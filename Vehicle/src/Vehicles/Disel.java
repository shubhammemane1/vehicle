package Vehicles;

public class Disel extends FourWheeler 
{
    private float diselRate;

    public Disel(int vno,String brand,String colour,long price,int gears)
	{
        super(vno, brand, colour, price, gears);
    }
    
    public float getDiselRate()
    {
        return diselRate;
    }

    public void setDiselRate(float diselRate)
    {
        this.diselRate=diselRate;
    }
}
