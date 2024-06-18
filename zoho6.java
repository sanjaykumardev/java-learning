public class StringExpander {

  public static void main(String[] args) {
    
      String input1 = "a1b10";
      String input2 = "b3c6d15";
      
      System.out.println(expandString(input1));
      System.out.println(expandString(input2));
  }
  
  public static String expandString(String input) {
      StringBuilder output = new StringBuilder();
      int length = input.length();
      
      for (int i = 0; i < length; ) {
          char character = input.charAt(i);
          int numStart = i + 1;
          
         
          while (numStart < length && Character.isDigit(input.charAt(numStart))) {
              numStart++;
          }
          
          int number = Integer.parseInt(input.substring(i + 1, numStart));
          for (int j = 0; j < number; j++) {
              output.append(character);
          }
          
        
          i = numStart;
      }
      
      return output.toString();
  }
}
