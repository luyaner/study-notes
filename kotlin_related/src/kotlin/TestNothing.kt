class TestNothing {

    fun scoreChecker(score: Int) {
        when(score) {
            -1 -> TODO("Not a valid score.")
            in 0..59 -> println("Fail")
            in 60..70 -> println("Pass")
            in 71..80 -> println("Credit")
            in 81..90 -> println("Distinction")
            in 91..100 -> println("High Distinction")
        }
    }
}

fun main() {
    val test = TestNothing()

    test.scoreChecker(10)
    test.scoreChecker(80)
    test.scoreChecker(-1)
}