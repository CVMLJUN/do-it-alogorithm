import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11660_구간합구하기2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sizeOfMatrix = Integer.parseInt(st.nextToken());
        int account = Integer.parseInt(st.nextToken());

        long[][] matrix = new long[sizeOfMatrix + 1][sizeOfMatrix + 1];

        for (int i = 1; i <= sizeOfMatrix; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= sizeOfMatrix; j++) {
                matrix[i][j] = matrix[i - 1][j] + matrix[i][j - 1] - matrix[i - 1][j - 1] + Integer.parseInt(st.nextToken());
            }
        }

        for (int z = 0; z < account; z++) {
            st = new StringTokenizer(br.readLine());

            int X1 = Integer.parseInt(st.nextToken());
            int Y1 = Integer.parseInt(st.nextToken());
            int X2 = Integer.parseInt(st.nextToken());
            int Y2 = Integer.parseInt(st.nextToken());

            long answer = matrix[X2][Y2] - matrix[X1 - 1][Y2] - matrix[X2][Y1 - 1] + matrix[X1 - 1][Y1 - 1];

            System.out.println(answer);
        }

    }
}
