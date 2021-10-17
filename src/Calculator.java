
public class Calculator {

	public int calculator(String string) {
		
		if(isEmpty(null)) {
		return 0;
	}
	return number(string);
	}
	private boolean isEmpty(String string) {
		return string.isEmpty();
	}
	
	private int number(String string)
	{
		String number = null;
		return Integer.parseInt(number);
	}
	
	
	private int getSum(String[] number)
	{
		int sum=0;
		for(String current:(number)) {
			sum = Integer.parseInt(current);
		}
		return sum;
	}
	


}
