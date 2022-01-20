public class Update_Bit{
    public static void main(String args[]){
        int n = 5;
        int pos = 1;
        int bitMask = 1<<pos;
        int update_to = 1;
        int new_n;
        if(update_to==0){
            new_n = ~bitMask & n;
        }
        else{
            new_n = bitMask | n;
        }

        System.out.println(new_n);
    }
}