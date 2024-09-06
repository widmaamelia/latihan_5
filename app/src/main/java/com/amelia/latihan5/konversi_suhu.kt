package com.amelia.latihan5

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class konversi_suhu : AppCompatActivity() {
    private lateinit var angka : EditText
    private lateinit var fahrenheit : Button
    private lateinit var kelvin : Button
    private lateinit var reamur : Button
    private lateinit var hasil1 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_konversi_suhu)

        angka = findViewById(R.id.angka)
        fahrenheit = findViewById(R.id.fahrenheit)
        kelvin = findViewById(R.id.kelvin)
        reamur = findViewById(R.id.reamur)
        hasil1 = findViewById(R.id.hasil1)

        fahrenheit.setOnClickListener(){
            val nAngka = angka.text.toString().toDouble()
            val fahren = (nAngka * 9 / 5 )  + 32

            hasil1.setText("fahrenheit = "+ fahren)

        }

        kelvin.setOnClickListener(){
            val nAngka = angka.text.toString().toDouble()
            val kelvin1 = nAngka + 273.15

            hasil1.text = "kelvin = "+ kelvin1

        }


        reamur.setOnClickListener(){
            val nAngka = angka.text.toString().toDouble()
            val reamur1 = nAngka * 4 / 5

            hasil1.setText("reamur = "+ reamur1)

        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}