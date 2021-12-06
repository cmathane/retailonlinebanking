package com.retail_Onlilne_banking_1.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	
Properties pro;

public ReadConfig()
{
	
	File src =new File ("./Configuration/config.properties");
	try 
	{
		FileInputStream fis = new FileInputStream(src);
		pro=new Properties();
		pro.load(fis);
	}
	
		catch(Exception e) 
	{
			
		System.out.println("Exception is "+e.getMessage());
			
			
	}
	
	}
	
	
public String getApplicationUrl()

{
	String url =pro.getProperty("baseURL");
	return url;	
	
}

public String getPassword()

{
	String url =pro.getProperty("password");
	return url;	
	
}
public String getUsername()

{
	String url =pro.getProperty("username");
	return url;	
	
}
public String getCromeDriver()

{
	String url =pro.getProperty("ChromePath");
	return url;	
	
}

	
public String getIDEfirefox()

{
	String url =pro.getProperty("firefoxpath");
	return url;	
	
}	
public String getYoutube()

{
	String url =pro.getProperty("Youtube");
	return url;	
	
}
public String getiepath()

{
	String url =pro.getProperty("iepath");
	return url;	
	
}	}

	
	
	
	
	
	
	

