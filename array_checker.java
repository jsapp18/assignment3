import java.util.Scanner;
class array_checker{
//This goes row by row and checks if something is unequal. If it is, it breaks and returns false
    public static boolean equals(int[][] m1, int[][] m2){
        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 3; col++){
                if (m1[row][col] != m2[row][col]){
                    return false;
                }
            }
        }
        return true;
    }
    //First this grabs both lists and then converts them from a string to a list of strings. From there, it goes in to the multidimensional array and parses the index of the list that will fo into m1 and m2 into an int.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter List 1 (9 numbers): ");
        String list1String = input.nextLine();
        System.out.println("Enter List 2 (9 numbers): ");
        String list2String = input.nextLine();
        input.close();
        int m1[][] = new int[3][3];
        int m2[][] = new int[3][3];
        String list1List[]= list1String.split(" ");
        String list2List[]= list2String.split(" ");
        int counter = 0;
        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 3; col++){
                m1[row][col] = Integer.parseInt(list1List[counter]);
                m2[row][col] = Integer.parseInt(list2List[counter]);
                counter++;
            }
        }
        System.out.println("These two arrays are " + (equals(m1, m2) ? "identical": "not identical"));
    }
};