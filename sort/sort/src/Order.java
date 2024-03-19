import java.util.Scanner;

public class Order {
    public static void main(String[] args){
        System.out.println("pleas enter 3 numbers");
        Scanner scanner = new Scanner(System.in);
        int [] aray = new int[3];
        for(int i=0;i<3;i++){
            System.out.println("num " + (i+1) + " :");
            int num = scanner.nextInt();
            aray[i] = num;
        }
        sort(aray);
        print(aray);
    }
    public static void print(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static int [] sort(int [] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int a = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = a;
                }
            }
        }
        return arr;

    }
}