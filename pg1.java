import java.util.*;

class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int count=UserMainCode.countOccurance2(s1,s2);
		System.out.println(count);
	}
}
class UserMainCode
{
	public static int countOccurance(String s1,String s2)
	{
		
		int count=0;
		while(s1.contains(s2))
		{
			count+=1;
			s1=s1.replaceFirst(s2,"");
		}
		return count;
    }
    public static int countOccurance2(String s1,String s2)
	{
		int count=0;
		for(int i=0;i<=s1.length()-s2.length();i++)
		{
			String temp=s1.substring(i,i+s2.length());
			
			if(temp.equals(s2))
			{
				count+=1;
			}
		}
		return count;
    }
	
}