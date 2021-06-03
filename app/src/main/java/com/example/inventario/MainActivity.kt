package com.example.inventario

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    var BotonVenta: Button?=null
    var BotonReparaciones: Button?=null
    var BotonAvanzado: Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        BotonVenta=findViewById(R.id.bventa)
        BotonReparaciones=findViewById(R.id.breparaciones)
        BotonAvanzado=findViewById(R.id.avanzado)

    }


    override fun onResume() {
        super.onResume()

        BotonVenta!!.setOnClickListener{
            //me envia a otra atividad
            val i: Intent = Intent(this,IngresarActivity::class.java)
            startActivity(i)

        }

        BotonReparaciones!!.setOnClickListener{
            //me envia a otra atividad
            val k: Intent = Intent(this,ConsultaActivity::class.java)
            startActivity(k)
        }

        BotonAvanzado!!.setOnClickListener{

            val l: Intent = Intent(this,LoginActivity::class.java)
            startActivity(l)

        }

    }


}