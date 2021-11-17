package Vehicles;
class Vehicle 
{
	int vno;
	String brand;
	String colour;
    long price;

    Vehicle(int vno,String brand,String colour,long price)
	{
        super();
        this.vno = vno;
		this.brand= brand;
		this.colour=colour;
        this.price=price;
    }
    
    public void displayInfo()
    {
        System.out.println("Vehicle No:"+vno);
		System.out.println("Brand Name:"+brand);
		System.out.println("colour:"+colour);
		System.out.println("Price:"+price);
		System.out.println("========================================");
    }
}
