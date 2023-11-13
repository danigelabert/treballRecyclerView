package com.danigelabert.treballrecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.danigelabert.treballrecyclerview.adapter.PersonasAdapter

class PersonasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personas)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        // Obtener la lista de personas de la intent
        val personasList: ArrayList<Persona>? =
            intent.getParcelableArrayListExtra("personasList")

        // Verificar si la lista no es nula antes de crear el adaptador
        if (personasList != null) {
            // Crear el adaptador
            val adapter = PersonasAdapter(personasList)

            // Configurar el RecyclerView
            recyclerView.layoutManager = LinearLayoutManager(this)
            recyclerView.adapter = adapter
        }
    }
}





