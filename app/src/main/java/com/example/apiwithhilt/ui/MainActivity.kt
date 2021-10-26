package com.example.apiwithhilt.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import com.example.apiwithhilt.R
import com.example.apiwithhilt.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import okhttp3.internal.wait

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
     private val viewModel: MainActivityViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
          viewModel.getCountry()

                viewModel.reponse.observe(this@MainActivity, Observer {

                    binding.progressBar.isVisible=false
                    binding.tv1.isVisible=true
                    binding.tv2.isVisible=true

                    binding.tv1.text = it.name
                    binding.tv2.text = it.capital
                })
        val list= mutableListOf<Int>(5,8,2,22,4)


             list.binarySearch (22).also {  Log.d("act "," the result is $it")}



            }




    }

