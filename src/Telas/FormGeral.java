/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import formGeral.formPrincipal;
import formGeral.formPrincipalDAO;
import javax.swing.JOptionPane;


public class FormGeral extends javax.swing.JFrame {

    formPrincipal fp = new formPrincipal();
    formPrincipalDAO fpDAO = new formPrincipalDAO();
    
   
    public FormGeral() {
        initComponents();
       setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        setTitle("Formulario Geral");
    }
    
    public void atualizarCamposConsulta(){
        
        tfAgressao.setSelectedItem(fp.getMeio_Agressao());
        tfautoprovocada.setSelectedItem(fp.getAutoprovocada().toString());
        tfAlcool.setSelectedItem(fp.getSuspeita_Alcool().toString());
        tfBairro_Ocorrencia.setText(fp.getBairroOcorrencia());
        tfCEP.setText(fp.getCEP());
        tfClassificacao.setSelectedItem(fp.getClassificacao_Final().toString());
        tfComplemento.setText(fp.getComplemento());
        tfConjugal.setSelectedItem(fp.getEstado_Civil().toString());
        tfCons_Ocorrencia.setSelectedItem(fp.getConsequencia_Ocorrencia().toString());
        tfDtNascimento.setText(fp.getDt_Nascimento());
        tfEncaminhamento.setSelectedItem(fp.getEncaminhamento().toString());
        tfEnvolvidos.setSelectedItem(fp.getNum_envolvidos().toString());
        tfEscolaridade.setSelectedItem(fp.getEscolaridade().toString());
        tfEvolucao.setSelectedItem(fp.getEvolucao().toString());
        tfIdade.setText(String.valueOf(fp.getIdade()));
        tfLogra_Ocorrencia.setText(fp.getLogra_Ocorrencia());
        tfLogradouro.setText(fp.getLogradouro());
        tfMuni_Ocorrencia.setText(fp.getMuni_Ocorrencia());
        tfMuni_notificacao.setText(fp.getCidade_notif());
        tfNumero.setText(String.valueOf(fp.getNum_Ocorrencia()));
        tfOcupacao.setText(fp.getOcupacao());
        tfPenetracao.setSelectedItem(fp.getPenetração().toString());
        tfProcedimento.setSelectedItem(fp.getProcedimento().toString().toString());
        tfRelacaoPessoa.setSelectedItem(fp.getRelacaoPessoa_Atendida().toString());
        tfSexo.setSelectedItem(fp.getSexo().toString());
        tfSexoAutor.setSelectedItem(fp.getSexo_Autor().toString());
        tfUF.setText(fp.getUF());
        tfUF_Ocorrencia.setText(fp.getUfOcorrencia());
        tfZona.setSelectedItem(fp.getZona().toString());
        tfbairro_Residencia.setText(fp.getBairro_Residencia());
        tfcomp_Ocorrencia.setText(fp.getComplem_Ocorrencia());
        tfcor.setSelectedItem(fp.getCor().toString());
        tfdt_Obito.setText(fp.getDt_Obito());
        tfdt_Ocorrencia.setText(fp.getDt_Ocorrencia());
        tfdt_notificacao.setText(fp.getDt_Notificacao());
        tfhr_Ocorrencia.setText(fp.getHr_Ocorrencia());
        tflocal_Ocorrencia.setSelectedItem(fp.getLocal_ocorrencia().toString());
        tfmuni_Residencia.setText(fp.getMuni_Ocorrencia());
        tfnome.setText(fp.getNome());
        tfnome_Mae.setText(fp.getNome_Mae());
        tfnum_Ocorrencia.setText(String.valueOf(fp.getNum_Ocorrencia()));
        tfnum_SUS.setText(String.valueOf(fp.getNum_Sus()));
        tfoutras_Vezes.setSelectedItem(fp.getOutrasVezes().toString());
        tfpontoReferencia.setText(fp.getPonto_Referencia());
        tftelefone.setText(fp.getTelefone());
        tftipo_Deficiencia.setSelectedItem(fp.getTipo_Deficiencia().toString());
        tftipo_Violencia.setSelectedItem(fp.getTipo_Violencia().toString());
        tftipo_ViolenciaSexual.setSelectedItem(fp.getViolenciaSexual().toString());
        tfuf.setText(fp.getUF());
        tfuni_Saude.setText(fp.getUnid_Saude());
        tfzonaOcorrencia.setSelectedItem(fp.getZona_Ocorrencia().toString());
      
    }

      
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Abas = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfUF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfMuni_notificacao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfuni_Saude = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfhr_Ocorrencia = new javax.swing.JFormattedTextField();
        tfdt_Ocorrencia = new javax.swing.JFormattedTextField();
        tfdt_notificacao = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel15 = new javax.swing.JPanel();
        jLabel208 = new javax.swing.JLabel();
        tfIdade = new javax.swing.JTextField();
        jLabel209 = new javax.swing.JLabel();
        tfSexo = new javax.swing.JComboBox<>();
        jLabel210 = new javax.swing.JLabel();
        tfcor = new javax.swing.JComboBox<>();
        jLabel211 = new javax.swing.JLabel();
        tfEscolaridade = new javax.swing.JComboBox<>();
        jLabel212 = new javax.swing.JLabel();
        tfOcupacao = new javax.swing.JTextField();
        jLabel213 = new javax.swing.JLabel();
        tfConjugal = new javax.swing.JComboBox<>();
        jLabel214 = new javax.swing.JLabel();
        tftipo_Deficiencia = new javax.swing.JComboBox<>();
        jLabel215 = new javax.swing.JLabel();
        tfnum_SUS = new javax.swing.JTextField();
        jLabel216 = new javax.swing.JLabel();
        tfnome_Mae = new javax.swing.JTextField();
        jLabel217 = new javax.swing.JLabel();
        tfuf = new javax.swing.JTextField();
        jLabel218 = new javax.swing.JLabel();
        tfmuni_Residencia = new javax.swing.JTextField();
        jLabel219 = new javax.swing.JLabel();
        tfbairro_Residencia = new javax.swing.JTextField();
        jLabel220 = new javax.swing.JLabel();
        tfLogradouro = new javax.swing.JTextField();
        jLabel221 = new javax.swing.JLabel();
        tfNumero = new javax.swing.JTextField();
        jLabel222 = new javax.swing.JLabel();
        tfComplemento = new javax.swing.JTextField();
        jLabel223 = new javax.swing.JLabel();
        tfpontoReferencia = new javax.swing.JTextField();
        jLabel224 = new javax.swing.JLabel();
        jLabel225 = new javax.swing.JLabel();
        jLabel226 = new javax.swing.JLabel();
        tfZona = new javax.swing.JComboBox<>();
        jLabel227 = new javax.swing.JLabel();
        tfnome = new javax.swing.JTextField();
        jLabel228 = new javax.swing.JLabel();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        tfCEP = new javax.swing.JFormattedTextField();
        tfDtNascimento = new javax.swing.JFormattedTextField();
        tftelefone = new javax.swing.JFormattedTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        tflocal_Ocorrencia = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        tfUF_Ocorrencia = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        tfMuni_Ocorrencia = new javax.swing.JTextField();
        tfBairro_Ocorrencia = new javax.swing.JTextField();
        tfLogra_Ocorrencia = new javax.swing.JTextField();
        tfnum_Ocorrencia = new javax.swing.JTextField();
        tfcomp_Ocorrencia = new javax.swing.JTextField();
        tfzonaOcorrencia = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        tfoutras_Vezes = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        tfautoprovocada = new javax.swing.JComboBox<>();
        jLabel36 = new javax.swing.JLabel();
        tfAgressao = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();
        tftipo_Violencia = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        tftipo_ViolenciaSexual = new javax.swing.JComboBox<>();
        jLabel39 = new javax.swing.JLabel();
        tfPenetracao = new javax.swing.JComboBox<>();
        jLabel40 = new javax.swing.JLabel();
        tfCons_Ocorrencia = new javax.swing.JComboBox<>();
        jLabel41 = new javax.swing.JLabel();
        tfProcedimento = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        tfEnvolvidos = new javax.swing.JComboBox<>();
        jLabel43 = new javax.swing.JLabel();
        tfRelacaoPessoa = new javax.swing.JComboBox<>();
        jLabel44 = new javax.swing.JLabel();
        tfSexoAutor = new javax.swing.JComboBox<>();
        jLabel45 = new javax.swing.JLabel();
        tfAlcool = new javax.swing.JComboBox<>();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        tfEvolucao = new javax.swing.JComboBox<>();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        tfEncaminhamento = new javax.swing.JComboBox<>();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        tfClassificacao = new javax.swing.JComboBox<>();
        Cadastrar = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        tfdt_Obito = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setText("Data da notificação");

