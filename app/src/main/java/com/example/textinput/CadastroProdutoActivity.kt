// Direitos reservados: William-MC-Flores
package com.example.textinput

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class CadastroProdutoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_produto)

        val etxtProduto = findViewById<TextInputEditText>(R.id.etxtProduto)
        val etxtPreco = findViewById<TextInputEditText>(R.id.etxtPreco)
        val etxtQuantidade = findViewById<TextInputEditText>(R.id.etxtQuantidade)
        val btnCadastrar = findViewById<Button>(R.id.btn_Cadastrar)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)

        btnCadastrar.setOnClickListener {
            val produto = etxtProduto.text.toString()
            val precoStr = etxtPreco.text.toString()
            val qtdStr = etxtQuantidade.text.toString()

            Log.d("Produto", "Produto: $produto\nPreço: R$ $precoStr\nQuantidade: $qtdStr")

            val preco = precoStr.toDoubleOrNull() ?: -1.0
            val quantidade = qtdStr.toIntOrNull() ?: 0

            if (preco <= 0) {
                txtResultado.text = "Preço inválido!"
            } else {
                val valorEstoque = preco * quantidade
                txtResultado.text = "$produto cadastrado! Valor em estoque: R$ $valorEstoque"
            }
        }
    }
}
