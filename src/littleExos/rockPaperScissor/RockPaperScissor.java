package littleExos.rockPaperScissor;

import java.util.Random;

public class RockPaperScissor {
	
	//computerChocies
	private static final String[] computerChoices = {"Rock","Paper","Scissors"};
	String computerChoice;
	
	public String getComputerChoice() {
		return computerChoice;
	}

	public void setComputerChoice(String computerChoice) {
		this.computerChoice = computerChoice;
	}

	public int getComputerScore() {
		return computerScore;
	}

	public void setComputerScore(int computerScore) {
		this.computerScore = computerScore;
	}

	public int getPlayerScore() {
		return playerScore;
	}

	public void setPlayerScore(int playerScore) {
		this.playerScore = playerScore;
	}

	//store the score to display int
	private int computerScore, playerScore;
	
	//generate random number
	private Random random;
	public RockPaperScissor() {
		random = new Random();
	}
	
	//playerchoice 
	//This method return the result of the game
	public String playRockPapperScissor(String playerChoice) {
		//generate computer choice
		computerChoice = computerChoices[random.nextInt(computerChoices.length)];
		
		String result;
		
		if(computerChoice.equals("Rock")) {
			if(playerChoice.equals("Paper")) {
				result = "Player wins";
				playerScore++;
			}else if(playerChoice.equals("Scissors")){
				result = "Computer wins";
				computerScore++;
			}else {
				result="Draw";
			}
		} else if(computerChoice.equals("Paper")) {
			if(playerChoice.equals("Scissors")) {
				result = "Player wins";
				playerScore++;
			}else if(playerChoice.equals("Rock")){
				result = "Computer wins";
				computerScore++;
			}else {
				result="Draw";
			}
		} else {
			if(playerChoice.equals("Rock")) {
				result = "Player wins";
				playerScore++;
			}else if(playerChoice.equals("Paper")){
				result = "Computer wins";
				computerScore++;
			}else {
				result="Draw";
			}
		}
		return result;
		
	}
	
	

}

