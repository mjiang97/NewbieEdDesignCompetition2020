# NewbieEdDesignCompetition2020

Here lies all the code that will be used in the Newbie Ed for the Design Competition 2020.

## Day 1

1) Clone this repository and create a new branch (Name it as FirstnameLastname, fill in your name of course, Ex: PakMingLau)
2) Checkout your branch and open Dog.java in your folder with VSCode
3) Create a constructor that takes in no inputs and sets the name to Fred, breed to Husky, age to 3, and rabies to false;
4) Create a method with the header `public int getAge()` which returns the age of the dog
5) Create a method with the header `public int getAgeInDogYears()` which returns the age of the dog in dog years
6) Create a method with the header `public boolean hasRabies()` that returns whether or not the dog has rabies.
7) Create a method with the header `public void setRabies(boolean gotRabies)` that sets `rabies` to `gotRabies`
8) In the main method, create a dog object using the default constructor and have it bark, print out its age, and give it rabies.
9) In the main method, create a dog whose name is bar, who is a dachschund, and is 1 year old. Print out its age in dog years and whether or not it has rabies.
10) `git add -A` and `git commit -m` and then `git push`. **From Renee: Make your commit messages pretty**
11) Create a pull request to merge to master.

### Optional

Create a new branch and name it FirstnameLastname1 (Ex: PakMingLau1).

- Create an interface called Animal

  - Add a method called makeNoise(), run(), eat(), age(). (These methods could have parameters and are missing return types, use your best judgement)

- Update Dog.java to implement Animal

  - replace bark() with makeNoise()

  - run() should take in an int n and if it's even, print out "`name`: pitter". If it's odd, print out "`name`: patter"
        - `foo.run(9)` -> foo: patter

  - eat() should take in a String n and print out "`name` is eating `n`"

  - `foo.eat("lasagna")` -> foo is eating lasagna
    - age() should increment the age by one and return the age after incrementing

- Create a class Cat that implements Animal (Use your best judgement and don't be afraid to add methods or variables to help you)

  - makeNoise() should print "Meow"

  - run() is similar to Dog.java's run(), but if it's even, print "`name`: patter" and if it's odd, print "`name`: pitter".

  - eat() is similar to Dog.java's eat(), but print's out "`owner` is feeding `n`"

  - age() is the same as Dog.java's except you increment by two.

- Create a pull request to merge this branch to your first branch and message Pak, Renee, Myles, or Sam.

  - `base:` is the first branch and `compare:` is this branch

- Once the pull request has been approved, delete this branch.

*_Try to figure these out by yourselves, but don't be afraid to ask us if the instructions are unclear._

## Day 2

## Day 3
