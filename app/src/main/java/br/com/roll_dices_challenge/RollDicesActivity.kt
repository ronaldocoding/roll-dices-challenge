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
        rollDices()
        setUpRollDicesButton()
    }

    private fun setUpRollDicesButton() {
        binding.rollDicesButton.setOnClickListener {
            rollDices()
        }
    }

    private fun rollDices() {
        val nextLeftDice = getRandomDice()
        val nextRightDice = getRandomDice()
        changeDices(nextLeftDice, nextRightDice)
    }

    private fun changeDices(leftDiceRollResult: Int, rightDiceRollResult: Int) {
        val nextLeftDiceId = getDiceId(leftDiceRollResult)
        val nextRightDiceId = getDiceId(rightDiceRollResult)

        binding.leftDice.setImageResource(nextLeftDiceId)
        binding.rightDice.setImageResource(nextRightDiceId)
    }

    private fun getDiceId(diceNumber: Int): Int {
        return resources.getIdentifier(
            "dice_$diceNumber",
            "drawable",
            packageName
        )
    }

    private fun getRandomDice(): Int = (1..6).random()

}