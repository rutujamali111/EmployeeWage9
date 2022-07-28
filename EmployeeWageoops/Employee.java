package EmployeeWageoops;

public class Employee {
	final int IS_PART_TIME=1;
	final int IS_FULL_TIME=2;
	int EMP_RATE_PER_HR;
	int NUM_OF_WORKING_DAYS;
	int MAX_HRS_IN_MONTH;
	String Company_name;
	
	
	public Employee(int eMP_RATE_PER_HR, int nUM_OF_WORKING_DAYS, int mAX_HRS_IN_MONTH, String company_name) {
		super();
		EMP_RATE_PER_HR = eMP_RATE_PER_HR;
		NUM_OF_WORKING_DAYS = nUM_OF_WORKING_DAYS;
		MAX_HRS_IN_MONTH = mAX_HRS_IN_MONTH;
		Company_name = company_name;
	}


	public int getEMP_RATE_PER_HR() {
		return EMP_RATE_PER_HR;
	}


	public void setEMP_RATE_PER_HR(int eMP_RATE_PER_HR) {
		EMP_RATE_PER_HR = eMP_RATE_PER_HR;
	}


	public int getNUM_OF_WORKING_DAYS() {
		return NUM_OF_WORKING_DAYS;
	}


	public void setNUM_OF_WORKING_DAYS(int nUM_OF_WORKING_DAYS) {
		NUM_OF_WORKING_DAYS = nUM_OF_WORKING_DAYS;
	}


	public int getMAX_HRS_IN_MONTH() {
		return MAX_HRS_IN_MONTH;
	}


	public void setMAX_HRS_IN_MONTH(int mAX_HRS_IN_MONTH) {
		MAX_HRS_IN_MONTH = mAX_HRS_IN_MONTH;
	}


	public String getCompany_name() {
		return Company_name;
	}


	public void setCompany_name(String company_name) {
		Company_name = company_name;
	}
	
	public void CalculateWage()
	{
		int empHrs=0;
		int totalEmpHrs=0;
		int totalWorkingDays=0;
		while(totalEmpHrs<=MAX_HRS_IN_MONTH && totalWorkingDays<NUM_OF_WORKING_DAYS)
		{
				totalWorkingDays++;
			int empCheck=(int) Math.floor(Math.random()*10)%3;
			switch(empCheck)
			{
				case IS_PART_TIME:
					empHrs=4;
					break;
				case IS_FULL_TIME:
					empHrs=8;
					break;
				default:
					empHrs=0;
			}
			totalEmpHrs+=empHrs;
			System.out.println("Days#: "+totalWorkingDays+"Emp Hrs: "+empHrs);
		}
	   int totalempWage=totalEmpHrs*EMP_RATE_PER_HR;
	   System.out.println("Total emp wage of company "+Company_name+"is "+totalempWage);
	}
	
	
}
