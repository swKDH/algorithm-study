package ù°��;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj1000 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int num1 = Integer.parseInt(st.nextToken()); //nextToken ���� ������ �о�帲
		int num2 = Integer.parseInt(st.nextToken());
		//System.out.println(num1+num2);
		System.out.println(num1-num2);
		
	}

}
