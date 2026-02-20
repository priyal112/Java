package Array;

public class arr1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[2] = 45;
        arr[6] = 56;
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        int[] arr1 = {1, 23, 54, 23};
        for(int i : arr1){
            System.out.println(i);
        }    

        // search element in array

    int arr2[] = {23, 45, 55, 76, 13};
    for(int i : arr2){
        if(i == 55){
            System.out.println("Found");
        }
    }
    }
}
