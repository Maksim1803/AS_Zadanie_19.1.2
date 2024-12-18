package com.example.zadanie1912

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val root = findViewById<ViewGroup>(R.id.root)
        val view = layoutInflater.inflate(R.layout.item, root, false)
        root.addView(view)
        val view1 = layoutInflater.inflate(R.layout.item, root, false)
        view1.visibility = View.INVISIBLE
        val view2 = layoutInflater.inflate(R.layout.item, root, false)
        view2.isEnabled = false
        val view3 = layoutInflater.inflate(R.layout.item, root, false)
        view3.setBackgroundColor(resources.getColor(R.color.colorAccent, theme))
        view3.setOnClickListener { }
        root.addView(view1)
        root.addView(view2)
        root.addView(view3)

    }
}