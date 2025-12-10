import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		boolean result=UserMainCode.regularExpression(input);
		System.out.println(result);
	}
}
class UserMainCode
{
	public static boolean regularExpression(String input)
	{
		return input.matches("[a-zA-Z0-9][R][0-9][a-zA-z0-9]");
	}
}