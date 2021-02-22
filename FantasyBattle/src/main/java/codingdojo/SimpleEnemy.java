package codingdojo;

import java.util.List;

public class SimpleEnemy implements Target {

    public static final float SOAK_MODIFIER = 1f;
    private Armor armor;
    private List<Buff> buffs;

    public SimpleEnemy(Armor armor, List<Buff> buffs) {
        this.armor = armor;
        this.buffs = buffs;
    }

    private int getSoak() {
        return Math.round(
                armor.getDamageSoak() *
                        soakModifier()
        );
    }

    private float soakModifier() {
        return ((float) buffs
                .stream()
                .mapToDouble(Buff::soakModifier)
                .sum()) +
                SOAK_MODIFIER;
    }

    @Override
    public int getSoak(int totalDamage) {
        return getSoak();
    }
}
