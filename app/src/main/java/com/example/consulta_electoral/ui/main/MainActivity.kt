package com.example.consulta_electoral

import android.app.Activity
import android.os.Bundle
import com.example.consulta_electoral.databinding.ActivityMainBinding

class MainActivity : Activity() {

    private lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
    }
}