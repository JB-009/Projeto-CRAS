/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formGeral;

import formGeral.formPrincipal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author jonat
 */
public class formPrincipalTableModel extends AbstractTableModel{
    private List<formPrincipal> principal = new ArrayList<>();
    private String[] colunas = {"Id", "Nome", "Data de Nascimento", "Evolução do Casos"};

    public formPrincipalTableModel(List<formPrincipal> principal) {
        this.principal = principal;
    }
    
    @Override
    public int getRowCount() {
        return principal.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        formPrincipal principal = this.principal.get(rowIndex);
        switch(columnIndex){
            case 0: return principal.getId();
            case 1: return principal.getNome();
            case 2 : return principal.getDt_Nascimento();
            case 3 : return principal.getEvolucao();
        }
        return null;
    }
    
        public String getColumnName(int index){
        switch(index){
            case 0:
                return colunas[0];
            case 1:
                return colunas[1];
            case 2:
                return colunas[2];
                case 3:
                return colunas[3];
                          
        }
        return null;
    } {
    
}
}