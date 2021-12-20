package lesson1;

public class Main {
  public static void main(String[] args) {
    Athlete[] participants = {
        new Human("Oleg"),
        new Cat("Barsik", 3000, 2),
        new Robot("R2d2", 10000, 10)
    };
    Obstacle[] obstacles = {
        new Road(500),
        new Wall(1),
        new Road(1000),
        new Wall(2),
        new Road(2000),
        new Wall(5),
        new Road(9000),
        new Wall(10),
    };

    for (Athlete participant : participants) {
      for (Obstacle obstacle : obstacles) {
        if(!obstacle.checkObstaclePass(participant)) {
          break;
        }
      }
      System.out.println("\n========================\n");
    }
  }
}
