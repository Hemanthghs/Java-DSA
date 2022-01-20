import java.util.Scanner;

public class Strings_2{
    public static void main(String args[]){
        String s1 = "Java";
        String s2 = "Java"; 
        //s1==s2: 0
        //s1>s2: +ve
        //s1<s2: -ve

        if(s1.compareTo(s2) == 0){
            System.out.println("Same");
        }
        else{
            System.out.println("Not same");
        }
    }
}