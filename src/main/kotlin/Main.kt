import kotlin.math.sqrt

class PrimeNumbers {
    var count = 2

    fun isPrime(n: Int) : Boolean {
        var t = false
        for (i in 2..sqrt(n.toDouble()).toInt()) t = t || (n % i == 0)
        return !t
    }

    val Stream = generateSequence {(count++)}

    fun givePrimeNumbers(n: Int) = Stream.filter { isPrime(it) }.take(n).toList()
}
