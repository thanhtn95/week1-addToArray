import java.util.Scanner;

public class AddToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {5,8,3,6,8,7,4};
        System.out.println("Original Array: ");
        for(int i : numbers) System.out.print(i+", ");
        System.out.println();
        System.out.println("Enter a number :");
        int inputNum = sc.nextInt();
        System.out.println("Enter index to add it: ");
        int index = sc.nextInt();
        if(index<0 || index >numbers.length){
            System.out.println("Invalid index!!!");
        }else{
            numbers = addToArray(numbers,index,inputNum);
            System.out.println("After Array: ");
            for(int i : numbers) System.out.print(i+", ");
        }
    }

    private static int[] addToArray(int[] arr, int index, int number){
        int[] tmp = new int[arr.length+1];
        for(int i = 0 ; i<index;i++){
            tmp[i] = arr[i];
        }
        tmp[index] = number;
        for(int i =index+1; i<tmp.length;i++){
            tmp[i] = arr[i-1];
        }
        return tmp;
    }
}
