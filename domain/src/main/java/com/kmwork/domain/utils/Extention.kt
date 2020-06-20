package com.kmwork.domain.utils

import com.kmwork.entities.responcemodel.StopsModelDB
import java.util.*

fun generateRandomList(): MutableList<StopsModelDB> {
    val stopsList: MutableList<StopsModelDB> = mutableListOf()
    val stopsModelDB = StopsModelDB(
        "87353632",
        "64 Komitas Ave, Yerevan 0015, Armenia",
        40.206187,
        44.524358,
        "10:00-11:00",
        "11:05",
        false,
        true
    )
    val stopsModelDB1 = StopsModelDB(
        "5111235",
        "2/2 Rubinyants St, Yerevan 0025, Armenia",
        40.199966,
        44.540333,
        "09:00-10:00",
        "09:45",
        false,
        false
    )
    val stopsModelDB2 = StopsModelDB(
        "846565465465",
        "4 Charents St, Yerevan 0025, Armenia",
        40.183957,
        44.527238,
        "10:00-12:00",
        "12:05",
        true,
        false
    )
    val stopsModelDB3 = StopsModelDB(
        "798",
        "Tigran Mets Ave, Yerevan, Armenia",
        40.176697,
        44.513501,
        "16:00-16:30",
        "16:15",
        false,
        true
    )
    val stopsModelDB4 = StopsModelDB(
        "9878",
        "6 Vazgen Sargsyan St, Yerevan, Armenia",
        40.176222,
        44.510419,
        "12:13-13:13",
        "14:00",
        true,
        false
    )
    val stopsModelDB5 = StopsModelDB(
        "88545",
        "Agatangeghos St, Yerevan, Armenia",
        40.171773,
        44.510259,
        "09:30-10:45",
        "10:30",
        false,
        false
    )
    val stopsModelDB6 = StopsModelDB(
        "23354",
        "1st d/st, Yerevan, Armenia",
        40.168377,
        44.513315,
        "20:00-21:15",
        "21:30",
        true,
        false
    )
    val stopsModelDB7 = StopsModelDB(
        "21201",
        "9 Kajaznuni St, Yerevan 0036, Armenia",
        40.168516,
        44.520292,
        "13:10-14:30",
        "14:20",
        false,
        true
    )
    val stopsModelDB8 = StopsModelDB(
        "02154",
        "Sari Tagh 3rd and 4rd lines, Yerevan, Armenia",
        40.163358,
        44.522457,
        "11:00-13:00",
        "12:50",
        false,
        false
    )
    val stopsModelDB9 = StopsModelDB(
        "5111235",
        "Sari Tagh 9th St, Yerevan 0054, Armenia",
        40.160165,
        44.524745,
        "09:00-10:00",
        "09:45",
        false,
        false
    )
    val stopsModelDB10 = StopsModelDB(
        "9878651",
        "8 Kajaznuni St, Yerevan 0070, Armenia",
        40.169464,
        44.519828,
        "09:00-10:00",
        "10:50",
        true,
        false
    )
    val stopsModelDB11 = StopsModelDB(
        "1215",
        "19 Nairi Zaryan St, Yerevan 0014, Armenia",
        40.204451,
        44.513275,
        "09:00-10:00",
        "09:45",
        false,
        false
    )
    val stopsModelDB12 = StopsModelDB(
        "987456",
        "1, 21 0015, Paronyan St, Yerevan, Armenia",
        40.182361,
        44.499293,
        "09:00-10:00",
        "09:45",
        false,
        false
    )
    val stopsModelDB13 = StopsModelDB(
        "00021",
        "18 Martiros Saryan St, Yerevan 0002, Armenia",
        40.185095,
        44.506664,
        "14:20-15:30",
        "15:45",
        false,
        true
    )
    val stopsModelDB14 = StopsModelDB(
        "88842",
        "25 Avet Avetisyan St, Yerevan 0033, Armenia",
        40.197603,
        44.498744,
        "09:50-11:00",
        "10:45",
        false,
        false
    )
    val stopsModelDB15 = StopsModelDB(
        "88788",
        "17 Hrachya Kochar St, Yerevan, Armenia",
        40.201012,
        44.500965,
        "16:00-17:00",
        "16:45",
        false,
        false
    )
    val stopsModelDB16 = StopsModelDB(
        "8436",
        "2 Komitas Ave, Yerevan 0124, Armenia",
        40.204367,
        44.502554,
        "22:20-23:00",
        "23:10",
        true,
        false
    )
    val stopsModelDB17 = StopsModelDB(
        "87452",
        "111 Manushian St, Yerevan 1245, Armenia",
        40.208333,
        44.502382,
        "09:20-10:00",
        "09:45",
        false,
        true
    )
    val stopsModelDB18 = StopsModelDB(
        "8651",
        "40 Mamikoniantc pokhoc, Yerevan 0004, Armenia",
        40.209204,
        44.519536,
        "14:00-15:00",
        "15:45",
        true,
        false
    )
    val stopsModelDB19 = StopsModelDB(
        "896656",
        "1 Nikoghayos Adonts St, Yerevan 0014, Armenia",
        40.209987,
        44.528604,
        "20:00-22:00",
        "21:45",
        false,
        false
    )

    stopsList.add(stopsModelDB)
    stopsList.add(stopsModelDB1)
    stopsList.add(stopsModelDB2)
    stopsList.add(stopsModelDB3)
    stopsList.add(stopsModelDB4)
    stopsList.add(stopsModelDB5)
    stopsList.add(stopsModelDB6)
    stopsList.add(stopsModelDB7)
    stopsList.add(stopsModelDB8)
    stopsList.add(stopsModelDB9)
    stopsList.add(stopsModelDB10)
    stopsList.add(stopsModelDB11)
    stopsList.add(stopsModelDB12)
    stopsList.add(stopsModelDB13)
    stopsList.add(stopsModelDB14)
    stopsList.add(stopsModelDB15)
    stopsList.add(stopsModelDB16)
    stopsList.add(stopsModelDB17)
    stopsList.add(stopsModelDB18)
    stopsList.add(stopsModelDB19)
    return stopsList
}