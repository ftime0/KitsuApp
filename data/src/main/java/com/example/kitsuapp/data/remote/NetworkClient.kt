package com.example.kitsuapp.data.remote

import com.example.kitsuapp.data.remote.apisevise.AnimeApi
import com.example.kitsuapp.data.remote.apisevise.AuthenticationApi
import com.example.kitsuapp.data.remote.apisevise.MangaApi
import retrofit2.Retrofit
import javax.inject.Inject

class NetworkClient @Inject constructor(
    retrofitClient: RetrofitClient,
    okHttp: OkHttp
) {
    private val provideRetrofit = retrofitClient.provideRetrofit(okHttp.provideOkHttpClient())

    fun provideAnimeApiService(): AnimeApi = provideRetrofit.create()
    fun provideMangaApiService(): MangaApi = provideRetrofit.create()

    class AuthenticationClient @Inject constructor(
        retrofitClient: RetrofitClient,
        okHttp: OkHttp
    ) {
        private val retrofit =
            retrofitClient.provideAuthenticationRetrofit(okHttp.provideOkHttpClient())

        fun provideAuthenticationApiService(): AuthenticationApi = retrofit.create()
    }
}

inline fun <reified T : Any> Retrofit.create(): T = create(T::class.java)
