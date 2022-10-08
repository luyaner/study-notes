import org.springframework.transaction.annotation.Transactional

class DummyClass {
    @Transactional
    fun methodC() {
        println("Method C")
        throw NullPointerException()
    }
}
