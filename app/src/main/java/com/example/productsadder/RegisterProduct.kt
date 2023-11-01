package com.example.productsadder

interface RegisterProduct {
    interface Presenter{
        fun createProduct(product: Product)
    }
    interface View{
        fun showProgress(enabled: Boolean)
        fun onCreateSucces(name: String)
        fun onCreateFailure(message: String)
    }
}