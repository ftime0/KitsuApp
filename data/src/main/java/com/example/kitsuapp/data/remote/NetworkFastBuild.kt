package com.example.kitsuapp.data.remote

import com.example.kitsuapp.data.BuildConfig
import com.example.kitsuapp.data.local.preferences.PreferencesHelper
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class RetrofitClient @Inject constructor() {
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit = Retrofit.Builder()
        .baseUrl(BuildConfig.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttpClient)
        .build()
    fun provideAuthenticationRetrofit(okHttpClient: OkHttpClient): Retrofit = Retrofit.Builder()
        .baseUrl("https://kitsu.io/api/oauth/")
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttpClient)
        .build()
}

class OkHttp @Inject constructor() {
    fun provideOkHttpClient(authenticationInterceptor: AuthenticationInterceptor? = null): OkHttpClient {
        val client = OkHttpClient()
            .newBuilder()
            .addInterceptor(provideLoggingInterceptor())
            .callTimeout(30, TimeUnit.SECONDS)
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
        authenticationInterceptor?.let { client.addInterceptor(authenticationInterceptor) }
        return client.build()
    }

    private fun provideLoggingInterceptor() = HttpLoggingInterceptor().setLevel(
        when {
            else -> HttpLoggingInterceptor.Level.NONE
        }
    )
    class AuthenticationInterceptor @Inject constructor(
        private val preferencesHelper: PreferencesHelper
    ) : Interceptor {
        override fun intercept(chain: Interceptor.Chain): okhttp3.Response {
            val request = chain
                .request()
                .newBuilder()
                .addHeader("Authorization:Bearer", "${preferencesHelper.accessToken}")
                .build()
            return chain.proceed(request)
        }
    }
}