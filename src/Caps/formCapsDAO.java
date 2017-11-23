
package Caps;

import Caps.formCaps;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class formCapsDAO {
    private Session sessao;
    private Transaction transacao;
    
     public void salvar(formCaps caps){
    
        sessao = HibernateUtil.getSessionFactory().openSession(); // Abre uma sessão;
        transacao = sessao.beginTransaction(); // Faz as transações basicas;
        sessao.save(caps); // Salva os dados na sessao;
        transacao.commit(); // envia pro banco de dados
        sessao.clear(); // Limpa a sessao;
    }
    
       public void deletar(formCaps caps){
    
        sessao = HibernateUtil.getSessionFactory().openSession(); // Abre uma sessão;
        transacao = sessao.beginTransaction(); // Faz as transações basicas;
        sessao.delete(caps); // Salva os dados na sessao;
        transacao.commit(); // envia pro banco de dados
        sessao.clear(); // Limpa a sessao;
    }
       
         public void atualizar(formCaps caps){
    
        sessao = HibernateUtil.getSessionFactory().openSession(); // Abre uma sessão;
        transacao = sessao.beginTransaction(); // Faz as transações basicas;
        sessao.update(caps); // Salva os dados na sessao;
        transacao.commit(); // envia pro banco de dados
        sessao.clear(); // Limpa a sessao;
        
        
    
}
         }