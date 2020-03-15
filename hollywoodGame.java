package Hollywood;

import java.io.*;
public class HOLLYWOOD
{
	public  void main(String args[])throws IOException
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		String m="MEAN GIRLS";
		String movie="";
		char c;
		int flag=5;
		int count=0;
		for(int i=0;i<m.length();i++)
		{
			char ch=m.charAt(i);
			if(ch==' ')
				movie=movie+"*";
			else if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				movie=movie+ch;
			else
				movie=movie+"_";
		}
		System.out.println("*******#######IMP INSTRUCTION PLS PRESS ANY OTHER NUMBER THAN THE POSITION NUMBER TO EXIT THE LOOP");
		System.out.println("enter numbers 1,4,6,8,9,10 for entering number");
		System.out.println("the movie you have got is="+movie);
		do
		{
			System.out.println("enter the character number");
			int n=Integer.parseInt(buf.readLine());
			if(n==1)
			{
				System.out.println("Enter FIRST character");
				c=(char)buf.read();
				c=Character.toUpperCase(c);
				buf.readLine();

				if(c=='M')
				{
					System.out.println("the first letter is right");
					count++;
				}
				else
				{
					System.out.println("the first letter is wrong");
					flag--;
				}
			}
			else if(n==4)
			{
				System.out.println("enter FOUTH character");
				c=(char)buf.read();
				c=Character.toUpperCase(c);
				buf.readLine();
				if(c=='N')
				{
					System.out.println("the fourth letter is right");
					count++;
				}
				else
				{
					System.out.println("the fourth letter is wrong");
					flag--;
				}

			}


			else if(n==6)
			{
				System.out.println("enter the SIXTH character");
				c=(char)buf.read();
				c=Character.toUpperCase(c);
				buf.readLine();
				if(c=='G')
				{
					System.out.println("the six letter is right");
					count++;
				}
				else
				{
					System.out.println("the six letter is wrong");
					flag--;

				}

			}
			else if(n==8)
			{
				System.out.println("enter the EIGHTH character");
				c=(char)buf.read();
				c=Character.toUpperCase(c);
				buf.readLine();
				if(c=='R')
				{
					System.out.println("the eight letter is right");
					count++;
				}
				else
				{
					System.out.println("the eight letter is wrong");
					flag--;

				}
			}
			else if(n==9)
			{
				System.out.println("enter the NINTH character");
				c=(char)buf.read();
				c=Character.toUpperCase(c);
				buf.readLine();
				if(c=='L')
				{
					System.out.println("the ninth letter is right");
					count++;
				}
				else
				{
					System.out.println("the ninth letter is wrong");
					flag--;
				}
			}

			else if(n==10)
			{
				System.out.println("enter the TENTH character");
				c=(char)buf.read();
				c=Character.toUpperCase(c);
				buf.readLine();
				if(c=='S')
				{
					System.out.println("the tenth letter is right");
					count++;
				}
				else
				{
					System.out.println("the tenth letter is wrong");
					flag--;  
				}
			}
			else
			{
				System.out.println("wrong choice");
				System.exit(0);


			}

		}
		while(flag>0);
		if(count!=6)
			System.out.println("YOU LOSE");
		else
			System.out.println("YOU WIN");
	}
}








