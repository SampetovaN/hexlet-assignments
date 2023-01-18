package exercise;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class ReversedSequenceTest {
    @Test
    void testReversedSequenceTest1() {
        CharSequence text = new ReversedSequence("abcdef");
        String expected = "fedcba";
        String result = text.toString();
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void testReversedSequenceTest2() {
        CharSequence text = new ReversedSequence("abcdef");
        char expected = 'e';
        char result = text.charAt(1);
        assertThat(result).isEqualTo(expected);

    }

    @Test
    void testReversedSequenceTest3() {
        CharSequence text = new ReversedSequence("abcdef");
        String expected = "edc";
        String result = text.subSequence(1, 4).toString();
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void testReversedSequenceTest4() {
        CharSequence text = new ReversedSequence("abcdef");
        int expected = 6;
        int result = text.length();
        assertThat(result).isEqualTo(expected);
    }

    // BEGIN
    
    // END
}
