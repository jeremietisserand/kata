package codingdojo;


class Player extends Target {
    public static final float STRENGTH_FACTOR = 0.1f;
    private final Inventory inventory;
    private final Stats stats;

    Player(Inventory inventory, Stats stats) {
        this.inventory = inventory;
        this.stats = stats;
    }

    Damage calculateDamage(Target other) {
        int totalDamage = calculateDamageWithoutSoak();

        return new Damage(Math.max(0, getDamage(other, totalDamage)));
    }

    private int calculateDamageWithoutSoak() {
        int baseDamage = inventory.getBaseDamage();
        float damageModifier = getStrengthModifier() + inventory.getDamageModifier();
        return Math.round(baseDamage * damageModifier);
    }

    private int getDamage(Target other, int totalDamage) {
        return totalDamage - getSoak(other, totalDamage);
    }

    private int getSoak(Target other, int totalDamage) {
        return other.getSoak(totalDamage);
    }

    private float getStrengthModifier() {
        return stats.getStrength() * STRENGTH_FACTOR;
    }

    @Override
    int getSoak(int totalDamage) {
        // TODO: Not implemented yet
        //  Add friendly fire
        return totalDamage;
    }
}
