package com.example.challengecomparis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.challengecomparis.R

class MainActivity : AppCompatActivity() {
    //    private var binding:
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var `fun`: override? = null
    fun onCreateView()
    fun View() {
        binding = MainFragmentBinding.inflate(inflater, container, false)
        with(binding)
        run {
            listsRecyclerview.layoutManager = LinearLayoutManager(requireContext())
            listsRecyclerview.adapter = ListSelectionRecyclerViewAdapter()
            return binding.root
            var onClick: navigateBtn
            {}
        }
    }
}