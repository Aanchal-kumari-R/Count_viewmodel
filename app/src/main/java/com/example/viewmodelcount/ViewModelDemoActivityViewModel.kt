package com.example.viewmodelcount

import androidx.lifecycle.ViewModel

class ViewModelDemoActivityViewModel:ViewModel() {
    var count:Int=0
    fun updateCount() {
        count++
    }

}