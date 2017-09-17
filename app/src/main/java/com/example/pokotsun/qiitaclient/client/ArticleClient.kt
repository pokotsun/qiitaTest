package com.example.pokotsun.qiitaclient.client

import com.example.pokotsun.qiitaclient.model.Article
import retrofit2.http.GET
import retrofit2.http.Query
import rx.Observable
import java.util.*

/**
 * Created by pokotsun on 17/09/17.
 */
interface ArticleClient {
    @GET("/api/v2/items")
    fun search(@Query("query") query: String): Observable<List<Article>>
}