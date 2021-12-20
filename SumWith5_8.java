/* Problem Statement: Give String containing digits which are comma seperated. print sum of num1 and num2 .where 
num2: if digit lie bettween 5 to 8 (8 always will be after 5) (including both) then append in num2.
num1: if digit don't lie bettween 5 to 8, then add in num1.

input: "3,2,6,5,1,4,8,9"
output: 5168
*/

import java.util.Scanner;

/**
 *
 * @author Jinal Sojitra
 */
public class SumWith5_8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.replaceAll(",", "");
        int n1=0;//sum
        int n2=0;//append
        int flag=0;
        for(int i=0;i<s.length();i++){
            
            int d=s.charAt(i)-'0';
            if(d==5)
                flag=1;
           
            if(flag==1){
                n2=n2*10+d;
            }
            else
                n1+=d;
            
            if(d==8)
                flag=0;
                
        }
        System.out.println(n1+n2);
    }
}
