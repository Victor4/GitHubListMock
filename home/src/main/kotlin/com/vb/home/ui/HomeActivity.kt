package com.vb.home.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vb.home.adapter.RepoAdapter
import com.vb.home.databinding.ActivityHomeBinding
import org.koin.android.viewmodel.ext.android.viewModel

class HomeActivity : AppCompatActivity() {

    val homeViewModel : HomeViewModel by viewModel()

    private lateinit var binding: ActivityHomeBinding
    private var adapter = RepoAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.repositoryRecyclerView.adapter = adapter
        adapter.submitList(homeViewModel.getGitHubProjects("victor"))

    }

}