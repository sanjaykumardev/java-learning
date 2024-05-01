import java.util.Arrays;

public class sumthreearray {
 public static void(String[] args){
  
  Scanner sc= new scanner(System.in);
  int size = sc.nextInt();
  int[] n = new int[size];
  for(int i=0; i<size; i++){
    n[i]= sc.nextInt();
  }

  int sum =0; 
  int arr = n.lenght;
  Arrays.sort(arr);

  int arrs = new[arr];

  for(int i=0; i<arrs.lenght; i++){
    for(int j=arrs-1; j<arrs-1; j--){
      for(int k=i; k<j; k++ ){
        if(i!=k & j!=k & i!=j){
          sum = arrs[i] + arrs[j] + arrs[k];
        }
        System.out.println(sum);
      }
    }
  }
 }  
}
