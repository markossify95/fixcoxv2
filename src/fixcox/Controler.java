/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fixcox;

/**
 *
 * @author Puskas
 * 
 */
public class Controler {
    
    private static int[][] coxArray = new int[3][3];
    
    public static boolean isFieldEmpty(int row, int column){
        if (coxArray[row][column]==0) {
            return true;
        }
        return false;
    }
    
    public static void turn(int row, int column, int playerNumber){
        coxArray[row][column]=playerNumber;
    }
    
    
    public static boolean isThereAWinner(int playerNumber){
        int brojac = 0;
        for (int i = 0; i < 3; i++) {
            if (checkRow(i, playerNumber) ||checkColumn(i, playerNumber)||checkMainBias(playerNumber) || checkSecondaryBias(playerNumber)) {
                return true;
            }
        }
        return false;
    }
    
    private static boolean checkRow(int n, int playerNumber){
        int brojac = 0;
        for (int i = 0; i < 3; i++) {
            if (coxArray[n][i]==playerNumber) {
                brojac++;
            }
        }
        if (brojac==3) {
            return true;
        } else {
            return false;
        }
    }
    
    private static boolean checkColumn(int n, int playerNumber){
        int brojac = 0;
        for (int i = 0; i < 3; i++) {
            if (coxArray[i][n]==playerNumber) {
                brojac++;
            }
        }
        if (brojac==3) {
            return true;
        } else {
            return false;
        }
    }
    
    private static boolean checkMainBias(int playerNumber){
        int brojac = 0;
        for (int i = 0; i < 3; i++) {
            if (coxArray[i][i]==playerNumber) {
                brojac++;
            }
        }
        if (brojac==3) {
            return true;
        } else {
            return false;
        }
    }
    
    private static boolean checkSecondaryBias(int playerNumber){
        int brojac = 0;
        for (int i = 0; i < 3; i++) {
            if (coxArray[i][2-i]==playerNumber) {
                brojac++;
            }
        }
        if (brojac==3) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void reset(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                coxArray[i][j]=0;
            }
        }
    }
    
    
}
