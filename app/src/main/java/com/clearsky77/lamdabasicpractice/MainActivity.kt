package com.clearsky77.lamdabasicpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("테스트"," ----- 고차 함수 -----")
        // 고차 함수
        b(::a)
        c(::a)

        // 람다 함수
        Log.d("테스트"," ----- 람다 함수 -----")
        // fun a와 같은 기능을 람다 함수로
//        val aa: (String)->Unit = { str: String -> Log.d("aa 내부","${str}한 람다 함수 aa") }
        val aa: (String)->Unit = { str -> Log.d("aa 내부","${str}한 람다 함수 aa") }
//        val aa = { str:String -> Log.d("aa 내부","${str}한 람다 함수") } // 얘는 안됨!!!
        b({ str:String -> Log.d("aa 내부","${str}한 람다 함수 aa") }) // 이렇게는 가능하다
        c(aa)
    }

    // 고차 함수
    fun a (str: String){
        Log.d("a 내부","${str}한 고차 함수 a")
    }

    fun b (method: (String)->Unit){
        method("b의 내부에서 호출")
    }

    fun c (method: (String)->Unit){
        method("c의 내부에서 호출")
    }

}