package kata;

import org.apache.commons.math3.primes.Primes;

import java.util.List;

import static java.util.stream.Collectors.*;
import static java.util.stream.IntStream.*;
import static org.apache.commons.math3.primes.Primes.*;

public class PrimeFactors {

    public static List<Integer> generate(int number) {
        return rangeClosed(2, number).filter(value -> isPrime(value) && number % value == 0).boxed().collect(toList());
    }
}
