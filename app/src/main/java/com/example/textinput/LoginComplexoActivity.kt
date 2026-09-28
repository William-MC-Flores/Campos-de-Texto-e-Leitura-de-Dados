// Direitos reservados: William-MC-Flores
package com.example.textinput

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class LoginComplexoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_complexo)

        val etxtEmail = findViewById<TextInputEditText>(R.id.etxtEmail)
        val etxtSenha = findViewById<TextInputEditText>(R.id.etxtSenha)
        val btnEntrar = findViewById<Button>(R.id.btn_Entrar)
        val btnEsqueciSenha = findViewById<Button>(R.id.btn_EsqueciSenha)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)

        btnEntrar.setOnClickListener {
            val email = etxtEmail.text.toString()
            val senha = etxtSenha.text.toString()

            Log.d("Login", "E-mail digitado: $email\nSenha com ${senha.length} caracteres")

            if (senha.length < 6) {
                txtResultado.text = "Senha muito curta! Mínimo 6 caracteres."
            } else {
                txtResultado.text = "Bem-vindo(a), $email!"
            }
        }

        btnEsqueciSenha.setOnClickListener {
            startActivity(android.content.Intent(this, RecuperarSenhaActivity::class.java))
        }
    }
}
