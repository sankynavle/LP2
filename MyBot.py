def greet(bot_name,birth_year):
    print("Hello! My name is",bot_name)
    print("I was created in",birth_year)

def remind_name():
    print('Please remind me your name.')
    name=input()
    print("What a great name you have",name)

def guess_age():
    print('Let me Guess your age.')
    print('Enter reminders of dividing your  age 3,5,7.')
    
    rem3=int(input())
    rem5=int(input())
    rem7=int(input()) 
    
    age=(rem3 * 70 + rem5 * 21 + rem7 * 15)% 105
    print("Your age is",age)
    print('thats good time to start programming!')

def count():
    print('Now I will prove to you that I can count to any number you want.')
    num = int(input())

    counter = 0
    while counter <= num:
        print(counter)
        counter += 1

def test():
    print("Let's test your programming knowledge.")
    print("Why do we use methods?")
    print("1. To repeat a statement multiple times.")
    print("2. To decompose a program into several small subroutines.")
    print("3. To determine the execution time of a program.")
    print("4. To interrupt the execution of a program.")

    answer = 2
    guess = int(input())
    while guess != answer:
        print("Please, try again.")
        guess = int(input())

    print('Completed, have a nice day!')
    print('.................................')
    print('.................................')
    print('.................................')


def end():
    print('Congratulations, have a nice day!')
    print('.................................')
    print('.................................')
    print('.................................')
    input()

greet('sbot','2020')
remind_name()
guess_age()
count()
test()
end()