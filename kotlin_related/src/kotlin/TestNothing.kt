class TestNothing {

    fun scoreChecker(score: Int) {
        when(score) {
            -1 -> throw Exception()
            -2 -> TODO("test")
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
    test.scoreChecker(-2)
    test.scoreChecker(-1)
    test.scoreChecker(100)
}