package rennsyuu;
/**問題集：http://www.kitako.tokyo/lib/JavaExercise.aspx?id=1 Java問題集
 *@author Maro2
 *問1-12 int 型の変数 x に任意の数値を代入し、インクリメント演算子、デクリメント演算子を
 *適用して結果を表示することにより演算子の効果を確認するプログラムを作成しなさい。
 */
public class rennsyuu12 {
	public static void main(String[] args) {
		int x = 50;
		
		x++;
		System.out.println( x );
		
		x--;
		System.out.println( x );
		x--;
		System.out.println( x );
	}
}
