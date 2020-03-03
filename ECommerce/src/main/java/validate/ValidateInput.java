package validate;

import java.util.InputMismatchException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class ValidateInput 
{
	static Logger logger = LogManager.getLogger(ValidateInput.class);

	
	public static int validate()
	{
		 Scanner scanner = new Scanner(System.in);
			
		int option;
		
		try
		{
			option = scanner.nextInt();
		}
		catch(InputMismatchException e)
		{
			logger.error("Enter the correct option");
			scanner.nextLine();
			option=scanner.nextInt();	
		}
		 
		return option;	
		
		
		
	}
	

}
