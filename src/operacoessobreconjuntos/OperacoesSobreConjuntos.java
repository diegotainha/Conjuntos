package operacoessobreconjuntos;

import java.util.ArrayList;

public class OperacoesSobreConjuntos {

    public static void main(String[] args) {

        ArrayList a = new ArrayList();
        a.add(1);
        a.add(7);
        a.add(3);
        a.add(5);
        a.add(10);

        ArrayList b = new ArrayList();
        b.add(1);
        b.add(3);
        b.add(5);
        b.add(7);
        b.add(9);

//        System.out.println("\nPertinência:");
//        System.out.println("Conjunto 'A' pertence a 'B'?\n" + Pertinencia.Pertence(a, b));  

//        System.out.println("\nContinência entre Conjuntos:");
//        System.out.println("Conjunto 'A' está no conjutno 'B'?\n" + Continencia.estahContido(a, b));

//        System.out.println("\nContinência entre valor e conjunto:");
//        System.out.println("Valor valor está no conjutno?\n" + Continencia.estahContido('a', b));

//        System.out.println("\nIgualdade:");
//        System.out.println("Conjuntos são iguais?\n" + OutrasOperacoes.Igualdade(a, b));

//        System.out.println("\nCardinalidade:");
//        System.out.println("Quantidade de subconjuntos\n" + OutrasOperacoes.Cardinalidade(a));    

//        System.out.println("\nUnião:");
//        System.out.println("União:\n" + OutrasOperacoes.Uniao(a, b));

//        System.out.println("\nInterseção:");
//        System.out.println("Conjunto Intersacao:\n" + OutrasOperacoes.Intersecao(a, b));

//        System.out.println("\nComplemento:");
//        System.out.println("Complemento: " + OutrasOperacoes.Complemento(a, b));

//        System.out.println("\nDiferença:");
//        System.out.println("Diferença: " + OutrasOperacoes.Diferenca(a, b));

//        System.out.println("Interseção:");
//        System.out.println("Interseção: " + OutrasOperacoes.Intersecaos(a,b));

        System.out.println("\nProduto Cartesiano:");
        System.out.println(OutrasOperacoes.ProdutoCartesiano(a, b));

    }
}