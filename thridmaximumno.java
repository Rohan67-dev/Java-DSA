public class thridmaximumno{
    class Solution {
    public int thirdMax(int[] nums) {

        int n = nums.length;
        int a = 0, temp;

        int[][] num = new int[n][2];
        for (int i = 0; i < n; i++) {

            boolean found = false;

            for (int j = 0; j < a; j++) {

                if (nums[i] == num[j][0]) {
                    found = true;
                    num[j][1]++;
                    break;
                }
            }

            if (!found) {
                num[a][0] = nums[i];
                num[a][1] = 1;
                a++;
            }
        }

        for (int i = 0; i < a; i++) {

            for (int j = i + 1; j < a; j++) {

                if (num[i][0] < num[j][0]) {

                    temp = num[i][0];
                    num[i][0] = num[j][0];
                    num[j][0] = temp;

                    temp = num[i][1];
                    num[i][1] = num[j][1];
                    num[j][1] = temp;
                }
            }
        }

        if (a >= 3) {
            return num[2][0];
        }

        return num[0][0];
    }
    }
}


