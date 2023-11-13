package com.danigelabert.treballrecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.danigelabert.treballrecyclerview.adapter.PersonasAdapter
import com.danigelabert.treballrecyclerview.databinding.ActivityPersonasBinding

class PersonasActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPersonasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPersonasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerView = binding.recyclerView

        val personasList: ArrayList<Persona>? =
            intent.getParcelableArrayListExtra("personasList")

        if (personasList != null) {
            val adapter = PersonasAdapter(personasList)

            recyclerView.layoutManager = LinearLayoutManager(this)
            recyclerView.adapter = adapter
        }
    }
}





