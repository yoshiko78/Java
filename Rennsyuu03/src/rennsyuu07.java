/**問題集：http://www.kitako.tokyo/lib/JavaExercise.aspx?id=1 Java問題集
 *@author Maro2
 *問1-7 int 型の変数 x、y に任意の数値を代入し、x の値を y に、y の値を x に入れ替えて x と y の値を表示するプログラムを作成しなさい。
 ※xとy以外に、もうひとつ変数が必要となる。
 */
public class rennsyuu07 {
	public static void main(String[] args) {
		int x,y,t;
		
		x = 10;
		y = 5;
		
		//ここでx,yの値を入れ替える
		t = x;
		x = y;
		y = t;
		System.out.println(x + "," + y);
	}
}
