package com.example.realestate.models

class Product {
    var name:String = ""
    var quantity:String = ""
    var price:String = ""
    var phone:String = ""
    var imageUrl:String = ""
    var id:String = ""

    constructor(name: String, quantity: String, price: String,phone: String, imageUrl: String, id: String) {
        this.name = name
        this.quantity = quantity
        this.price = price
        this.phone = phone
        this.imageUrl = imageUrl
        this.id = id
    }

    constructor()
}