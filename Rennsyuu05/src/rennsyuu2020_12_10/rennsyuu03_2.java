package rennsyuu2020_12_10;
/**問題集：http://www.kitako.tokyo/lib/JavaExercise.aspx?id=2 Java問題集
 *@author Maro2
 *問2-3 int 型の変数 x に数値を入力し、x を 1 乗、2 乗、3 乗した結果を表示するプログラムを作成しなさい。
 */
import java.util.Scanner;
public class rennsyuu03_2 {
	public static void main(String[] args) {
		System.out.println("好きな数字を入力してください");
		//好きな数字を入力
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		scanner.close();
		//好きな数字を１乗、２乗、３乗する
		System.out.println("好きな数字を1乗します");
		System.out.println(x);
		System.out.println("好きな数字を2乗します");
		System.out.println(x * x);
		System.out.println("好きな数字を3乗します");
		System.out.println(x * x * x);

	}

}
