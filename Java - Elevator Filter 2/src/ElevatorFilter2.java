public class ElevatorFilter2 {
    public static void main(String[] args) {
        System.out.println("True or False?");
        System.out.println("You can fit all ten o the");
        System.out.println("Brickenchickerdectuplets");
        System.out.println("on the elevator:");
        int weightOfAPerson = 150;
        int elevatorWeightLimit = 1400;
        int numberOfPeople = elevatorWeightLimit / weightOfAPerson;
        boolean allTenOkay = numberOfPeople >= 10;
        System.out.println(allTenOkay);
    }
}
