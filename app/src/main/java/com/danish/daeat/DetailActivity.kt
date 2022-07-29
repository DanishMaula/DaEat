package com.danish.daeat

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.danish.daeat.data.Recipe
import com.danish.daeat.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    companion object {
        const val RECIPES_DATA = "recipe"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        val data = intent.getParcelableExtra<Recipe>(RECIPES_DATA)
        binding.tvTitle.text = data?.name
        binding.tvDetail.text = data?.description
        binding.tvInstruction.text = data?.instructions
        binding.tvBahanBahan.text = data?.ingredients

        Glide.with(this)
            .load(data?.photo)
            .into(binding.imgDetail)
    }

}