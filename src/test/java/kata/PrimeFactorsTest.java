package kata;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.*;
import static java.util.Collections.singletonList;
import static kata.PrimeFactors.*;
import static org.junit.Assert.*;

public class PrimeFactorsTest {

    @Test
    public void shouldBeAbleToFactorVariousNumbers() {
        assertTrue(generate(2).containsAll(singletonList(2)));
        assertTrue(generate(3).containsAll(singletonList(3)));
        assertTrue(generate(5).containsAll(singletonList(5)));
        assertTrue(generate(7).containsAll(singletonList(7)));
    }

    @Test
    public void shouldReturnMoreThanOneFactorsIfNeeded() {
        assertTrue(generate(4).containsAll(singletonList(2)));
        assertTrue(generate(6).containsAll(asList(2, 3)));
        assertTrue(generate(9).containsAll(singletonList(3)));
        assertTrue(generate(10).containsAll(asList(2, 5)));
        assertTrue(generate(8).containsAll(singletonList(2)));
    }


}