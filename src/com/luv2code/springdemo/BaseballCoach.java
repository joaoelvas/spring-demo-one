package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

	FortuneService fortuneService;
	
	private String emailAddress, team;
	
	public BaseballCoach() {
		System.out.println("BaseballCoach: Called Costructor");
	}

	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 mins in the batting practice";
	}

	@Override
	public String getDailyFortune() {
		// use my fortune service to get a fortune
		return fortuneService.getFortune();
	}
	
	@Override
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("BaseballCoach: Called Setter");
		this.fortuneService = fortuneService;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	
	
}
