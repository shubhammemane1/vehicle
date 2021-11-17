package Vehicles;

public class ThreeWheeler extends Vehicle
{
    int mileage;
    
    public ThreeWheeler(int vno,String brand,String colour,long price,int mileage)
	{
		super(vno, brand, colour, price);
		this.mileage=mileage;
	}
}

