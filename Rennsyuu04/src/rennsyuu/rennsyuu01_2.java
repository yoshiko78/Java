package rennsyuu;
/**問題集：http://www.kitako.tokyo/lib/JavaExercise.aspx?id=2 Java問題集
 *@author Maro2
 *問2-1 String 型の変数 s に文字列を入力し、s の値を表示するプログラムを作成しなさい。
 */
import java.util.Scanner;
public class rennsyuu01_2 {
	public static void main(String [] args) {
		System.out.println("文字を入力してください");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		scanner.close();
		System.out.println("入力した文字は" + s + "です");
	}
}
