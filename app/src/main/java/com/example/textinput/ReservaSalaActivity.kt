// Direitos reservados: William-MC-Flores
package com.example.textinput

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class ReservaSalaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reserva_sala)

        val etxtNome = findViewById<TextInputEditText>(R.id.etxtNome)
        val etxtSala = findViewById<TextInputEditText>(R.id.etxtSala)
        val etxtHorario = findViewById<TextInputEditText>(R.id.etxtHorario)
        val btnReservar = findViewById<Button>(R.id.btn_Reservar)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)

        btnReservar.setOnClickListener {
            val nome = etxtNome.text.toString()
            val sala = etxtSala.text.toString()
            val horario = etxtHorario.text.toString()

            // Terminal
            Log.d("ReservaSala", "Responsável: $nome\nSala: $sala\nHorário: $horario")
            println("Responsável: $nome\nSala: $sala\nHorário: $horario")

            // Tela
            txtResultado.text = "$sala reservado para $nome às $horario"
        }
    }
}
