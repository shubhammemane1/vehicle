package Vehicles;

public class Electrical extends FourWheeler 
{
    private float electRate=20.0f;
    public Electrical(int vno,String brand,String colour,long price,int gears)
	{
		super(vno, brand, colour, price, gears);
    }
    public float getElectRate()
    {
        return electRate;
    }

    public void setElectRate(float electRate)
    {
        this.electRate=electRate;
    }
}