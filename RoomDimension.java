
	public class RoomDimension 
{

    private double length;
    private double width;

    public RoomDimension(double length, double width) 
	{
        this.length = length;
        this.width = width;
    }

    public double getLength() 
	{
        return length;
    }

    public double getWidth()
	{
        return width;
    }

    public double getArea()
	{
        return length * width;
    }

    @Override
    public String toString() {
        return "Room Dimensions of Length:" + length + 
		            ", and Width:" + width + " ";
    }

}
