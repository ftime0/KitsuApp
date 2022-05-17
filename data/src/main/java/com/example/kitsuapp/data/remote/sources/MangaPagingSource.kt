package com.example.kitsuapp.data.remote.sources

import android.net.Uri
import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.kitsuapp.data.remote.apisevise.MangaApi
import com.example.kitsuapp.data.remote.dtos.manga.MangaData
import retrofit2.HttpException
import java.io.IOException


class MangaPagingSource(
    private val api: MangaApi
) : PagingSource<Int, MangaData>() {
    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, MangaData> {
        val page = params.key ?: 20
        return try {
            val response = api.fetchManga(params.loadSize, page)
            val nextPage = if (response.links.next == null) {
                null
            } else
                Uri.parse(response.links.next).getQueryParameter("page[offset]")!!.toInt()
            LoadResult.Page(
                data = response.data,
                prevKey = null, nextKey = nextPage
            )

        } catch (io: IOException) {
            LoadResult.Error(io)
        } catch (http: HttpException) {
            LoadResult.Error(http)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, MangaData>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)
        }

    }
}







