public class GameRPG {
    public static void main(String[] args) {
        Player hero = new Player(100, 15);
        Goblin enemyGoblin = new Goblin(50, 8); 

        System.out.println("--- Game Mulai ---");
        
        hero.displayInfo();
        enemyGoblin.displayInfo();

        System.out.println("--- ROUND 1: Player Attack ---");
        
        int playerDmg = hero.attack();
        enemyGoblin.takeDamage(playerDmg);

        if (enemyGoblin.getHp() <= 0) {
            System.out.println("Goblin telah dikalahkan!");
            return; 
        }

        System.out.println("--- ROUND 2: Goblin Attack ---");
        
        int goblinDmg = enemyGoblin.attack(); 
        hero.takeDamage(goblinDmg);
        
        if (hero.getHp() <= 0) {
            System.out.println("Player telah dikalahkan! Game Over.");
        } else {
            System.out.println("--- Status Akhir ---");
            hero.displayInfo();
            enemyGoblin.displayInfo();
        }
        
        System.out.println("--- Game Selesai ---");
    }
}