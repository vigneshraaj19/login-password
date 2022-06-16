package recursion;

class One
{
  
	static int sum(int n)
	{
	    if (n == 0)
	    
	        return 0;
	    int temp = (n % 10 + sum(n / 10));
	    if (temp < 10)
	        return temp;
	    return sum(temp);
	}
 
 
    public static void main(String args[])
    {
        int num =99;
        int result = sum(num);
        System.out.println(result);
    }
}