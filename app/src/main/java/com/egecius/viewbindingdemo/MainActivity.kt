package com.egecius.viewbindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.egecius.viewbindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.showToast.setOnClickListener {
        	Toast.makeText(this, "clicked from ViewBinding", Toast.LENGTH_SHORT).show()
        }
    }
}
