package algorithm;

import java.io.*;
import java.util.*;

public class 쉬운계단수 {
	static int N, dp[][], ans;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		dp = new int[N + 1][10];
		dp[1][0] = 0;
		for (int i = 1; i < 10; i++) {
			dp[1][i] = 1;
		}
		for (int i = 2; i <= N; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 0) {
					dp[i][j] = dp[i - 1][j + 1];
				} else if (j == 9) {
					dp[i][j] = dp[i - 1][j - 1];
				} else {
					dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % 1000000000;
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			ans = (ans + dp[N][i]) % 1000000000;
		}
		System.out.println(ans);
	}
}
