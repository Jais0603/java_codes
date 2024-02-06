import java.util.Scanner;

public class AquacultureTechnology1 {

    private int shrimpHungerLevel;
    private int fishHungerLevel;
    private int shrimpFoodDispenser;
    private int fishFoodDispenser;
    private Scanner scanner;

    public AquacultureTechnology1() {
        shrimpHungerLevel = 0;
        fishHungerLevel = 0;
        shrimpFoodDispenser = 0;
        fishFoodDispenser = 0;
        scanner = new Scanner(System.in);
    }

    public void detectHungerLevels() {
        System.out.print("Enter the shrimp hunger level (0-100): ");
        shrimpHungerLevel = scanner.nextInt();
        System.out.print("Enter the fish hunger level (0-100): ");
        fishHungerLevel = scanner.nextInt();
    }

    public void controlFoodDispensers() {
        if (shrimpHungerLevel < 50) {
            shrimpFoodDispenser = 0;
        } else if (shrimpHungerLevel >= 50 && shrimpHungerLevel < 75) {
            shrimpFoodDispenser = 25;
        } else {
            shrimpFoodDispenser = 50;
        }

        if (fishHungerLevel < 50) {
            fishFoodDispenser = 0;
        } else if (fishHungerLevel >= 50 && fishHungerLevel < 75) {
            fishFoodDispenser = 50;
        } else {
            fishFoodDispenser = 100;
        }

        System.out.println("Shrimp food dispenser: " + shrimpFoodDispenser + "%");
        System.out.println("Fish food dispenser: " + fishFoodDispenser + "%");
    }

    public static void main(String[] args) {
        AquacultureTechnology aquaculture = new AquacultureTechnology();
        aquaculture.detectHungerLevels();
        aquaculture.controlFoodDispensers();
    }
}