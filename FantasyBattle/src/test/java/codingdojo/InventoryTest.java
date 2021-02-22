package codingdojo;

import org.junit.jupiter.api.Test;

import static codingdojo.EquipmentTest.buildEquipment;
import static org.junit.jupiter.api.Assertions.*;

class InventoryTest {

    @Test
    void baseDamage_computeItemSum() {
        Inventory inventory = buildInventory();

        int baseDamage = inventory.getBaseDamage();

        assertEquals(10, baseDamage);
    }

    @Test
    void damageModifier_computeItemSum() {
        Inventory inventory = buildInventory();

        float baseDamage = inventory.getDamageModifier();

        assertEquals(5.1f, baseDamage);
    }

    public static Inventory buildInventory() {
        Equipment equipment = buildEquipment();
        return new Inventory(equipment);
    }


}