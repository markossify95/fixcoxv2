/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fixcox;

/**
 *
 * @author Puskas
 */
public class FieldValues {
    private int[][] coxArray = new int[3][3];
    
    public FieldValues(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                coxArray[i][j] = 0;
            }
        }
    }

    /**
     * @return the coxArray
     */
    public int[][] getCoxArray() {
        return coxArray;
    }

    /**
     * @param coxArray the coxArray to set
     */
    public void setCoxArray(int[][] coxArray) {
        this.coxArray = coxArray;
    }
    
}
