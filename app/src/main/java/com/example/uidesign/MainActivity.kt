package com.example.uidesign

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.HandlerThread
import android.os.Looper
import com.example.uidesign.databinding.ActivityMainBinding
import kotlinx.coroutines.Runnable
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    private lateinit  var adapter1:Adapter
    lateinit var imageList: List<Int>
    private var currentPage = 0
    private var timer: Timer? = null

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        imageList = ArrayList<Int>()

        imageList = imageList + R.drawable.technology1
        imageList = imageList + R.drawable.technology2
        imageList = imageList + R.drawable.nature

        adapter1 = Adapter(this,imageList)

        binding.pager.adapter = adapter1

        /*val handler = Handler()
        val runnable = Runnable {
            binding.pager.currentItem = (binding.pager.currentItem + 1) % imageList.size
            handler.postDelayed(runnable, 3000)
        }
        handler.postDelayed(runnable, 3000)*/
        val timer = Timer()
        val timerTask = object : TimerTask() {
            override fun run() {
                runOnUiThread {
                    binding.pager.currentItem = (binding.pager.currentItem + 1) % imageList.size
                }
            }
        }
        timer.scheduleAtFixedRate(timerTask, 4000, 3000)
    }

    /*private fun autoScroll(interval:Long){
        var scrollPosition = 0;

        val runnable =  object : Runnable {
            override fun run() {

                val count = adapter1?.itemCount?:0

                Handler(Looper.getMainLooper()).postDelayed(runnable, 2000)
            }

        }

    }*/
}