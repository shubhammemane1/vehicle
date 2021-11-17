package Vehicles;

public class FourWheeler extends Vehicle{
public int gears;
    
	FourWheeler(int vno,String brand,String colour,long price,int gears)
	{
		super(vno, brand, colour, price);
		this.gears=gears;
	}

}




