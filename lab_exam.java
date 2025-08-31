import java.util.Scanner;
public class lab_exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];

        for(int i = 0; i<5; i++){
            System.out.println("Enter elements: ");
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter number you want to insert: ");
        int n = sc.nextInt();

        System.out.println("Enter index: ");
        int index = sc.nextInt();

        for(int i = 5; i>=index; i--){
            arr[i + 1] = arr[i];
        }

        arr[index] = n;
        System.out.println("Elements: ");
        for(int i = 0; i<6; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
