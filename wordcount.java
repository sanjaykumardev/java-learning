public class wordcount {
    // Function to count total words in a string
    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0; // Return 0 if the string is null or empty
        }
        // Split the string into words based on whitespace characters
        String[] words = str.trim().split("\s");

        return words.length; // Return the count of words
    }
    public static void main(String[] args) {
        String text = "This is my name."; // Change this string

        int wordCount = countWords(text);

        System.out.println("Total words in the string: " + wordCount);
    }
}


