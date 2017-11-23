
package Caps;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class formCaps {
    
    @Id
    @GeneratedValue
    
    private int id;
    
     private String uniSaude, prontuario, microarea, ACS, tipo_Acompanhamento, visão_Tratamento, 
           nome, dt_Nascimento, sexo, estadoCivil, escolaridade,profissao, renda, 
            telefone, endereco, numero, resiFisica, moradorRua;

 private String diagnostico, medPsiqui, medUsado,internacao, auto_Exterminio,saudeMental, 
         Diag_Neurologico, aval_neurologica,SemResidencia,rMoradorRua;

    /**
     * @return the uniSaude
     */
    public String getUniSaude() {
        return uniSaude;
    }

    /**
     * @param uniSaude the uniSaude to set
     */
    public void setUniSaude(String uniSaude) {
        this.uniSaude = uniSaude;
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
     * @return the microarea
     */
    public String getMicroarea() {
        return microarea;
    }

    /**
     * @param microarea the microarea to set
     */
    public void setMicroarea(String microarea) {
        this.microarea = microarea;
    }

    /**
     * @return the ACS
     */
    public String getACS() {
        return ACS;
    }

    /**
     * @param ACS the ACS to set
     */
    public void setACS(String ACS) {
        this.ACS = ACS;
    }

    /**
     * @return the tipo_Acompanhamento
     */
    public String getTipo_Acompanhamento() {
        return tipo_Acompanhamento;
    }

    /**
     * @param tipo_Acompanhamento the tipo_Acompanhamento to set
     */
    public void setTipo_Acompanhamento(String tipo_Acompanhamento) {
        this.tipo_Acompanhamento = tipo_Acompanhamento;
    }

    /**
     * @return the visão_Tratamento
     */
    public String getVisão_Tratamento() {
        return visão_Tratamento;
    }

    /**
     * @param visão_Tratamento the visão_Tratamento to set
     */
    public void setVisão_Tratamento(String visão_Tratamento) {
        this.visão_Tratamento = visão_Tratamento;
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
     * @return the estadoCivil
     */
    public String getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * @param estadoCivil the estadoCivil to set
     */
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
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
     * @return the profissao
     */
    public String getProfissao() {
        return profissao;
    }

    /**
     * @param profissao the profissao to set
     */
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    /**
     * @return the renda
     */
    public String getRenda() {
        return renda;
    }

    /**
     * @param renda the renda to set
     */
    public void setRenda(String renda) {
        this.renda = renda;
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
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the resiFisica
     */
    public String getResiFisica() {
        return resiFisica;
    }

    /**
     * @param resiFisica the resiFisica to set
     */
    public void setResiFisica(String resiFisica) {
        this.resiFisica = resiFisica;
    }

    /**
     * @return the moradorRua
     */
    public String getMoradorRua() {
        return moradorRua;
    }

    /**
     * @param moradorRua the moradorRua to set
     */
    public void setMoradorRua(String moradorRua) {
        this.moradorRua = moradorRua;
    }

    /**
     * @return the diagnostico
     */
    public String getDiagnostico() {
        return diagnostico;
    }

    /**
     * @param diagnostico the diagnostico to set
     */
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    /**
     * @return the medPsiqui
     */
    public String getMedPsiqui() {
        return medPsiqui;
    }

    /**
     * @param medPsiqui the medPsiqui to set
     */
    public void setMedPsiqui(String medPsiqui) {
        this.medPsiqui = medPsiqui;
    }

    /**
     * @return the medUsado
     */
    public String getMedUsado() {
        return medUsado;
    }

    /**
     * @param medUsado the medUsado to set
     */
    public void setMedUsado(String medUsado) {
        this.medUsado = medUsado;
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
     * @return the auto_Exterminio
     */
    public String getAuto_Exterminio() {
        return auto_Exterminio;
    }

    /**
     * @param auto_Exterminio the auto_Exterminio to set
     */
    public void setAuto_Exterminio(String auto_Exterminio) {
        this.auto_Exterminio = auto_Exterminio;
    }

    /**
     * @return the saudeMental
     */
    public String getSaudeMental() {
        return saudeMental;
    }

    /**
     * @param saudeMental the saudeMental to set
     */
    public void setSaudeMental(String saudeMental) {
        this.saudeMental = saudeMental;
    }

    /**
     * @return the Diag_Neurologico
     */
    public String getDiag_Neurologico() {
        return Diag_Neurologico;
    }

    /**
     * @param Diag_Neurologico the Diag_Neurologico to set
     */
    public void setDiag_Neurologico(String Diag_Neurologico) {
        this.Diag_Neurologico = Diag_Neurologico;
    }

    /**
     * @return the aval_neurologica
     */
    public String getAval_neurologica() {
        return aval_neurologica;
    }

    /**
     * @param aval_neurologica the aval_neurologica to set
     */
    public void setAval_neurologica(String aval_neurologica) {
        this.aval_neurologica = aval_neurologica;
    }

    /**
     * @return the SemResidencia
     */
    public String getSemResidencia() {
        return SemResidencia;
    }

    /**
     * @param SemResidencia the SemResidencia to set
     */
    public void setSemResidencia(String SemResidencia) {
        this.SemResidencia = SemResidencia;
    }

    /**
     * @return the rMoradorRua
     */
    public String getrMoradorRua() {
        return rMoradorRua;
    }

    /**
     * @param rMoradorRua the rMoradorRua to set
     */
    public void setrMoradorRua(String rMoradorRua) {
        this.rMoradorRua = rMoradorRua;
    }
    
}
