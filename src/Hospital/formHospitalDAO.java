
package Hospital;

import Hospital.formHospital;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;


public class formHospitalDAO {
    private Session sessao;
    private Transaction transacao;
    
     public void salvar(formHospital fh){
    
        sessao = HibernateUtil.getSessionFactory().openSession(); // Abre uma sessão;
        transacao = sessao.beginTransaction(); // Faz as transações basicas;
        sessao.save(fh); // Salva os dados na sessao;
        transacao.commit(); // envia pro banco de dados
        sessao.clear(); // Limpa a sessao;
    }
    
       public void deletar(formHospital fh){
    
        sessao = HibernateUtil.getSessionFactory().openSession(); // Abre uma sessão;
        transacao = sessao.beginTransaction(); // Faz as transações basicas;
        sessao.delete(fh); // Salva os dados na sessao;
        transacao.commit(); // envia pro banco de dados
        sessao.clear(); // Limpa a sessao;
    }
       
         public void atualizar(formHospital fh){
    
        sessao = HibernateUtil.getSessionFactory().openSession(); // Abre uma sessão;
        transacao = sessao.beginTransaction(); // Faz as transações basicas;
        sessao.update(fh); // Salva os dados na sessao;
        transacao.commit(); // envia pro banco de dados
        sessao.clear(); // Limpa a sessao;
        
        
    
}
    
}
