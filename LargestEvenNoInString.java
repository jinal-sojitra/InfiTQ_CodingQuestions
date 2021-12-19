Problem Statement: given String containing letters, Special Characters, digits. find out largest possible even no. after removing duplicate digits, and print that even no.,
if even no. is not possible then return -1.

ex. input: "infosys@337" output: -1
ex.2 input: "Jinal@0505" output: 50

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Jinal Sojitra
 */
public class LargestEvenNoInString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.replaceAll("[A-Za-z]","");
        s=s.replaceAll("\\W","");
        
        HashSet<Integer> hs=new HashSet<>();
        
        for(int i=0;i<s.length();i++){
            hs.add(Integer.parseInt(String.valueOf(s.charAt(i))));
        }
        ArrayList<Integer> a=new ArrayList<>(hs);
        
        Collections.sort(a, Collections.reverseOrder());
        
        boolean noEven=true;
        int n=a.size();
        for(int i=n-1;i>0;i--){
            if(a.get(i)%2==0){
            a.add(a.get(i));
            a.remove(i);
            noEven=false;
            break;
            }
        }
        
        if(noEven){
            System.out.println(-1);
        }
        else{
            int res=0;
            for(int i=0;i<n;i++){
                res=res*10+a.get(i);
            }
            System.out.println(res);
        }        
    }
}
