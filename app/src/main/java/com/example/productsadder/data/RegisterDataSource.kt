package com.example.productsadder.data

import com.example.productsadder.Product
import com.example.productsadder.RegisterProduct

interface RegisterDataSource {
    fun createProduct(product: Product,registerCallback: RegisterCallback)
}