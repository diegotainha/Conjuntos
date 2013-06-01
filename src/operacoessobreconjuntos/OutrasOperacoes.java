package operacoessobreconjuntos;

import java.util.ArrayList;
import java.util.Collections;

public class OutrasOperacoes {

    public static boolean Igualdade(ArrayList a, ArrayList b) {
        int tamA = a.size(), tamB = b.size();
        if (tamB != tamA) {
            return false;
        }
        ArrayList auxA = new ArrayList();
        auxA.addAll(a);
        ArrayList auxB = new ArrayList();
        auxB.addAll(b);

        Collections.sort(auxA);
        Collections.sort(auxB);

        for (int i = 0; i < tamA; i++) {
            if (auxA.get(i) != auxB.get(i)) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList Complemento(ArrayList u, ArrayList a) {
        int tamU = u.size();
        ArrayList arr = new ArrayList();
        for (int i = 0; i < tamU; i++) {
            if (a.contains(u.get(i)) == false) {
                arr.add(u.get(i));
            }
        }
        return arr;
    }

    public static ArrayList Diferenca(ArrayList a, ArrayList b) {
        int tamA = a.size();
        ArrayList arr = new ArrayList();
        for (int i = 0; i < tamA; i++) {
            if (b.contains(a.get(i)) == false) {
                arr.add(a.get(i));
            }
        }
        return arr;
    }

    public static ArrayList Uniao(ArrayList a, ArrayList b) {
        int tamA = a.size();
        ArrayList arr = new ArrayList();
        arr.add(b);
        for (int i = 0; i < tamA; i++) {
            if (b.contains(a.get(i)) == false) {
                arr.add(a.get(i));
            }
        }
        return arr;
    }

    public static ArrayList Intersecao(ArrayList a, ArrayList b) {
        int tamA = a.size(), tamB = b.size();
        ArrayList arr = new ArrayList();
        for (int i = 0; i < tamA; i++) {
            for (int j = 0; j < tamB; j++) {
                if (a.get(i) == b.get(j)) {
                    arr.add(a.get(i));
                }
            }
        }
        return arr;
    }

    public static int Cardinalidade(ArrayList a) {
        return a.size();
    }

    public static ArrayList ProdutoCartesiano(ArrayList a, ArrayList b) {
        int tamA = a.size(), tamB = b.size();
        ArrayList arr = new ArrayList();

        for (int i = 0; i < tamA; i++) {
            for (int j = 0; j < tamB; j++) {
                arr.add("<" + a.get(i) + ", " + b.get(j) + ">");
            }
        }

        return arr;
    }
}