package com.geekbrains.myfirsttests

import kotlin.math.pow

class MathForTests {

    companion object {
        fun cubicRoot(number: Int): Double {
            return number.toDouble().pow(1 / 3.toDouble())
        }

        fun cubicToString(result: Double): String? {
            if (result == 0.0) return null
            return "Cubic result is $result"
        }

        fun copyList(listForCopied: IntArray) = listForCopied
    }
}