package io.access.kotlintraining

import org.junit.Test
import kotlin.test.assertEquals

class SampleTest {
    @Test
    fun testWelcome() {
        welcome()

        // Example of test
        val expected = 1
        val actual = 1
        assertEquals(expected, actual, "[want] $expected [got] $actual")


        //hello Funcを呼びだす
        hello()
    }

//    @Test
//    fun testHello() {
//        // TODO: implement to call hello function
//    }

    fun hello(){
        println("HEllo Wortld")
    }
}