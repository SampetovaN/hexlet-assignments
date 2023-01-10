package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Map;

import org.junit.jupiter.api.Test;

class AppTest {

    private static final List<Integer> NUMBERS_1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
    private static final List<Integer> NUMBERS_2 = new ArrayList<>(Arrays.asList(7, 3, 10));
    private static final List<Integer> NUMBERS_3 = new ArrayList<>();
    @Test
    void testTake() {
        // BEGIN
        List<Integer> actual1 = App.take(NUMBERS_1, 2);
        List<Integer> actual2 = App.take(NUMBERS_2, 8);
        List<Integer> actual3 = App.take(NUMBERS_3, 9);
        assertThat(actual1).isEqualTo(Arrays.asList(1,2));
        assertThat(actual2).isEqualTo(Arrays.asList(7, 3, 10));
        assertThat(actual3).isEqualTo(Arrays.asList());
        // END
    }
}
