import Wrapper.Wrapper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ExampleTest {

    @Test
    void shouldDoNothing_whenWrapLongerThanSentence() {
        String sentence = "mot1";

        String result = Wrapper.wrap(sentence, 10);

        assertThat(result).isEqualTo("mot1");
    }

    @Test
    void shouldCutWord() {
        String sentence = "mot1";

        String result = Wrapper.wrap(sentence, 2);

        assertThat(result).isEqualTo("mo\nt1");
    }

    @Test
    void shouldCutWordMultipleTimes() {
        String sentence = "mot1";

        String result = Wrapper.wrap(sentence, 1);

        assertThat(result).isEqualTo("m\no\nt\n1");
    }

    @Test
    void shouldRemoveTrailingSpaces() {
        String sentence = "word word";

        String result = Wrapper.wrap(sentence, 5);

        assertThat(result).isEqualTo("word\nword");
    }

    @Test
    void shouldSplitAtWordBoundaries() {
        String sentence = "word word";

        String result = Wrapper.wrap(sentence, 6);

        assertThat(result).isEqualTo("word\nword");
    }

    @Test
    void shouldSplitAtWordBoundaries_multipleTimes() {
        String sentence = "word word word";

        String result = Wrapper.wrap(sentence, 5);

        assertThat(result).isEqualTo("word\nword\nword");
    }

    @Test
    void shouldSplitAtWordBoundaries_multipleTimes_keepingSpaces() {
        String sentence = "word word word";

        String result = Wrapper.wrap(sentence, 11);

        assertThat(result).isEqualTo("word word\nword");
    }
}
