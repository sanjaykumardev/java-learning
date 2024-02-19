public class reversenumber {

  public static int  Number(int number){
    // convert the number to string
    String str = Integer.toString(number);
    // reverse the string using the stringbulider
    StringBuilder reverseint = new StringBuilder(str).reverse();
     //convert the string to number
    int reversenumber  = Integer.parseInt(reverseint.toString());

    
   
    return reversenumber;
  }
   
  public static void main(String[] args){
    int N = 123; 
    System.out.println("original:" +N);
    int reversed = Number(N);
    System.out.println("reverse:"  +reversed);

  }
}
