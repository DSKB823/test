public class Armor {

  public static String defaultArmor(){
    String armor = "Error";
    switch (Player.klasse) {
      case "Krieger":
      armor = "ein Kettenhemd";
      break;

      case "Schurke":
      armor = "eine Lederjacke";
      break;

      case "Magier":
      armor = "eine Robe";
      break;
    }
    return armor;
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
