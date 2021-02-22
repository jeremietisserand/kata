package codingdojo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SimpleEnemyTest {

    @Test
    void soak_compute() {
        SimpleEnemy simpleEnemy = buildSimpleEnemy();

        int soak = simpleEnemy.getSoak(0);

        assertEquals(10, soak);
    }

    @Test
    void soak_computeWithMultipleBuff() {
        Armor armor = new SimpleArmor(5);
        Buff firstBuff = new BasicBuff(1.0f, 1.0f);
        Buff secondBuff = new BasicBuff(0.4f, 0.4f);
        List<Buff> buffs = new ArrayList<>();
        buffs.add(firstBuff);
        buffs.add(secondBuff);
        SimpleEnemy simpleEnemy = new SimpleEnemy(armor, buffs);

        int soak = simpleEnemy.getSoak(0);

        assertEquals(12, soak);
    }

    public static SimpleEnemy buildSimpleEnemy() {
        Armor armor = new SimpleArmor(5);
        Buff buff = new BasicBuff(1.0f, 1.0f);
        SimpleEnemy simpleEnemy = new SimpleEnemy(armor, Collections.singletonList(buff));
        return simpleEnemy;
    }

}