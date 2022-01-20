public class Strings_4{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Hemanth");

        char temp;
        int j = sb.length() - 1;
        for(int i=0;i<sb.length()/2;i++){
            temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            j--; 
        }

        System.out.println(sb);
    }
}