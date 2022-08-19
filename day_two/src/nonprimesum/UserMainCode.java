package nonprimesum;

public class UserMainCode {

	static int addNumber(int n) {

		int count = 0;
		int sum=0;

		for (int i = 1; i <= n; i++) {
			//count=0;
			
			for(int j=1; j<=i;j++) {

			if (j%i==0) {
				count++;
			}
		}
			if(count!=2) {
				sum = sum+i;
			}
		
	}
		return sum;
	}
/*	static int prime(int x) {
		int cou = 0;
		for (int i = 1; i <= x; i++) {

			if (x % i == 0)
				cou++;
		}
		System.out.println(cou);
		return cou;
	} */

}
