/* 642115032 Putthipong Ninwong */

package se233.chapter1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import se233.chapter1.controller.GenCharacter;
import se233.chapter1.controller.GenItemList;
import se233.chapter1.model.character.BasedCharacter;
import se233.chapter1.model.item.Armor;
import se233.chapter1.model.item.BasedEquipment;
import se233.chapter1.model.item.Weapon;
import se233.chapter1.view.CharacterPane;
import se233.chapter1.view.EquipPane;
import se233.chapter1.view.InventoryPane;
import java.util.ArrayList;

public class Launcher extends Application {
    private static Scene mainScene ;
    private static BasedCharacter mainCharacter = null ;
    private static ArrayList<BasedEquipment> allEquipments = null ;
    private static Weapon equippedWeapon = null ;
    private static Armor equippedArmor = null ;
    private static CharacterPane characterPane = null ;
    private static EquipPane equipPane = null ;
    private static InventoryPane inventoryPane = null ;

    public static void refreshPane(){
        equipPane.drawPane(equippedWeapon, equippedArmor);
        characterPane.drawPane(mainCharacter);
        inventoryPane.drawPane(allEquipments);
    }

    public Pane getMainPane() {
        BorderPane mainPane = new BorderPane();
        characterPane = new CharacterPane() ;
        equipPane = new EquipPane();
        inventoryPane = new InventoryPane();
        refreshPane();
        mainPane.setCenter(characterPane);
        mainPane.setLeft(equipPane);
        mainPane.setBottom(inventoryPane);
        return  mainPane;
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Intro to RPG");
        primaryStage.setResizable(false);
        primaryStage.show();
        mainCharacter = GenCharacter.setUpCharacter() ;
        allEquipments = GenItemList.setUpItemList() ;
        Pane mainPane = getMainPane() ;
        mainScene = new Scene(mainPane) ;
        primaryStage.setScene(mainScene);
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static BasedCharacter getMainCharacter() {
        return mainCharacter;
    }

    public static void setMainCharacter(BasedCharacter mainCharacter) {
        Launcher.mainCharacter = mainCharacter;
    }

    public static ArrayList<BasedEquipment> getAllEquipments() {
        return allEquipments;
    }

    public static void setAllEquipments(ArrayList<BasedEquipment> allEquipments) {
        Launcher.allEquipments = allEquipments;
    }

    public static Weapon getEquippedWeapon() {
        return equippedWeapon;
    }

    public static void setEquippedWeapon(Weapon equippedWeapon) {
        Launcher.equippedWeapon = equippedWeapon;
    }

    public static Armor getEquippedArmor() {
        return equippedArmor;
    }

    public static void setEquippedArmor(Armor equippedArmor) {
        Launcher.equippedArmor = equippedArmor;
    }
}
