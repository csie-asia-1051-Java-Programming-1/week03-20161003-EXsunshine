/*
 * Topic: 讓使用者輸入一正整數n，計算1*(1+1) + 2*(2+1) + 3*(3+1) + … + n*(n+1)並輸出結果。
 * Date: 2016/10/03
 * Author: 105021057 張岳埕
 */
package hw;
import java.util.*;
public class hw05_105021057 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int s = 0;
		while(n>0){
		s = s+n*(n+1);
		n--;
		}
		System.out.print(s);
	}

}
