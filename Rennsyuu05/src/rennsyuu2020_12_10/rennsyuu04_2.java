package rennsyuu2020_12_10;
/**問題集：http://www.kitako.tokyo/lib/JavaExercise.aspx?id=2 Java問題集
 *@author Maro2
 *問2-4 int 型の変数 x、y にそれぞれ数値を入力し、x と y の和、差（x－y）、積、商と余り(x÷y)、を表示するプログラムを作成しなさい。
 */
import java.util.Scanner;
public class rennsyuu04_2 {
	/**
	 * int x = scanner.nextInt();
	 * int x = scanner.nextInt();
	 * 2つ並べれば数字を2つ入力できるようになる
	 */
	public static void main(String[] args) {
		System.out.println("好きな数字を2つ入力してください");
		//数字を2つ入力
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		scanner.close();
		//計算結果を出力
		
		System.out.println("x,yの和を表示します");
		System.out.println("和=" + (x + y));
		
		System.out.println("x,yの差を表示します");
		System.out.println("差=" + (x - y));
		
		System.out.println("x,yの積を表示します");
		System.out.println("積=" + (x * y));
		
		System.out.println("x,yの商とあまりを表示します");
		System.out.println("商=" + (x / y) + "あまり=" + (x % y));
	}

}
