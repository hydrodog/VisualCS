package org.adastraeducation.visualcs.algorithms;

import org.adastraeducation.visualcs.PAppletArrayDisplayer;
import org.adastraeducation.visualcs.VisualCS;

public class BubbleSort {
	private static PAppletArrayDisplayer a;
	
	public static void bubbleSort(int[] x) {
		for (int i = x.length-1; i > 1; i--)
			for (int j = 0; j < i; i++)
				if (VisualCS.visualize)
					a.compare(j, j+1);
				if (x[j] > x[j+1]) {
					int temp = x[j];
					x[j] = x[j+1];
					x[j+1] = temp;
					if (VisualCS.visualize)
						a.swap(j, j+1);
				}
	}
	public static void main(String[] args) {
		int[] arr = { 9, 1, 8, 2, 7, 3, 6, 5 };
		a = new PAppletArrayDisplayer(arr);
		bubbleSort(arr);
		a.display();
	}
}
