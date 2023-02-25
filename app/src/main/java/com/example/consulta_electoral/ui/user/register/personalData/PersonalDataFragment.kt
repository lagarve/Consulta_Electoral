package com.example.consulta_electoral.ui.user.register.acountData

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.consulta_electoral.R

class PersonalDataFragment : Fragment() {

    companion object {
        fun newInstance() = PersonalDataFragment()
    }

    private lateinit var viewModel: PersonalDataViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.fragment_personal_data, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PersonalDataViewModel::class.java)
        // TODO: Use the ViewModel
    }

}