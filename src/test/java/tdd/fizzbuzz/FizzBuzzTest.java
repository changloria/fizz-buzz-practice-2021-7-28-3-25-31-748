package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_return_order_when_countoff_given_order_number_with_normal_case() {
        //given
        int order = 1;
        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.countOff(order);
        //then
        assertEquals("1", actual);
    }

    @Test
    void should_return_FizzBuzzWhizz_when_countoff_given_order_number_multiple_of_3_5_7() {
        //given
        int order = 105;
        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.countOff(order);
        //then
        assertEquals("FizzBuzzWhizz", actual);
    }

    @Test
    void should_return_FizzBuzz_when_countoff_given_order_number_multiple_of_3_5() {
        //given
        int order = 30;
        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.countOff(order);
        //then
        assertEquals("FizzBuzz", actual);
    }

    @Test
    void should_return_FizzWhizz_when_countoff_given_order_number_multiple_of_3_7() {
        //given
        int order = 21;
        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.countOff(order);
        //then
        assertEquals("FizzWhizz", actual);
    }

    @Test
    void should_return_BuzzWhizz_when_countoff_given_order_number_multiple_of_5_7() {
        //given
        int order = 35;
        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.countOff(order);
        //then
        assertEquals("BuzzWhizz", actual);
    }
}
