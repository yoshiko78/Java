package rennsyuu;
/**問題集：http://www.kitako.tokyo/lib/JavaExercise.aspx?id=2 Java問題集
 *@author Maro2
 *問2-2 int 型の変数 x に数値を入力し、x の値を表示するプログラムを作成しなさい。
 */
import java.util.Scanner;
public class rennsyuu02_2 {
	public static void main(String[] args) {
		System.out.println("好きな数字を入力してください");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		scanner.close();
		System.out.println("入力した数字は" + x + "です");
	}
}
