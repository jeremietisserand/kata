import java.util.Optional;

public class CustomList {

    private ItemElement firstElement;

    public CustomList() {
        firstElement = new EmptyItem();
    }

    public Optional<String> find(String item) {
        return firstElement.find(item);
    }

    public void add(String item) {
        firstElement = firstElement.append(item);
    }

    public int length() {
        return firstElement.length();
    }

    public void deleteFirst(String item) {
        firstElement = firstElement.removeFirst(item);
    }
}
