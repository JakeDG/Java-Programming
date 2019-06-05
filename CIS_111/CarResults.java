import javax.swing.JOptionPane;
import java.io.*;

public class CarResults {

public static void main(String[] args) throws IOException

{

        String make;
        String model;
        int year;
        double price;

        Car myCar = new Car();

        make = JOptionPane.showInputDialog("What is the Make of your car? ");

        myCar.setMake(make);
        
        model = JOptionPane.showInputDialog("Enter your car's model: ");

        myCar.setModel(model);

        year = Integer.parseInt(JOptionPane.showInputDialog("What is the Year of your car? "));

        myCar.setYear(year);
        
        price = Double.parseDouble(JOptionPane.showInputDialog("Enter your car's Price: "));
        
        myCar.setPrice(price);


        System.out.println("Your car is a " + " " + myCar.getYear() + " " + myCar.getModel() + " " + myCar.getMake() + " " + myCar.getPrice());
       
    
        System.exit(0);

      }

}