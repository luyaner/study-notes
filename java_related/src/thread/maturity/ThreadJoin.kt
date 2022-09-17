package thread.maturity

class ThreadJoin: Thread {

    constructor(s: String) {
        super.setName(s)
    }

    override fun run() {
        for (i in 1..10) {
            println("${this.name} ---- $i")
        }
    }
}

fun main() {
    for (i in 1..10) {
        if (i == 6) {
            val childThread = ThreadJoin("ChildThread")
            childThread.start()
            childThread.join()
        }
        println("${Thread.currentThread().name} ---- $i")
    }
}