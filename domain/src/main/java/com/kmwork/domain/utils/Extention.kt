package com.kmwork.domain.utils

import com.kmwork.entities.responcemodel.StopsModelDB
import java.util.*

fun generateRandomList(): MutableList<StopsModelDB> {
    val stopsList: MutableList<StopsModelDB> = mutableListOf()
    val stopsModelDB1 = StopsModelDB(
        "87353632",
        "64 Komitas Ave, Yerevan 0015, Armenia",
        "40.206187",
        "44.524358",
        "10:00-11:00",
        "11:05",
        false,
        true
    )
    val stopsModelDB = StopsModelDB(
        "5111235",
        "2/2 Rubinyants St, Yerevan 0025, Armenia",
        "40.199966",
        " 44.540333",
        "09:00-10:00",
        "09:45",
        false,
        false
    )
    val stopsModelDB2 = StopsModelDB(
        "846565465465",
        "4 Charents St, Yerevan 0025, Armenia",
        "40.183957",
        "44.527238",
        "10:00-12:00",
        "12:05",
        true,
        false
    )
    val stopsModelDB3 = StopsModelDB(
        "5111235",
        "19 Nairi Zaryan St, Yerevan 0014, Armenia",
        "40.204451,",
        "44.513275",
        "09:00-10:00",
        "09:45",
        false,
        false
    )
    stopsList.add(stopsModelDB1)
    stopsList.add(stopsModelDB)
    stopsList.add(stopsModelDB2)
    stopsList.add(stopsModelDB3)
    return stopsList
}