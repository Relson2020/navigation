package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.navigation.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val binding : FragmentSecondBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_second, container, false)
        val view = binding.root
       binding.fragment2TextView.setOnClickListener {
            val action = SecondFragmentDirections.secondToNestedNavigationGraph(2)
            Navigation.findNavController(view).navigate(action)
        }
        return view
    }
}