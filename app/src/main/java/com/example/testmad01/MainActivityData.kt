package com.example.testmad01

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.testmad01.database.Student
import com.example.testmad01.database.StudentRepository
import kotlinx.coroutines.launch

class MainActivityData: ViewModel(){

    private val _data = MutableLiveData<List<Student>>()

    val data: LiveData<List<Student>> = _data
    fun setData(data:List<Student>){
        _data.value = data
    }

}