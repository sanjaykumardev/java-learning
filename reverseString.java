import java.util.*;

public class reverseString {

  public static void  main(String[] args ){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

  
   
    sc.close();


   String[] words = str.split(" ");
   int left = 0;
   int right = words.length-1;
   while(left < right){
     String temp = words[left];
     words[left] = words[right];
     words[right] = temp;
     
     left++;
     right--;
   }
  
   StringBuilder reversedSentence = new StringBuilder();
        for (String word : words) {
            reversedSentence.append(word).append(" ");
        }

        // Remove the extra space at the end
        reversedSentence.deleteCharAt(reversedSentence.length() - 1);

        System.out.println(reversedSentence.toString());
    }
  
  }

 
 


