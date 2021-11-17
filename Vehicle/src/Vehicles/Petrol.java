package Vehicles;

public class Petrol extends FourWheeler 
{
    private float petrolRate;
    public Petrol(int vno,String brand,String colour,long price,int gears)
	{
        super(vno, brand, colour, price, gears);
    }
    public float getPetrolRate()
    {
        return petrolRate;
    }

    public void setPetrolRate(float petrolRate)
    {
        this.petrolRate=petrolRate;
    }
}