        jLabel2.setText("UF");

        jLabel3.setText("Municipío de notificação");

        jLabel4.setText("Unidade de saúde (ou outra fonte notificadora)");

        jLabel5.setText("Data da ocorrência do evento");

        jLabel6.setText("Hora da ocorrência (0 - 24 horas)");

        try {
            tfhr_Ocorrencia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfhr_Ocorrencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfhr_OcorrenciaActionPerformed(evt);
            }
        });

        try {
            tfdt_Ocorrencia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            tfdt_notificacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfdt_notificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdt_notificacaoActionPerformed(evt);
            }
        });

        jButton1.setText("Avançar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfuni_Saude, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfhr_Ocorrencia)
                                    .addComponent(tfdt_Ocorrencia, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfMuni_notificacao))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfUF, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfdt_notificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(213, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(26, 26, 26))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdt_notificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfMuni_notificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfuni_Saude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfdt_Ocorrencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfhr_Ocorrencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        Abas.addTab("Dados Gerais", jPanel2);

        jPanel15.setBackground(new java.awt.Color(204, 255, 204));

        jLabel208.setText("Idade");

        jLabel209.setText("Sexo");

        tfSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Ignorado" }));

        jLabel210.setText("Cor");

        tfcor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Branca", "Preta", "Amarela", "Parda", "Indígena", "Ignorado" }));

        jLabel211.setText("Escolaridade");

        tfEscolaridade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Analfabeto", "Ensino fundamental completo", "Ensino fundamental incompleto", "Ensino médio completo", "Ensino médio incompleto", "Ensino superior completo", "Ensino superior incompleto", "Não se aplica", "Ignorado" }));

        jLabel212.setText("Ocupação");

        jLabel213.setText("Situação conjugal");

        tfConjugal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Casado/união consensual", "Viúvo", "Separado", "Não se aplica", "Ignorado" }));

        jLabel214.setText("Possui algum tipo de deficiência?");

        tftipo_Deficiencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Física", "Mental", "Visual", "Auditiva", "Outras deficiências/Síndromes", "Nenhuma" }));

        jLabel215.setText("Número do cartão do SUS");

        jLabel216.setText("Nome da mãe");

        jLabel217.setText("UF");

        jLabel218.setText("Município de residência");

        jLabel219.setText("Bairro de residência");

        jLabel220.setText("Logradouro");

        jLabel221.setText("Número");

        jLabel222.setText("Complemento");

        jLabel223.setText("Ponto de referência");

        jLabel224.setText("CEP");

        jLabel225.setText("(DDD) Telefone");

        jLabel226.setText("Zona");

        tfZona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Urbana", "Periurbana", "Rural", "Ignorado" }));

        jLabel227.setText("Nome:");

        jLabel228.setText("Dt.Nascimento");

        jButton26.setText("Avançar");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26jButton3ActionPerformed(evt);
            }
        });

        jButton27.setText("Voltar");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27jButton4ActionPerformed(evt);
            }
        });

        try {
            tfCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            tfDtNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            tftelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#.####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel227)
                            .addComponent(jLabel209))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfnome)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton27)
                                    .addComponent(jLabel225))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tftelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel15Layout.createSequentialGroup()
                                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                                            .addComponent(jLabel208)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(tfIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel212, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel15Layout.createSequentialGroup()
                                                .addComponent(jLabel215)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tfnum_SUS))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                                                .addComponent(jLabel213, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tfConjugal, 0, 1, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                                                .addComponent(jLabel211)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(tfEscolaridade, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(32, 32, 32))
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addComponent(jLabel228)
                                        .addGap(163, 163, 163))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(tfDtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfOcupacao, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(21, 21, 21))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel216)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfnome_Mae, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(229, 229, 229)
                                .addComponent(jLabel217)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addComponent(tfuf, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                                .addGap(196, 196, 196)
                                .addComponent(jLabel220)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfLogradouro))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel222)
                                    .addComponent(jLabel221)
                                    .addComponent(jLabel223)
                                    .addComponent(jLabel214)
                                    .addComponent(jLabel224)
                                    .addComponent(jLabel210)
                                    .addComponent(jLabel226))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNumero)
                                    .addComponent(tfComplemento)
                                    .addComponent(tfpontoReferencia)
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tftipo_Deficiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfcor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(tfCEP)))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                                                .addComponent(jLabel219)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                            .addGroup(jPanel15Layout.createSequentialGroup()
                                                .addComponent(jLabel218)
                                                .addGap(10, 10, 10)))
                                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(tfmuni_Residencia)
                                            .addComponent(tfbairro_Residencia, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)))
                                    .addComponent(jButton26))))))
                .addGap(45, 45, 45))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel227, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel209)
                            .addComponent(tfSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel217)
                            .addComponent(tfuf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel208)
                    .addComponent(jLabel218)
                    .addComponent(tfmuni_Residencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel219)
                    .addComponent(tfbairro_Residencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel228)
                    .addComponent(tfDtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel220)
                    .addComponent(jLabel212)
                    .addComponent(tfOcupacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel221)
                    .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel211)
                    .addComponent(tfEscolaridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel222)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel213)
                            .addComponent(tfConjugal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(tfComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel215)
                            .addComponent(tfnum_SUS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel223)
                            .addComponent(tfpontoReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel224)
                            .addComponent(tfCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel214)
                            .addComponent(tftipo_Deficiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel225)
                                    .addComponent(tftelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel210)
                                    .addComponent(tfcor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel216)
                        .addComponent(tfnome_Mae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel226))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jScrollPane1.setViewportView(jPanel15);

        Abas.addTab("Dados da Pessoa Atendida", jScrollPane1);

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));

        jLabel26.setText("Local de ocorrência");

        tflocal_Ocorrencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Residência", "Habitação coletiva", "Via pública", "Ambiente de trabalho", "Escola", "Creche", "Estabelecimento de saúde", "Instituição socioeducativa", "Instituição de longa permanência", "Instituição prisional", "Terreno baldio", "Bar ou similar", "Outros", "Ignorado" }));

        jLabel27.setText("UF");

        jLabel28.setText("Município de ocorrência");

        jLabel29.setText("Bairro de ocorrência");

        jLabel30.setText("Logradouro");

        jLabel31.setText("Número");

        jLabel32.setText("Complemento");

        jLabel33.setText("Zona de ocorrência");

        tfzonaOcorrencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Urbana", "Periurbana", "Rural", "Ignorado" }));

        jLabel34.setText("Ocorreu outras vezes?");

        tfoutras_Vezes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não", "Ignorado" }));

        jLabel35.setText("A lesão foi autoprovocada?");

        tfautoprovocada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não", "Ignorado" }));

        jLabel36.setText("Meio de agressão");

        tfAgressao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arma branca", "Arma de fogo", "Objeto contudente", "Força corporal", "Enforcamento/Sufocamento", "Queimadura", "Outros", "Não se aplica", "Ignorado" }));

        jLabel37.setText("Tipos de violências");

        tftipo_Violencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Física", "Psicológica/Moral", "Negligência/Abandono", "Sexual", "Tráfico de seres humanos", "Trabalho infantil", "Tortura", "Patrimonial", "Outros", "Não se aplica", "Ignorado" }));

        jButton5.setText("Avançar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Voltar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel28)
                                            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(tfUF_Ocorrencia, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE))
                                            .addComponent(tfMuni_Ocorrencia)))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel29)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfBairro_Ocorrencia))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel30)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfLogra_Ocorrencia)))
                                .addGap(155, 155, 155))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel35))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfautoprovocada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfoutras_Vezes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(69, 69, 69))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel37)
                                    .addComponent(jLabel36))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfAgressao, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton5)
                                        .addComponent(tftipo_Violencia, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel26))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tflocal_Ocorrencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfzonaOcorrencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel31)
                                    .addGap(22, 22, 22)
                                    .addComponent(tfnum_Ocorrencia, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel32)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfcomp_Ocorrencia, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfAgressao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfUF_Ocorrencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(tfMuni_Ocorrencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(tfBairro_Ocorrencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tftipo_Violencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfautoprovocada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35))))
                .addGap(4, 4, 4)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(tfLogra_Ocorrencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfnum_Ocorrencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(tfoutras_Vezes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(tfcomp_Ocorrencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfzonaOcorrencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tflocal_Ocorrencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        Abas.addTab("Dados da Ocorrencia", jPanel4);

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));

        jLabel38.setText("Se ocorreu violência sexual, qual o tipo?");

        tftipo_ViolenciaSexual.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Assédio sexual", "Estupro", "Atentado violento ao pudor", "Pornografia infantil", "Exploração sexual", "Outros", "Não se aplica", "Ignorado" }));

        jLabel39.setText("Se ocorreu penetração, qual o tipo?");

        tfPenetracao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Oral", "Anal", "Vaginal", "Não se aplica", "Ignorado" }));

        jLabel40.setText("Consequências da ocorrência detectadas no momento da notificação");

        tfCons_Ocorrencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aborto", "Gravidez", "DST", "Tentativa de suicídio", "Outros", "Ignorado" }));

        jLabel41.setText("Procedimento indicado");

        tfProcedimento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Profilaxia DST", "Profilaxia HIV", "Profilaxia hepatite B", "Coleta de sangue", "Coleta de sêmen", "Coleta de secreção vaginal", "Contracepção de emergência", "Comunicaão de acidente de trabalho", "Aborto previsto em lei", "Não se aplica", "Ignorado" }));

        jButton7.setText("Avançar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Voltar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel39)
                                    .addGap(18, 18, 18)
                                    .addComponent(tfPenetracao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel38)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tftipo_ViolenciaSexual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel40)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCons_Ocorrencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfProcedimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(292, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7)
                        .addGap(25, 25, 25))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(tftipo_ViolenciaSexual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPenetracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(tfCons_Ocorrencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41)
                    .addComponent(tfProcedimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 282, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        Abas.addTab("Violencia Sexual", jPanel5);

        jPanel6.setBackground(new java.awt.Color(204, 255, 204));

        jLabel42.setText("Número de envolvidos");

        tfEnvolvidos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Um", "Dois ou mais", "Ignorado" }));

        jLabel43.setText("Relação coma pessoa atendida");

        tfRelacaoPessoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pai", "Mãe", "Padastro", "Madrasta", "Cônjuge", "Ex-cônjuge", "Namorado(a)", "Ex-namorado(a)", "Amigos/Conhecidos", "Desconhecido", "Cuidador", "Patrão/chefe", "Pessoa com relação", "Institucional", "Não se plica", "Ignorado" }));

        jLabel44.setText("Sexo do provável autor da agressão");

        tfSexoAutor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Ambos os sexos", "Ignorado" }));

        jLabel45.setText("Suspeita de uso de alcool");

        tfAlcool.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não", "Ignorado" }));

        jButton9.setText("Avançar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Voltar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel45)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfAlcool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel43)
                                    .addGap(18, 18, 18)
                                    .addComponent(tfRelacaoPessoa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel44)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfSexoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel42)
                                .addGap(18, 18, 18)
                                .addComponent(tfEnvolvidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(417, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jButton10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton9)
                        .addGap(33, 33, 33))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(tfEnvolvidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(tfRelacaoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(tfSexoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAlcool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 249, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        Abas.addTab("Dados do autor da agressão", jPanel6);

        jPanel7.setBackground(new java.awt.Color(204, 255, 204));

        jLabel46.setText("Evolução do caso");

        tfEvolucao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alta", "Encaminhamento ambulatorial", "Encaminhamento hospitalar", "Evasão/Fuga", "Óbito pela agressão", "Óbito por outras causas", "Ignorado" }));

        jLabel47.setText("Se óbito pela agressão, informar a data");

        jLabel48.setText("Encaminhamento da pessoa atendida para outros setores");

        tfEncaminhamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Conselho tutelar (Criança/adolescente)", "Vara da infância/juventude", "Casa de proteção/abrigo", "Programa sentinela", "Delegacia especializada da mulher", "Delegacia de Prot. da Criança e do Adolescente", "Outras delegacias", "Ministério público", "Centro de referencia da assistência social/CRAS", "IML", "Outros", "Não se aplica", "Ignorado" }));

        jLabel49.setText("Circustância da lesão (confirmada)");

        jLabel50.setText("Classificação final");

        tfClassificacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Suspeito", "Confirmado", "Descartado" }));

        Cadastrar.setText("Cadastrar");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });

        jButton11.setText("Voltar");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        try {
            tfdt_Obito.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Cadastrar)
                .addGap(28, 28, 28))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel49)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel46)
                                .addGap(18, 18, 18)
                                .addComponent(tfEvolucao, 0, 1, Short.MAX_VALUE)
                                .addGap(345, 345, 345))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfEncaminhamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfdt_Obito, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton11)
                            .addComponent(jLabel50))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfClassificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(tfEvolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(tfdt_Obito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEncaminhamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel49)
                .addGap(37, 37, 37)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfClassificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        Abas.addTab("Evolução e Encaminhamento", jPanel7);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Abas, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Abas, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
     
        Encaminhamento enc = new Encaminhamento();
        
        
        // Dados gerais
        fp.setNome(tfnome.getText());
        fp.setDt_Nascimento(tfDtNascimento.getText());
        fp.setDt_Notificacao(tfdt_notificacao.getText());
        fp.setUF(tfUF.getText());
        fp.setMuni_Ocorrencia(tfMuni_notificacao.getText());       
        fp.setUnid_Saude(tfuni_Saude.getText());
        fp.setDt_Ocorrencia(tfdt_Ocorrencia.getText());
        fp.setHr_Ocorrencia(tfhr_Ocorrencia.getText());
        
        // Dados da pessoa atendida
        fp.setIdade(Integer.parseInt(tfIdade.getText()));
        fp.setSexo((String) tfSexo.getSelectedItem());
        fp.setCor((String) tfcor.getSelectedItem());
        fp.setEscolaridade((String) tfEscolaridade.getSelectedItem());
        fp.setOcupacao(tfOcupacao.getText());
        fp.setEstado_Civil((String) tfConjugal.getSelectedItem());
        fp.setTipo_Deficiencia((String) tftipo_Deficiencia.getSelectedItem());
        fp.setNum_Sus(Integer.parseInt(tfnum_SUS.getText()));
        fp.setNome_Mae(tfnome_Mae.getText());
        fp.setTelefone(tftelefone.getText());
        fp.setUF(tfuf.getText());
        fp.setMunic_Residencia(tfmuni_Residencia.getText());
        fp.setBairro_Residencia(tfbairro_Residencia.getText());
        fp.setLogradouro(tfLogradouro.getText());
        fp.setNumero_casa(Integer.parseInt(tfNumero.getText()));
        fp.setComplemento(tfComplemento.getText());
        fp.setPonto_Referencia(tfpontoReferencia.getText());
        fp.setCEP(tfCEP.getText());
        fp.setZona((String) tfZona.getSelectedItem());
        
        // Dados da ocorrência
        fp.setLocal_ocorrencia((String) tflocal_Ocorrencia.getSelectedItem());
        fp.setUfOcorrencia(tfUF_Ocorrencia.getText());
        fp.setMuni_Ocorrencia((tfMuni_Ocorrencia.getText()));
        fp.setBairroOcorrencia(tfBairro_Ocorrencia.getText());
        fp.setLogra_Ocorrencia(tfLogra_Ocorrencia.getText());
        fp.setNum_Ocorrencia(Integer.parseInt(tfnum_Ocorrencia.getText()));
        fp.setComplem_Ocorrencia(tfcomp_Ocorrencia.getText());
        fp.setZona_Ocorrencia((String) tfzonaOcorrencia.getSelectedItem());
        fp.setOutrasVezes((String) tfoutras_Vezes.getSelectedItem());
        fp.setAutoprovocada((String) tfautoprovocada.getSelectedItem());
        fp.setMeio_Agressao((String) tfAgressao.getSelectedItem());
        fp.setTipo_Violencia((String) tftipo_Violencia.getSelectedItem());
        
        // Violência sexual
        fp.setViolenciaSexual((String) tftipo_ViolenciaSexual.getSelectedItem());
        fp.setPenetração((String) tfPenetracao.getSelectedItem());
        fp.setConsequencia_Ocorrencia((String) tfCons_Ocorrencia.getSelectedItem());
        fp.setProcedimento((String) tfProcedimento.getSelectedItem());
        
        // Dados do autor da agressão
        fp.setNum_envolvidos((String) tfEnvolvidos.getSelectedItem());
        fp.setRelacaoPessoa_Atendida((String) tfRelacaoPessoa.getSelectedItem());
        fp.setSexo_Autor((String) tfSexoAutor.getSelectedItem());
        fp.setSuspeita_Alcool((String) tfAlcool.getSelectedItem());
        
        // Evolução e encaminhamento
        fp.setEvolucao((String) tfEvolucao.getSelectedItem());
        fp.setDt_Obito(tfdt_Obito.getText());
        fp.setEncaminhamento((String) tfEncaminhamento.getSelectedItem());
        fp.setClassificacao_Final((String) tfClassificacao.getSelectedItem());
       
        if(fp.getId()!=0){
            fpDAO.atualizar(fp);   
             JOptionPane.showMessageDialog(null,"Caso editado com Sucesso!!!");
        }
        
          else{
        fpDAO.salvar(fp);
        enc.exportarComponente(fp);
        enc.setVisible(true);
        dispose();
        
        JOptionPane.showMessageDialog(null,"Usuario salvo com Sucesso!!!");
          }
        
        
       
        
      
        
    }//GEN-LAST:event_CadastrarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        this.Abas.setSelectedIndex(1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.Abas.setSelectedIndex(3);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      this.Abas.setSelectedIndex(4);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       this.Abas.setSelectedIndex(5);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         this.Abas.setSelectedIndex(1);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
         this.Abas.setSelectedIndex(2);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        this.Abas.setSelectedIndex(3);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        this.Abas.setSelectedIndex(4);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton26jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26jButton3ActionPerformed
       this.Abas.setSelectedIndex(2);
    }//GEN-LAST:event_jButton26jButton3ActionPerformed

    private void jButton27jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27jButton4ActionPerformed
        this.Abas.setSelectedIndex(0);
    }//GEN-LAST:event_jButton27jButton4ActionPerformed

    private void tfdt_notificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdt_notificacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdt_notificacaoActionPerformed

    private void tfhr_OcorrenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfhr_OcorrenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfhr_OcorrenciaActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormGeral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Abas;
    private javax.swing.JButton Cadastrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel208;
    private javax.swing.JLabel jLabel209;
    private javax.swing.JLabel jLabel210;
    private javax.swing.JLabel jLabel211;
    private javax.swing.JLabel jLabel212;
    private javax.swing.JLabel jLabel213;
    private javax.swing.JLabel jLabel214;
    private javax.swing.JLabel jLabel215;
    private javax.swing.JLabel jLabel216;
    private javax.swing.JLabel jLabel217;
    private javax.swing.JLabel jLabel218;
    private javax.swing.JLabel jLabel219;
    private javax.swing.JLabel jLabel220;
    private javax.swing.JLabel jLabel221;
    private javax.swing.JLabel jLabel222;
    private javax.swing.JLabel jLabel223;
    private javax.swing.JLabel jLabel224;
    private javax.swing.JLabel jLabel225;
    private javax.swing.JLabel jLabel226;
    private javax.swing.JLabel jLabel227;
    private javax.swing.JLabel jLabel228;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> tfAgressao;
    private javax.swing.JComboBox<String> tfAlcool;
    private javax.swing.JTextField tfBairro_Ocorrencia;
    private javax.swing.JFormattedTextField tfCEP;
    private javax.swing.JComboBox<String> tfClassificacao;
    private javax.swing.JTextField tfComplemento;
    private javax.swing.JComboBox<String> tfConjugal;
    private javax.swing.JComboBox<String> tfCons_Ocorrencia;
    private javax.swing.JFormattedTextField tfDtNascimento;
    private javax.swing.JComboBox<String> tfEncaminhamento;
    private javax.swing.JComboBox<String> tfEnvolvidos;
    private javax.swing.JComboBox<String> tfEscolaridade;
    private javax.swing.JComboBox<String> tfEvolucao;
    private javax.swing.JTextField tfIdade;
    private javax.swing.JTextField tfLogra_Ocorrencia;
    private javax.swing.JTextField tfLogradouro;
    private javax.swing.JTextField tfMuni_Ocorrencia;
    private javax.swing.JTextField tfMuni_notificacao;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfOcupacao;
    private javax.swing.JComboBox<String> tfPenetracao;
    private javax.swing.JComboBox<String> tfProcedimento;
    private javax.swing.JComboBox<String> tfRelacaoPessoa;
    private javax.swing.JComboBox<String> tfSexo;
    private javax.swing.JComboBox<String> tfSexoAutor;
    private javax.swing.JTextField tfUF;
    private javax.swing.JTextField tfUF_Ocorrencia;
    private javax.swing.JComboBox<String> tfZona;
    private javax.swing.JComboBox<String> tfautoprovocada;
    private javax.swing.JTextField tfbairro_Residencia;
    private javax.swing.JTextField tfcomp_Ocorrencia;
    private javax.swing.JComboBox<String> tfcor;
    private javax.swing.JFormattedTextField tfdt_Obito;
    private javax.swing.JFormattedTextField tfdt_Ocorrencia;
    private javax.swing.JFormattedTextField tfdt_notificacao;
    private javax.swing.JFormattedTextField tfhr_Ocorrencia;
    private javax.swing.JComboBox<String> tflocal_Ocorrencia;
    private javax.swing.JTextField tfmuni_Residencia;
    private javax.swing.JTextField tfnome;
    private javax.swing.JTextField tfnome_Mae;
    private javax.swing.JTextField tfnum_Ocorrencia;
    private javax.swing.JTextField tfnum_SUS;
    private javax.swing.JComboBox<String> tfoutras_Vezes;
    private javax.swing.JTextField tfpontoReferencia;
    private javax.swing.JFormattedTextField tftelefone;
    private javax.swing.JComboBox<String> tftipo_Deficiencia;
    private javax.swing.JComboBox<String> tftipo_Violencia;
    private javax.swing.JComboBox<String> tftipo_ViolenciaSexual;
    private javax.swing.JTextField tfuf;
    private javax.swing.JTextField tfuni_Saude;
    private javax.swing.JComboBox<String> tfzonaOcorrencia;
    // End of variables declaration//GEN-END:variables
}
