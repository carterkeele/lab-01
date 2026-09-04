package com.example.petshop

abstract class Mood(val date: String, val pet: Pet) {
    abstract fun showMood(): String
}