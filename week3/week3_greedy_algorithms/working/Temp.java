import java.util.ArrayList;

class Temp{
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.remove(1);

        for (int item : al){
            System.out.println(item);
        }
    }
}