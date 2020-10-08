import java.util.Optional;

public class EmptyItem implements ItemElement {
    @Override
    public Optional<String> find(String item) {
        return Optional.empty();
    }

    @Override
    public ItemElement append(String item) {
        return new Node(item, new EmptyItem());
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public ItemElement removeFirst(String item) {
        return this;
    }
}
