// Direitos reservados: William-MC-Flores
package com.example.textinput

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class InscricaoEventoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inscricao_evento)

        val etxtNome = findViewById<TextInputEditText>(R.id.etxtNome)
        val etxtEmail = findViewById<TextInputEditText>(R.id.etxtEmail)
        val etxtIdade = findViewById<TextInputEditText>(R.id.etxtIdade)
        val btnInscrever = findViewById<Button>(R.id.btn_Inscrever)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)

        btnInscrever.setOnClickListener {
            val nome = etxtNome.text.toString()
            val email = etxtEmail.text.toString()
            val idadeStr = etxtIdade.text.toString()

            Log.d("Inscricao", "Nome: $nome\nE-mail: $email\nIdade: $idadeStr")

            val idade = idadeStr.toIntOrNull() ?: -1

            if (idade in 14..99) {
                txtResultado.text = "$nome, sua inscrição foi confirmada!"
            } else {
                txtResultado.text = "Idade inválida para o evento."
            }
        }
    }
}
