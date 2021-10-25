package com.geekbrains.myfirsttests

import org.junit.Assert
import org.junit.Test

class CubicRootTest {

    @Test
    fun cubicRoot_simpleEquals_toThree() {
        Assert.assertEquals(MathForTests.cubicRoot(27), 3.0, 0.0)
    }

    @Test
    fun cubicRoot_simpleNotEqual() {
        Assert.assertNotEquals(MathForTests.cubicRoot(21), 3.0, 0.0)
    }

    @Test
    fun cubicRoot_simpleNotNull() {
        Assert.assertNotNull(MathForTests.cubicToString(3.0))
    }

    @Test
    fun cubicRoot_simpleIsNull() {
        Assert.assertNull(MathForTests.cubicToString(0.0))
    }

    @Test
    fun listOfCopy_simpleArrayEqual() {
        val arrayToCheck = intArrayOf(1, 2, 3)
        Assert.assertArrayEquals(MathForTests.copyList(arrayToCheck), arrayToCheck)
    }
}