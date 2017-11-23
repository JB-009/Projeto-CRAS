package Usuario;

import Usuario.Usuario;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

public class UsuarioDAO {

    private Session sessao;
    private Transaction transacao;

    public void salvar(Usuario usuario) {

        sessao = HibernateUtil.getSessionFactory().openSession(); // Abre uma sessão;
        transacao = sessao.beginTransaction(); // Faz as transações basicas;
        sessao.save(usuario); // Salva os dados na sessao;
        transacao.commit(); // envia pro banco de dados
        sessao.clear(); // Limpa a sessao;
    }

    public void deletar(Usuario usuario) {

        sessao = HibernateUtil.getSessionFactory().openSession(); // Abre uma sessão;
        transacao = sessao.beginTransaction(); // Faz as transações basicas;
        sessao.delete(usuario); // Salva os dados na sessao;
        transacao.commit(); // envia pro banco de dados
        sessao.clear(); // Limpa a sessao;
    }

    public void atualizar(Usuario usuario) {

        sessao = HibernateUtil.getSessionFactory().openSession(); // Abre uma sessão;
        transacao = sessao.beginTransaction(); // Faz as transações basicas;
        sessao.update(usuario); // Salva os dados na sessao;
        transacao.commit(); // envia pro banco de dados
        sessao.clear(); // Limpa a sessao;
    }

    public List<Usuario> listarUsuario() {

        sessao = HibernateUtil.getSessionFactory().openSession(); // Abre uma sessão;
        transacao = sessao.beginTransaction(); // Faz as transações basicas;
        List<Usuario> usuarios = sessao.createCriteria(Usuario.class).list();
        sessao.close();

        return usuarios;
    }

    public Usuario autenticar(String login, String senha) {

        sessao = HibernateUtil.getSessionFactory().openSession(); // Abre uma sessão;
        transacao = sessao.beginTransaction(); // Faz as transações basicas;
        Usuario usuario = (Usuario) sessao.createCriteria(Usuario.class).add(Restrictions.eq("login", login)).
                add(Restrictions.eq("senha", senha)).uniqueResult();
        sessao.close();

        return usuario;
    }
    
      public Usuario pesquisarUsuarioID(int id){
        sessao = HibernateUtil.getSessionFactory().openSession(); 
        transacao = sessao.beginTransaction();
        Usuario usuario = (Usuario) sessao.createCriteria(Usuario.class).add(Restrictions.eq("id", id)).uniqueResult();
        sessao.close();
        
        return usuario;
        }

}
