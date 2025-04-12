import java.util.*;

class John{
    public static void main(String[] args) {
        
        Map<Integer, String> m = new HashMap<Integer, String>();
        
        m.put(15, "Sundari");
        m.put(35, "Anjali");
        m.put(20, "John");
        m.put(28, "Rishi");


        //System.out.println(m.keySet());
        // System.out.println(m.get(17));

        for(Object i : m.keySet()){
            System.out.println(i + " : " + m.get(i));
        }
    }
}
