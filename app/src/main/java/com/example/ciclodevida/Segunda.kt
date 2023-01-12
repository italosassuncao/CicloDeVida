package com.example.ciclodevida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.graphics.Color

class Segunda : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        // Recuperando os parâmetros passados
        val parametrosEnviados = intent
        val parametros = parametrosEnviados.extras
        val sNome = parametros!!.getString("nome")
        val iIdade = parametros!!.getInt("idade")

        // Atualizando o texto da tela com o parâmetro passado
        val txtSegundaTela = findViewById<TextView>(R.id.txtSegundaTela)
        txtSegundaTela.setTextColor(Color.parseColor("#00FF00"))
        txtSegundaTela.text = sNome

        val txtIdade = findViewById<TextView>(R.id.txtIdade)
        txtIdade.setTextColor(Color.parseColor("#FF00FF"))
        txtIdade.text = iIdade.toString()

        val btnFechar = findViewById<Button>(R.id.btnFechar)
        btnFechar.setOnClickListener {
            finish();
        }
    }
}