package net.exodiac.weapons.weaponsystem;

import net.exodiac.weapons.weaponsystem.statistics.Rarity;
import net.exodiac.weapons.weaponsystem.statistics.StatisticPackage;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public abstract class AbstractWeapon {

    private ItemStack weapon;
    private int damage;

    private int minimunLevel;

    private String name;
    private List<String> description;
    private Rarity rarity;

    private StatisticPackage statisticPackage;


    public AbstractWeapon() {
        statisticPackage = new StatisticPackage();
        damage = 4;
    }

    public StatisticPackage getStatisticPackage() {
        return  statisticPackage;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public ItemStack getWeapon() {
        return weapon;
    }

    public void setWeapon(ItemStack weapon) {
        this.weapon = weapon;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }

    public int getMinimunLevel() {
        return minimunLevel;
    }

    public void setMinimunLevel(int minimunLevel) {
        this.minimunLevel = minimunLevel;
    }
}
