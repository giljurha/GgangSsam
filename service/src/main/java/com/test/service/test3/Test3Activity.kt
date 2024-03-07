package com.test.service.test3

import android.app.job.JobInfo
import android.app.job.JobScheduler
import android.content.ComponentName
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import com.test.service.R
import com.test.service.databinding.ActivityTest3Binding

class Test3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityTest3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button4.setOnClickListener {
            val scheduler = getSystemService(JOB_SCHEDULER_SERVICE) as JobScheduler

            val extras = PersistableBundle()
            extras.putString("extra_data", "hello kkang")

            val builder = JobInfo.Builder(1, ComponentName(this, MyJobService::class.java))
            builder.setRequiredNetworkType(JobInfo.NETWORK_TYPE_UNMETERED)
            builder.setExtras(extras)

            scheduler.schedule(builder.build())
        }
    }
}