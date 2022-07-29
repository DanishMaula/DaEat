package com.danish.daeat

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.danish.daeat.data.Recipe
import com.danish.daeat.data.ResepData


class MainActivity : AppCompatActivity() {


    private lateinit var rvRecipe: RecyclerView
    private var list: ArrayList<Recipe> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        supportActionBar?.hide()

        rvRecipe = findViewById(R.id.rv_list)
        rvRecipe.setHasFixedSize(true)

        list.addAll(ResepData.listFood)
        showRecyclerList()

        val btnProfile: ImageButton = findViewById(R.id.circle_image)
        btnProfile.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

    }

    private fun showRecyclerList() {
        rvRecipe.layoutManager = LinearLayoutManager(this)
        val listRecipeAdapter = ListAdapter(list)
        rvRecipe.adapter = listRecipeAdapter
    }
}