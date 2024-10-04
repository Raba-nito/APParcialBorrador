package ar.com.ifts18.apparcial

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonTC = findViewById<Button>(R.id.BtTc)
        val caja = findViewById<CheckBox>(R.id.caja)

        botonTC.setOnClickListener{
            mostrarToast("Boton de terminos y condiciones")
            regresarHome()
        }

        // Llamo a SharedPreferences y extraigo "terminosAceptados"
        val misPreferencias = getSharedPreferences("MyPreferences", Context.MODE_PRIVATE)
        val terminosAceptados = misPreferencias.getBoolean("terminosAceptados", false)

        // Dependiendo el boton presionado se cambia el estado del CheckBox
        caja.isChecked = terminosAceptados

    }
    private fun regresarHome(){
        val intent = Intent(this, FourthActivity::class.java).apply {  }
        startActivity(intent)
        finish()
    }
    
    private fun mostrarToast(mensajeToast: String){
        Toast.makeText(this, mensajeToast, Toast.LENGTH_LONG).show()
    }
}