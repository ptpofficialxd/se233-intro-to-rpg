package se233.chapter1.model.character;

import se233.chapter1.model.DamageType;
import se233.chapter1.model.item.Armor;
import se233.chapter1.model.item.Weapon;

public class BasedCharacter {
    protected String name;
    protected String imgpath ;
    protected DamageType type ;
    protected Integer fullHp , basedPow , basedDef , basedRes ;
    protected Integer hp , power , defense , resistance ;
    protected Weapon weapon ;
    protected Armor armor ;

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }
    public Integer getFullHp() {
        return fullHp;
    }

    public void setFullHp(Integer fullHp) {
        this.fullHp = fullHp;
    }

    public Integer getBasedPow() {
        return basedPow;
    }

    public void setBasedPow(Integer basedPow) {
        this.basedPow = basedPow;
    }

    public Integer getBasedDef() {
        return basedDef;
    }

    public void setBasedDef(Integer basedDef) {
        this.basedDef = basedDef;
    }

    public Integer getBasedRes() {
        return basedRes;
    }

    public void setBasedRes(Integer baseRes) {
        this.basedRes = baseRes;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    public Integer getResistance() {
        return resistance;
    }

    public void setResistance(Integer resistance) {
        this.resistance = resistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DamageType getType() {
        return type;
    }

    public void setType(DamageType type) {
        this.type = type;
    }

    public void equipWeapon(Weapon weapon){
        this.weapon = weapon;
        this.power = this.basedPow + weapon.getPower();
    }

    public  void equipArmor(Armor armor){
        this.armor = armor ;
        this.defense = this.basedDef + armor.getDefense() ;
        this.resistance = this.basedRes + armor.getResistance() ;
    }

    public void unequipArmor(){
        this.armor = null ;
        this.defense = this.basedDef  ;
        this.resistance = this.basedRes  ;
    }

    public void unequipWeapon() {
        this.weapon = null;
        this.power = this.basedPow ;
    }

    @Override
    public String toString() {
        return this.name  ;
    }



}
