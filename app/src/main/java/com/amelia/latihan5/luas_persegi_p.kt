package com.amelia.latihan5

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class luas_persegi_p : AppCompatActivity() {
    private lateinit var panjang : EditText
    private lateinit var lebar : EditText
    private lateinit var tinggi : EditText
    private lateinit var hitung : Button
    private lateinit var luas : TextView
    private lateinit var volume : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_luas_persegi_p)

        panjang = findViewById(R.id.panjang)
        lebar = findViewById(R.id.lebar)
        tinggi = findViewById(R.id.tinggi)
        hitung = findViewById(R.id.hitung)
        luas = findViewById(R.id.luas)
        volume = findViewById(R.id.volume)

        hitung.setOnClickListener(){
            val panjang1 =  panjang.text.toString().toDouble()
            val lebar1 =  lebar.text.toString().toDouble()
            val tinggi1 =  tinggi.text.toString().toDouble()

            val lp = 2 * ((panjang1 * lebar1) + (panjang1 * tinggi1) + (lebar1 * tinggi1) )
            val vol = panjang1 * lebar1 * tinggi1

            luas.text = "Luas permukaan =" + lp
            volume.text = "volume = "+ vol

        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}