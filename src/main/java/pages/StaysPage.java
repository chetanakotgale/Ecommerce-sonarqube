package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StaysPage 
{
	private By SearchPlace = By.id("//input[@id=\"ss\"]");
	private By StartDate = By.id("//*[@id=\"frm\"]/div[1]/div[2]/div[1]/div[2]/div/div/div/div/span");
	private By EndDate = By.id("//*[@id=\"frm\"]/div[1]/div[2]/div[1]/div[3]/div/div/div/div/span");
	private By Persons = By.id("//*[@id=\"xp__guests__toggle\"]");
	private By SearchButton = By.id("//*[@id=\"frm\"]/div[1]/div[4]/div[2]/button");
	
	private WebDriver driver;
	
	public StaysPage(WebDriver driver)
	{
		this.driver = driver;
	}

	public void setSearchPlace(By searchPlace) {
		SearchPlace = searchPlace;
	}

	public void setStartDate(By startDate) {
		StartDate = startDate;
	}

	public void setEndDate(By endDate) {
		EndDate = endDate;
	}

	public void setPersons(By persons) {
		Persons = persons;
	}

	public void setSearchButton(By searchButton) {
		SearchButton = searchButton;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	
	
}
