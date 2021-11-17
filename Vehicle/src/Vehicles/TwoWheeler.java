package Vehicles;

public class TwoWheeler extends Vehicle {
	
	String n;
	int cc;
    
	 public TwoWheeler(int vno,String brand,String colour,long price,int cc)
	{
		super(vno, brand, colour, price);
		this.cc=cc;
	}
}




