package com.example.android.fitnesstracker.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.android.fitnesstracker.R
import com.example.android.fitnesstracker.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TrackingFragment : Fragment(R.layout.fragment_tracking) {

    private val viewModel: MainViewModel by viewModels()

}