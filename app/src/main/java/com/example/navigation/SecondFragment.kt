package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.navigation.Navigation

class SecondFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        view.findViewById<TextView>(R.id.fragment2TextView).setOnClickListener {
            val bundle = bundleOf("key" to "hey its from the second fragment")
            Navigation.findNavController(view).navigate(R.id.secondToNestedNavigationGraph,bundle)
        }
        return view
    }
}