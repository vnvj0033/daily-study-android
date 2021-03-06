package com.example.mvctutorial.network.module.apiservice

import com.example.mvctutorial.network.module.model.Post
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface PostApi {
    @GET("posts")
    fun getPost(@QueryMap queryMap: Map<String, String>): Call<Post>

    @GET("posts/{id}")
    fun getPost(@Path("id") id: Int): Call<Post>
}