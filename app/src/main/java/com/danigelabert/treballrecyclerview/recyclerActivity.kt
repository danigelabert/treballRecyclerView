package com.danigelabert.treballrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.danigelabert.treballrecyclerview.databinding.ActivityRecyclerBinding

class recyclerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRecyclerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}