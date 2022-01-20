import java.util.Scanner;

public class TwoDim_Array_Searching{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i,j;
        
        System.out.println("Enter the no. of rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter the elements of the array: ");
        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the element to search: ");
        int x = sc.nextInt();

        int flag = 0;
        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
                if(arr[i][j] == x){
                    flag=1;
                    System.out.println("Found at position "+i+", "+j);
                    break;
                }
            }
        }

        if(flag == 0){
            System.out.println("Not found");
        }


    }
}