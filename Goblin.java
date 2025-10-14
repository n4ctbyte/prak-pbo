/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Goblin extends Enemy {
    
    public Goblin(int hp, int baseDamage) {
        super(hp, baseDamage);
    }

    @Override
    public int attack() {
        
        int currentHp = getHp();
   
        int lastDigit = currentHp % 10; 

        if (lastDigit == 1 || lastDigit == 5) { 
            int doubleDamage = getBaseDamage() * 2;
            System.out.println("Goblin menyerang! HP berakhir di " + lastDigit + ". DAMAGE GANDA: " + doubleDamage);
            return doubleDamage;
        } else {
            int normalDamage = getBaseDamage();
            System.out.println("Goblin menyerang dengan damage normal: " + normalDamage);
            return normalDamage;
        }
    }
    
    public void info() {
        System.out.println("=== Goblin Info ===");
        System.out.println("HP: " + getHp()); 
        System.out.println("Damage Dasar: " + getBaseDamage());
    }
}