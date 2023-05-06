package Exercicio7;

public class Livro {
    public String titulo;
    public String autor;
    public int ano;

    public void imprimiDadosLivro() {
        System.out.println("Título: " +  this.titulo +"\n"+
                "Autor: " + this.autor+ "\n"+
                "Ano: " + this.ano);
    }

}
