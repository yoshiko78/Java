package rennsyuu;
/**問題集：http://www.kitako.tokyo/lib/JavaExercise.aspx?id=1 Java問題集
 *@author Maro2
 *問1-10 int 型の変数 x に任意の数値を代入し、
 *x を 1 乗、2 乗、3 乗した結果を表示するプログラムを作成しなさい。
 */
public class rennsyuu10 {
		public static void main(String[] args) {
			int x = 2;
			System.out.println(x * x);
			System.out.println(x * x * x);
			System.out.println(x * x * x * x);

			//Math.powでdouble型にはなるが累乗ができる
			System.out.println(Math.pow(x, 1));
			System.out.println(Math.pow(x, 2));
			System.out.println(Math.pow(x, 3));
	}
}
