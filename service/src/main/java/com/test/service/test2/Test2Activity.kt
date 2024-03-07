package com.test.service.test2

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.IBinder
import android.util.Log
import com.test.service.R
import com.test.service.databinding.ActivityTest2Binding

class Test2Activity : AppCompatActivity() {

    lateinit var serviceBinder: MyService.MyBinder

    val connection = object : ServiceConnection {
        override fun onServiceConnected(name: ComponentName?, service: IBinder?) {
            serviceBinder = service as MyService.MyBinder
        }
        override fun onServiceDisconnected(name: ComponentName?) = Unit
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityTest2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = Intent(this, MyService::class.java)
        bindService(intent, connection, Context.BIND_AUTO_CREATE)

        binding.button.setOnClickListener {
            serviceBinder.funA(10)
        }
        binding.button3.setOnClickListener {
            Log.d("kkang", "${serviceBinder.funB(20)}")
        }
    }
}