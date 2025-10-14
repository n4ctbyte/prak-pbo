/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Enemy {
    private int hp;
    private int baseDamage;
    public Enemy(int hp, int baseDamage) {
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
        System.out.println("Enemy menyerang dengan " + baseDamage + " damage.");
        return baseDamage;
    }
    public void takeDamage(int damage) {
        hp -= damage;
        if (hp < 0) {
            hp = 0;
        }
        System.out.println("Enemy menerima " + damage + " damage. Sisa HP: " + hp);
    }
    
    public void info() {
        System.out.println("=== Enemy Info ===");
        System.out.println("HP: " + hp);
        System.out.println("Damage: " + baseDamage);
    }
}