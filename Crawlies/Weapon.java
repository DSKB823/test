public class Weapon {

  public static String defaultWeapon(){
    String weapon = "Error";
    switch (Player.klasse) {
      case "Krieger":
      weapon = "ein Kurzschwert";
      break;

      case "Schurke":
      weapon = "einen Dolch";
      break;

      case "Magier":
      weapon = "einen Stab";
      break;
    }
    return weapon;
  }

  public static int defaultValue(){
    int value = 0;
    switch (Player.klasse) {
      case "Krieger":
      value = 3;
      break;

      case "Schurke":
      value = 2;
      break;

      case "Magier":
      value = 0;
      break;
    }
    return value;
  }
}
