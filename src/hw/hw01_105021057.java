/*
 * Topic: 輸入一個正整數值(不含 0)，傳回該數值是幾位數(# ofdigits)。
 * Date: 2016/10/03
 * Author: 105021057 張岳埕
 */
package hw;
import java.util.*;
public class hw01_105021057 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Long a = scn.nextLong();
		int sum = 0;
		while(a>0){
			sum++;
			a = a/10;	
		}
		System.out.print(sum+"位數");
	}

}
