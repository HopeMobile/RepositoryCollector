package com.hopedevelops.repositorycollector

import com.hopedevelops.repositorycollector.Repository
import retrofit2.Call
import retrofit2.http.GET

interface RepositoryService {

    @get:GET("/orgs/:google/repos")
    val repositories: Call<Repository>
}