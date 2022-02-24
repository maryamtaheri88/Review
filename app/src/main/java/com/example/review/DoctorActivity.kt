package com.example.review

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.review.databinding.ActivityDoctorBinding

class DoctorActivity : AppCompatActivity() {

    lateinit var binding : ActivityDoctorBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDoctorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView1.text = getString(R.string.hello_world)
    }

}