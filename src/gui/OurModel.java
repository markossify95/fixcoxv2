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
    int array[][];
    
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
