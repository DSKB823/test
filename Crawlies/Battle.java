public class Battle {

  static int pHealth = Player.health;
  static int pArmor = Player.armorValue;
  static int pDamage = Player.weaponDamage;
  static int eHealth = Enemie.enemieHealth;
  static int eArmor = Enemie.enemieArmor;
  static int eDamage = Enemie.enemieDamage;
  static String actor = "Error";
  static String target = "Error";

  public static void combat() {
    int damage = 0;
    for(int i = 0 ; i < 10 ; i++) {
      actor = "Player";
      target = "Enemie";
      if (isAlive(actor, target) == true){
        System.out.println(actor + Battle.pHealth + " - " + target + Battle.eHealth);
        damage = Battle.pDamage - Battle.eArmor;
        Battle.eHealth -= damage;
      }

      actor = "Enemie";
      target = "Player";
      if (isAlive(actor, target) == true){
        System.out.println(actor + Battle.eHealth + " - " + target + Battle.pHealth);
        damage = Battle.eDamage - Battle.pArmor;
        Battle.pHealth -= damage;
      }

    }
  }

  public static boolean isAlive(String actor, String target) {
    boolean alive = true;
    switch (actor) {
      case "Player":
      if (pHealth <= 0) {
        alive = false;
      }
      break;

      case "Enemie":
      if (eHealth <= 0) {
        alive = false;
      }
      break;
    }

    switch (target) {
      case "Player":
      if (pHealth <= 0) {
        alive = false;
      }
      break;

      case "Enemie":
      if (eHealth <= 0) {
        alive = false;
      }
      break;
      }
  return alive;
}
}
