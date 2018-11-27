package com.kotlinlearn

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

// https://legacy.gitbook.com/book/wangjiegulu/kotlin-for-android-developers-zh/details     《Kotlin for android Developers》中文翻译
class MainActivity : AppCompatActivity() {

    private lateinit var mMainRecycler : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mMainRecycler = findViewById(R.id.MainRecyclerView)
        mMainRecycler.layoutManager = LinearLayoutManager(this);
    }
}
