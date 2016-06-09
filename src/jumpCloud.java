import java.util.Scanner;

public class jumpCloud {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int c[] = new int[n];
		for (int c_i = 0; c_i < n; c_i++) {
			c[c_i] = in.nextInt();
		}

		/* solution starts */
		int jump_step = 2;
		int steps = 0;
		for (int i = 0; i < n;) {
			if (i + 2 < n) {
				if (c[i + jump_step] == 0) {
					steps += 1;
					i = i + jump_step;
					System.out.println("jump step 2");
				} else {
					jump_step = 1;
					steps += 1;
					i = i + jump_step;
					jump_step = 2;
					System.out.println("jump step 1");
				}
			} else if (i + 1 == n - 1) {
				//System.out.println("in the end");
				i = i+1;
				steps += 1;
				//System.out.println(steps);
				break;
			}
			if(i == n-1)
			{
				System.out.println(steps);
				break;
			}
		}
		
	}
}
