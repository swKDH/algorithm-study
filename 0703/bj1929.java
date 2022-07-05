package ù°��;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj1929 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int s = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		
		boolean[] check = new boolean[e+1];
		check[0] = check[1] = true;
		for(int i=2; i<=e;i++) {
			if(check[i]==true) {
				continue;
			}
			for(int j=i+i; j<=e; j=j+i) {
				check[j]=true; //j=i+i -> 2�� ������� �Ҽ��� �ƴϱ⿡ true�� ��ȯ
			}
		}
		for( int i=s; i<=e; i++) { //������ִ� �ݺ����� �־��ְ� false(�Ҽ�)�ΰ�츸 ���
			
			if(check[i]==false) {
				System.out.println(i);
			}
		}
	}

}
