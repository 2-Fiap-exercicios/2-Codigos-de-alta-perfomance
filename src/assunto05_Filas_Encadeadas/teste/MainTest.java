package assunto05_Filas_Encadeadas.teste;

import assunto05_Filas_Encadeadas.filas.FilaInt;

public class MainTest {
    public static void main(String[] args) {
        FilaInt fila = new FilaInt();
        fila.init();
        fila.enqueue(5);
        fila.enqueue(10);
        if (!fila.isEmpty()) {
            System.out.println(fila.dequeue());
        }
        else {
            System.out.println("fila vazia");
        }
    }
}
