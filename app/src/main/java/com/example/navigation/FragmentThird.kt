package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation

class FragmentThird : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_third, container, false)
        view.findViewById<TextView>(R.id.fragment3TextView).text = arguments?.getString("key").toString()
            view.findViewById<TextView>(R.id.fragment3TextView).setOnClickListener {

                Navigation.findNavController(view).navigate(R.id.thirdFragmentToFirstFragment)
            }
        return view
    }

}