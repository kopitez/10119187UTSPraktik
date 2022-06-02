package com.alv1n.pikobar

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.Button

class CheckActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnDialog : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check)


        //custom dialog
        btnDialog = findViewById(R.id.btn_selanjutnya)
        btnDialog.setOnClickListener {
            customDialog()
        }
    }


    //custom dialog
    private fun customDialog (){
        val dialog = Dialog(this)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.setContentView(R.layout.custom_dialog)

        val btnTutup = dialog.findViewById<Button>(R.id.btn_tutup)
        btnTutup.setOnClickListener{
            dialog.dismiss()
        }
        dialog.show()
    }

    override fun onClick(p0: View?) {

    }


}