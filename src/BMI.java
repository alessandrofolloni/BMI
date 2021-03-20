import java.util.Scanner;

public class BMI {

    /**
     * Write a program that calculates and displays a person's body mass index
     * (BMI). A person's BMI is calculated with the following formula: BMI = weight
     * (kg) / height (m) ^ 2. Display a message indicating whether the person has
     * optimal weight, is underweight, or is overweight. A sedentary person's weight
     * is considered optimal if his or her BMI is between 18.5 and 25. If the BMI is
     * less than 18.5, the person is considered underweight. If the BMI value is
     * greater than 25, the person is considered overweight.
     *
     * @author Justin Musgrove
     * @return
     */

    public static void main(String [] args){
        double weight;
        double height;
        double bmi;

        Scanner keyboard= new Scanner(System.in);

        System.out.println("Questo programma calcola il tuo indice di massa corporeo");

        System.out.println("Immetti la tua altezza in metri");
        height = keyboard.nextDouble();

        System.out.println("Immetti il tuo peso");
        weight=keyboard.nextDouble();

        bmi=bmiCalculate(height,weight);

        System.out.println("Il tuo indice di massa corporeo o bmi è "+ bmi);

        System.out.println(bmiDescript(bmi));

        keyboard.close();
    }

    static double bmiCalculate (double height, double weight){
        return weight/(height * height);
    }

    static String bmiDescript(double bmi){
        if(bmi >= 18.5 && bmi <= 25)
            return "Il tuo bmi è ottimale";
        else if(bmi < 18.5)
            return "Sei uno scheletro";
        else if(bmi>25 && bmi < 30)
            return "Sei un pochino troppo grasso, non demordere";
        else
            return "Serve una dieta";
    }
}
