import java.util.Scanner;

/**
 * �ļ�����:1��n��1���ֵĴ���
 * ʱ�䣺2016-9-9 11:16
 * ˵����1����Ŀ������һ������n,���ش�1��n��������1���ֵĸ�����
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
