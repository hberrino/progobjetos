package Pila;

import java.util.ArrayList;

public class Pila {
    private ArrayList<Objeto> objetos;

    public Pila (){
        this.objetos=new ArrayList<>();
    }
    public void push (Objeto o){
        objetos.add(o);
    }
    public Objeto pop() {
        return objetos.remove(objetos.size() - 1);
    }
    public Objeto top (){
        return objetos.get(objetos.size() - 1);
    }
    public int size() {
        return objetos.size();
    }
    public Pila copy() {
        Pila nueva = new Pila();
        for (Objeto o : objetos) {
            nueva.push(o); // agrega en el mismo orden
        }
        return nueva;
    }
    public Pila reverse() {
        Pila inversa = new Pila();
        for (int i = objetos.size() - 1; i >= 0; i--) {
            inversa.push(objetos.get(i));
        }
        return inversa;
    }
}
