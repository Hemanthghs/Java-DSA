//String Builder

import java.util.Scanner;

public class Strings_3{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Hemanth");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 
        sb.setCharAt(0,'h');
        System.out.println(sb);

        //insert a char
        sb.insert(0,'H');

        System.out.println(sb);

        //delete
        sb.delete(0,1);

        System.out.println(sb);

        sb.append("s");
        sb.append("ai");

        System.out.println(sb);
    }
}