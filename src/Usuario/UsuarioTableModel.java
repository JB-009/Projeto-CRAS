
package Usuario;

import Usuario.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class UsuarioTableModel extends AbstractTableModel{
    private List<Usuario> usuarios = new ArrayList<>();
    private String[] colunas = {"Id", "Nome", "Login", "Tipo de Usuario"};

    public UsuarioTableModel(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    @Override
    public int getRowCount() {
        return usuarios.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Usuario usuarios = this.usuarios.get(rowIndex);
        switch(columnIndex){
            case 0: return usuarios.getId();
            case 1: return usuarios.getNome();
            case 2 : return usuarios.getLogin();
            case 3 : return usuarios.getFuncao();
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
    }
    
}
