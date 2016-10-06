package com.wk.batAlgorithm.run;

public class ShellSort {
	public int[] shellSort(int[] A, int n) {
		int step = n/2;
		while (step>0) {
			for (int i = 0; i < step; i++) {
				for (int j = i + step; j < n; j += step) {
					int pre = j - step;
					int pos = j;
					int tmp = 0;
					while (pre >= i && A[pos] < A[pre]) {
						tmp = A[pos];
						A[pos] = A[pre];
						A[pre] = tmp;
						pre -= step;
					}
				}
			}
			step--;
		}
		return A;
	}
}
