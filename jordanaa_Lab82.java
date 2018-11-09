//Unemployment statistics from 2008 - 2012 in the months of January and December
//Data taken from the Bureau of Labor Statistics
public class jordanaa_Lab82 {
	public static void main(String[] args) {
		System.out.println("Percentage of employed Labor Force over the age of 16 \n");
		System.out.println("\t Jan \t Dec");
		String[] titles = {"2008", "2009", "2010", "2011", "2012"}
		;
		double[][] unemployment = {
				{62.9 , 61.0},
				{60.6 , 58.3},
				{58.5 , 58.3},
				{58.3 , 58.6},
				{58.4 , 58.7},
		};
		for (int i = 0; i < titles.length;) {
			for (int k = 0; k < unemployment.length; k++) {
				for(int l = 0; l < unemployment[k].length; l++) {
					System.out.print(titles[i]); 
					System.out.printf("\t %1.1f", unemployment[k][l] );
					System.out.print("%");
					l++;
					System.out.printf("\t %1.1f", unemployment[k][l] );
					System.out.print("%");
					System.out.println(" "); 
					i++;
				}
			}
		}
		System.out.println("\n(Data taken from the Bureau of Labor Statistics.)");
	}
}

