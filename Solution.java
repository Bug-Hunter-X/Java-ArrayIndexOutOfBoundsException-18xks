public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];
        if (arr.length > 0) {
            arr[arr.length -1] = 10; 
            System.out.println(arr[arr.length -1]);
        } else {
            System.out.println("Array is empty");
        }
    }
}