package set.ex02;

import java.util.Objects;

public class LinguagemF implements Comparable<LinguagemF> {
    private String nome,ide;
    private int anoDecriacao;

    public LinguagemF(String nome, String ide, int anoDecriacao) {
        this.nome = nome;
        this.ide = ide;
        this.anoDecriacao = anoDecriacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    public int getAnoDecriacao() {
        return anoDecriacao;
    }

    public void setAnoDecriacao(int anoDecriacao) {
        this.anoDecriacao = anoDecriacao;
    }

    @Override
    public int compareTo(LinguagemF o) {
        return Integer.compare(this.anoDecriacao,o.getAnoDecriacao());//Comparação numérica
//        return this.ide.compareTo(o.ide);//Comparação da Ide
//        return this.nome.compareTo(o.getNome());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemF that = (LinguagemF) o;
        return anoDecriacao == that.anoDecriacao && Objects.equals(nome, that.nome) && Objects.equals(ide, that.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, ide, anoDecriacao);
    }

    @Override
    public String toString() {
        return "\n======Linguagens De Programação========\n" +
                "\n Nome da Linguagem: " + nome +
                "\n IDE utilizada: " + ide  +
                "\n Ano de Criação: " + anoDecriacao + "\n";
    }
}
/*class ComparatorIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        return lf1.ide.compareToIgnoreCase(lf2.ide);
    }
}

class ComparatorAnoDeCriacaoENome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        int anoDeCriacao = Integer.compare(lf1.anoDeCriacao, lf2.anoDeCriacao);
        if (anoDeCriacao != 0) return anoDeCriacao;
        return lf1.nome.compareToIgnoreCase(lf2.nome);
    }
}

class ComparatorNomeAnoDeCriacaoIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        int nome = lf1.nome.compareToIgnoreCase(lf2.nome);
        int anoDeCriacao = Integer.compare(lf1.anoDeCriacao, lf2.anoDeCriacao);
        if (nome != 0) return nome;
        if (anoDeCriacao != 0) return anoDeCriacao;
        return lf1.ide.compareToIgnoreCase(lf2.ide);
    }
}*/