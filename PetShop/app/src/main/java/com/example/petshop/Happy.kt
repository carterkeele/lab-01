package com.example.petshop

class Happy(date: String, pet: Pet): Mood(date, pet) {
    override fun showMood(): String {
        return "They are happy as of $date"
    }
}