package com.nepplus.orderapp_20220222

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nick_name.*

class EditNickNameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nick_name)

        setupEvents()
        setValues()
    }

    fun setupEvents(){

        btnSave.setOnClickListener {

            val inputNickName = edtNickName.text.toString()
            val resultIntent = Intent()
            resultIntent.putExtra("nick",inputNickName)
            setResult(RESULT_OK, resultIntent)
            finish()
        }
    }

    fun setValues(){

    }
}