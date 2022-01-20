public class Clear_Bit{
    public static void main(String args[]){
        int n = 5;
        int pos = 2;
        int bitMask = 1<<pos;

        int new_n = ~bitMask & n;

        System.out.println(new_n);
    }
}