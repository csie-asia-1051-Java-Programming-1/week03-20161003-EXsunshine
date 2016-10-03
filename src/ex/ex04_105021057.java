package ex;
/*
 * Topic: 將一連串數字(每個數字為 0~9)輸入，計算其和。例如：輸入 12345，輸出為15 (1+2+3+4+5=15)
 * Date: 2016/10/03
 * Author: 105021057 張岳埕
 */
import java.util.Scanner;
public class ex04_105021057 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int sum = 0;
		while(a>0){
			sum = sum + a%10;
			a = a/10;
		}
		System.out.print(sum);
	}

}
