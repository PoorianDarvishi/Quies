package com.example.navigation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class InfoFragmentViewModel : ViewModel() {
    val userName = MutableLiveData<String>()
    val password = MutableLiveData<String>()
    val save = MutableLiveData<String>()

}