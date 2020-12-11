package rennsyuu2020_12_10;
/**問題集：http://www.kitako.tokyo/lib/JavaExercise.aspx?id=2 Java問題集
 *@author Maro2
 *問2-6 年齢を訊ね、生まれてから現在までの、おおよその日数を表示するプログラムを作成しなさい。
 */
import java.util.Scanner;
public class rennsyuu06_2 {
	public static void main(String [] args) {
		System.out.println("年齢を入力してください");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		scanner.close();
		System.out.println("あなたが生まれてから約" + 365*x + "日経過しています");
	}

}
