import java.util.Optional;

public class Node implements ItemElement {
    private String item;
    private ItemElement tail;

    public Node(String item, ItemElement tail) {
        this.item = item;
        this.tail = tail;
    }

    @Override
    public Optional<String> find(String item) {
        if(this.item.equals(item)){
            return Optional.of(this.item);
        }
        return tail.find(item);
    }

    @Override
    public ItemElement append(String item) {
        return new Node(this.item, tail.append(item));
    }

    @Override
    public int length() {
        return tail.length() + 1;
    }

    @Override
    public ItemElement removeFirst(String item) {
        if(this.item.equals(item)) {
            return tail;
        }
        return new Node(this.item, tail.removeFirst(item));
    }
}
