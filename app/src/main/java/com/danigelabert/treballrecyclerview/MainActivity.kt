package com.danigelabert.treballrecyclerview

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val personasList = ArrayList<Persona>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAgregar = findViewById<Button>(R.id.btnAgregar)
        val btnSiguiente = findViewById<Button>(R.id.btnSiguiente)
        val edtNombre = findViewById<EditText>(R.id.edtNombre)
        val edtEdad = findViewById<EditText>(R.id.edtEdad)

        btnAgregar.setOnClickListener {
            val nombre = edtNombre.text.toString()
            val edad = edtEdad.text.toString()

            if (nombre.isNotEmpty() && edad.isNotEmpty()) {
                personasList.add(Persona(nombre, edad))
                Toast.makeText(this, "Persona agregada", Toast.LENGTH_SHORT).show()
                edtNombre.text.clear()
                edtEdad.text.clear()
            } else {
                Toast.makeText(this, "Por favor, completa ambos campos", Toast.LENGTH_SHORT).show()
            }
        }

        btnSiguiente.setOnClickListener {
            val intent = Intent(this, PersonasActivity::class.java)
            intent.putParcelableArrayListExtra("personasList", personasList)
            startActivity(intent)
        }
    }
}