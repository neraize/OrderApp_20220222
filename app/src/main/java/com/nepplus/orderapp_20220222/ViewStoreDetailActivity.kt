package com.nepplus.orderapp_20220222

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.nepplus.orderapp_20220222.datas.StoreData
import kotlinx.android.synthetic.main.activity_view_store_detail.*

class ViewStoreDetailActivity : AppCompatActivity() {

    lateinit var mStoreData:StoreData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_store_detail)

        mStoreData = intent.getSerializableExtra("store") as StoreData
        setupEvents()
        setVlaues()
    }

    fun setupEvents(){

    }

    fun setVlaues(){

        Glide.with(this).load(mStoreData.logoImageURL).into(imgLogo)

        txtStoreName.text = mStoreData.name

        txtPhoneNum.text =mStoreData.phoneNum

        ratingBar.rating =mStoreData.rating.toFloat()

        txtRating.text ="(${mStoreData.rating})"
    }
}