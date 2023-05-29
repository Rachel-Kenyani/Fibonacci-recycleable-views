package com.cyanide.fibonacciorecycleableviews

import NumbersRVAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.cyanide.fibonacciorecycleableviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding=ActivityMainBinding.inflate(layoutInflater)

    }
    override fun onResume() {
        super.onResume()
        fibonacciTo100()
    }
    fun fibonacciTo100(){

        var first = 0
        var second = 1
        var c: Int
        println("Numbers to 100:")
        print("$first, $second")
        var numbers_list= mutableListOf<Int>(first,second)
        while (true) {
            c = first + second
            if (c > 100)
                break
            numbers_list.add(c)

            first= second
            second= c

    }
        binding.rvnames.layoutManager=LinearLayoutManager(this)
       var adapter=NumbersRVAdapter(numbers_list)
        binding.rvnames.adapter=adapter
}}
