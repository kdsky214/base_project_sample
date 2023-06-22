package com.kdang.base.sample.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor( ) : ViewModel() {
    val tag = "Main-VM"

    private val _outPrintLiveData:MutableLiveData<String> = MutableLiveData()
    val outPrintLiveData:LiveData<String> = _outPrintLiveData


    fun initData(){
        viewModelScope.launch(Dispatchers.Main){
            _outPrintLiveData.value = "메인 화면 출력하기 "
        }
    }
}