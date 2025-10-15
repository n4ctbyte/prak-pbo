import java.util.Random;

public class Rpg {
    public static void main(String[] args) {
        Player nact = new Player("Nact", 500, 100);
        Goblin gobs = new Goblin("Gobs", 300, 50);

        while (nact.getHp() > 0 && gobs.getHp() > 0) {
            nact.attack(gobs);

            if (gobs.getHp() <= 0) {
                gobs.die();
                break;
            }
            gobs.attack(nact);
            
            if (nact.getHp() <= 0) {
                nact.die();
                break;
            }
        }
    }
}

class Player {
    private String name;
    private double hp;
    private double baseDamage;

    public Player(String name, double hp, double baseDamage) {
        this.name = name;
        this.hp = hp;
        this.baseDamage = baseDamage;
    }

    public String getName() {
        return name;
    }

    public double getHp() {
        return hp;
    }

    public double getBaseDamage() {
        return baseDamage;
    }

    public void attack(Enemy e) {
        e.getName();
        System.out.printf("%s menyerang %s dengan damage %.1f!\n", name, e.getName(), baseDamage);
        e.takeDamage(baseDamage);
    }

    public void takeDamage(double damage) {
        System.out.printf("Sisa darah %s : %.1f\n", name, hp -= damage);
    }

    public void die() {
        System.out.printf("%s mati!", name);
    }
}

class Enemy {
    protected String name;
    protected double hp;
    protected double baseDamage;

    public Enemy(String name, double hp, double baseDamage) {
        this.name = name;
        this.hp = hp;
        this.baseDamage = baseDamage;
    }

    public String getName() {
        return name;
    }

    public double getHp() {
        return hp;
    }

    public double getBaseDamage() {
        return baseDamage;
    }

    public void attack(Player p) {
        double hp = p.getHp();
        System.out.printf("%s menyerang %s dengan damage %.1f!\n", name, p.getName(), baseDamage);
        System.out.printf("Sisa darah %s : %.1f\n", p.getName(), hp -= baseDamage);
        p.takeDamage(baseDamage);
    }

    public void takeDamage(double damage) {
        System.out.printf("Sisa darah %s : %.1f\n", name, hp -= damage);
    }
}

class Goblin extends Enemy {
    Random rd = new Random();
    public Goblin(String name, double hp, double baseDamage) {
        super(name, hp, baseDamage);
    }

    @Override
    public void attack(Player p) {
        double chance = rd.nextDouble();

        if (chance <= 0.05) {
            System.out.printf("CRIT!!! %s menyerang %s dengan damage %.1f!!!\n", name, p.getName(), baseDamage*2);
            p.takeDamage(baseDamage*2);
        }
        else {
            System.out.printf("%s menyerang %s dengan damage %.1f!\n", name, p.getName(), baseDamage);
            p.takeDamage(baseDamage);
        }
    }

    public void takeDamage(double damage) {
        System.out.printf("Sisa darah %s : %.1f\n", name, hp -= damage);
    }

    public void die() {
        System.out.printf("%s mati!", name);
    }
}