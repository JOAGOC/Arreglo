/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angel
 */
public class ArrayEntero {
    private int tam, tope = 0;
    private int A[];
    private boolean orden;

    public ArrayEntero(int tam) {
        this.tam = tam;
        A = new int[tam];
    }

    public void inicializar() {
        for (int i = 0; i < tam; i++)
            A[i] = (int) (Math.random() * 100);
        tope = tam;
    }

    public void mostrar() {
        for (int i = 0; i <= tope; i++)
            System.out.print("[" + A[i] + "]\n");
    }

    public static void main(String[] args) {
        ArrayEntero a = new ArrayEntero(8);
        a.inicializar();
        a.mostrar();
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public int getTope() {
        return tope;
    }

    public void setTope(int tope) {
        this.tope = tope;
    }

    public int[] getA() {
        return A;
    }

    public void setA(int[] A) {
        this.A = A;
    }

    public boolean lleno() {
        return tope == tam;
    }

    public boolean vacio() {
        return tope == 0;
    }

    public void insertar(int v) throws Exception {
        try {
            A[tope++] = v;
        } catch (IndexOutOfBoundsException e) {
            tope--;
            throw new Exception("El arreglo está lleno");
        }
    }

    public void sacar() throws Exception {
        try {
            if (vacio())
                throw new Exception();
            else
                tope--;
        } catch (Exception e) {
            throw new Exception("El arreglo está vacío");
        }
    }

    public long ordenar() {//(6n^2-9n+7)
        long startTime = System.nanoTime(); // 1
        int x = tope - 1;// 1
        if (orden = !orden) // 1
            //         1     n  (n-1)
            for (int i = 0; i < x; i++) {
                //         2        n      (n-1)
                for (int j = i+1; j < tope; j++) { //m = 
                    if (A[i] < A[j]) //1
                    {
                        int xd = A[i];//1
                        A[i] = A[j];//1
                        A[j] = xd;//1
                    }//4(n-1)=4n-4=>4n-4+2n+1=  6n-3 => (n-1)(6n-3) + 2n = (6n^2-9n+3)+(4) =>  = 6n^2-9n+7
                }
            }
        else
            for (int i = 0; i < x; i++) {
                for (int j = i+1; j < tope; j++) {
                    if (A[i] > A[j]) {
                        int xd = A[i];
                        A[i] = A[j];
                        A[j] = xd;
                    }
                }
            }
        return System.nanoTime() - startTime; //1
    }
}
