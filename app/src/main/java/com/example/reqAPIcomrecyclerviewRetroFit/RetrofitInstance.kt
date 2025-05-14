package com.example.reqAPIcomrecyclerviewRetroFit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    val api: ApiService by lazy {
        Retrofit.Builder() // construtor de retrofit
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }
}

//object kotlin = padrão singleton, serve para criar uma classe que tem apenas uma instância

// lazy = inicialização preguiçosa, serve para inicializar a variável apenas
// quando for utilizada
// addConverterFactory = adiciona um conversor de JSON para o Retrofit
//gson = serve para converter o json em um objeto kotlin

//Retrofit = biblioteca para fazer chamadas http.
