import java.util.*;
public class wifi{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		
		for(int i=n+1;i<m;i++){
			int c=0;
			for(int j=1;j<=i;j++)
				if(i%j==0)
					c++;
			//System.out.println(c);
			if(c==2)
				System.out.print(i+" ");
		}
		
	}
}
