package com.alv1n.pikobar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button



class KontakActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnTambah2 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kontak)

        btnTambah2 = findViewById(R.id.btn_tambah2)

        btnTambah2.setOnClickListener(this)


    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_tambah2 ->{
                val intentBiasa = Intent(this@KontakActivity, FormActivity::class.java)
                startActivity(intentBiasa)
            }
        }
    }
}