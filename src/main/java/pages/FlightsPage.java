package pages;

import org.openqa.selenium.By;

public class FlightsPage
{
	private By text = By.id("//*[@id=\"c8LFW-primary\"]/section[1]/div/h1");
	private By RoundTripOption = By.id("//*[@id=\"gZMn-roundtrip-label\"]/span");
	private By OneWayOption = By.id("//*[@id=\"gZMn-oneway-label\"]/span");
	private By TwoWayOption = By.id("//*[@id=\"gZMn-multicity-label\"]");
	private By StartPlace = By.id("//*[@id=\"gZMn-origin\"]");
	private By DestinationPlace = By.id("//*[@id=\"gZMn-destination\"]");
	private By StartDate = By.id("//*[@id=\"frm\"]/div[1]/div[2]/div[1]/div[2]/div/div/div/div/span");
	private By EndDate = By.id("//*[@id=\"frm\"]/div[1]/div[2]/div[1]/div[3]/div/div/div/div/span");
	private By Persons = By.id("//*[@id=\"xp__guests__toggle\"]");
	private By SearchButton = By.id("//*[@id=\"frm\"]/div[1]/div[4]/div[2]/button");

	public void setText(By text) {
		this.text = text;
	}
	public void setRoundTripOption(By roundTripOption) {
		RoundTripOption = roundTripOption;
	}
	public void setOneWayOption(By oneWayOption) {
		OneWayOption = oneWayOption;
	}
	public void setTwoWayOption(By twoWayOption) {
		TwoWayOption = twoWayOption;
	}
	public void setStartPlace(By startPlace) {
		StartPlace = startPlace;
	}
	public void setDestinationPlace(By destinationPlace) {
		DestinationPlace = destinationPlace;
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
	
	

}
