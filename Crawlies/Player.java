import java.util.Scanner;

public class Player {
  static int health = 0;

  static String armor = "Error";
  static int armorValue = 0;

  static String weapon = "Error";
  static int weaponDamage = 0;

  static String klasse = "Error";

public static void player() {

  String load = Load.load();
  //System.out.println(load);

  if (load.equals("new")){
    System.out.println("Erstelle Spieler");
    System.out.println("Wähle eine Klasse[Krieger/Schurke/Magier]");
    Scanner input = new Scanner(System.in);
    klasse = input.next();
    System.out.println("");
    Player.healthGen();
    Player.armorGen();
    Player.weaponGen();
    switch (Player.klasse) {

      case "Krieger":
      System.out.println("Deine Klasse ist der Krieger");
      System.out.println("Du hast " + health + " HP");
      System.out.println(armor);
      System.out.println("und " + weapon);
      break;

      case "Schurke":
      System.out.println("Deine Klasse ist der Schurke");
      System.out.println("Du hast " + health + " HP");
      System.out.println(armor);
      System.out.println("und " + weapon);

      break;

      case "Magier":
      System.out.println("Deine Klasse ist der Magier");
      System.out.println("Du hast " + health + " HP");
      System.out.println(armor);
      System.out.println("und " + weapon);
      break;
    }
  } else {
    System.out.println("Lade Spieler");
  }
}


  public static void healthGen() {
    switch (Player.klasse) {

      case "Krieger":
        Player.health = 200;
      break;

      case "Schurke":
        Player.health = 150;
      break;

      case "Magier":
        Player.health = 100;
      break;

      default:
        Player.health = 100;
      break;
    }
  }

  public static void armorGen() {
    switch (Player.klasse) {

      case "Krieger":
        Player.armor = Armor.defaultArmor();
        Player.armorValue = Armor.defaultValue();
      break;

      case "Schurke":
        Player.armor = Armor.defaultArmor();
        Player.armorValue = Armor.defaultValue();
      break;

      case "Magier":
        Player.armor = Armor.defaultArmor();
        Player.armorValue = Armor.defaultValue();
      break;
    }

  }

  public static void weaponGen() {
    switch (Player.klasse) {

      case "Krieger":
        Player.weapon = Weapon.defaultWeapon();
        Player.weaponDamage = Weapon.defaultValue();
      break;

      case "Schurke":
        Player.weapon = Weapon.defaultWeapon();
        Player.weaponDamage = Weapon.defaultValue();
      break;

      case "Magier":
        Player.weapon = Weapon.defaultWeapon();
        Player.weaponDamage = Weapon.defaultValue();
      break;
    }

  }
}
