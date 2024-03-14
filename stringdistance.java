import java.util.*;

public class stringdistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String word = sc.nextLine();
        String  word2 = sc.nextLine();
     
        int distance = distanceString(sentence, word);
        int distance2 = distanceString(sentence, word2);
       
        System.out.print(distance);
        System.out.print(distance2);
        sc.close();
    }

    public static int distanceString(String sentence, String word) {
        String[] words = sentence.split("//s");
        int distance = Integer.MAX_VALUE;
        int prevIndex = -1;
    
        for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase(word)) {
                if (prevIndex != -1) {
                    int currDistance = i - prevIndex;
                    int sum = currDistance;
                    if (sum == distance) {
                        distance = sum;
                    }
                }
                prevIndex = i;
            }
        }
        return distance == Integer.MAX_VALUE ? -1 : distance;
    } 
}