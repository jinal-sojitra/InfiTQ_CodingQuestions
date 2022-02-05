/*
Reverse String After Removing Duplicate Characters.Deletion should be done from 2nd occurence.

example:
input: "GeeksForGeeks"
Output: "rofskeg"
*/

public class reverseAfterRemovingDuplicates {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<str.length();i++){
            hs.add(str.charAt(i));
        }
        
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<str.length();i++){
            if(hs.contains(str.charAt(i))){
                sb.append(str.charAt(i));
                hs.remove(str.charAt(i));
            }
        }
        System.out.println(sb.reverse().toString());
    }
    
}

