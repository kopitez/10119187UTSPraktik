package com.alv1n.pikobar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button



class FormActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnSelanjutnya : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        btnSelanjutnya = findViewById(R.id.btn_selanjutnya)

        btnSelanjutnya.setOnClickListener(this)


    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_selanjutnya ->{
                val intentBiasa = Intent(this@FormActivity, CheckActivity::class.java)
                startActivity(intentBiasa)
            }
        }
    }
}