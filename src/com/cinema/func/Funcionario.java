package com.cinema.func;

/**
 * Representa um funcionário do cinema.
 */
public class Funcionario {

    private int idFuncionario; // ID único do funcionário
    private String nome; // Nome do funcionário
    private String usuario; // Nome de usuário para login
    private String senha; // Senha para login

    /**
     * Construtor para inicializar um Funcionario com informações completas.
     *
     * @param idFuncionario O ID único do funcionário
     * @param nome O nome do funcionário
     * @param usuario O nome de usuário para login
     * @param senha A senha para login
     */
    public Funcionario(int idFuncionario, String nome, String usuario, String senha) {
        this.idFuncionario = idFuncionario;
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
    }

    /**
     * Construtor padrão que inicializa um Funcionario com valores padrão.
     * Nota: não é recomendado usar esse construtor diretamente.
     */
    public Funcionario() {
        // Os valores padrão serão null para Strings e 0 para int (para idFuncionario)
    }

    /**
     * Obtém o ID do funcionário.
     *
     * @return O ID do funcionário
     */
    public int getIdFuncionario() {
        return idFuncionario;
    }

    /**
     * Define o ID do funcionário.
     *
     * @param idFuncionario O novo ID do funcionário
     */
    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    /**
     * Obtém o nome do funcionário.
     *
     * @return O nome do funcionário
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do funcionário.
     *
     * @param nome O novo nome do funcionário
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o nome de usuário para login.
     *
     * @return O nome de usuário
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define o nome de usuário para login.
     *
     * @param usuario O novo nome de usuário
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Obtém a senha do funcionário.
     *
     * @return A senha do funcionário
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Define a senha do funcionário.
     *
     * @param senha A nova senha do funcionário
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * Retorna uma representação em string do objeto Funcionario.
     *
     * @return Uma string representando o Funcionario
     */
    @Override
    public String toString() {
        return "Funcionario{" +
                "idFuncionario=" + idFuncionario +
                ", usuario='" + usuario + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
