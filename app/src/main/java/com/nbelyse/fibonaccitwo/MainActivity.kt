package com.nbelyse.fibonaccitwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.nbelyse.fibonaccitwo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        fibonacioSequence()
    }
    fun fibonacioSequence(){

            var i = 0
            val n = 100
            var t1 = 0
            var t2 = 1

            print("First $n terms: ")

            while (i <= n) {
                val sum = t1 + t2
                print("$t1 + ")

                 if (sum > 100){
                     print(",$sum")
                 }
                t1 = t2
                t2 = sum


            }




        binding.rvNames.layoutManager = LinearLayoutManager(this)
        val namesAdapter= rv_fibonacio(n)
        binding.rvNames.adapter = namesAdapter
    }

}