package lab3;

public class Battle {
    public static boolean battle(Character player, Monster enemy) {
        while (player.getHealth() > 0) {
            System.out.println(player.getName() + ": " + player.getHealth());
            System.out.println(enemy.getName() + ": " + enemy.getHealth());
            player.attack(enemy);
            if (enemy.getHealth() > 0) {
                enemy.attack(player);
            }
            else {
                break;
            }
        }
        if (enemy.getHealth() <= 0) {
            System.out.println("Enemy is dead");
            return true;
        }
        else if (player.getHealth() <= 0) {
            System.out.println("Player is dead");
        }
        return false;
    }
    public static void main(String[] args) {
        var player = new Human("Ivan", "the programmer", 100, 50);
        var enemy = new FallenShaman("Navi", "shaman", 200, 80);
        while (player.getHealth() > 0) {
            System.out.println(player.getName() + ": " + player.getHealth());
            System.out.println(enemy.getName() + ": " + enemy.getHealth());
            player.attack(enemy);
            if (enemy.getHealth() > 0) {
                enemy.attack(player);
            }
            else {
                System.out.println("Enemy is dead");
                break;
            }
        }
    }
}
