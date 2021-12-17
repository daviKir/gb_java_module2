package lesson1;

public class Main {
  public static void main(String[] args) throws Exception {
    Object[] participants = {
        new Human("Oleg"),
        new Cat("Barsik", 3000, 2),
        new Robot("R2d2", 10000, 10)
    };
    Object[] obstacles = {
        new Road(500),
        new Wall(1),
        new Road(1000),
        new Wall(2),
        new Road(2000),
        new Wall(5),
        new Road(9000),
        new Wall(10),
    };

    for (Object participant : participants) {
      for (Object obstacle : obstacles) {
        if (obstacle instanceof Road road && !road.checkRun(participant)) {
          break;
        }
        if (obstacle instanceof Wall wall && !wall.checkJump(participant)) {
          break;
        }
      }
      System.out.println("\n========================\n");
    }
  }
}
