import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Jinal Sojitra
 */
public class RemoveCharAtSpecialIndex {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String instr=sc.nextLine();
        int n=instr.length();
        StringBuilder outstr=new StringBuilder();
        HashMap<Character,Integer> hm_l=new HashMap<>();
        HashMap<Character,Integer> hm_d=new HashMap<>();
        int count_d=0;
        int count_l=0;
        for(int i=0;i<n;i++){
            char c=instr.charAt(i);
            if(isDigit(instr.charAt(i))){
                if(hm_d.containsKey(c)){
                    int updated=hm_d.get(c)+1;
                    hm_d.put(c,updated);
                }
                else if(c!=' ')
                    hm_d.put(c, 1);
            }
            if(isLetter(instr.charAt(i))){
                if(hm_l.containsKey(c)){
                    int updated=hm_l.get(c)+1;
                    hm_l.put(c,updated);
                }
                else
                    hm_l.put(c, 1);
            }
        }
        //max
        for(Map.Entry<Character,Integer> e:hm_d.entrySet()){
            count_d=Math.max(count_d,e.getValue());
        }
        
        for(Map.Entry<Character,Integer> e:hm_l.entrySet()){
            count_l=Math.max(count_l,e.getValue());
        }
        
        int sp_index=Math.abs(count_l-count_d);
        char c=instr.charAt(sp_index);
        for(int i=0;i<n;i++){
            char res_c=instr.charAt(i);
            if(res_c!=' ' && res_c!=c){
                outstr.append(res_c);
            }
            if(res_c==' ')
                outstr.append('$');
        }
        System.out.println(outstr);
       
    }
}
