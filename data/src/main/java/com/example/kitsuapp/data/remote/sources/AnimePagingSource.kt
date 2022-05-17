package com.example.kitsuapp.data.remote.sources

import android.net.Uri
import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.kitsuapp.data.remote.apisevise.AnimeApi
import com.example.kitsuapp.data.remote.dtos.anime.AnimeDataDto
import retrofit2.HttpException
import java.io.IOException


class AnimePagingSource(
    private val api: AnimeApi
) : PagingSource<Int, AnimeDataDto>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, AnimeDataDto> {
        val page = params.key ?: 1
        return try {
            val response =
                api.fetchAnime(params.loadSize, page)
            val nextPage = if (response.links?.next == null) {
                null
            } else
                Uri.parse(response.links.next).getQueryParameter("page[offset]")!!.toInt()
            LoadResult.Page(
                data = response.data,
                null,
                nextKey = nextPage
            )

        } catch (io: IOException) {
            LoadResult.Error(io)
        } catch (http: HttpException) {
            LoadResult.Error(http)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, AnimeDataDto>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)

        }

    }
}
