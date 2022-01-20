import java.util.Scanner;

public class Strings_1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String name = sc.nextLine();

        String surname = sc.next();

        System.out.println(name+" "+surname);
        System.out.println(name.length());

        //charAt
        for(int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }

    }
}