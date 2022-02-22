package com.nepplus.orderapp_20220222.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.nepplus.orderapp_20220222.datas.StoreData

class StoreAdapter(
    val mContext:Context,
    resId:Int,
    val mList:ArrayList<StoreData>
):ArrayAdapter<StoreData>(mContext, resId, mList) {


}