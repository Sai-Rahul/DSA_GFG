import java.util.*;

public class lcmnaive {
	static int lcm (int a, int b)
	{
	   int res= Math.max(a, b);
	   while(true)
	   {
		   if (res%a ==0 && res%b ==0)
			   return res;
		   res++;
	   }
	}
	

	public static void main(String[] args) {
		int a= 3;int b=5;
		System.out.println(lcm(a,b));

	}

}
