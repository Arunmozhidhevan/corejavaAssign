package com.te.logic;

public class UserMainCodee {
	
public static int sum(int n1,int n2,int n3) {
	
		if(n1==13&&n2==13)
			return 0;
		else if(n1==13&&n2==13&&n3==13)
			return 0;
		else if(n1==13)
			return n3;
		else if(n2==13)
			return n1;
		else if(n3==13)
			return n1+n2;
		else
			return n1+n2+n3;

}
}
