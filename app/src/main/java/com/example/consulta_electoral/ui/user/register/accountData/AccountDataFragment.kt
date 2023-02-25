package com.example.consulta_electoral.ui.user.register.acountData

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.consulta_electoral.databinding.FragmentAcountDataBinding

class AcountDataFragment : Fragment() {

    private var _binding: FragmentAcountDataBinding? = null
    private val binding get() =_binding!!
    private lateinit var acountDataViewModel: AcountDataViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        acountDataViewModel = ViewModelProvider(this)[AcountDataViewModel::class.java]
        _binding = FragmentAcountDataBinding.inflate(inflater, container, false)


        return binding.root
    }
    override fun onDestroyView(){
        super.onDestroyView()
        _binding = null
    }


}