/*
 * Topic: 讓使用者輸入多個數，統計正數、負數及零各有多少個。
 * Date: 2016/10/03
 * Author: 105021057 張岳埕
 */
package hw;
import java.util.*;
public class hw02_105021057 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a=0;int b=0;int c=0;
		boolean run = true;
		while(run==true){
			int s = scn.nextInt();
			if(s<0){
				a++;
			}else{
				if(s==0){
				b++;
			}else{
				c++;
			}
				
		}
	System.out.print("是否繼續(Y/n):");
	char fu = scn.next().charAt(0);
	if(fu == 'n' || fu == 'N'){
		break;
	}
	}
		System.out.println("正數"+c+"個");
		System.out.println("負數"+a+"個");
		System.out.println("零"+b+"個");
	}
}
