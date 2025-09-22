import java.util.Scanner;

public class PlayerSelection {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your age: ");
        byte age = input.nextByte();
        System.out.print("Enter your height (metres): ");
        float heightInMetres = input.nextFloat();
        System.out.print("Enter your weight (pounds): ");
        float weightInPounds = input.nextFloat();

        System.out.print("Enter your jersey number: ");
        byte jerseyNumber = input.nextByte();


        final float POUND = 0.45359237f;
        final byte METER = 100;

        int weightInKg = (int) (weightInPounds * POUND);
        int heightInCm = (int) (heightInMetres * METER);

        System.out.println(" ");
        System.out.println("PLAYER REPORT");
        System.out.println("Player name: " + name);


        //Player Category and age
        if (age>30) {
            System.out.println("Age: " + age+ " (Veteran)");
        }
        else if (age>=20){
            System.out.println("Age: " + age+ " (Prime Player)");
        }
        else {
            System.out.println("Age: " + age+ " (Rising Star)");
        }


        age++;//increment
        age--;//decrement

        System.out.println("Height: " + heightInCm + "cm");
        System.out.println("Weight: " + weightInKg + "kg");
        System.out.println("Jersey Number: " + jerseyNumber);
        switch (jerseyNumber) {
            case 1:
                System.out.println("Position: Goal Keeper");
                break;
            case 2:
            case 5:
                System.out.println("Position: Defender");
                break;

            case 6:
            case 8:
                System.out.println("Position: Midfielder");
                break;
            case 7:
            case 11:
                System.out.println("Position: Winger");
                break;
            case 9:
                System.out.println("Position: Striker");
                break;
            case 10:
                System.out.println("Position: Playmaker");
                break;
            default:
                System.out.println("Player position not known");
        }
        if (jerseyNumber == 7 || jerseyNumber == 9 || jerseyNumber == 10 || jerseyNumber == 11) {
            System.out.println("Attacker Jersey: Yes");
        }
        else {
            System.out.println("Attacker Jersey: No");
        }
        boolean isEligible = (age >= 18 && age< 35 && weightInKg <= 90);
        if (isEligible) {
            System.out.println("Eligibility: Eligible");
        }
        else{
            System.out.println("Eligibility: Not Eligible");
        }
        //Lineup Decision
        if (age >= 20 && age <= 30) {
            if (weightInKg < 80)
                System.out.println("Lineup Decision: Starting line up");
            else
                System.out.println("Lineup Decision: Bench");
        }
        else{
            System.out.println("Lineup Decision: Bench");
        }
        //Final Decision
        String isReady = (age >= 18 && age < 35 && weightInKg <= 90)?"Final Decision: Play":"Final Decision: Rest";
        System.out.print(isReady);
    }
}
