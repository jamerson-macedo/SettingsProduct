package com.example.productsadder.data

interface RegisterCallback {
    fun onSuccess()
    fun onFailure(messager: String)
    fun onComplete()

}