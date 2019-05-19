import java.util.Scanner;

public class Solution {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int size=s.length()-(k-1);
        String[] al=new String[size];
        int start=0;
        int end=k;
        for(int i=0;i<size;i++){
            al[i]=s.substring(start,end);
            start++;
            end++;
        }
        for(int i = 0; i<size-1; i++) {
             for (int j = i+1; j<al.length; j++) {
                if(al[i].compareTo(al[j])>0) {
                   String temp = al[i];
                   al[i] = al[j];
                   al[j] = temp;
                }
             }
          }
        smallest=al[0];
        largest=al[al.length-1];
     
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
