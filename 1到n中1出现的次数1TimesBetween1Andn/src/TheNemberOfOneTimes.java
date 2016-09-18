import java.util.Scanner;

/**
 * 文件名称:1到n中1出现的次数
 * 时间：2016-9-9 11:16
 * 说明：1、题目：给定一个整数n,返回从1到n的数字中1出现的个数。
 * */
public class TheNemberOfOneTimes {
	
	public static int getOneTimes(int n){
		int count=0;
		for(int i=1;i<=n;i++){
			count+=getOneInSpecialNum(i);
		}
		return count;
	}
	
	
	public static int getOneInSpecialNum(int n){
		int count=0;
		while(n!=0){
			if(n%10==1){
				count++;
			}
			n=n/10;
		}
		return count;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			int n=in.nextInt();
			System.out.println(getOneTimes(n));
		}
	}

}
