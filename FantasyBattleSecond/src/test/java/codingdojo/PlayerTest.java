package codingdojo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class PlayerTest {

    // choose this one if you are familiar with mocks
    @Disabled("Test is not finished yet")
    @Test
    void damageCalculationsWithMocks() {
        Inventory inventory = mock(Inventory.class);
        Stats stats = mock(Stats.class);
        SimpleEnemy target = mock(SimpleEnemy.class);

        Damage damage = new Player(inventory, stats).calculateDamage(target);
        assertEquals(10, damage.getAmount());
    }

    @Test
    void damageCalculations_forSimpleEnemy() {
        Item leftHand = new BasicItem(1, 2);
        Item rightHand = new BasicItem(1, 2);
        Item head = new BasicItem(0, 1);
        Item feet = new BasicItem(3, 4);
        Item chest = new BasicItem(1, 0);
        Equipment equipment = new Equipment(leftHand, rightHand, head, feet, chest);
        Inventory inventory = new Inventory(equipment);
        Stats stats = new Stats(0);
        Armor armor = new SimpleArmor(2);
        List<Buff> buffs = List.of(new BasicBuff(1), new BasicBuff(0));
        SimpleEnemy target = new SimpleEnemy(armor, buffs);

        Damage damage = new Player(inventory, stats).calculateDamage(target);

        assertEquals(50, damage.getAmount());
    }
}
