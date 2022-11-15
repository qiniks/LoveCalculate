package com.example.lovecalculate.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.lovecalculate.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = NavHostFragment.findNavController(this)
        argumentsAndSet()
        initClick()
    }

    private fun initClick() {
        binding.tryAgainBtn.setOnClickListener {
            navController.navigateUp()
        }
    }

    private fun argumentsAndSet() {
        binding.firstName.text = arguments?.getString("firstName")
        binding.secondName.text = arguments?.getString("secondName")
        binding.percent.text = arguments?.getString("percentage")
        binding.result.text = arguments?.getString("result")
    }


}