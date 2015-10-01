package kr.ac.kookmin.lab01;

public class Sort {

	static void sorting(int a[]) {
		
		for(int i = 0; i < a.length - 1; i++) {
			
			for(int j = 0; j < a.length - 1; j++) {
				
				int temp;
			
				if(a[j] >= a[j + 1])
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
				
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[] = new int[10];
		num[0] = 10;
		num[1] = 5;
		num[2] = 2;
		num[3] = 7;
		num[4] = 9;
		num[5] = 1;
		num[6] = 8;
		num[7] = 4;
		num[8] = 3;
		num[9] = 6;
		
		sorting(num);
		
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
	}

}