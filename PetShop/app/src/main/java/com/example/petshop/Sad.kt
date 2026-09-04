package com.example.petshop

class Sad(date: String, pet: Pet): Mood(date, pet) {
    override fun showMood(): String {
        return "They are sad as of $date"
    }
}