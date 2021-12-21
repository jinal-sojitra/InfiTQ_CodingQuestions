/*

input: "rhdt:246,ghftd:1246"
output: "trhd" "ftdgh"

explaination: number part of 1st term- 2*2+4*4+6*6=56 which is even, so rotate string to right by 1.
              number part of 2nd term- 1*1+2*2+4*4+6*6=57 which is odd, so rotate string to left by 2.

*/

import java.util.Scanner;

/**
 *
 * @author Jinal Sojitra
 */
public class StringRotationOnSquare {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        String[] arr=s.split(",");
        for(String str: arr){
            String[] obj=str.split(":");
            String word=obj[0];
            int len=word.length();
            int sq=0;
            int number=Integer.parseInt(obj[1]);
            
            while(number>0){
                int d=number%10;
                sq+=d*d;
                number/=10;
            }
            if(sq%2==0){
                System.out.println(word.charAt(len-1)+word.substring(0,len-1));
            }
            else{
                
                System.out.println(word.substring(2,len)+word.substring(0,2));
            }
        
        }
    }
}
