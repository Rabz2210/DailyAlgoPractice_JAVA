import java.util.Scanner;
import java.util.*;

class BinarySearch{
    public static boolean find(int ary[], int s, int l, int key){
        if(s<=l){
            int mid = s+(l-s)/2;
            if(ary[mid]==key)return true;
            if(key<ary[mid])find(ary, s, mid-1,key);
            if(key>ary[mid])find(ary, mid+1, l, key);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int t = scan.nextInt();
        
        List<Boolean> result = new ArrayList<Boolean>(t);
        while(t-->0){
            int key = scan.nextInt();
            scan.nextLine();
            String sary[] = scan.nextLine().split(" ");
            int size= sary.length;
            int ary[]=new int[size];
            for(int j=0;j<size;j++){
                ary[j]=Integer.parseInt(sary[j]);
            }
            result.add(find(ary,0,ary.length-1,key));
            
        }
        for(Boolean each: result){
            System.out.println(each);
        }
        scan.close();
    }
   
}
