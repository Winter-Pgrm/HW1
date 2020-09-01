/*
Name: Alexander Phillips
CptS 233: MicroAssignment #1
Date: 9/1/2020
gitRepo url: https://github.com/Winter-Pgrm/HW1.git
*/
import java.util.Scanner; 

public class HW1_AlexPhillips
{
  public static void main(String[] args) 
  {
	// Local unchangable "global" varaibles
    final double CARPET_COST_PER_SQUAREFOOT = 8.0;


    System.out.println("This program outputs the total cost"
           +" of a carpet at a rate of 8$ per Squarefoot"
			+ "\nPlease enter the dimension when promted"
			 + "(in feet): followed by enter.");
    
	
	// Get input from user!
	
	Scanner input = new Scanner(System.in);
		
    System.out.print("Length of room: ");
    double length = input.nextDouble();

    System.out.print("Width of room: ");
    double width = input.nextDouble();

	//Close the keyboard input out
    input.close();
	
	//End of all user input for this session

    //Creates dimension and carpet to send infromation to. 
    RoomDimension dimensions = new RoomDimension(length,width);
    RoomCarpet roomCarpet = new RoomCarpet(dimensions,
            CARPET_COST_PER_SQUAREFOOT);

    // output
    System.out.println(roomCarpet);
  }
}
 