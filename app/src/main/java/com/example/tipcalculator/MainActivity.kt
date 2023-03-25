package com.example.tipcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.tipcalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val calculate: Button = binding.calculateButton

        calculate.setOnClickListener {
            val moneyAmount = binding.moneyAmount.text.toString().toDouble()
            val tipPercent = binding.tipPercent.text.toString().toDouble()
            binding.tipAmount.text = getString(R.string.tip_amount, (moneyAmount  * (tipPercent / 100.0)).toString())
        }

    }
}