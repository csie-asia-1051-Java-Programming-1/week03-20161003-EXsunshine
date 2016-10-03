package ex;
/*
 * Topic: 輸入一正整數，判斷其奇偶數。
 * Date: 2016/10/03
 * Author: 105021057 張岳埕
 */
import java.util.Scanner;
public class ex05_105021057 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		if(a%2==1){
			System.out.print("奇數");
		}else{
			System.out.print("偶數");
		}
	}

}
