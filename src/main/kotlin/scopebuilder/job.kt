package scopebuilder

import kotlinx.coroutines.*

//coroutineScope: 현재 스레드를 멈추지 않고 호출한 쪽이 suspend 되고 시간이 지나면 다시 수행.
suspend fun builder() = coroutineScope {
    val job = launch {
        delay(1000L)
    }
    job.join() // job 객체의 launch 블록이 끝날 때까지 기다림.
}

//runBlocking: 현재 스레드를 멈추게 만들고 기다림.
fun main() = runBlocking<Unit> {
    builder()
}