package codingdojo;

class Inventory {
    private final Equipment equipment;

    Inventory(Equipment equipment) {
        this.equipment = equipment;
    }

    int getBaseDamage() {
        return equipment.getBaseDamage();
    }

    float getDamageModifier() {
        return equipment.getDamageModifier();
    }

}
