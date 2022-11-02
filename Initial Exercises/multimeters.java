import java.util.Scanner;

public class multimeters
{
    public static void main(String[] args){
        Scanner input=  new Scanner(System.in);

        double[] multimetersVoltage = new double[10];
        double averageMultimeters=0;
        double[] deviations= new double[10];
        double variance=0;
        double standardDeviation;

        for(int i = 0; i < 10; i++)
        {
            System.out.printf("Enter with the %d voltage: ", i + 1);
            multimetersVoltage[i] = input.nextDouble();
            averageMultimeters+=multimetersVoltage[i];
        }

        averageMultimeters/= 10; 

        for(int i = 0; i < 10; i++)
        {
            deviations[i]= Math.abs(averageMultimeters-multimetersVoltage[i]);
        }

        for(int i = 0; i < 10; i++)
        {
           variance += Math.pow(deviations[i],2);
        }

        variance=variance/10;

        standardDeviation=Math.sqrt(variance);

        for(int i = 0 ; i < 10; i++)
        {
            System.out.format("The %d voltage: %f\n", i + 1, multimetersVoltage[i]);
        }

        System.out.format("The average of voltages is %f\n", averageMultimeters);
        System.out.format("The standard deviation is %f\n", standardDeviation);


        if(standardDeviation>(averageMultimeters*0.1))
        {
            System.out.println("the multimeter has problems, so it cannot be used for operations");
        }else
        {
            System.out.println("the multimeter can be used.");
        }
        
        input.close();
    }
}