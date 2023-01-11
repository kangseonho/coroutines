package scopebuilder

import kotlinx.coroutines.*;

//하나의 스레드 안에서 여러 코드 블럭 수행.
fun delay() = runBlocking {
    launch {
        println("launch: ${Thread.currentThread().name}")
        delay(100L) //suspension point
        println("World!")
    }
    println("runBlocking: ${Thread.currentThread().name}")
    delay(500L) //suspension point
    println("Hello")
}

fun sleep() = runBlocking {
    launch {
        println("launch: ${Thread.currentThread().name}")
        println("World!")
    }
    println("runBlocking: ${Thread.currentThread().name}")
    Thread.sleep(500)
    println("Hello")
}

/*
fun main() {
    delay()
    sleep()
}
*/