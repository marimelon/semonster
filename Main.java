public class Main {
  public static void main(String[] args) {
    System.out.println("SEMONSTER!!");
    Monster monster = new Monster();
    System.out.println(monster.toString());
    var player = new Player();
    player.drawMonsters();
    player.showDeck();
  }
}
