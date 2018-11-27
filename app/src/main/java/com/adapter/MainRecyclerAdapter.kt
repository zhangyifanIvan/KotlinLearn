package com.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView

/**
 * Copyright (C), 2018-2018, 912租房网
 * Author: 张一帆
 * Date: 2018/11/27 0027 下午 3:14
 * Description:
 */
class MainRecyclerAdapter() : RecyclerView.Adapter<MainRecyclerAdapter.VH>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): VH {
        return VH(TextView(p0.context))
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(p0: VH, p1: Int) {
    }

    class VH(private val textview: TextView) : RecyclerView.ViewHolder(textview)

}