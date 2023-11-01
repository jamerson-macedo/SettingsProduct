package com.example.productsadder.presenter

import com.example.productsadder.Product
import com.example.productsadder.RegisterProduct
import com.example.productsadder.data.RegisterCallback
import com.example.productsadder.data.RegisterRepository

class RegisterPresenter(private val view: RegisterProduct.View,val registerRepository: RegisterRepository):RegisterProduct.Presenter {
    override fun createProduct(product: Product) {
        val isnameValid = product.name.length > 3

        registerRepository.createProduct(product,object :RegisterCallback{
            override fun onSuccess() {
                //
            }

            override fun onFailure(messager: String) {
               //
            }

            override fun onComplete() {
                //
            }

        })
    }
}