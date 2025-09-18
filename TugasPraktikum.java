public class TugasPraktikum {
    public static void main(String[] args) {
        Game Mage = new Game("Shiroe (Mage)", 100, 150.0, 10, false);
        Game Assassin = new Game("Akatsuki (Assassin)", 100, 20, false);
        Game Guardian = new Game("Naotsugu (Guardian)", 250, false, 50);

        Assassin.getInfo();
        Assassin.attack("Shiroe", 50);
        Mage.attack("Naotsugu");
        Guardian.attack();
    }
}

class Game {
    private String namaPlayer;
    private int health;
    private int power;
    private double mana;
    private int defend;
    private boolean isDead;

    public Game(String namaPlayer, int health, int power, boolean isDead) {
        this.namaPlayer = namaPlayer;
        this.health = health;
        this.power = power;
        this.isDead = isDead;
        this.mana = 0;
        this.defend = 0;
    }

    public Game(String namaPlayer, int health, double mana, int power, boolean isDead) {
        this.namaPlayer = namaPlayer;
        this.health = health;
        this.mana = mana;
        this.isDead = isDead;
        this.power = power;
        this.defend = 0;
    }

    public Game(String namaPlayer, int health, boolean isDead, int defend) {
        this.namaPlayer = namaPlayer;
        this.health = health;
        this.defend = defend;
        this.isDead = isDead;
        this.power = 0;
        this.mana = 0;
    }

    public void attack(String target) {
        System.out.println(namaPlayer + " menyerang " + target + "!");
        System.out.println("Magic Damage : " + power + "\n");
    }

    public void attack(String target, int bonus) {
        System.out.println(namaPlayer + " menyerang " + target + "!");
        System.out.println("Bonus damage : " + bonus);
        System.out.println("Damage : " + (power + bonus) + "\n");
    }

    public void attack() {
        System.out.println(namaPlayer + " menyerang!\n");
    }

    public void getInfo() {
        System.out.println("Nama Player : " + namaPlayer);
        System.out.println("Health : " + health);
        System.out.println("Power : " + power);
        System.out.println("Mana : " + mana);
        System.out.println("Defend : " + defend);
        System.out.println("Status : " + (isDead ? "Mokad" : "Idup\n"));
    }
}
