import java.util.*;
// import java.lang.*;
// import java.io.*;

// tamil arasan  call me in drone lab

public class cricket {

  public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
  
    System.out.println("");
    int s = sc.nextInt();


    for(int i=0; i<s; i++){
      int N = sc.nextInt();
        
      int M = sc.nextInt();
      sc.close();
      int numMatches = N - 1;
          
      if(numMatches >= M){
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }
    }
    
	}

  
}





	



