package com.example.viewmodelcount

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodelcount.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    lateinit var viewModel: ViewModelDemoActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModel=ViewModelProvider(this).get(ViewModelDemoActivityViewModel::class.java)
        binding.tvCount.text=viewModel.count.toString()

        binding.button.setOnClickListener {
          viewModel.updateCount()
            binding.tvCount.text=viewModel.count.toString()
        }
    }
}