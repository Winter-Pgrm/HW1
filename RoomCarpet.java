//Simple class to caluclate carpet cost, calls roomDimensions
public class RoomCarpet 
{

    private RoomDimension roomDimensions;
    private double carpetCost;

    public RoomCarpet(RoomDimension roomDimensions, double carpetCost)
	{
        this.roomDimensions = roomDimensions;
        this.carpetCost = carpetCost;
    }

    public double getTotal()
	{
        return carpetCost * roomDimensions.getArea();
    }

    @Override
    public String toString()
	{
        return "The " + roomDimensions
                + "at a rate of " + carpetCost + "$ per sqaure foot, "
                        + "has come to a grand total of " + getTotal() + "$!";
    }

}
