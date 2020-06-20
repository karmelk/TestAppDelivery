package com.kmwork.testappdelivery

import android.content.Context
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.google.maps.android.ui.IconGenerator
import com.kmwork.entities.localmodel.MarkerMapModel

fun changeFragment(activity: FragmentActivity, fragment: Fragment) {
    val fth = activity.supportFragmentManager.beginTransaction()
    fth.replace(R.id.containerFragment, fragment)
    fth.commit()
}

fun getMarkerIconWithLabel(mContext: Context, item: MarkerMapModel): Bitmap {
    val iconGenerator = IconGenerator(mContext)
    val markerView: View = LayoutInflater.from(mContext).inflate(R.layout.layout_marker, null)
    val imgMarker: ImageView = markerView.findViewById(R.id.imgMarker)
    val tvLabel = markerView.findViewById<TextView>(R.id.tvLabel)
    when {
        item.isFinishedStops -> {
            imgMarker.setImageResource(R.drawable.ic_marker_finished)
        }
        item.isDatePenalty -> {
            imgMarker.setImageResource(R.drawable.ic_marker_passed)
        }
        else -> {
            imgMarker.setImageResource(R.drawable.ic_marker_unfinished)
        }
    }
    tvLabel.text = item.id.toString()
    iconGenerator.setContentView(markerView)
    iconGenerator.setBackground(null)
    return iconGenerator.makeIcon(item.id.toString())
}