package com.nepplus.orderapp_20220222

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nepplus.orderapp_20220222.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mAdapter:MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupEvents()
        setValues()
    }

    fun setupEvents(){

    }

    fun setValues(){

        mAdapter = MainViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter =mAdapter
        
        // 도전 과제 - 치킨 가게 목록 추가 시에는, offScreenLimit =3 설정해줘야 정상 동작

        mainTabLayout.setupWithViewPager(mainViewPager)
    }
}