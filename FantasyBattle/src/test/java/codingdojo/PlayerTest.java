package codingdojo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static codingdojo.InventoryTest.buildInventory;
import static codingdojo.SimpleEnemyTest.buildSimpleEnemy;
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

    // choose this one if you are not familiar with mock
    @Test
    void damageCalculations_forSimpleEnemy() {
        Stats stats = new Stats(0);
        Inventory inventory = buildInventory();
        SimpleEnemy simpleEnemy = buildSimpleEnemy();

        Damage damage = new Player(inventory, stats).calculateDamage(simpleEnemy);

        assertEquals(41, damage.getAmount());
    }

    @Test
    void damageCalculations_forPlayer() {
        Stats stats = new Stats(0);
        Inventory inventory = buildInventory();
        Player otherPlayer = new Player(inventory, stats);

        Damage damage = new Player(inventory, stats).calculateDamage(otherPlayer);

        assertEquals(0, damage.getAmount());
    }

}
