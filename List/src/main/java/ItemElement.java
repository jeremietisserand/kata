import java.util.Optional;

public interface ItemElement {
    Optional<String> find(String item);

    ItemElement append(String item);

    int length();

    ItemElement removeFirst(String item);
}
