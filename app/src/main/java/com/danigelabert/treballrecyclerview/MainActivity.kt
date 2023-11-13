package com.danigelabert.treballrecyclerview

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.danigelabert.treballrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val personasList = ArrayList<Persona>()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnAgregar = binding.btnAgregar
        val btnSiguiente = binding.btnSiguiente
        val edtNombre = binding.edtNombre
        val edtEdad = binding.edtEdad

        btnAgregar.setOnClickListener {
            val nombre = edtNombre.text.toString()
            val edad = edtEdad.text.toString()

            if (nombre.isNotEmpty() && edad.isNotEmpty()) {
                personasList.add(Persona(nombre, edad))
                Toast.makeText(this, "Persona afegida", Toast.LENGTH_SHORT).show()
                edtNombre.text.clear()
                edtEdad.text.clear()
            } else {
                Toast.makeText(this, "Sisplau, completa els dos camps", Toast.LENGTH_SHORT).show()
            }
        }

        btnSiguiente.setOnClickListener {
            val intent = Intent(this, PersonasActivity::class.java)
            intent.putParcelableArrayListExtra("personasList", personasList)
            startActivity(intent)
        }
    }
}