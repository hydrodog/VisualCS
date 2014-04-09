package org.adastraeducation.visualcs.test;
import org.adastraeducation.visualcs.*;

public class TestTextArrayDisplayer {
	public static void main(String[] args) {
		int[] a = { 5, 1, 4, 3, 2 };
		TextArrayDisplayer displayer = new TextArrayDisplayer(a);
		displayer.swap(1, 2);
		displayer.rotate(0, 3, +1);
		
	}
}
