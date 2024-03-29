package codingdojo;

public class BasicItem implements Item {

    private final int baseDamage;
    private final float damageModifier;

    public BasicItem(int baseDamage, float damageModifier) {
        this.baseDamage = baseDamage;
        this.damageModifier = damageModifier;
    }

    @Override
    public int getBaseDamage() {
        return baseDamage;
    }

    @Override
    public float getDamageModifier() {
        return damageModifier;
    }
}
