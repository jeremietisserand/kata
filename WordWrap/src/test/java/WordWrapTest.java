import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class WordWrapTest {

    @Test
    void shouldNotWrap() {
        // WHEN
        String result = WordWrap.wrap("Small content", 20);

        // THEN
        assertThat(result).isEqualTo("Small content");
    }

    @Test
    void shouldWrapAtLimit() {
        // WHEN
        String result = WordWrap.wrap("Content",3);

        // THEN
        assertThat(result).isEqualTo("Con\nten\nt");
    }

    @Test
    void shouldNotWrapAtLimit() {
        // WHEN
        String result = WordWrap.wrap("Content",7);

        // THEN
        assertThat(result).isEqualTo("Content");
    }

    @Test
    void shouldWrapAtLastSpace(){
        // WHEN
        String result = WordWrap.wrap("Content is large enougth to be split", 13);

        // THEN
        assertThat(result).isEqualTo("Content is\nlarge enougth\nto be split");
    }
}