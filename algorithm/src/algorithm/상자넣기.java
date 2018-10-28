package algorithm;

import java.io.*;
import java.util.*;

public class 상자넣기 {

	static int N, idx;
	static int boxes[] = new int[1001];
	static int dp[] = new int[1001];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		StringTokenizer stzr = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) {
			boxes[i] = Integer.parseInt(stzr.nextToken());
		}
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if (dp[j] == 0 || dp[j] >= boxes[i]) {
					if(dp[j] == 0) idx++;
					dp[j] = boxes[i];
					break;
				}
			}
		}
		System.out.println(idx);
	}
}
