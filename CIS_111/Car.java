public class Car
{
    private int yearModel;
    private String carMake;
    private double priceModel;
    private String carModel;

    public Car(String make, String model, int year, double price)
    {
        yearModel = year;
        carMake = make;
        priceModel = price;
        carModel = model;      
    }

    public int getYear()                
    {
        return yearModel;
    }

    public String getMake()
    {
        return carMake;
    }

    public double getPrice()
    {
        return priceModel;
    }

    public String getModel()
    {
        return carModel;
    }

    public void setYear(int year)
    {
        yearModel = year;
    }

    public void setMake(String carMake)
    {
        carMake = carMake;
    }

    public void setPrice(double price)                        
    {
        priceModel = price;   
    }
 
    public void setModel(String model)
    {
        carModel = model;
    }

}