package com.example.reqAPIcomrecyclerviewRetroFit

import retrofit2.http.GET

interface ApiService {
    @GET("users")
    suspend fun getUsers(): List<User>
}

//Annotation get = faz uma requisição get para a url /users.
//@GET é possível pois houve a dependencia retrofit-2.9.0 no gralde.kts

//suspend = função que pode ser pausada e retomada
