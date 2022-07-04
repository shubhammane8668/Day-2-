public class whileloop1 {

	public static void main(String[] args) {
		//a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5
    int num=5, i=1, sum=0;
    while(i<=num)
    {
    	sum=sum+i;
    	i++;
    }
    System.out.println("sum of numbers= "+sum);
	}

}
