import java.io.*;
import java.util.*;

public class Yanasorter{
public static void main(String [ ] args) throws IOException
{
	File f = new File("detour.txt");
	Scanner scan = new Scanner(f);
	ArrayList<Double> yvals = new ArrayList<Double>();
	ArrayList<Double> xvals = new ArrayList<Double>();
	ArrayList<Double> sorted_yvals = new ArrayList<Double>();

	while (scan.hasNextLine()){
		xvals.add(scan.nextDouble());
		double yv = scan.nextDouble();
		yvals.add(yv);
		sorted_yvals.add(yv);
		scan.nextLine();
	}

	Collections.sort(sorted_yvals);

	/* Prints the sorted values

	for(double val: sorted_yvals){
		System.out.println(val);
	}
	*/

	/*

	//Prints each value with the number of times it appears. 
	double pastVal = 0;
	int count = 1;
	for(double val: sorted_yvals){
		if (pastVal == val) count++;
		else {
			System.out.println(pastVal + ", " + count);
			count = 1;
		}
		pastVal = val;
	}
*/ 
	//Prints values above 10000 along with their time
	for(double val: sorted_yvals){
		if(val > 10000){
			int index = yvals.indexOf(val);
			System .out.println(xvals.get(index) + ", " + val);
		}
	}

}
}
