import java.util.*;
class John{
    public static void main(String[] args) {        
        Set<Integer> c = new TreeSet<Integer>();
        c.add(15);
        c.add(5);
        c.add(20);
        c.add(18);
        c.add(5);

        for(Object i :c){
            int num = (Integer) i;
            System.out.println(num);
        }     
    }
}