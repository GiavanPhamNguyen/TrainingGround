# Training Ground Game
A simple text-based Kotlin game where the player fights a dummy.

## How to Run
Clone the repository:
```bash
git clone https://github.com/GiavanPhamNguyen/TrainingGround.git
cd TrainingGround
# Open the project in IntelliJ IDEA or any Kotlin-compatible IDE
# Run the main() function in TrainingGround.kt

## Features
- Text-based RPG combat written in Kotlin  
- Player can choose a name at the start of the game
- Guided rules and instructions displayed at the start of each session  
- Multiple weapons: Fists, Staff, Sword, Bow  
- Each weapon has unique hit chances and damage ranges  
- Turn-based combat: 5 turns per training session  
- Player actions each turn: Attack, Heal, or Quit  
- Dice-based mechanics: randomized hit success and damage  
- Healing system: restore 1–6 HP per turn
- Enemy AI: Dummy attacks back with variable success and damage  
- HP tracking: Player HP and Dummy HP displayed each turn  
- Victory/defeat outcomes: Game ends when turns run out or either the player's or the dummy's HP drops to 0  
- Input validation: Handles invalid input from user   

## Future Improvements
- Add multiple enemies
- Include items and inventory
- Add levels and scoring