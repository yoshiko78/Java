package rennsyuu2020_12_10;
/**問題集：http://www.kitako.tokyo/lib/JavaExercise.aspx?id=2 Java問題集
 *@author Maro2
 *問2-5 ２つの整数値を入力し、平均値を求めるプログラムを作成しなさい。
 ※計算は整数で行い、小数点以下は切り捨ててよい。
 */
import java.util.Scanner;
public class rennsyuu05_2 {
	public static void main(String[] args) {
		System.out.println("平均値を求めます");
		System.out.println("好きな数字を2つ入力してください");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		scanner.close();
		System.out.println("平均値は" + (x + y ) /2 + "です");

	}

}
