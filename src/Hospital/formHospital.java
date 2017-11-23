
package Hospital;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class formHospital {
    
    @Id
    @GeneratedValue
    
    private int id;
    
    private String nome,emicao,carater,prontuario, dt_Nascimento,sexo,muni_Residencia,
            recurso,muni_Atendimento,internacao,saida,cnes,hospital,motivo_Saida,CPF_Resp,
            prof_Responsavel;
    
    private int num_Autorizacao,cartao_sus,idade,cod_Municipio;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the emicao
     */
    public String getEmicao() {
        return emicao;
    }

    /**
     * @param emicao the emicao to set
     */
    public void setEmicao(String emicao) {
        this.emicao = emicao;
    }

    /**
     * @return the carater
     */
    public String getCarater() {
        return carater;
    }

    /**
     * @param carater the carater to set
     */
    public void setCarater(String carater) {
        this.carater = carater;
    }

    /**
     * @return the prontuario
     */
    public String getProntuario() {
        return prontuario;
    }

    /**
     * @param prontuario the prontuario to set
     */
    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    /**
     * @return the dt_Nascimento
     */
    public String getDt_Nascimento() {
        return dt_Nascimento;
    }

    /**
     * @param dt_Nascimento the dt_Nascimento to set
     */
    public void setDt_Nascimento(String dt_Nascimento) {
        this.dt_Nascimento = dt_Nascimento;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the muni_Residencia
     */
    public String getMuni_Residencia() {
        return muni_Residencia;
    }

    /**
     * @param muni_Residencia the muni_Residencia to set
     */
    public void setMuni_Residencia(String muni_Residencia) {
        this.muni_Residencia = muni_Residencia;
    }

    /**
     * @return the recurso
     */
    public String getRecurso() {
        return recurso;
    }

    /**
     * @param recurso the recurso to set
     */
    public void setRecurso(String recurso) {
        this.recurso = recurso;
    }

    /**
     * @return the muni_Atendimento
     */
    public String getMuni_Atendimento() {
        return muni_Atendimento;
    }

    /**
     * @param muni_Atendimento the muni_Atendimento to set
     */
    public void setMuni_Atendimento(String muni_Atendimento) {
        this.muni_Atendimento = muni_Atendimento;
    }

    /**
     * @return the internacao
     */
    public String getInternacao() {
        return internacao;
    }

    /**
     * @param internacao the internacao to set
     */
    public void setInternacao(String internacao) {
        this.internacao = internacao;
    }

    /**
     * @return the saida
     */
    public String getSaida() {
        return saida;
    }

    /**
     * @param saida the saida to set
     */
    public void setSaida(String saida) {
        this.saida = saida;
    }

    /**
     * @return the cnes
     */
    public String getCnes() {
        return cnes;
    }

    /**
     * @param cnes the cnes to set
     */
    public void setCnes(String cnes) {
        this.cnes = cnes;
    }

    /**
     * @return the hospital
     */
    public String getHospital() {
        return hospital;
    }

    /**
     * @param hospital the hospital to set
     */
    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    /**
     * @return the motivo_Saida
     */
    public String getMotivo_Saida() {
        return motivo_Saida;
    }

    /**
     * @param motivo_Saida the motivo_Saida to set
     */
    public void setMotivo_Saida(String motivo_Saida) {
        this.motivo_Saida = motivo_Saida;
    }

    /**
     * @return the CPF_Resp
     */
    public String getCPF_Resp() {
        return CPF_Resp;
    }

    /**
     * @param CPF_Resp the CPF_Resp to set
     */
    public void setCPF_Resp(String CPF_Resp) {
        this.CPF_Resp = CPF_Resp;
    }

    /**
     * @return the prof_Responsavel
     */
    public String getProf_Responsavel() {
        return prof_Responsavel;
    }

    /**
     * @param prof_Responsavel the prof_Responsavel to set
     */
    public void setProf_Responsavel(String prof_Responsavel) {
        this.prof_Responsavel = prof_Responsavel;
    }

    /**
     * @return the num_Autorizacao
     */
    public int getNum_Autorizacao() {
        return num_Autorizacao;
    }

    /**
     * @param num_Autorizacao the num_Autorizacao to set
     */
    public void setNum_Autorizacao(int num_Autorizacao) {
        this.num_Autorizacao = num_Autorizacao;
    }

    /**
     * @return the cartao_sus
     */
    public int getCartao_sus() {
        return cartao_sus;
    }

    /**
     * @param cartao_sus the cartao_sus to set
     */
    public void setCartao_sus(int cartao_sus) {
        this.cartao_sus = cartao_sus;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the cod_Municipio
     */
    public int getCod_Municipio() {
        return cod_Municipio;
    }

    /**
     * @param cod_Municipio the cod_Municipio to set
     */
    public void setCod_Municipio(int cod_Municipio) {
        this.cod_Municipio = cod_Municipio;
    }
    
    
            
}
