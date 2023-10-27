package lab3;

import java.util.ArrayDeque;
import java.util.Queue;

public class Game {
    Character hero;
    Queue<Monster> monsters;

    void createHero(String name, String profession) {
        hero = new Human(name, profession, 100, 50);
        monsters = new ArrayDeque<Monster>();
    }

    void addMonster(Monster monster) {
        monsters.add(monster);
    }

    void startBattle() {
        Battle.battle(hero, monsters.remove());
    }

    void recover() {
        hero.setHealth(100);
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.createHero("Ivan", "the builder");
        game.addMonster(new FallenShaman("Navi", "great", 200, 30));
        game.startBattle();
        game.recover();
    }
}
