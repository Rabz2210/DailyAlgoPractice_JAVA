
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class NumberOfDigitsInAstring
 {
    public static void main(String args[] ) throws Exception {

        

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s =br.readLine();           // Reading input from STDIN
        HashMap<Character,Integer> mp = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            char key = s.charAt(i);
            if(mp.containsKey(key)){
                Integer val = mp.get(key)+1;
                mp.put(key,val);
            }else{
                mp.put(key,1);
            }
            
        }
        for(int i=0;i<10;i++){
            char key = (char)(i+'0');
            if(mp.containsKey(key)){System.out.println(""+i+" "+mp.get(key));}
            else{System.out.println(""+(int)i+" "+0);}
        }

    }
}
