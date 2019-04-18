package io.access.kotlintraining

import org.junit.Test
import java.lang.Exception
import kotlin.random.Random


class SampleTest {

    class Dice(n:Int){
        init {
            require(n > 0){"not support range. n>0"}
        }

        //class内でnを定義してあげる？ thisで使う的な
        val n:Int = n

        //回数
        var num = 0


        fun roll():Int {
            this.num += 1
//            check(this.num <= 100){"I was broken"}f

            if(this.num <= 100){
                throw Exception("I was broken")
            }

            if(this.n == 1) return 1
            else            return Random.nextInt(1, this.n)
        }
    }


    class MyCustomClass {
        var counter: Int = 0

        var propertyWithCounter: Int = 0
        set(i){
            counter += 1
        }
    }

    class NabeAtsu {
        // TODO: 実装する
        var num = 0

        fun next(): String {
            // TODO: 実装する
            this.num += 1

            when{
                this.num % 3 == 0 -> return "aho"
                this.num.toString().indexOf('3') != -1 -> return "aho"
                else -> return this.num.toString()

            }
        }
    }


    @Test
    fun testWelcome() {
//        welcome()
//
//        // Example of test
//        val expected = 1
//        val actual = 1
//        assertEquals(expected, actual, "[want] $expected [got] $actual")

        //TODO 課題1
//        testFizzBuzz()

        //TODO 課題2
//        val leapyear = listOf<Int>( 1804, 1808, 1812, 1816, 1820, 1824, 1828, 1832, 1836, 1840, 1844, 1848, 1852,
//                                    1856, 1860, 1864, 1868, 1872, 1876, 1880, 1884, 1888, 1892, 1896, 1904, 1908,
//                                    1912, 1916, 1920, 1924, 1928, 1932, 1936, 1940, 1944, 1948, 1952, 1956, 1960,
//                                    1964, 1968, 1972, 1976, 1980, 1984, 1988, 1992, 1996, 2000, 2004, 2008, 2012,
//                                    2016, 2020, 2024, 2028, 2032, 2036, 2040, 2044, 2048, 2052, 2056, 2060, 2064,
//                                    2068, 2072, 2076, 2080, 2084, 2088, 2092, 2096, 2104, 2108, 2112, 2116, 2120,
//                                    2124, 2128, 2132, 2136, 2140, 2144, 2148)
//
//        for (year in leapyear){
//            if(isLeapYear(year)){
////                println("leap year!")
//            }else{
//                println("not leap year")
//                print(year)
//                break
//            }
//        }

        //TODO 課題3
//        val a = 3
//        val b = 2
//        print( power(a, b) )

        //TODO 課題4
//        var num = 3
//        print(num.isEven())
//        print(num.addisOdd())

        //TODO 課題5
//        val d = Dice(10)
//
//        for(i in 1..100) {
//            println(d.roll())
//        }
//        d.roll()


        //TODO 課題6
//        val p = MyCustomClass()
//        p.propertyWithCounter = 123
//        p.propertyWithCounter = 456
//        p.propertyWithCounter = 789
//        println(p.counter)

        //TODO 課題7
//        val n = NabeAtsu()
//
//        for(i in 1..100){
//            println(n.next())
//        }

        //TODO 課題8
        val client = Client(PersonalInfo("test"))
        val message = "message"
        val mailer = tmpMailer()

        sendMessageToClient(client, message, mailer)




    }

    fun testFizzBuzz(){

        for (i in 1..100){
            when{
                i % 15 == 0 -> println("Fizz Buzz")
                i % 3 == 0 -> println("Fizz")
                i % 5 == 0 -> println("Buzz")
                else -> println(i)
            }
        }
    }

    fun isLeapYear(y: Int): Boolean {
        var result = false

        //もし4でわりきれるか
        if( y % 4 == 0 ){
            if( (y % 100 == 0) || (y % 400 != 0) ){
                result = true
            }
        }


        return result
    }

    fun power(a: Int, n: Int): Long {
        if (a < 0 || n < 0) {
            println("inputs must be positive. return 0")
            return 0
        }

        return Math.pow(a.toDouble(), n.toDouble()).toLong()
    }


    fun Int.addisOdd(): Boolean{
        var result = false

        if( this % 2 == 1 ) {
            result = true
        }
        return result
    }

    fun Int.isEven(): Boolean{
        var result = false

        if( this % 2 == 0){
            result = true
        }
        return result
    }



    fun sendMessageToClient(client: Client?, message: String?, mailer: Mailer) {
        // TODO: 実装する

        client ?: return
        message ?: return

        val personalInfo = client.personalInfo

        val email = personalInfo?.email

        email?.let { mailer.sendMessage(it, message) }




    }

    // コンパイル通すための諸々
    class Client (val personalInfo: PersonalInfo?)
    class PersonalInfo (val email: String?)

    class tmpMailer : Mailer {
        override fun sendMessage(email: String, message: String) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    }


    interface Mailer {

        fun sendMessage(email: String, message: String)
    }
}