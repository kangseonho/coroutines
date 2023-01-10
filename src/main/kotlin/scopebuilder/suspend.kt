package scopebuilder

import kotlinx.coroutines.*;

suspend fun world() {
    println("runBlocking: ${Thread.currentThread().name}")
    delay(500L)
    println("world")
}

suspend fun hello() = runBlocking {
    println("runBlocking: ${Thread.currentThread().name}")
    delay(100L)
    println("Hello")
}

fun main() = runBlocking<Unit> {
    launch {
        world()
    }
    launch {
        hello()
    }
}