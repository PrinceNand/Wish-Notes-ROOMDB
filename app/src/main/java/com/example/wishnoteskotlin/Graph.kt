package com.example.wishnoteskotlin

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.wishnoteskotlin.data.WishDatabase
import com.example.wishnoteskotlin.data.WishRepository

object Graph {

    private lateinit var database: WishDatabase

    val wishRepository by lazy {
        WishRepository(wishDao = database.wishDao())
    }

    fun provide(context: Context){
        database = Room.databaseBuilder(
            context,WishDatabase :: class.java, "wishlist.db"
        ).build()
    }
}

/*---------------------------------------------Theory-----------------------------------------------

Overview of Code Snippet

Purpose:
    Manages a singleton instance for database access and data repository in an Android application.
    Components


Singleton Object:
    Declared using "object Graph", ensuring only one instance exists throughout the application.
    Commonly used for dependency injection.

Lateinit Database:
    "private lateinit var database: WishDatabase:"
    "lateinit" allows the variable to be initialized later.
    Ensures that the database is set up before any access attempts.

Lazy Initialization of Repository:
    "val wishRepository by lazy { ... }:"
    Instantiates "WishRepository" only when it is first accessed.
    Utilizes "database.wishDao()" to get the DAO needed for data operations.
    Optimizes resource usage by delaying instantiation.

Provide Method:
    "fun provide(context: Context):"
    Initializes the "database" variable using Room's "databaseBuilder".
    Requires a "Context" to create the database instance.
    Should be called once during the application startup.


Use Case

Dependency Injection:
    Centralizes management of dependencies (database and repository).
    Promotes a single shared instance across the application.

Database Access:
    Provides easy access to "WishRepository" for interacting with the database.

Lazy Loading:
    Allocates resources only when necessary, enhancing performance.

Example of Usage
Typically called in the onCreate method of the Application class:
    "Graph.provide(this)" // Initializes the database

Access the wishRepository anywhere in the app to perform data operations:
    val repository = Graph.wishRepository
*/