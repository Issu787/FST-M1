print("Rock-Paper-Scissors Game")

while (True):
    player1 = input("Player 1, enter your choice (rock/paper/scissors): ").lower()
    player2 = input("Player 2, enter your choice (rock/paper/scissors): ").lower()
    if player1 == player2:
        print ("This is a Tie!")
    elif player1 == "rock":
        if player2 == "scissors":
            print ("player 1 wins!")
        else:
            print ("player 2 wins!")
    elif player1 == "scissors":
        if player2 == "paper":
            print ("player 1 wins!")
        else:
            print ("player 2 wins!")
    elif player1 == "paper":
        if player2 == "rock":
            print ("player 1 wins!")
        else:
            print ("player 2 wins!") 
        
    else:
        print("Invalid input! You have not entered rock, paper or scissors, try again!!")  

    Restart = input("Do you want to replay ? Please provide your input as Yes or No. ").lower()
    if Restart == "no":
        print("*********GAME CLOSED*****. BYE BYE.")
        break
    elif Restart == "yes":
        continue
    else:
        print("You entered an invalid option. Exiting now.")
        break
