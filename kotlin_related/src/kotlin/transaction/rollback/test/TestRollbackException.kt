import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
class TestRollbackException(
    private val dummyClass: DummyClass
) {

    @Transactional
    fun methodA() {
        methodB()
    }

    private fun methodB() {
        dummyClass.methodC()
    }
}

fun main() {
    val dummyClass = DummyClass()
    val testRollbackException = TestRollbackException(dummyClass = dummyClass)

    try {
        testRollbackException.methodA()
    } catch (exception: Exception) {
        println(exception)
    }
}