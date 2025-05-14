package com.example.reqAPIcomrecyclerviewRetroFit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UserAdapter(private val users: List<User>) :
    RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    //Classe interna que representa o ViewHolder
    class UserViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nome: TextView = view.findViewById(R.id.txtNome)
        val email: TextView = view.findViewById(R.id.txtEmail)
    }

    // Método chamado quando o ViewHolder é criado
    // Cria uma nova instância do ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        return UserViewHolder(view)
    }

    // Método chamado para vincular os dados do usuário ao ViewHolder
    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = users[position]
        holder.nome.text = user.name
        holder.email.text = user.email
    }

    override fun getItemCount(): Int = users.size
}