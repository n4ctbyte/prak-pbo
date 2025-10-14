/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Player {
    private int hp;
    private int baseDamage;
    public Player(int hp, int baseDamage) {
        this.hp = hp;
        this.baseDamage = baseDamage;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getBaseDamage() {
        return baseDamage;
    }
    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    } 
    public int attack() {
        System.out.println("Player menyerang dengan " + baseDamage + " damage.");
        return baseDamage;
    }
    public void takeDamage(int damage) {
        hp -= damage;
        if (hp < 0) {
            hp = 0;
        }
        System.out.println("Player menerima " + damage);
        System.out.println("Sisa HP : " + hp);
    }
    public void info() {
        System.out.println("=== Player Info ===");
        System.out.println("HP: " + hp);
        System.out.println("Damage: " + baseDamage);
    }
}