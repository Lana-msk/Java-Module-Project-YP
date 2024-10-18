import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car carOne = getCarFromUser (scanner, 1);
        Car carTwo = getCarFromUser (scanner, 2);
        Car carThree = getCarFromUser (scanner, 3);
        defineLeaderAndTextOut (carOne, carTwo, carThree);
    }
    public static Car getCarFromUser(Scanner scanner, int carNumber) {
        System.out.println("Введите название машины № " + carNumber);
        String carModel = scanner.next();
        System.out.println("Введите скорость машины № " + carNumber);
        int carSpeed = Integer.parseInt(scanner.next());
        while (!((carSpeed > 0) && (carSpeed <= 250))) {
            System.out.println("Введите корректную скорость машины № " + carNumber + "!");
            carSpeed = scanner.nextInt();
        }
        return new Car(carSpeed, carModel);
    }
    public static void defineLeaderAndTextOut(Car one, Car two, Car three) {
        Race race = new Race ();
        Race.defineLeaderFromParticipants(one, two, three);
        Car raceLeader = race.getLeader();
        System.out.println("Гонку выиграл автомобиль " + raceLeader.getModel());
    }
}
