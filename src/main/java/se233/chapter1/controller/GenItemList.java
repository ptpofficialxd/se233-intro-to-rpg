package se233.chapter1.controller;


import se233.chapter1.model.DamageType;
import se233.chapter1.model.item.Armor;
import se233.chapter1.model.item.BasedEquipment;
import se233.chapter1.model.item.Weapon;

import java.util.ArrayList;

public class GenItemList {
    public static ArrayList<BasedEquipment> setUpItemList() {
        ArrayList<BasedEquipment> itemLists = new ArrayList<BasedEquipment>(7);
        itemLists.add(new Weapon("Sword" , 20 , DamageType.Physical , "assets/sword.png"));
        itemLists.add(new Weapon("Shotgun",50, DamageType.Physical,"assets/shotgun.png")) ;
        itemLists.add(new Weapon("Wand",30, DamageType.Magical,"assets/wand.png"));
        itemLists.add(new Weapon("Axe" , 30 , DamageType.Magical , "assets/axe.png"));
        itemLists.add(new Weapon("Dagger",80, DamageType.Battlemage,"assets/dagger.png")) ;
        itemLists.add(new Armor("Shirt",30,15,"assets/shirt.png"));
        itemLists.add(new Armor("Armor",50,30,"assets/armor.png"));
        itemLists.add(new Armor("Veil",80,50,"assets/veil.png"));
        return  itemLists;
    }
}
