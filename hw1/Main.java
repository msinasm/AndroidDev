public class Main {
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int c = arr[i];
            if (c > max) {
                max = c;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,2,51,3,50};
        System.out.println(findMax(array)); // 51
    }

}
