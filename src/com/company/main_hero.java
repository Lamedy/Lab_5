package com.company;

import java.util.Scanner;

public class main_hero {
    String name;
    stats hero = new stats();
    healthbar info = new healthbar();
    actions movement = new actions();

    public main_hero() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter character name\nInput: ");
        name = scan.nextLine();
        System.out.print("\n");

        info.health = 20 + (5 * hero.health);
        info.mana = 15 + (2 * hero.intelligense);

        movement.damage_first_action = 7 + (3 * hero.dexterity);
        movement.damage_second_action = 7 + (3 * hero.strenght);
        movement.damage_third_action = 10 + (5 * hero.intelligense);
        movement.percent_luck = 3 + (2 * hero.luck);
    }
}
