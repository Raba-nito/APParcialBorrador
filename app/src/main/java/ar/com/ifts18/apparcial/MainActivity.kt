package ar.com.ifts18.apparcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonTC = findViewById<Button>(R.id.BtTc)

        botonTC.setOnClickListener{
            Toast.makeText(this, "Boton de terminos y condiciones", Toast.LENGTH_LONG).show()
            setContentView(R.layout.activity_fourth)
        }

        fun regresarHome(){
            val intent = Intent(this, FourthActivity::class.java).apply {  }
            startActivity(intent)
            finish()
        }

    }
}