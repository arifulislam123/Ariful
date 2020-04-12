package math.problems;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 *
		 */


		int x=100, y=10;
		while (x>=90){
			System.out.print(x+ " ");
			x--;
		}
		x++;
		for(int i=0; i<y;i++){
			System.out.print(x-2+ " ");
			x -=2;
		}
		for(int i=0;i<y;i++){
			System.out.print(x-3+ " ");
			x -=3;
		}
		for(int i=0;i<y;i++){
			if(i<9){
				System.out.print(x-4+ " ");
				x -=4;
			}else
				System.out.print(x -=4);
		}



	}
}
