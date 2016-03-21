/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import fixcox.FieldValues;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Puskas
 */
public class OurModel extends AbstractTableModel{
    FieldValues values = new FieldValues();
    public int array[][];
    
    public OurModel() {
        this.array = values.getCoxArray();
    }
    
    @Override
    public int getRowCount() {
        return 3;
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return (Object)array[rowIndex][columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        switch(array[rowIndex][columnIndex]){
            case 0: return true;
            
            case 1: return false;
            
            case 2: return false;
        
            default: 
                        return true;
       
        }
    }
    
}
