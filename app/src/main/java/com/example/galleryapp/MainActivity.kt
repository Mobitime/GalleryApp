package com.example.galleryapp

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    private lateinit var viewPager: ViewPager2
    private lateinit var adapter: PictureAdapter

    private val pictures = listOf(
        Picture("Звёздная ночь", "Винсент Ван Гог", R.drawable.starry_night),
        Picture("Мона Лиза", "Леонардо да Винчи", R.drawable.mona_lisa),
        Picture("Сотворение Адама", "Микеланджело", R.drawable.creation_of_adam),
        Picture("Девушка с жемчужной серёжкой", "Йоханнес Вермеер", R.drawable.girl_with_a_pearl_earring),
        Picture("Крик", "Эдвард Мунк", R.drawable.the_scream),
        Picture("Тайная вечеря", "Леонардо да Винчи", R.drawable.last_supper),
        Picture("Сад земных наслаждений", "Иероним Босх", R.drawable.garden_of_earthly_delights),
        Picture("Ночной дозор", "Рембрандт", R.drawable.night_watch),
        Picture("Сельский праздник", "Питер Брейгель Старший", R.drawable.rural_festival),
        Picture("Автопортрет с отрезанным ухом", "Винсент Ван Гог", R.drawable.self_portrait_with_cut_off_ear)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        viewPager = findViewById(R.id.viewPager)
        adapter = PictureAdapter(this, pictures)
        viewPager.adapter = adapter
    }





}