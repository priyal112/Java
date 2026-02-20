package Array;

public class arr2 {
    public static void main(String[] args) {
        // find max value
        int[] arr = new int[5];
        arr[0] = 2;
        arr[1] = 12;
        arr[2] = 786;
        arr[3] = 768;
        arr[4] = -65;
        int res = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > res){
                res = arr[i];
            }            
        }
        System.out.println(res);



        // REVERSE PRINT ARRAY

        int[] arr1 = {12, 34, 65, 24, 54, 5, 6, 46,55};
        for (int i = arr1.length -1; i >= 0; i--){
            System.out.println(arr1[i ]);
        }

        // sum of array

        int arr2[] = {56, -87, -86, 98, 6, -7};
        int sum = 0;

        for (int i = 0; i < arr2.length; i++){
            sum = sum + arr2[i];
        }
        System.out.println(sum);
    }
}
