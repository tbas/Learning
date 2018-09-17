public class Main {
    public static void main(String[] args){
		
		System.out.println("HeadFirstJava First Chapter");
	
		double y = 26.5;
		int x = (int) y;
		System.out.println(y);
		
		
		 x = 3;
		while (x > 0) {
			if (x == 1) {
				System.out.print("d");
				x = x - 1;
			}
			if (x == 2) {
				System.out.print("b c");
				}
			if (x > 2) {
				System.out.print("a");
				
			}
			x = x - 1;
			System.out.print("-");
		}
		
	}
}
