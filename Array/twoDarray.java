package Array;

public class twoDarray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int[][] nums = {
            {2, 4, 7},
            {6, 3, 6},
            {6, 3, 7}
        };
        System.out.println(nums[1][2]);

        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

    // CHARACTER

        char[][] arr1 = new char[3][2];
        arr1[0][0] = 'a';
        arr1[0][1] = 'b';
        arr1[1][0] = 'c';
        arr1[1][1] = 'd';
        arr1[2][0] = 'e';
        arr1[2][1] = 'f';

        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr1[i].length; j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
