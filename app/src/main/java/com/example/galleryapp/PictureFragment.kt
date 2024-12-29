package com.example.galleryapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.galleryapp.databinding.FragmentPictureBinding

class PictureFragment : Fragment() {
    private var _binding: FragmentPictureBinding? = null
    private val binding get() = _binding!!

    private lateinit var picture: Picture

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            picture = it.getParcelable(ARG_PICTURE)!!
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPictureBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvTitle.text = picture.title
        binding.tvAuthor.text = picture.author
        binding.ivPicture.setImageResource(picture.imageResId)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        private const val ARG_PICTURE = "picture"

        fun newInstance(picture: Picture): PictureFragment {
            val fragment = PictureFragment()
            val args = Bundle()
            args.putParcelable(ARG_PICTURE, picture)
            fragment.arguments = args
            return fragment
        }
    }
}