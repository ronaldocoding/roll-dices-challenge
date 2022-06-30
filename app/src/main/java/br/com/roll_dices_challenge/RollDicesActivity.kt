package br.com.roll_dices_challenge

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.roll_dices_challenge.databinding.ActivityRollDicesBinding

class RollDicesActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityRollDicesBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = binding.root
        setContentView(view)
    }

    private fun getRandomDice(): Int = (1..6).random()

}