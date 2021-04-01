import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WordWrap2Test {

    @Test
    void shouldNotWrapEmptyString() {
        assertThat(WordWrap2.wrap("", 0)).isEqualTo("");
    }

    @Test
    void shouldNotWrap_whenTextLength_isSmallerThanColumnSize() {
        assertThat(WordWrap2.wrap("e", 1)).isEqualTo("e");
    }

    @Test
    void shouldWrap() {
        assertThat(WordWrap2.wrap("ee", 1)).isEqualTo("e\ne");
    }

    @Test
    void shouldWrapTwice() {
        assertThat(WordWrap2.wrap("eee", 1)).isEqualTo("e\ne\ne");
    }

    @Test
    void shouldRemoveSpaceBeforeWrap() {
        assertThat(WordWrap2.wrap("e ee", 2)).isEqualTo("e\nee");
    }

}