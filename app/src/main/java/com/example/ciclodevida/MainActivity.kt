package com.example.ciclodevida

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSegundaTela = findViewById(R.id.btnSegundaTela) as Button
        btnSegundaTela.setOnClickListener {
            // criar parametros
            val parametros = Bundle()
            parametros.putString("nome", "João da Silveira")
            parametros.putInt("idade", 123)

            // criar intent
            val segundaTela = Intent(this, Segunda::class.java)
            segundaTela.putExtras(parametros)

            // fazer a chamada
            startActivity(segundaTela)
        }

        val btnFechar = findViewById<Button>(R.id.btnFechar)
        btnFechar.setOnClickListener {
            finish()
        }

        val btnNavegador = findViewById<Button>(R.id.btnNavegador)
        btnNavegador.setOnClickListener {
            val url = "https:www.terra.com.br"

            // Identificando a Activity a ser aberta (Chrome)
            val navegador = Intent(Intent.ACTION_VIEW)

            // Passando a URL como parâmetro para o navegador (Chrome)
            navegador.data = Uri.parse(url)

            // Abrindo o navegador (Chrome)
            startActivity(navegador)
        }


        Toast.makeText(getApplicationContext(), "onCreate chamado", Toast.LENGTH_LONG).show();
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(getApplicationContext(), "onStart chamado", Toast.LENGTH_LONG).show();
    }
    override fun onRestart() {
        super.onRestart()
        Toast.makeText(getApplicationContext(), "onRestart chamado", Toast.LENGTH_LONG).show();
    }
    override fun onResume() {
        super.onResume()
        Toast.makeText(getApplicationContext(), "onResume chamado", Toast.LENGTH_LONG).show();
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(getApplicationContext(), "onPause chamado", Toast.LENGTH_LONG).show();
    }
    override fun onStop() {
        super.onStop()
        Toast.makeText(getApplicationContext(), "onStop chamado", Toast.LENGTH_LONG).show();
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(getApplicationContext(), "onDestroy chamado", Toast.LENGTH_LONG).show();
    }
}