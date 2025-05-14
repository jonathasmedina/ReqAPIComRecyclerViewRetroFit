package com.example.reqAPIcomrecyclerviewRetroFit

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Chamada assíncrona com coroutine
        // CoRoutine = serve para fazer chamadas assíncronas em background
        //lifecycleScope = faz com que a coroutine seja cancelada quando a Activity é destruída
        lifecycleScope.launch {
            try {
                val lista = RetrofitInstance.api.getUsers()
                recyclerView.adapter = UserAdapter(lista)
            } catch (e: Exception) {
                Toast.makeText(this@MainActivity, "Erro: ${e.message}", Toast.LENGTH_LONG).show()
            }
        }
    }
}

//RetrofitInstance é o objeto que contém a instância do Retrofit
//api é a interface que contém a função getUsers()