package com.example.android.fitnesstracker.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.android.fitnesstracker.R
import com.example.android.fitnesstracker.viewmodel.StatisticsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StatisticsFragment : Fragment(R.layout.fragment_statistics) {

    private val viewModel: StatisticsViewModel by viewModels()
}