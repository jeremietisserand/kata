import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class LinkedListTest {

    @Test
    void shouldNotFindAnyElement_whenListIsEmpty() {
        CustomList myList = new CustomList();

        Assertions.assertThat(myList.find("kata")).isNotPresent();
    }

    @Test
    void shouldFindElement_whenElementIsAppend() {
        CustomList myList = new CustomList();
        myList.add("kata");

        Optional<String> foundItem = myList.find("kata");
        Assertions.assertThat(foundItem).isPresent();
        Assertions.assertThat(foundItem).contains("kata");
    }

    @Test
    void shouldNotFindElement_whenListIsNotEmpty() {
        CustomList myList = new CustomList();
        myList.add("kata");
        myList.add("kata-bis");

        Assertions.assertThat(myList.find("toto")).isNotPresent();
    }


    @Test
    void shouldFindFirstElement_whenListContainsElements() {
        CustomList myList = new CustomList();
        myList.add("kata");
        myList.add("kata-bis");

        Optional<String> foundItem = myList.find("kata");
        Assertions.assertThat(foundItem).isPresent();
        Assertions.assertThat(foundItem).contains("kata");
    }

    @Test
    void shouldGetLength_whenListIsEmpty() {
        CustomList myList = new CustomList();

        Assertions.assertThat(myList.length()).isEqualTo(0);
    }

    @Test
    void shouldGetLength_whenListContainsElements() {
        CustomList myList = new CustomList();
        myList.add("kata");
        myList.add("kata-bis");

        Assertions.assertThat(myList.length()).isEqualTo(2);
    }

    @Test
    void shouldNotDeleteElement_whenListIsEmpty() {
        CustomList myList = new CustomList();

        myList.deleteFirst("kata");

        Assertions.assertThat(myList.length()).isEqualTo(0);
    }

    @Test
    void shouldNotDeleteElement_whenElementIsNotInList() {
        CustomList myList = new CustomList();
        myList.add("kata-bis");

        myList.deleteFirst("kata");

        Assertions.assertThat(myList.length()).isEqualTo(1);
    }

    @Test
    void shouldDeleteFirstElement_whenListContainsElements() {
        CustomList myList = new CustomList();
        myList.add("kata");
        myList.add("kata-bis");

        myList.deleteFirst("kata");

        Assertions.assertThat(myList.length()).isEqualTo(1);
        Assertions.assertThat(myList.find("kata")).isNotPresent();
    }
}
