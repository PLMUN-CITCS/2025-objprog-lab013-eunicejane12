public class ParametersAndArguments {

    // Method to calculate the area of a room
    public static int calculateArea(int width, int height) {
        int area = width * height;  // Calculate the area
        return area;  // Return the calculated area
    }

    public static void main(String[] args) {
        // Declare the width and height of the room
        int roomWidth = 10;
        int roomHeight = 15;

        // Call the calculateArea method and pass roomWidth and roomHeight as arguments
        int area = calculateArea(roomWidth, roomHeight);

        // Print the result
        System.out.println("The calculated area is: " + area);
    }
}
