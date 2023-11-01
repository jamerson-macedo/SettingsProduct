package com.example.productsadder.data

import com.example.productsadder.Product

class RegisterRepository(private val dataSource: RegisterDataSource) {
    fun createProduct(product: Product,callback: RegisterCallback){
        dataSource.createProduct(product,callback)
    }
}