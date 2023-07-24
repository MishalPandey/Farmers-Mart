package com.mishalpandey.farmersmart.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.mishalpandey.farmersmart.R
import com.mishalpandey.farmersmart.databinding.FragmentProductBinding


class ProductFragment : Fragment() {

    private lateinit var binding : FragmentProductBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentProductBinding.inflate(layoutInflater)

        binding.floatingActionButton.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.action_productFragment_to_addproductFragment)
        }
        return binding.root
    }


}