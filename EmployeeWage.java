
public class EmployeeWage 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int IS_PART_TIME=1;
		int IS_FULL_TIME=2;
		int EMP_RATE_PER_HOUR=20;
		int EMPhRS=0;
		int empWage=0;
		double empCheck=Math.floor(Math.random()*10)%3;
		if (empCheck==IS_PART_TIME)
			EMPhRS=4;
		else if(empCheck==IS_FULL_TIME)
			EMPhRS=0;
		else
			EMPhRS=0;
		empWage=EMPhRS*EMP_RATE_PER_HOUR;
		System.out.println("Daily employee wage: "+ empWage);
		

	}
}
