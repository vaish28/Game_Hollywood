import java.io.*;
public class HOLLY
{
	public void main()throws IOException
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		String movie1="MEAN GIRLS";
		String movie="";
		for(int i=0;i<movie1.length();i++)
		{
			char ch=movie1.charAt(i);
			if(ch==' ')
			movie=movie+"*";
			else if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			movie=movie+ch;
			else
			movie=movie+"_";
		}
		System.out.println(movie);
		int f1=9;
		while(f1>0)
		{
			System.out.println("Number of lives remaining:"+f1);
			System.out.println("Enter position number ");
			int n=Integer.parseInt(buf.readLine());
			System.out.println("Enter alphabet at tje corresponding postion number");
			char c=(char)buf.read();
			c=Character.toUpperCase(c);
			buf.readLine();
			if(c==movie1.charAt(n-1))
			{
				movie=movie.substring(0,n-1)+c+movie.substring(n);
				System.out.println("\f");
				System.out.println(movie);
			}
			else f1--;
		}
		if(f1==0) System.out.println("YOU LOSE.");
		else System.out.println("YOU WIN");
	}
}
