public class countevennumber {
  public static void count(int[] arr){
    int even = 0;
    int odd = 0; 
 
    for(int num :arr ){
      if(num%2 == 0){
      even++;
      }
      else{
       odd++;
      }

    }
    System.out.println(  even);
    System.out.println( odd);
  }
  public static void main(String[] args) {
    int[] arr = new int[] {21 ,33 ,82,6 ,3 ,4 ,9};
      count(arr);

  }
}
