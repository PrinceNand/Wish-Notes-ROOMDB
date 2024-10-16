package com.example.wishnoteskotlin

import android.app.Application

class WishListApp: Application(){
    override fun onCreate() {
        super.onCreate()
        Graph.provide(this)
    }
}

/*
Global State Management:
    If you need to share resources or state across your entire app, the Application class is ideal.
    It provides a central place for managing such resources.
*/
