import java.util.HashMap;
import java.util.Map;
 
public class App {

    public static void main(String[] args) throws Exception {
        App app = new App();
        boolean eredmeny = app.benneVanE("COVID-19xd","CO-x14d");
        System.out.println(eredmeny);
        
    }

    public boolean benneVanE(String a, String b) {

        Map<Character,Integer> map = new HashMap<Character,Integer>(); 
        
        for(int i = 0; i < a.length(); i++){

            map.put(a.charAt(i),(map.getOrDefault(a.charAt(i),0)+1));

        }

        for(int i = 0; i < b.length(); i++){
            
            if(map.containsKey(b.charAt(i))){

                if(map.get(b.charAt(i))<=0) return false;

            }
            else{
                return false;
            }
              
            map.put(b.charAt(i),(map.get(b.charAt(i))-1));
        } 
                
        return true;
    }
}
