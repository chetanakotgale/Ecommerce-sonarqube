package com.epam.book;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BrowserReader
{
	public static String getDriverPath() throws IOException
	{
		String path = System.getProperty("user.dir")+"\\config\\configuration.properties";
		
		try(FileInputStream file = new FileInputStream(new File(path)))
		{
			Properties prop = new Properties();
			prop.load(file);
			
			String driverPath = prop.getProperty("firefox");
			
			System.out.print(driverPath);
			
			return driverPath;
		}	
	}
	
	public static String getUrl() throws IOException
	{
		try(FileInputStream file = new FileInputStream("config\\configuration.properties"))
		{
			Properties prop = new Properties();
			prop.load(file);
			
			String driverPath = prop.getProperty("Website");
			
			return driverPath;
		}	
	}
}
