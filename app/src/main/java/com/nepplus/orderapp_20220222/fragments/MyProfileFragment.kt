package com.nepplus.orderapp_20220222.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.nepplus.orderapp_20220222.EditNickNameActivity
import com.nepplus.orderapp_20220222.R
import kotlinx.android.synthetic.main.fragment_my_profile.*

class MyProfileFragment:Fragment() {

    val REQ_CODE_NICKNAME = 2000

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_profile, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        // 내정보 화면 관련 동작 코드
        setupEvents()
        setValues()
    }

    fun setupEvents(){

        btnEditNickName.setOnClickListener {
            val myIntent = Intent(requireContext(), EditNickNameActivity::class.java)
            startActivityForResult(myIntent, REQ_CODE_NICKNAME)
        }
    }

    fun setValues(){

    }
}