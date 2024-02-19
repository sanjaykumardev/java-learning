import java.util.*;

public class stringdistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String word = sc.next();
        // String word2 = sc.next();
        int distance = distanceString(sentence, word);
        // int distance2 = distanceString(sentence, word2);
        System.out.print(distance);
        // System.out.print(distance2);
     
        sc.close();
    }

    public static int distanceString(String sentence, String word) {
        String[] words = sentence.split("");
        int distance = Integer.MAX_VALUE;
        int prevIndex = -1;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase(word)) {
                if (prevIndex != -1) {
                    int currDistance = i - prevIndex;
                    if (currDistance == distance) {
                        distance = currDistance;
                    }
                }
                prevIndex = i;
            }
            if(distance == -1){
              System.out.println("not found distance");
            }

        }
        return distance == Integer.MAX_VALUE ? -1 : distance ;
    }
}