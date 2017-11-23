
package formGeral;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class formPrincipal {
    @Id
    @GeneratedValue
    
    private int id;
    
    // Aba de notificações:

private String nome, dt_Nascimento, dt_Notificacao, UF, cidade_notif, unid_Saude, dt_Ocorrencia, hr_Ocorrencia;

// Aba de Dados da Pessoa Atendida

private String sexo, cor, escolaridade, ocupacao, estado_Civil, tipo_Deficiencia, 
        nome_Mae, telefone, munic_Residencia, bairro_Residencia, Logradouro, complemento, ponto_Referencia, CEP, zona;
        
        
private int idade, num_Sus, numero_casa;  

// Aba Dados da Ocorrencia;

private String local_ocorrencia, muni_Ocorrencia, logra_Ocorrencia,  bairroOcorrencia,
        complem_Ocorrencia, zona_Ocorrencia, outrasVezes, autoprovocada, meio_Agressao, tipo_Violencia,ufOcorrencia;

private int num_Ocorrencia;

// Aba Violencia Sexual;

private String violenciaSexual, Penetração, consequencia_Ocorrencia, procedimento;

// Aba Dados do autor da Agressao;

private String num_envolvidos, relacaoPessoa_Atendida, sexo_Autor, suspeita_Alcool;

// Aba Evolucao e Encaminhamento;

private String evolucao, dt_Obito, encaminhamento, classificacao_Final;

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
     * @return the dt_Notificacao
     */
    public String getDt_Notificacao() {
        return dt_Notificacao;
    }

    /**
     * @param dt_Notificacao the dt_Notificacao to set
     */
    public void setDt_Notificacao(String dt_Notificacao) {
        this.dt_Notificacao = dt_Notificacao;
    }

    /**
     * @return the UF
     */
    public String getUF() {
        return UF;
    }

    /**
     * @param UF the UF to set
     */
    public void setUF(String UF) {
        this.UF = UF;
    }

    /**
     * @return the cidade_notif
     */
    public String getCidade_notif() {
        return cidade_notif;
    }

    /**
     * @param cidade_notif the cidade_notif to set
     */
    public void setCidade_notif(String cidade_notif) {
        this.cidade_notif = cidade_notif;
    }

    /**
     * @return the unid_Saude
     */
    public String getUnid_Saude() {
        return unid_Saude;
    }

    /**
     * @param unid_Saude the unid_Saude to set
     */
    public void setUnid_Saude(String unid_Saude) {
        this.unid_Saude = unid_Saude;
    }

    /**
     * @return the dt_Ocorrencia
     */
    public String getDt_Ocorrencia() {
        return dt_Ocorrencia;
    }

    /**
     * @param dt_Ocorrencia the dt_Ocorrencia to set
     */
    public void setDt_Ocorrencia(String dt_Ocorrencia) {
        this.dt_Ocorrencia = dt_Ocorrencia;
    }

    /**
     * @return the hr_Ocorrencia
     */
    public String getHr_Ocorrencia() {
        return hr_Ocorrencia;
    }

    /**
     * @param hr_Ocorrencia the hr_Ocorrencia to set
     */
    public void setHr_Ocorrencia(String hr_Ocorrencia) {
        this.hr_Ocorrencia = hr_Ocorrencia;
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
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the escolaridade
     */
    public String getEscolaridade() {
        return escolaridade;
    }

    /**
     * @param escolaridade the escolaridade to set
     */
    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    /**
     * @return the ocupacao
     */
    public String getOcupacao() {
        return ocupacao;
    }

    /**
     * @param ocupacao the ocupacao to set
     */
    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }

    /**
     * @return the estado_Civil
     */
    public String getEstado_Civil() {
        return estado_Civil;
    }

    /**
     * @param estado_Civil the estado_Civil to set
     */
    public void setEstado_Civil(String estado_Civil) {
        this.estado_Civil = estado_Civil;
    }

    /**
     * @return the tipo_Deficiencia
     */
    public String getTipo_Deficiencia() {
        return tipo_Deficiencia;
    }

    /**
     * @param tipo_Deficiencia the tipo_Deficiencia to set
     */
    public void setTipo_Deficiencia(String tipo_Deficiencia) {
        this.tipo_Deficiencia = tipo_Deficiencia;
    }

    /**
     * @return the nome_Mae
     */
    public String getNome_Mae() {
        return nome_Mae;
    }

    /**
     * @param nome_Mae the nome_Mae to set
     */
    public void setNome_Mae(String nome_Mae) {
        this.nome_Mae = nome_Mae;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the munic_Residencia
     */
    public String getMunic_Residencia() {
        return munic_Residencia;
    }

    /**
     * @param munic_Residencia the munic_Residencia to set
     */
    public void setMunic_Residencia(String munic_Residencia) {
        this.munic_Residencia = munic_Residencia;
    }

    /**
     * @return the bairro_Residencia
     */
    public String getBairro_Residencia() {
        return bairro_Residencia;
    }

    /**
     * @param bairro_Residencia the bairro_Residencia to set
     */
    public void setBairro_Residencia(String bairro_Residencia) {
        this.bairro_Residencia = bairro_Residencia;
    }

    /**
     * @return the Logradouro
     */
    public String getLogradouro() {
        return Logradouro;
    }

    /**
     * @param Logradouro the Logradouro to set
     */
    public void setLogradouro(String Logradouro) {
        this.Logradouro = Logradouro;
    }

    /**
     * @return the complemento
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * @return the ponto_Referencia
     */
    public String getPonto_Referencia() {
        return ponto_Referencia;
    }

    /**
     * @param ponto_Referencia the ponto_Referencia to set
     */
    public void setPonto_Referencia(String ponto_Referencia) {
        this.ponto_Referencia = ponto_Referencia;
    }

    /**
     * @return the CEP
     */
    public String getCEP() {
        return CEP;
    }

    /**
     * @param CEP the CEP to set
     */
    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    /**
     * @return the zona
     */
    public String getZona() {
        return zona;
    }

    /**
     * @param zona the zona to set
     */
    public void setZona(String zona) {
        this.zona = zona;
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
     * @return the num_Sus
     */
    public int getNum_Sus() {
        return num_Sus;
    }

    /**
     * @param num_Sus the num_Sus to set
     */
    public void setNum_Sus(int num_Sus) {
        this.num_Sus = num_Sus;
    }

    /**
     * @return the numero_casa
     */
    public int getNumero_casa() {
        return numero_casa;
    }

    /**
     * @param numero_casa the numero_casa to set
     */
    public void setNumero_casa(int numero_casa) {
        this.numero_casa = numero_casa;
    }

    /**
     * @return the local_ocorrencia
     */
    public String getLocal_ocorrencia() {
        return local_ocorrencia;
    }

    /**
     * @param local_ocorrencia the local_ocorrencia to set
     */
    public void setLocal_ocorrencia(String local_ocorrencia) {
        this.local_ocorrencia = local_ocorrencia;
    }

    /**
     * @return the muni_Ocorrencia
     */
    public String getMuni_Ocorrencia() {
        return muni_Ocorrencia;
    }

    /**
     * @param muni_Ocorrencia the muni_Ocorrencia to set
     */
    public void setMuni_Ocorrencia(String muni_Ocorrencia) {
        this.muni_Ocorrencia = muni_Ocorrencia;
    }

    /**
     * @return the logra_Ocorrencia
     */
    public String getLogra_Ocorrencia() {
        return logra_Ocorrencia;
    }

    /**
     * @param logra_Ocorrencia the logra_Ocorrencia to set
     */
    public void setLogra_Ocorrencia(String logra_Ocorrencia) {
        this.logra_Ocorrencia = logra_Ocorrencia;
    }

    /**
     * @return the bairroOcorrencia
     */
    public String getBairroOcorrencia() {
        return bairroOcorrencia;
    }

    /**
     * @param bairroOcorrencia the bairroOcorrencia to set
     */
    public void setBairroOcorrencia(String bairroOcorrencia) {
        this.bairroOcorrencia = bairroOcorrencia;
    }

    /**
     * @return the complem_Ocorrencia
     */
    public String getComplem_Ocorrencia() {
        return complem_Ocorrencia;
    }

    /**
     * @param complem_Ocorrencia the complem_Ocorrencia to set
     */
    public void setComplem_Ocorrencia(String complem_Ocorrencia) {
        this.complem_Ocorrencia = complem_Ocorrencia;
    }

    /**
     * @return the zona_Ocorrencia
     */
    public String getZona_Ocorrencia() {
        return zona_Ocorrencia;
    }

    /**
     * @param zona_Ocorrencia the zona_Ocorrencia to set
     */
    public void setZona_Ocorrencia(String zona_Ocorrencia) {
        this.zona_Ocorrencia = zona_Ocorrencia;
    }

    /**
     * @return the outrasVezes
     */
    public String getOutrasVezes() {
        return outrasVezes;
    }

    /**
     * @param outrasVezes the outrasVezes to set
     */
    public void setOutrasVezes(String outrasVezes) {
        this.outrasVezes = outrasVezes;
    }

    /**
     * @return the autoprovocada
     */
    public String getAutoprovocada() {
        return autoprovocada;
    }

    /**
     * @param autoprovocada the autoprovocada to set
     */
    public void setAutoprovocada(String autoprovocada) {
        this.autoprovocada = autoprovocada;
    }

    /**
     * @return the meio_Agressao
     */
    public String getMeio_Agressao() {
        return meio_Agressao;
    }

    /**
     * @param meio_Agressao the meio_Agressao to set
     */
    public void setMeio_Agressao(String meio_Agressao) {
        this.meio_Agressao = meio_Agressao;
    }

    /**
     * @return the tipo_Violencia
     */
    public String getTipo_Violencia() {
        return tipo_Violencia;
    }

    /**
     * @param tipo_Violencia the tipo_Violencia to set
     */
    public void setTipo_Violencia(String tipo_Violencia) {
        this.tipo_Violencia = tipo_Violencia;
    }

    /**
     * @return the ufOcorrencia
     */
    public String getUfOcorrencia() {
        return ufOcorrencia;
    }

    /**
     * @param ufOcorrencia the ufOcorrencia to set
     */
    public void setUfOcorrencia(String ufOcorrencia) {
        this.ufOcorrencia = ufOcorrencia;
    }

    /**
     * @return the num_Ocorrencia
     */
    public int getNum_Ocorrencia() {
        return num_Ocorrencia;
    }

    /**
     * @param num_Ocorrencia the num_Ocorrencia to set
     */
    public void setNum_Ocorrencia(int num_Ocorrencia) {
        this.num_Ocorrencia = num_Ocorrencia;
    }

    /**
     * @return the violenciaSexual
     */
    public String getViolenciaSexual() {
        return violenciaSexual;
    }

    /**
     * @param violenciaSexual the violenciaSexual to set
     */
    public void setViolenciaSexual(String violenciaSexual) {
        this.violenciaSexual = violenciaSexual;
    }

    /**
     * @return the Penetração
     */
    public String getPenetração() {
        return Penetração;
    }

    /**
     * @param Penetração the Penetração to set
     */
    public void setPenetração(String Penetração) {
        this.Penetração = Penetração;
    }

    /**
     * @return the consequencia_Ocorrencia
     */
    public String getConsequencia_Ocorrencia() {
        return consequencia_Ocorrencia;
    }

    /**
     * @param consequencia_Ocorrencia the consequencia_Ocorrencia to set
     */
    public void setConsequencia_Ocorrencia(String consequencia_Ocorrencia) {
        this.consequencia_Ocorrencia = consequencia_Ocorrencia;
    }

    /**
     * @return the procedimento
     */
    public String getProcedimento() {
        return procedimento;
    }

    /**
     * @param procedimento the procedimento to set
     */
    public void setProcedimento(String procedimento) {
        this.procedimento = procedimento;
    }

    /**
     * @return the num_envolvidos
     */
    public String getNum_envolvidos() {
        return num_envolvidos;
    }

    /**
     * @param num_envolvidos the num_envolvidos to set
     */
    public void setNum_envolvidos(String num_envolvidos) {
        this.num_envolvidos = num_envolvidos;
    }

    /**
     * @return the relacaoPessoa_Atendida
     */
    public String getRelacaoPessoa_Atendida() {
        return relacaoPessoa_Atendida;
    }

    /**
     * @param relacaoPessoa_Atendida the relacaoPessoa_Atendida to set
     */
    public void setRelacaoPessoa_Atendida(String relacaoPessoa_Atendida) {
        this.relacaoPessoa_Atendida = relacaoPessoa_Atendida;
    }

    /**
     * @return the sexo_Autor
     */
    public String getSexo_Autor() {
        return sexo_Autor;
    }

    /**
     * @param sexo_Autor the sexo_Autor to set
     */
    public void setSexo_Autor(String sexo_Autor) {
        this.sexo_Autor = sexo_Autor;
    }

    /**
     * @return the suspeita_Alcool
     */
    public String getSuspeita_Alcool() {
        return suspeita_Alcool;
    }

    /**
     * @param suspeita_Alcool the suspeita_Alcool to set
     */
    public void setSuspeita_Alcool(String suspeita_Alcool) {
        this.suspeita_Alcool = suspeita_Alcool;
    }

    /**
     * @return the evolucao
     */
    public String getEvolucao() {
        return evolucao;
    }

    /**
     * @param evolucao the evolucao to set
     */
    public void setEvolucao(String evolucao) {
        this.evolucao = evolucao;
    }

    /**
     * @return the dt_Obito
     */
    public String getDt_Obito() {
        return dt_Obito;
    }

    /**
     * @param dt_Obito the dt_Obito to set
     */
    public void setDt_Obito(String dt_Obito) {
        this.dt_Obito = dt_Obito;
    }

    /**
     * @return the encaminhamento
     */
    public String getEncaminhamento() {
        return encaminhamento;
    }

    /**
     * @param encaminhamento the encaminhamento to set
     */
    public void setEncaminhamento(String encaminhamento) {
        this.encaminhamento = encaminhamento;
    }

    /**
     * @return the classificacao_Final
     */
    public String getClassificacao_Final() {
        return classificacao_Final;
    }

    /**
     * @param classificacao_Final the classificacao_Final to set
     */
    public void setClassificacao_Final(String classificacao_Final) {
        this.classificacao_Final = classificacao_Final;
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

}