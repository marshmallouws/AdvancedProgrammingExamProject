/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.actor;

import java.util.List;

/**
 *
 * @author Annika
 */
public class Character extends Race {    

    public Character(String raceName, int strength, List<Ability> abilities) {
        super(raceName, strength, abilities);
    }
}
