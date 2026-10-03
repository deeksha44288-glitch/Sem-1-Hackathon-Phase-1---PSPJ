import java.util.Scanner;
public class DataTypes{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Panel ID");
        int PanelID = sc.nextInt();

        System.out.println("enter the enery genedated in kwh");
        double energyGenerated = sc.nextDouble();

        System.out.println("enter the number of soral panels");
        int numberOfPanels = sc.nextInt();

        System.out.println("system status: ");
        char status = sc.next().charAt(0);

        System.out.println("Panel ID: " + PanelID);
        System.out.println("Energy Generated: " + energyGenerated);
        System.out.println("Number of Panels: " + numberOfPanels);
        System.out.println("System Status: " + status);

    }
}