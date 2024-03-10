package com.test.contentprovider.test1

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.test.contentprovider.R
import com.test.contentprovider.databinding.ActivityTest1Binding

class Test1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityTest1Binding.inflate(layoutInflater)
        setContentView(R.layout.activity_test1)

        binding.button.setOnClickListener {
            val cursor = contentResolver.query(
                Uri.parse("content://com.my.provider"),
            null,null,null,null,null)
            while(cursor?.moveToNext() ?: false){
                Log.d("kkang",cursor?.getString(0) ?: "")
            }
        }
    }
}