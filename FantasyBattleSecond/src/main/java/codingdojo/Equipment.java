package codingdojo;


import java.util.List;

class Equipment {
    // TODO add a ring item that may be equipped
    //  that may also add damage modifier
    private final List<Item> items;

    Equipment(Item ...items) {
        this.items = List.of(items);
    }

    int getBaseDamage() {
        return items.stream()
                .mapToInt(Item::getBaseDamage)
                .sum();
    }

    float getDamageModifier() {
        return (float) items.stream()
                .mapToDouble(Item::getDamageModifier)
                .sum();
    }
}
