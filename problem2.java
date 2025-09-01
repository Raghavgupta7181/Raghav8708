import java.util.Scanner;
public class problem2 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the number in array");
        int i; 
        int arr[]  =new int[5];
     //loop for taking values
        for(i=0;i<5;i++){
            arr[i] = scan.nextInt();
        }
        // loop for printing array and find max values.
        System.out.println("printed array");
        int max=0;
       for(int j=0;j<5;j++){
        
        System.out.println("array is\n"+arr[j]);
        if (arr[j]>max){
            max=arr[j];
        }
       }
       System.out.print("\nLargest = "+max);
    }
}
