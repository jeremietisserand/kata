package codingdojo;

public class Inventory {
    private final Equipment equipment;

    public Inventory(Equipment equipment) {
        this.equipment = equipment;
    }

    public float getDamageModifier() {
        return equipment.getDamageModifier();
    }

    public int getBaseDamage() {
        return equipment.getBaseDamage();
    }
}
