package net.exodiac.weapons.weaponsystem.weapons;

import net.exodiac.weapons.weaponsystem.AbstractWeapon;
import net.exodiac.weapons.weaponsystem.statistics.Rarity;
import net.exodiac.weapons.weaponsystem.statistics.Statistic;

import java.util.Arrays;

public class SwordOfDoom extends AbstractWeapon {
    public SwordOfDoom() {
        setName("Sword of Doom");
        setRarity(Rarity.RARE);

        setDescription(Arrays.asList(
                "&7Dangerous weapon capable of",
                "&7taking down the strongest enemies."
        ));

        setDamage(5);
        setMinimunLevel(5);

        getStatisticPackage().addStatistic(Statistic.REFLECTION, 5);
        getStatisticPackage().addStatistic(Statistic.SOUL_DRAIN, 3);
        getStatisticPackage().addStatistic(Statistic.EXP_BOOST, 10);
    }
}
