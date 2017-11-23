
package formGeral;

import formGeral.formPrincipal;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;


public class formPrincipalDAO {
    private Session sessao;
    private Transaction transacao;
    
     public void salvar(formPrincipal fp){
    
        sessao = HibernateUtil.getSessionFactory().openSession(); // Abre uma sessão;
        transacao = sessao.beginTransaction(); // Faz as transações basicas;
        sessao.save(fp); // Salva os dados na sessao;
        transacao.commit(); // envia pro banco de dados
        sessao.clear(); // Limpa a sessao;
    }
    
       public void deletar(formPrincipal fp){
    
        sessao = HibernateUtil.getSessionFactory().openSession(); // Abre uma sessão;
        transacao = sessao.beginTransaction(); // Faz as transações basicas;
        sessao.delete(fp); // Salva os dados na sessao;
        transacao.commit(); // envia pro banco de dados
        sessao.clear(); // Limpa a sessao;
    }
       
         public void atualizar(formPrincipal fp){
    
        sessao = HibernateUtil.getSessionFactory().openSession(); // Abre uma sessão;
        transacao = sessao.beginTransaction(); // Faz as transações basicas;
        sessao.update(fp); // Salva os dados na sessao;
        transacao.commit(); // envia pro banco de dados
        sessao.clear(); // Limpa a sessao;
        
}
          public List<formPrincipal> listarCasos(){
         sessao = HibernateUtil.getSessionFactory().openSession(); // Abre uma sessão;
          transacao = sessao.beginTransaction();
          List<formPrincipal> principal = sessao.createCriteria(formPrincipal.class).list();
          sessao.close();
          
        return principal;
        }
         
        public formPrincipal pesquisarCasoID(int id){
        sessao = HibernateUtil.getSessionFactory().openSession(); 
        transacao = sessao.beginTransaction();
        formPrincipal principal = (formPrincipal) sessao.createCriteria(formPrincipal.class).add(Restrictions.eq("id", id)).uniqueResult();
        sessao.close();
        
        return principal;
        }
         
         
          
        
}
     
         
