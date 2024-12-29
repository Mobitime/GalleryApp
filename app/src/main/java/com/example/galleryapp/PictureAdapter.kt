package com.example.galleryapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class PictureAdapter(fragmentActivity: FragmentActivity, private val pictures: List<Picture>) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int = pictures.size

    override fun createFragment(position: Int): Fragment {
        return PictureFragment.newInstance(pictures[position])
    }
}