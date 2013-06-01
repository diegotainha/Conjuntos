package operacoessobreconjuntos;

import java.util.ArrayList;
import java.util.Collections;

public class Continencia {

    //Verifica se o conjunto A está contido em B
    public static boolean estahContido(ArrayList a, ArrayList b) {
        int tamA = a.size(), tamB = b.size();
        if (tamB < tamA) {
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
                if (auxA.get(i).getClass().isArray()) {
                }
                return false;
            }
        }
        return true;
    }

    public static boolean estahContido(int a, ArrayList b) {
        int tamB = b.size();
        for (int i = 0; i < tamB; i++) {
            if (a == b.get(i)) {
                return true;
            }
        }
        return false;
    }

    public static boolean estahContido(double a, ArrayList b) {
        int tamB = b.size();
        for (int i = 0; i < tamB; i++) {
            if (a == b.get(i)) {
                return true;
            }
        }
        return false;
    }

    public static boolean estahContido(String a, ArrayList b) {
        int tamB = b.size();
        for (int i = 0; i < tamB; i++) {
            if (a.equals(b.get(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean estahContido(char a, ArrayList b) {
        int tamB = b.size();
        for (int i = 0; i < tamB; i++) {
            if (a == b.get(i)) {
                return true;
            }
        }
        return false;
    }
}