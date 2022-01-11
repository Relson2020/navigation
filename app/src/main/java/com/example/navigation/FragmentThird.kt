package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.navigation.databinding.FragmentThirdBinding

class FragmentThird : Fragment() {
    private val args : FragmentThirdArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val binding: FragmentThirdBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_third, container, false)
        val view = binding.root

        val data  = args.args
        binding.fragment3TextView.text = data.toString()

        binding.fragment3TextView.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.thirdFragmentToFirstFragment)
        }
        return view
    }

}