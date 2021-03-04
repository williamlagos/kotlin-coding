package io.efforia.institutional

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        clientes.setOnClickListener {
            Toast.makeText(applicationContext, "Clientes foi clicado", Toast.LENGTH_LONG).show()
            val intent = Intent(this, DetalheClientesActivity::class.java)
            startActivity(intent)
        }
        contato.setOnClickListener {
            val intent = Intent(this, DetalheContatoActivity::class.java)
            startActivity(intent)
        }
        empresa.setOnClickListener {
            val intent = Intent(this, DetalheEmpresaActivity::class.java)
            startActivity(intent)
        }
        servicos.setOnClickListener {
            val intent = Intent(this, DetalheServicoActivity::class.java)
            startActivity(intent)
        }
    }
}