package com.example.apifetching

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.codepath.asynchttpclient.AsyncHttpClient
import com.codepath.asynchttpclient.callback.JsonHttpResponseHandler
import com.bumptech.glide.Glide
import okhttp3.Headers
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.math.BigInteger
import java.security.MessageDigest
import kotlin.time.measureTimedValue


class MainActivity : AppCompatActivity() {

    // Index to keep track of the current Pokémon being displayed
    private var currentIndex = 1
    private lateinit var nextButton: Button
    private lateinit var pokemonNameTextView: TextView
    private lateinit var pokemonImageView: ImageView
    private lateinit var pokemonWeightView: TextView
    private lateinit var pokemonTypeView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         nextButton = findViewById<Button>(R.id.nextButton)
         pokemonNameTextView = findViewById<TextView>(R.id.pokemonNameTextView)
        pokemonImageView = findViewById(R.id.pokemonImageView)
        pokemonWeightView = findViewById(R.id.weightView)
        pokemonTypeView = findViewById(R.id.typesView)
        // call to grab 20 names of pokemons and their correspondant url

        // Assuming you have a button named "nextButton" in your layout
        nextButton.setOnClickListener {
            getPokemons(currentIndex)
            currentIndex = currentIndex + 1
        }
    }

    private fun getPokemons(i: Int) {
        val client = AsyncHttpClient()
        val url = "https://pokeapi.co/api/v2/pokemon/$i/"
        client[url, object : JsonHttpResponseHandler() {
            override fun onFailure(
                statusCode: Int,
                headers: Headers?,
                response: String,
                throwable: Throwable?
            ) {
                Log.d("TAG", response)
            }

            override fun onSuccess(statusCode: Int, headers: Headers?, json: JSON) {
                Log.d("TAG", json.toString())
                val jsonObject = json.jsonObject
                val name = jsonObject.getString("name")
                val weight = jsonObject.getInt("weight")
                val typeJsonArray = jsonObject.getJSONArray("types")
                val types = mutableListOf<String>()
                for (i in 0 until typeJsonArray.length()) {
                    val typeObject = typeJsonArray.getJSONObject(i)
                    val typeName = typeObject.getJSONObject("type").getString("name")
                    types.add(typeName)
                }
                val spriteUrl = jsonObject.getJSONObject("sprites").getString("front_default")


                updateUI(name, types.joinToString(", "), weight.toString(), spriteUrl)

            }
        }] // client
    }

    private fun updateUI(name: String, types: String, weight: String, spriteUrl: String) {
        // Update TextView and ImageView here
        pokemonNameTextView.text = name
        pokemonWeightView.text = "Weight: "+ weight
        pokemonTypeView.text = "Type: " +types
        Glide.with(this)
            .load(spriteUrl)
            .placeholder(R.drawable.pokemonimg)
            .error(R.drawable.pokemonimg)
            .into(pokemonImageView)
    }
}

