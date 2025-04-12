import java.util.*;

class John{
    public static void main(String[] args) {
        
        Map<Integer, String> m = new HashMap<Integer, String>();
        
        m.put(17, "Jagadesh");
        m.put(5, "Madhu");
        m.put(20, "Kanthara");
        m.put(7, "Devi");


        //System.out.println(m.keySet());
        // System.out.println(m.get(17));

        for(Object i : m.keySet()){
            System.out.println(i + " : " + m.get(i));
        }
    }
}