public class arrayJava{
    public static void main(String[] args){
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        // int[] myNum = {10, 20, 30, 40};
        System.out.println(cars[0]); // Outputs Volvo
        cars[0] = "Opel";
        System.out.println(cars[0]); // Now outputs Opel instead of Volvo
        System.out.println(cars.length); // Outputs size arrays
        // 2d arrays
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[1][2]); // Outputs 7
    }
}