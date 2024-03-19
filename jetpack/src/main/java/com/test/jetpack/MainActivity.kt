package com.test.jetpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.test.jetpack.databinding.ActivityMainBinding
import com.test.jetpack.recyclerview.ProfileAdapter
import com.test.jetpack.recyclerview.Profiles

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        val profileList = arrayListOf(
            Profiles(R.drawable.man, "홍드로이드", 27, "안드로이드 앱 개발자"),
            Profiles(R.drawable.man, "홍드로이드", 27, "안드로이드 앱 개발자"),
            Profiles(R.drawable.man, "홍드로이드", 27, "안드로이드 앱 개발자"),
            Profiles(R.drawable.woman, "홍드로이드", 27, "안드로이드 앱 개발자"),
            Profiles(R.drawable.woman, "홍드로이드", 27, "안드로이드 앱 개발자"),
            Profiles(R.drawable.woman, "홍드로이드", 27, "안드로이드 앱 개발자")
        )
//        activityMainBinding.recyclerView
//        activityMainBinding..layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
//        rv_profile.setHasFixedSize(true)
//
//        rv_profile.adapter = ProfileAdapter(profileList)
    }
}