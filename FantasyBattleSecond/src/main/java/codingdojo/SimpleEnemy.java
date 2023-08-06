package codingdojo;

import java.util.Collections;
import java.util.List;

public class SimpleEnemy extends Target {

    private final Armor armor;
    private final List<Buff> buffs;

    public SimpleEnemy(Armor armor, List<Buff> buffs) {
        this.armor = armor;
        this.buffs = Collections.unmodifiableList(buffs);
    }

    List<Buff> getBuffs() {
        return buffs;
    }

    Armor getArmor() {
        return this.armor;
    }

    int getSoak(int totalDamage) {
        int soak;
        soak = Math.round(
            getArmor().getDamageSoak() *
            (
                ((float) getBuffs()
                    .stream()
                    .mapToDouble(Buff::soakModifier)
                    .sum()) +
                1f
            )
        );
        return soak;
    }
}
