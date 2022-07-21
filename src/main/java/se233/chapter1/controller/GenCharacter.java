package se233.chapter1.controller;

import se233.chapter1.model.character.BasedCharacter;
import se233.chapter1.model.character.BattleMageCharacter;
import se233.chapter1.model.character.MagicalCharacter;
import se233.chapter1.model.character.PhysicalCharacter;



import java.util.Random;

public class GenCharacter {
    public static BasedCharacter setUpCharacter() {
        BasedCharacter character ;
        Random ran = new Random() ;
        int type = ran.nextInt(3) +1 ;
        int basedDef = ran.nextInt(50)+1;
        int basedRes = ran.nextInt(50)+1 ;

        if(type == 1 ) {
            character = new MagicalCharacter("Wizard","assets/wizard.png",basedDef,basedRes) ;
        }else if(type == 2){
            character = new PhysicalCharacter("Knight" , "assets/knight.png" , basedDef ,basedRes) ;
        }else{
            character = new BattleMageCharacter("Jett" , "assets/jett.png" , basedDef ,basedRes);
        }
        return  character ;
    }
}
