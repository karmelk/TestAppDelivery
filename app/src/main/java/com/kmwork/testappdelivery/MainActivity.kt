package com.kmwork.testappdelivery

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kmwork.testappdelivery.fragment.home.HomeFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val homeFragment=HomeFragment.newInstance()
        val fth = supportFragmentManager.beginTransaction()
        fth.replace(R.id.container, homeFragment)
        fth.commit()
    }
}