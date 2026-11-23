package ChatGPT;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        Random random = new Random();

	        int answer = random.nextInt(100) + 1;
	        int guess;

	        System.out.println("請猜一個 1~100 的數字：");

	        do {
	            System.out.print("輸入數字：");
	            guess = input.nextInt();

	            if (guess > answer) {
	                System.out.println("太大了！");
	            } else if (guess < answer) {
	                System.out.println("太小了！");
	            } else {
	                System.out.println("恭喜答對！");
	            }

	        } while (guess != answer);

	        input.close();
	    }
}
