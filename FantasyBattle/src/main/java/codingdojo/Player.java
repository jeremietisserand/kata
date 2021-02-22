package codingdojo;


class Player implements Target {
    public static final float STRENGTH_FACTOR = 0.1f;
    private Inventory inventory;
    private Stats stats;

    Player(Inventory inventory, Stats stats) {
        this.inventory = inventory;
        this.stats = stats;
    }

    Damage calculateDamage(Target other) {
        int soak = other.getSoak(damage());

        return new Damage(Math.max(0, damage() - soak));
    }

    private int damage() {
        return Math.round(inventory.getBaseDamage() * getDamageModifier());
    }

    private float getDamageModifier() {
        return strength() + inventory.getDamageModifier();

    }

    private float strength() {
        return stats.getStrength() * STRENGTH_FACTOR;
    }

    @Override
    public int getSoak(int totalDamage) {
        // TODO: Not implemented yet
        //  Add friendly fire
        return totalDamage;
    }
}
