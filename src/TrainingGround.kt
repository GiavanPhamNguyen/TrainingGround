var turn = 5 //declare turn counter
var userHP = 15 //declare userHP
var dummyHP = 15 //declare dummyHP
fun main() {
    //declare user HP and dummy HP


    //prompt user to enter name and confirm name; output dummy's HP and user's HP; set the scene
    println("Welcome to the Training Ground, what is your name?")
    var userName = readLine()
    println("Welcome to the Training Ground, $userName!")
    println("Across the arena, an intimidating dummy stares back at you")
    println("Its HP is $dummyHP")
    println("Your HP is $userHP.")

    //give user option to continue or exit
    println("Do you want to fight the dummy? Type yes or no")
    var userInput = readLine()
    println()

    //if user decides to train, provide comprehensive rules and guidelines, then provide user with respective options
    if (userInput == "yes") {
        println("Here are the rules:")
        println("1. You have 5 turns to defeat the dummy.")
        println("2. You will be given three weapons to choose from. Choose wisely.")
        println("3. Each turn you can choose to either attack the dummy, heal yourself, or quit the training.")
        println("4. Depending on the weapon, each attack will a chance of hitting/missing determined by two 6-sided dice being rolled.")
        println("5. Depending on the weapon, each attack will have range of damage determined by a 6-sided die being rolled.")
        println("6. Healing will also have a range of effectiveness determined by a 1 6-sided die being rolled, with the minimum being 1HP to a maximum of 6HP restored per turn.")
        println()
        println("Let the training begin.")
        println()

        //weapon selection
        println("Here are your choices of weapons: type 'fists' | 'staff' | 'sword' | 'bow'|")
        println("Weapon     Hit Chance      Damage Range  ")
        println("----------------------------------------")
        println("Fists  |   72.7% (High)       | 1-6 (Low)")
        println("Staff  |   54.5% (Moderate)   | 2-14 (Moderate)")
        println("Sword  |   54.5% (Moderate)   | 4-15 (High)")
        println("Bow    |   36.4%% (Low)       | 7-15 (Deadly)")
        var userWeapon = readLine()?.trim()?.lowercase()
        println()

        //training depending on user's weapon choice, utilizing loops while user's HP and dummy's HP are above zero within 5 turns
        if (userWeapon == "fists") {
            println("You have selected to not use a weapon, instead you rely on your trusty knuckle sandwiches!")
            println("You will need to roll a 4 or higher to successfully land an attack on the dummy.")
            while (turn > 0 && userHP > 0 && dummyHP > 0) {
                println("What do you want to do? type 'attack' | 'heal' | 'quit' | Turns Remaining: $turn")
                println("$userName's HP: $userHP")
                println("Dummy's HP: $dummyHP")
                userInput = readLine()?.trim()?.lowercase()
                println()
                if (userInput == "attack") {
                    attackFists()
                    if(dummyHP > 0){
                    dummyAttacks()
                    } else {
                        println("The dummy died")
                        println()
                    }
                } else if (userInput == "heal") {
                    heal()
                    if(dummyHP > 0){
                        dummyAttacks()
                    } else {
                        println("The dummy died")
                        println()
                    }
                } else if (userInput == "quit") {
                    println("You have chosen to quit the training.")
                    break
                }
            }
        } else if (userWeapon == "staff") {
            println("You have selected the staff!")
            println("You will need to roll a 6 or higher to successfully land an attack on the dummy.")
            while (turn > 0 && userHP > 0 && dummyHP > 0) {
                println("What do you want to do? type 'attack' | 'heal' | 'quit' | Turns remaining: $turn")
                println("$userName's HP: $userHP")
                println("Dummy's HP: $dummyHP")
                userInput = readLine()?.trim()?.lowercase()
                println()
                if (userInput == "attack") {
                    attackStaff()
                    if(dummyHP > 0){
                        dummyAttacks()
                    } else {
                        println("The dummy died.")
                        println()
                    }
                } else if (userInput == "heal") {
                    heal()
                    if(dummyHP > 0){
                        dummyAttacks()
                    } else {
                        println("The dummy died.")
                        println()
                    }
                } else if (userInput == "quit") {
                    println("You have chosen to quit the training.")
                    break
                }
            }
        } else if (userWeapon == "sword") {
            println("You have selected the sword!")
            println("You will need to roll a 6 or higher to successfully land an attack on the dummy.")
            while (turn > 0 && userHP > 0 && dummyHP > 0) {
                println("What do you want to do? type 'attack' | 'heal' | 'quit' | Turns remaining: $turn")
                println("$userName's HP: $userHP")
                println("Dummy's HP: $dummyHP")
                userInput = readLine()?.trim()?.lowercase()
                println()
                if (userInput == "attack") {
                    attackSword()
                    if(dummyHP > 0){
                        dummyAttacks()
                    } else {
                        println("The dummy died.")
                        println()
                    }
                } else if (userInput == "heal") {
                    heal()
                    if(dummyHP > 0){
                        dummyAttacks()
                    } else {
                        println("The dummy died.")
                        println()
                    }
                } else if (userInput == "quit") {
                    println("You have chosen to quit the training.")
                    break
                }
            }
        } else if (userWeapon == "bow") {
            println("You have selected the bow!")
            println("You will need to roll a 8 or higher to successfully land an attack on the dummy.")
            while (turn > 0 && userHP > 0 && dummyHP > 0) {
                println("What do you want to do? type 'attack' | 'heal' | 'quit' | Turns remaining: $turn")
                println("$userName's HP: $userHP")
                println("Dummy's HP: $dummyHP")
                userInput = readLine()?.trim()?.lowercase()
                println()
                if (userInput == "attack") {
                    attackBow()
                    if(dummyHP > 0){
                        dummyAttacks()
                    } else {
                        println("The dummy died.")
                        println()
                    }
                } else if (userInput == "heal") {
                    heal()
                    if(dummyHP > 0){
                        dummyAttacks()
                    } else {
                        println("The dummy died.")
                        println()
                    }
                } else if (userInput == "quit") {
                    println("You have chosen to quit the training.")
                    break
                }
            }
        } else {
            println("You have selected an invalid weapon.")
        }
        if (turn == 0) {
            if(dummyHP > 0){
                println("You have no turns remaining.")
                println("Here are the results:")
                println("$userName's HP: $userHP")
                println("The dummy's HP: $dummyHP")
                println("$userName did not defeat the dummy.")
                println("The dummy laughs at $userName.")
                println()
            }
            else{
                println("You have no turns remaining.")
                println("Here are the results:")
                println("$userName's HP: $userHP")
                println("The dummy's HP: $dummyHP")
                println("The dummy is defeated by $userName")
                println()
            }
        } else {
            if (userHP > 0 && dummyHP <= 0){
                println("Here are the results:")
                println("$userName's HP: $userHP")
                println("The dummy's HP: $dummyHP")
                println("The dummy has been defeated by $userName")
                println()
            } else if (dummyHP > 0 && userHP <= 0){
                println("Here are the results:")
                println("$userName's HP: $userHP")
                println("The dummy's HP: $dummyHP")
                println("You died")
                println("$userName did not defeat the dummy.")
                println("The dummy laughs at $userName.")
            } else{
                println("Here are the results:")
                println("$userName's HP: $userHP")
                println("The dummy's HP: $dummyHP")
                println("$userName did not defeat the dummy.")
                println("The dummy laughs at $userName.")
                println("Have a good day!")
            }
        }
    } else if (userInput == "no") {
            println("Understandable. I'd be scared too.")
            println("Have a good day!")
        } else{
            println("Invalid input. Please rerun the program!")
            println("Have a good day!")
        }
}

