package array;

public class array3 {
    public static void main(String[] args) {
        char arr[] = {'S', 'T', 'A', 'R'};
        int line = 4;

        int star = 4;
        int ch = 0;
        for (int i = 0; i < line; i++) {
            int ch1 = ch;
            for (int j = 0; j < star; j++) {
                System.out.print(arr[ch1]);
                ch1++;
                if (ch1 > 3) {
                    ch1 = 0;
                }

            }
            System.out.println();
            ch++;


        }
    }
}