import java.util.*;

public class zoho3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int weight = getWeight(arr[i]);
            if (weight % 2 != 0 && weight % 12 == 0 && Math.sqrt(weight) % 1 == 0) {
                list.add(arr[i]);
            }
        }

        Collections.sort(list);
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.print(sum + " ");
    }

    public static int getWeight(int n) {
        int weight = 0;
        while (n > 0) {
            weight += n % 10;
            n /= 10;
        }
        return weight;
    }
}
