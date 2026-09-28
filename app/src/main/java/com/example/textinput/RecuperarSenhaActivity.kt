// Direitos reservados: William-MC-Flores
package com.example.textinput

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class RecuperarSenhaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recuperar_senha)

        val etxtEmail = findViewById<TextInputEditText>(R.id.etxtEmail)
        val etxtConfirmarEmail = findViewById<TextInputEditText>(R.id.etxtConfirmarEmail)
        val btnRecuperar = findViewById<Button>(R.id.btn_Recuperar)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)

        btnRecuperar.setOnClickListener {
            val email = etxtEmail.text.toString()
            val confirmacao = etxtConfirmarEmail.text.toString()

            Log.d("RecuperarSenha", "E-mail: $email\nConfirmação: $confirmacao")

            if (email == confirmacao && email.isNotEmpty()) {
                txtResultado.text = "Link enviado para $email"
            } else {
                txtResultado.text = "Os e-mails não conferem!"
            }
        }
    }
}
