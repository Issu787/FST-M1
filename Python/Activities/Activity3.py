print("Rock-Paper-Scissors Game")

player1 = input("Player 1, enter your choice (rock/paper/scissors): ").lower()
player2 = input("Player 2, enter your choice (rock/paper/scissors): ").lower()


if player1 == player2:
    print("It's a tie!")
elif player1 == "rock":
    if player2 == "scissors":
        print("Player 1 wins! Rock beats Scissors.")
    else:
        print("Player 2 wins! Paper beats Rock.")
elif player1 == "scissors":
    if player2 == "paper":
        print("Player 1 wins! Scissors beats Paper.")
    else:
        print("Player 2 wins! Rock beats Scissors.")
elif player1 == "paper":
    if player2 == "rock":
        print("Player 1 wins! Paper beats Rock.")
    else:
        print("Player 2 wins! Scissors beats Paper.")
else:
    print("Invalid input! Please choose rock, paper, or scissors.")
