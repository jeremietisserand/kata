package codingdojo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquipmentTest {

    @Test
    void baseDamage_computeItemSum() {
        Equipment equipment = buildEquipment();

        int baseDamage = equipment.getBaseDamage();

        assertEquals(10, baseDamage);
    }

    @Test
    void damageModifier_computeItemSum() {
        Equipment equipment = buildEquipment();

        float baseDamage = equipment.getDamageModifier();

        assertEquals(5.1f, baseDamage);
    }

    public static Equipment buildEquipment() {
        Item rightHand = new BasicItem("flashy sword of danger", 10, 1.0f);
        Item leftHand = new BasicItem("round shield", 0, 1.4f);
        Item feet = new BasicItem("ten league boots", 0, 0.1f);
        Item head = new BasicItem("helmet of swiftness", 0, 1.2f);
        Item chest = new BasicItem("breastplate of steel", 0, 1.4f);
        return new Equipment(leftHand, rightHand, head, feet, chest);
    }
}