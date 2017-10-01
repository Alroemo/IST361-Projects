/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefense;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Lauren
 */
public class PlayerController {
    
  PlayerUI playerView = new PlayerUI();
  private int score =0;
  private int money =0;
  private int stage =1;
  private int difficulty = 1;
  private int amountScoreChanged =0;
  private int amountMoneyChanged =0;
  private int amountHealthChanged =0;
  private String name = "";
  private int health = 0;
  private int highScore =0;
  
  public PlayerController(PlayerUI playerView){
    
    this.playerView = playerView;
    this.score = score;
    this.money = money;
    this.stage = stage;
    this.difficulty = difficulty;
    this.health = 100;
    }
    
   public void setScore(int amountScoreChanged){
    score = score + amountScoreChanged;
    
    }
  public int getScore(){
      return score;
  }
   
  public void setMoney(int amountMoneyChanged){
      money = money + amountMoneyChanged;
  }
  public int getMoney(){
      return money;
  }
  
 public void setStage(){
     stage = stage+1;
 }
 public int getStage(){
     return this.stage;
 }
 
 public void setDifficulty(int difficulty){
     this.difficulty =difficulty;
 }
 public int getDifficulty(){
     return difficulty;
 }

 public void setName(String name){
     this.name = name;
 }
 public String getName(){
     return name;
 }
 public void setHealth(int amountHealthChanged){
     health = health +amountHealthChanged;
 }
 public int getHealth(){
     return this.health;
 }
 
 public String showHighScore() throws IOException{
   String savedHighScore ="0";
     
     File file = new File("HighScores.txt");
     file.createNewFile();
  try{
             Scanner scnr = new Scanner(file);
             savedHighScore = scnr.nextLine();
   
           scnr.close();
        }
        
        catch(Exception e){
            String errString = e.getMessage();
            
        }
    
        
     return savedHighScore;
 }
 
 public void compareScore(int currentScore) 
 {
     
     try{
     int highScore = Integer.parseInt(showHighScore());
     
      if(currentScore>highScore){
         saveHighScore(currentScore);
         
     }
     }
     catch(Exception e){
        System.out.println(e.getMessage());
     }
    
    
 } 
 public void saveHighScore(int highScore) {
     File file = new File("HighScores.txt");
      
     try{
        file.createNewFile();
        PrintWriter out = new PrintWriter("HighScores.txt");
        out.println(highScore);
         out.close();
         
        } 
    
     catch(Exception e ){
     System.out.println(e.getMessage());
    
        }
 }
 
}

