user1 = input("what is player 1's name?")
user2 = input("what is player 2's name?")
user1_answer = input(user1 + ",do you want to choose rock,paper or scissors? ").lower()
user2_answer = input(user2 + ",do you want to choose rock,paper or scissors? ").lower()
if user1_answer == user2_answer:
    print("it's a tie!")
elif user1_answer == 'rock':
    if user1_answer == 'scissors':
     print("Rock wins!")
    else:
        print("paper wins!")
elif user1_answer == 'scissors':
     if user2_answer == 'paper':
        print("Scissors win!")
     else:
        print("Rock wins!")
elif user1_answer == 'paper':
     if user2_answer == 'rock':
        print("Paper wins!")
     else:
        print("Scissors win!")
else:
     print("Invalid input! You have not entered rock, paper or scissors, try again.")

