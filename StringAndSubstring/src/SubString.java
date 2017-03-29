import java.util.*;
/*
 * Write a program to find a substring in a String by using an 
 * inbuilt method of String class.
 */
public class SubString {

	public static void main(String args[])
	{
		Sub a= new Sub();  //new object of class Sub
		a.getString();
		a.display();
	}
}

class Sub
{
	String s,sub1,sub2,sub3;
	Scanner input= new Scanner(System.in);
	
	
	//method to get string and find its substring
	void getString()
	{
		
		//try catch block to handle String Exception
		try
		{
			System.out.println("Enter a string --->");
			s= input.next();
			sub1= s.substring(2,4);  // create a substring using inbuilt function
			sub2=s.substring(3);	// create a substring using inbuilt function
			sub3="am";
			
			if (s.contains(sub3)) // check whether substring sub3 exists in string s
			{
				System.out.println("substring " +sub3+"  exists in string "+s);
			}
			else
			{
				System.out.println("substring " +sub3+"  does not exists in string "+s);
			}
		}
		
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Invalid string entry.. please re enter to match indices of substring");
		}
	}
	
	
	//method to display the string and substrings
	void display()
	{
		System.out.println("String Entered is --->" +s);
		System.out.println("Sub String 1 --->" +sub1);
		System.out.println("Sub String 2 --->" +sub2);
	}
	
}