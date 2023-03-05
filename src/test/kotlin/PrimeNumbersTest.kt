import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class PrimeNumbersTest {

    private val primeNumbersTest: PrimeNumbers = PrimeNumbers()

    @Test
    fun givePrimeNumbers() {
        val expected1 : List<Int> = listOf(2, 3, 5, 7, 11)
        val real1 = primeNumbersTest.givePrimeNumbers(5)
        val expected2 : List<Int> = emptyList()
        val real2 = primeNumbersTest.givePrimeNumbers(0)
        assertEquals(expected1, real1)
        assertEquals(expected2, real2)
    }
}