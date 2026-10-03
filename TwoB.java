import java.util.Scanner;
public class TwoB{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the energy generated in khw: ");
        double energy = sc.nextDouble();

        if (energy>= 10 ){
            System.out.println("Good Energy Generation");
        }
        else{
            System.out.println("Low energy Generation");
        }
    }
}