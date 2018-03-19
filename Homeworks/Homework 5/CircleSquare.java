import java.util.Random;

public class CircleSquare {
	public static void main(String[] args) {
		long before = System.currentTimeMillis();
		Random rand = new Random();
		
		double x=0, y=0;
		long total = 4000000000L;
		
		int count = 0;
		long loop_cnt = 0;
		
		double ratioForPi=0;
		double piEst=0;
		
		double radius = 2; //radius is 2 for this example
		
		ratioForPi = count/total;
		piEst = ratioForPi*4;
		
		while (loop_cnt<total){
			x = rand.nextDouble()%radius;
			y = rand.nextDouble()%radius;
			if (Math.sqrt(x*x+y*y)<radius)
				loop_cnt++;
		}
		System.out.println("Pi is: " +piEst);
		System.out.println(System.currentTimeMillis()-before);
	}

}


