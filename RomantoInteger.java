import java.util.HashMap;
import java.util.Map;
public class RomantoInteger {
    public int romantoInt(String s){
        Map<Character, Integer> symbolValues = new HashMap<Character,Integer>();

        symbolValues.put('I', 1);
        symbolValues.put('V', 5);
        symbolValues.put('X', 10);
        symbolValues.put('L', 50);
        symbolValues.put('C', 100);
        symbolValues.put('D', 500);
        symbolValues.put('M', 1000);


        int n = s.length();
        int num  = symbolValues.get(s.charAt(n-1));

        for(int i = n-2; i >= 0; i--){
            if(symbolValues.get(s.charAt(i)) >= symbolValues.get(s.charAt(i+1))){
                num += symbolValues.get(s.charAt(i));
            }else{
                num -= symbolValues.get(s.charAt(i));
            }
        }
        return num;
    }
    
}
