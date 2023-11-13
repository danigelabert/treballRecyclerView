package com.danigelabert.treballrecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.danigelabert.treballrecyclerview.Persona
import com.danigelabert.treballrecyclerview.R

class PersonasAdapter(private val personas: List<Persona>) :
    RecyclerView.Adapter<PersonasAdapter.PersonaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonaViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_persona, parent, false)
        return PersonaViewHolder(view)
    }

    override fun onBindViewHolder(holder: PersonaViewHolder, position: Int) {
        val persona = personas[position]
        holder.bind(persona)
    }

    override fun getItemCount(): Int {
        return personas.size
    }

    class PersonaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(persona: Persona) {
            itemView.findViewById<TextView>(R.id.txtNombre).text = persona.nombre
            itemView.findViewById<TextView>(R.id.txtEdad).text = persona.edad
        }
    }
}