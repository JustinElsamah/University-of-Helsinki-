/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author justinelsamah
 */
public class Player {
    
    private int goals;
    private String name;
    
    public Player(String name){
        
        this(name, 0);
        
    }
    
    public Player(String name, int goals){
     
        this.name = name;
        this.goals = goals;
        
    }
    
    public String getName(){
        return this.name;
    }
    
    public int goals(){
        return this.goals;
    }
    
    public String toString(){
        return this.name + ", goals: " + this.goals;
    }
    
}
