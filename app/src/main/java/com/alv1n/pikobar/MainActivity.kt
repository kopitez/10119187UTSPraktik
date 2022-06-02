package com.alv1n.pikobar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button



class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnTambah : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnTambah = findViewById(R.id.btn_tambah1)

        btnTambah.setOnClickListener(this)


    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_tambah1 ->{
                val intentBiasa = Intent(this@MainActivity, KontakActivity::class.java)
                startActivity(intentBiasa)
            }
        }
    }
}