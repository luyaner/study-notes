package thread.maturity

import java.text.SimpleDateFormat
import java.util.Date

fun main() {
        val format = SimpleDateFormat("HH:mm:ss")
    while (true) {
        val date = Date()
        println(format.format(date))
        Thread.sleep(1000)
    }
}