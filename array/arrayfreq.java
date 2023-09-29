package array;

public class arrayfreq {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 2, 1, 4, 3};
        int Temp[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    Temp[j] = -1;
                }
                if (Temp[i] != -1) {
                    Temp[i] = count;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (Temp[i] != -1) {
                System.out.println(arr[i] + "|" + Temp[i]);
            }

        }
    }
}


