package operacoessobreconjuntos;

import java.util.ArrayList;

public class Pertinencia {

    //Verifica se o conjunto A esta contido em B
    public static boolean Pertence(ArrayList a, ArrayList b) {
        int tamA = a.size(), tamB = b.size();

        //Caso o conjunto A for menor que B já não está contido.
        if (tamA > tamB) {
            return false;
        }
        int aux = 0;

        //Percorre o todos os elementos do conjunto, casa esta contido no outro conjunto o aux é incrementado
        for (int i = 0; i < tamA; i++) {
            if (b.contains(a.get(i)) == true) {
                aux++;
            }
        }

        //Se o aux tiver o mesmo tamanho que o conjunto A o conjunto A esta contido em B
        if (aux == tamA) {
            return true;
        }
        return false;
    }

    //Verifica se um valor inteiro pertence ao conjunto B, se sim retorna true, se não retorna false.
    public static boolean Pertence(int a, ArrayList b) {
        int tamB = b.size();
        for (int i = 0; i < tamB; i++) {
            if (a == b.get(i)) {
                return true;
            }
        }
        return false;
    }

    //Verifica se um valor float pertence ao conjunto B, se sim retorna true, se não retorna false.
    public static boolean Pertence(float a, ArrayList b) {
        int tamB = b.size();
        for (int i = 0; i < tamB; i++) {
            if (a == b.get(i)) {
                return true;
            }
        }
        return false;
    }

    //Verifica se uma string pertence ao conjunto B, se sim retorna true, se nao retorna false.
    public static boolean Pertence(String a, ArrayList b) {
        int tamB = b.size();
        for (int i = 0; i < tamB; i++) {
            if (a.equals(b.get(i))) {
                return true;
            }
        }
        return false;
    }

    //Verifica se um caracter pertence ao conjunto B, se sim retorna true, se nao retorna false.
    public static boolean Pertence(char a, ArrayList b) {
        int tamB = b.size();
        for (int i = 0; i < tamB; i++) {
            if (a == b.get(i)) {
                return true;
            }
        }
        return false;
    }
}