import java.util.*;


public class Test1 {
    public static void main(String[] args){
        ArrayList<Integer> list;
        list= new ArrayList<Integer>();
        int a=1,b=1;
        System.out.println(a==b); 

        Integer a1=new Integer(1), b1=1;
        System.out.println(a1.equals(b1));



        list.add(1);
        list.add(2);        
        list.set(0,5);
        list.add(0,10);
        for(int i=0; i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
        

    }
}
