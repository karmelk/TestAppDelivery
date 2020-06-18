package com.kmwork.testappdelivery

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.kmwork.testappdelivery.R


fun changeFragment(activity: FragmentActivity, fragment: Fragment){
    val fth = activity.supportFragmentManager.beginTransaction()
    fth.replace(R.id.containerFragment, fragment)
    fth.commit()
}