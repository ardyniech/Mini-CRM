package com.minicrm.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.minicrm.viewmodel.CustomerViewModel

class MainActivity : AppCompatActivity() {
    private val viewModel: CustomerViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.customerList.observe(this) {
            // Update UI/RecyclerView here
        }
    }
}