package com.kmwork.domain.utils

import com.kmwork.entities.StopsModelDB
import java.util.*

fun generateRandomList(): MutableList<StopsModelDB> {
    val stopsList: MutableList<StopsModelDB> = mutableListOf()
    val stopsModelDB = StopsModelDB(
        UUID.randomUUID().toString(),
        "47 Marksi poxoc",
        "10:00-11:00",
        "10:20",
        false
    )
    stopsList.add(stopsModelDB)
    return stopsList
}