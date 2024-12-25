package littleExos.rockPaperScissor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Frontend extends JFrame implements ActionListener{
	JButton rockButton, paperButton, scissorButton;
	//will display computer choice
	JLabel computerChoice;
	
	//will display 
	JLabel computerScoreLabel, playerScoreLabel;
	//backedn obj
	RockPaperScissor rockPaperScissor; 
	
	public Frontend() {
		//invoke Jframe constructor
		super("Rock papper scissor");
	
		setSize(450, 574);
		
		//disable layout management (x,y coordinates)
		setLayout(null);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		//put screen mid
		setLocationRelativeTo(null);
		
		//initialize the backend obj
		rockPaperScissor = new RockPaperScissor();
		
		//add component
		addFrontendComponents();
	}

	private void addFrontendComponents() {
		//label du score
		computerScoreLabel = new JLabel("Computer : 0");
		//set x y coord
		computerScoreLabel.setBounds(0,43,450,30);
	    computerScoreLabel.setFont(new Font("Dialog", Font.BOLD, 26));
	    computerScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
	    add(computerScoreLabel);
	    
	    
	    /**Display computer choice**/
	    computerChoice = new JLabel("?");
	    computerChoice.setBounds(175, 118,98,81);
	    computerChoice.setFont(new Font("Dialog", Font.PLAIN, 18));	
	    computerChoice.setHorizontalAlignment(SwingConstants.CENTER);
	    //blank border around
	    computerChoice.setBorder(BorderFactory.createLineBorder(Color.black));
	    add(computerChoice);
	    
	    /**Player score label**/
	    playerScoreLabel = new JLabel("Player : 0");
  		playerScoreLabel.setBounds(0,317,450,30);
  		playerScoreLabel.setFont(new Font("Dialog", Font.BOLD, 26));
  		playerScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
  		add(playerScoreLabel);
  		
  		/**Player choice**/
  		
  		//rock
  		rockButton = new JButton("Rock");
  		rockButton.setBounds(40,387,105,81);
  		rockButton.setFont(new Font("Dialog", Font.PLAIN, 18));
  		rockButton.addActionListener(this);
  		add(rockButton);
  		
  		//paper
  		paperButton = new JButton("Paper");
  		paperButton.setBounds(165,387,105,81);
  		paperButton.setFont(new Font("Dialog", Font.PLAIN, 18));
  		paperButton.addActionListener(this);
  		add(paperButton);  		
  		
  		//scissor
  		scissorButton = new JButton("Scissors");
  		scissorButton.setBounds(290,387,105,81);
  		scissorButton.setFont(new Font("Dialog", Font.PLAIN, 18));
  		scissorButton.addActionListener(this);
  		add(scissorButton);
	}
	
	private void showDialog(String message) {
		JDialog resultdialog = new JDialog(this, "Result", true);
		resultdialog.setSize(227,124);
		resultdialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		resultdialog.setResizable(false);
		
		//message label
		JLabel resultLabel = new JLabel(message);
		resultLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
		resultdialog.add(resultLabel, BorderLayout.CENTER);
		
		// try again button
		JButton tryAgainButton = new JButton("Try again ?");
		tryAgainButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// reset
				computerChoice.setText("?");
				
				//close
				resultdialog.dispose();
			}
		});
		
		resultdialog.add(tryAgainButton, BorderLayout.SOUTH);
		resultdialog.setLocationRelativeTo(this);
		resultdialog.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//get player Choice
		String playerChoice = e.getActionCommand().toString();
		
		//play rock paper scissor and store result
		String result = rockPaperScissor.playRockPapperScissor(playerChoice);
		
		//load computer's choice
		computerChoice.setText(rockPaperScissor.getComputerChoice());
		
		//update score
		computerScoreLabel.setText("Computer: " + rockPaperScissor.getComputerScore());
		playerScoreLabel.setText("Player : " + rockPaperScissor.getPlayerScore());
		
		
		//display result dialog
		showDialog(result);
		
	}
	
}
