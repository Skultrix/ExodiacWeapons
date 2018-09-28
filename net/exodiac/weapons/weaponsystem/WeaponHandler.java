package net.exodiac.weapons.weaponsystem;

import net.exodiac.weapons.weaponsystem.weapons.SwordOfDoom;

import java.util.HashMap;
import java.util.Map;

public class WeaponHandler {

    private Map<String, AbstractWeapon> weapons = new HashMap<>();

    public WeaponHandler() {
        registerWeapon("Sword of Doom", new SwordOfDoom());
    }

    private void registerWeapon(String name, AbstractWeapon weapon) {
        weapons.put(name, weapon);
    }
}
