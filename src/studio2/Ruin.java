package studio2;

import java.util.Scanner;
public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Your start amount");
		double startAmount = in.nextDouble();
		System.out.println("Win chance");
		double winchance = in.nextDouble();
		System.out.println("win limit");
		double winlimit = in.nextDouble();
		System.out.println("Total simultaions: " ); 
	    int totalSimulations = in.nextInt();
		 
	    double j = startAmount;
	    
	    
	    //while(j < winlimit&&j>0) {
			//double k = Math.random();
			//if(k>winchance) {
				//System.out.println("Success");
			    //j++;}
			//else if(k<winchance) {
				//System.out.println("Ruin");
				//j--;
			//System.out.println(j);
			
		//}
	    
		for(int i = totalSimulations; i<= 0; i++) {
			while(j < winlimit||j>0) {
				double k = Math.random();
				if(k>winchance)
				   j++;
				System.out.println("Simulation" + i + “：“ + j + ”WIN“ )；
				else if(k<winchance)
					j--;
				System.out.println("Simulation" + i + “：“ + j + ”LOOSE“ )；
			}
		}
	}
 
