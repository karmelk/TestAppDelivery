package com.kmwork.entities

data class DeliveryException<ErrorBody>(val errorCode: Int, val errorBody: ErrorBody? = null, val errorMessage:String?=null)