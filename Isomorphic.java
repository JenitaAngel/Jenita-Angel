import java.util.Map;
import java.util.HashMap;
public class Isomorphic {
  public boolean isoString(String a, String b) {
    Map<Character, Character> m = new HashMap<Character , Character>();
    if(a == null || b == null) {
      return false;
    }
    if(a.length() != b.length()) {
      return false;
    }
    for(int i = 0; i < a.length(); i++) {
      char c = a.charAt(i);
      char c1 = b.charAt(i);
      if(m.contains(c) {
        if(m.get(c) != c1) {
          return false;
        } 
      } else {
          if(m.contains(c1)) {
              return false;
          }
              m.put(c,c1);
      }
      }
    }
    public static void main(String[] arg) {
      Isomorphic iso = new Isomorphic();
      iso.isoString("egg","add");
    }
}
              
