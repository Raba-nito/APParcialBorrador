package ar.com.ifts18.apparcial

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast


class FourthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        val denegarTc = findViewById<Button>(R.id.denegar)
        val aceptarTc= findViewById<Button>(R.id.aceptar)


        aceptarTc.setOnClickListener{
            Toast.makeText(this, "tocaste el boton de ACEPTAR", Toast.LENGTH_LONG).show()
            setContentView(R.layout.activity_main)
        }

        denegarTc.setOnClickListener {
            Toast.makeText(this, "Tocaste el boton de DENEGAR", Toast.LENGTH_LONG).show()
            Log.d("tag","DENEGAR")
            setContentView(R.layout.activity_main)
        }


    }
}