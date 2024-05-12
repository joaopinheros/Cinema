package com.cinema.produto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * Representa um produto disponível no cinema.
 */
public class Produto {
    private int produtoId; // Identificador único do produto
    private String nome; // Nome do produto
    private String categoria; // Categoria do produto
    private Date dataFabricacao; // Data de fabricação do produto
    private Date dataValidade; // Data de validade do produto
    private double precoUnitario; // Preço unitário do produto
    private int quantidadeEstoque; // Quantidade em estoque do produto
    private static int count = 1; // Contador para gerar IDs únicos
    private static Scanner sc = new Scanner(System.in);
    private static List<Produto> produtos = new ArrayList<>(); // Lista de produtos

    /**
     * Construtor para criar um novo produto com todos os detalhes especificados.
     *
     * @param produtoId         O identificador único do produto.
     * @param nome              O nome do produto.
     * @param categoria         A categoria do produto.
     * @param dataFabricacao    A data de fabricação do produto.
     * @param dataValidade      A data de validade do produto.
     * @param precoUnitario     O preço unitário do produto.
     * @param quantidadeEstoque A quantidade em estoque do produto.
     */
    public Produto(int produtoId, String nome, String categoria, Date dataFabricacao, Date dataValidade,
                   double precoUnitario, int quantidadeEstoque) {
        this.produtoId = produtoId;
        this.nome = nome;
        this.categoria = categoria;
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = dataValidade;
        this.precoUnitario = precoUnitario;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    /**
     * Construtor vazio padrão.
     */
    public Produto() {
        // Utilizado apenas para criar instâncias vazias, se necessário
    }

    // Getters e Setters

    /**
     * Retorna o nome do produto.
     *
     * @return O nome do produto.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do produto.
     *
     * @param nome O novo nome do produto.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna a categoria do produto.
     *
     * @return A categoria do produto.
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Define a categoria do produto.
     *
     * @param categoria A nova categoria do produto.
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Retorna a data de fabricação do produto.
     *
     * @return A data de fabricação do produto.
     */
    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    /**
     * Define a data de fabricação do produto.
     *
     * @param dataFabricacao A nova data de fabricação do produto.
     */
    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    /**
     * Retorna a data de validade do produto.
     *
     * @return A data de validade do produto.
     */
    public Date getDataValidade() {
        return dataValidade;
    }

    /**
     * Define a data de validade do produto.
     *
     * @param dataValidade A nova data de validade do produto.
     */
    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    /**
     * Retorna o preço unitário do produto.
     *
     * @return O preço unitário do produto.
     */
    public double getPrecoUnitario() {
        return precoUnitario;
    }

    /**
     * Define o preço unitário do produto.
     *
     * @param precoUnitario O novo preço unitário do produto.
     */
    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    /**
     * Retorna a quantidade em estoque do produto.
     *
     * @return A quantidade em estoque do produto.
     */
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    /**
     * Define a quantidade em estoque do produto.
     *
     * @param quantidadeEstoque A nova quantidade em estoque do produto.
     */
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    /**
     * Retorna o identificador único do produto.
     *
     * @return O identificador único do produto.
     */
    public int getProdutoId() {
        return produtoId;
    }

    /**
     * Define o identificador único do produto.
     *
     * @param produtoId O novo identificador único do produto.
     */
    public void setProdutoId(int produtoId) {
        this.produtoId = produtoId;
    }

    /**
     * Retorna uma representação em string do objeto Produto.
     *
     * @return Uma string que representa o objeto Produto.
     */
    @Override
    public String toString() {
        return "Produto{" +
                "produtoId=" + produtoId +
                ", nome='" + nome + '\'' +
                ", categoria='" + categoria + '\'' +
                ", dataFabricacao=" + dataFabricacao +
                ", dataValidade=" + dataValidade +
                ", precoUnitario=" + precoUnitario +
                ", quantidadeEstoque=" + quantidadeEstoque +
                '}';
    }

    /**
     * Método para cadastrar um novo produto.
     *
     * @return Uma string representando o produto cadastrado.
     */
    public static String cadastrarProduto(Produto produto) {
        System.out.println("Digite o nome do produto:");
        String nome = sc.nextLine();

        System.out.println("Digite a categoria do produto:");
        String categoria = sc.nextLine();

        Date dataFabricacao = readDate("data de fabricação (no formato dd/MM/yyyy):");

        Date dataValidade = readDate("data de validade (no formato dd/MM/yyyy):");

        System.out.println("Digite o preço unitário do produto:");
        double precoUnitario = Double.parseDouble(sc.nextLine());

        System.out.println("Digite a quantidade em estoque do produto:");
        int quantidadeEstoque = Integer.parseInt(sc.nextLine());

        Produto novoProduto = new Produto(count, nome, categoria, dataFabricacao, dataValidade,
                precoUnitario, quantidadeEstoque);
        produtos.add(novoProduto);
        count++;

        return novoProduto.toString();
    }

    private static Date readDate(String prompt) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date data = null;

        while (data == null) {
            try {
                System.out.println("Digite a " + prompt);
                data = dateFormat.parse(sc.nextLine());
            } catch (ParseException e) {
                System.out.println("Data inválida. Digite novamente.");
            }
        }

        return data;
    }
}
