package MainPackage;


import java.util.Scanner;

public class TuitionPayment {
	
	public static double CalcTotal(double percentIncrease, double tuition){
		//Calculates the total debt of the student for a percent increase each of four years
		return tuition * (2 + percentIncrease + Math.pow((1 + percentIncrease),2) + Math.pow((1 + percentIncrease),3));
	}
	
	public static double CalcMonthlyPayment(double tot, double apr, int term){
		//Implements standard amortization formula
		double i = apr/12;
		int n = term * 12;
		double temp = Math.pow(1+i,n);
		temp--;
		temp = i/temp;
		temp += i;
		double monthlyPayment = tot * temp;
		return monthlyPayment;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Initial tuition per year.");
		double t = input.nextDouble();
		
		System.out.println("Enter annual percent increase in tuition.");
		double p = input.nextDouble();
		
		System.out.println("Enter apr(must be greater than zero).");
		double a = input.nextDouble();
		
		System.out.println("Enter term of debt in years.");
		int d = input.nextInt();
		
		double tot = CalcTotal(p, t);
		
		double payment = CalcMonthlyPayment(tot, a, d);
		
		System.out.println("Your monthly payment is: " + payment);

	}

}
