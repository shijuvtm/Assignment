import java.util.*;
class Anagram
    {
        public boolean isAnagram(String str1,String str2)
        {

                if(str1.length()!=str2.length()){
                    return false;
                }
                else
                {
                    char[] charArray1=str1.toCharArray();
                    char[] charArray2=str2.toCharArray();

                    //  Bubble sorting technique
                    for(int i=0;i<charArray1.length;i++){
                        for(int j=0;j<charArray1.length;j++){
                            if(charArray1[i]>charArray1[j]){
                                char temp=charArray1[i];
                                charArray1[i]=charArray1[j];
                                charArray1[j]=temp;
                            }
                        }
                    }
                    for(int i=0;i<charArray2.length;i++){
                        for(int j=0;j<charArray2.length;j++){
                            if(charArray2[i]>charArray2[j])
                            {
                                char temp=charArray2[i];
                                charArray2[i]=charArray2[j];
                                charArray2[j]=temp;
                            }
                        }
                    }
                    for(int i=0;i<charArray1.length;i++){
                        if(charArray1[i]!=charArray2[i]){
                            return false;
                        }
                    }
                    return true;

                }

    }
}
public class Main {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string 1");
        String str1=sc.nextLine();
        System.out.println("enter the string 2");
        String str2=sc.nextLine();
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        Anagram obj=new Anagram();

        boolean result=obj.isAnagram(str1,str2);

        System.out.println("\n"+result);

    }

}