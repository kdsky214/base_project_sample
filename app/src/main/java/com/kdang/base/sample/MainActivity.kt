package com.kdang.base.sample

import androidx.activity.viewModels
import com.kdang.base.sample.base.BaseActivity
import com.kdang.base.sample.databinding.ActivityMainBinding
import com.kdang.base.sample.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>(){
    private val viewModel: MainViewModel by viewModels()
    override val layoutResourceId = R.layout.activity_main

    override fun initView() {
        viewModel.initData()
    }

    override fun initObserver() {
        viewModel.outPrintLiveData.observe(this){ value->
            binding.tvMain.text = value
        }
    }
}