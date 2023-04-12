package com.example.empregaeu4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.empregaeu4.databinding.ActivityTela2Binding

class Tela2Activity : AppCompatActivity() {

    private lateinit var binding: ActivityTela2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTela2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val usuarioNome = binding.tvUsuarioNome
        val nome = intent.getStringExtra("nome")
        usuarioNome.text = nome
        //setContentView(R.layout.activity_tela2)

        val nomeUsuario = binding.textView3
        val nome = intent.getStringExtra("nome")
        nomeUsuario.text = nome

        val btParaFullscreenActivity = binding.button

        btParaFullscreenActivity.setOnClickListnner {
            val intent = Intent(this,btParaFullscreenActivity::class.java)
            startActivity( intent)
        }
    }
}