//functions used for attacking and healing
fun attackFists(){//declare functions for attacking with fists
    var hitChance = (2..12).random()
    var damageChance = (1..6).random()
    if (hitChance <= 3){
        println("You rolled a $hitChance!")
        println("You missed.")
        turn--
        println("YOU HAVE $turn TURNS REMAINING.")
    }
    else {
        println("You rolled a(n) $hitChance!")
        println("You successfully hit the dummy.")
        if (damageChance == 6) {
            var damage = 6
            println("You rolled a $damageChance!")
            println("You inflicted $damage points to the dummy's HP.")
            dummyHP -= damage
            turn--
            println("YOU HAVE $turn TURNS REMAINING.")
        } else if (damageChance == 5) {
            var damage = 5
            println("You rolled a $damageChance!")
            println("You inflicted $damage points to the dummy's HP.")
            dummyHP -= damage
            turn--
            println("YOU HAVE $turn TURNS REMAINING.")
        } else if (damageChance == 4) {
            var damage = 4
            println("You rolled a $damageChance!")
            println("You inflicted $damage points to the dummy's HP.")
            dummyHP -= damage
            turn--
            println("YOU HAVE $turn TURNS REMAINING.")
        } else if (damageChance == 3) {
            var damage = 3
            println("You rolled a $damageChance!")
            println("You inflicted $damage points to the dummy's HP.")
            dummyHP -= damage
            turn--
            println("YOU HAVE $turn TURNS REMAINING.")
        } else if (damageChance == 2) {
            var damage = 2
            println("You rolled a $damageChance!")
            println("You inflicted $damage points to the dummy's HP.")
            dummyHP -= damage
            turn--
            println("YOU HAVE $turn TURNS REMAINING.")
        } else if (damageChance == 1) {
            var damage = 1
            println("You rolled a $damageChance!")
            println("You inflicted $damage points to the dummy's HP.")
            dummyHP -= damage
            turn--
            println("YOU HAVE $turn TURNS REMAINING.")
        }
    }
}
fun attackStaff(){//declare function for attacking with staff
    var hitChance = (2..12).random()
    var damageChance = (1..6).random()
    if (hitChance <= 5){
        println("You rolled a $hitChance!")
        println("You missed.")
        turn--
        println("YOU HAVE $turn TURNS REMAINING.")
    }
    else {
        println("You rolled a(n) $hitChance!")
        println("You successfully hit the dummy.")
        if (damageChance == 6) {
            var damage = 10
            println("You rolled a $damageChance!")
            println("You inflicted $damage points to the dummy's HP.")
            dummyHP -= damage
            turn--
            println("YOU HAVE $turn TURNS REMAINING.")
        } else if (damageChance == 5) {
            var damage = 9
            println("You rolled a $damageChance!")
            println("You inflicted $damage points to the dummy's HP.")
            dummyHP -= damage
            turn--
            println("YOU HAVE $turn TURNS REMAINING.")
        } else if (damageChance == 4) {
            var damage = 8
            println("You rolled a $damageChance!")
            println("You inflicted $damage points to the dummy's HP.")
            dummyHP -= damage
            turn--
            println("YOU HAVE $turn TURNS REMAINING.")
        } else if (damageChance == 3) {
            var damage = (6..7).random()
            println("You rolled a $damageChance!")
            println("You inflicted $damage points to the dummy's HP.")
            dummyHP -= damage
            turn--
            println("YOU HAVE $turn TURNS REMAINING.")
        } else if (damageChance == 2) {
            var damage = (4..5).random()
            println("You rolled a $damageChance!")
            println("You inflicted $damage points to the dummy's HP.")
            dummyHP -= damage
            turn--
            println("YOU HAVE $turn TURNS REMAINING.")
        } else if (damageChance == 1) {
            var damage = (2..3).random()
            println("You rolled a $damageChance!")
            println("You inflicted $damage points to the dummy's HP.")
            dummyHP -= damage
            turn--
            println("YOU HAVE $turn TURNS REMAINING.")
        }
    }
}
fun attackSword(){//declare function for attacking with sword
    var hitChance = (2..12).random()
    var damageChance = (1..6).random()
    if (hitChance <= 5){
        println("You rolled a $hitChance!")
        println("You missed.")
        turn--
        println("YOU HAVE $turn TURNS REMAINING.")
    }
    else {
        println("You rolled a(n) $hitChance!")
        println("You successfully hit the dummy.")
        if (damageChance == 6) {
            var damage = 15
            println("You rolled a $damageChance!")
            println("You inflicted $damage points to the dummy's HP.")
            dummyHP -= damage
            turn--
            println("YOU HAVE $turn TURNS REMAINING.")
        } else if (damageChance == 5) {
            var damage = 14
            println("You rolled a $damageChance!")
            println("You inflicted $damage points to the dummy's HP.")
            dummyHP -= damage
            turn--
            println("YOU HAVE $turn TURNS REMAINING.")
        } else if (damageChance == 4) {
            var damage = (12..13).random()
            println("You rolled a $damageChance!")
            println("You inflicted $damage points to the dummy's HP.")
            dummyHP -= damage
            turn--
            println("YOU HAVE $turn TURNS REMAINING.")
        } else if (damageChance == 3) {
            var damage = (10..11).random()
            println("You rolled a $damageChance!")
            println("You inflicted $damage points to the dummy's HP.")
            dummyHP -= damage
            turn--
            println("YOU HAVE $turn TURNS REMAINING.")
        } else if (damageChance == 2) {
            var damage = (7..9).random()
            println("You rolled a $damageChance!")
            println("You inflicted $damage points to the dummy's HP.")
            dummyHP -= damage
            turn--
            println("YOU HAVE $turn TURNS REMAINING.")
        } else if (damageChance == 1) {
            var damage = (4..6).random()
            println("You rolled a $damageChance!")
            println("You inflicted $damage points to the dummy's HP.")
            dummyHP -= damage
            turn--
            println("YOU HAVE $turn TURNS REMAINING.")
        }
    }
}
fun attackBow(){//declare function for attacking with bow
    var hitChance = (2..12).random()
    var damageChance = (1..6).random()
    if (hitChance <= 7){
        println("You rolled an $hitChance!")
        println("You missed.")
        turn--
        println("YOU HAVE $turn TURNS REMAINING.")
    }
    else {
        println("You rolled a(n) $hitChance!")
        println("You successfully hit the dummy.")
        if (damageChance == 6) {
            var damage = 15
            println("You rolled a $damageChance!")
            println("You inflicted $damage points to the dummy's HP.")
            dummyHP -= damage
            turn--
            println("YOU HAVE $turn TURNS REMAINING.")
        } else if (damageChance == 5) {
            var damage = 14
            println("You rolled a $damageChance!")
            println("You inflicted $damage points to the dummy's HP.")
            dummyHP -= damage
            turn--
            println("YOU HAVE $turn TURNS REMAINING.")
        } else if (damageChance == 4) {
            var damage = 13
            println("You rolled a $damageChance!")
            println("You inflicted $damage points to the dummy's HP.")
            dummyHP -= damage
            turn--
            println("YOU HAVE $turn TURNS REMAINING.")
        } else if (damageChance == 3) {
            var damage = 12
            println("You rolled a $damageChance!")
            println("You inflicted $damage points to the dummy's HP.")
            dummyHP -= damage
            turn--
            println("YOU HAVE $turn TURNS REMAINING.")
        } else if (damageChance == 2) {
            var damage = 11
            println("You rolled a $damageChance!")
            println("You inflicted $damage points to the dummy's HP.")
            dummyHP -= damage
            turn--
            println("YOU HAVE $turn TURNS REMAINING.")
        } else if (damageChance == 1) {
            var damage = (8..10).random()
            println("You rolled a $damageChance!")
            println("You inflicted $damage points to the dummy's HP.")
            dummyHP -= damage
            turn--
            println("YOU HAVE $turn TURNS REMAINING.")
        }
    }
}
fun heal() {//declare function for healing
    var healChance = (1..6).random()
    println("You rolled a $healChance! you healed yourself for $healChance points!")
    userHP += healChance
    turn--
    println("YOU HAVE $turn TURNS REMAINING.")
    }

fun dummyAttacks() {//declare function for dummy attacking back
    var hitChance = (2..12).random()
    var damage = (1..6).random()
    if (hitChance <= 7){
        println()
        println("The dummy attempted to strike, but missed.")
        println()
    } else{
        println()
        println("The dummy attempted to strike, and successfully hit for $damage points.")
        userHP -= damage
        println()
    }

}

