package com.test.permission.test1

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat
import com.test.permission.R

class Test1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test1)

        val requestLauncher = registerForActivityResult(
            ActivityResultContracts.RequestPermission()
        ){
            if (it) {
                Log.d("kkang", "callback... granted...")
            } else {
                Log.d("kkang", "callback... denied...")
            }
        }
        val status = ContextCompat.checkSelfPermission(
            this,
            "android.permission.ACCESS_FINE_LOCATION"
        )
        if (status == PackageManager.PERMISSION_GRANTED){
            Log.d("kkang","granted....")
        } else {
            requestLauncher.launch("android.permission.ACCESS_FINE_LOCATION")
        }
    }
}