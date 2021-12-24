package com.clearsky77.lamdabasicpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 고차 함수
        b(::a)
        Log.d("테스트","b(::a) ------------")
        c(::a)
        Log.d("테스트","c(::a) ------------")

    }

    // 고차 함수
    fun a (str: String){
        Log.d("function a 내부","${str}한 함수 a")
    }

    fun b (method: (String)->Unit){
        method("b의 내부에서 호출")
    }

    fun c (method: (String)->Unit){
        method("c의 내부에서 호출")
    }

}