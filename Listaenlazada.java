
package listaenlazada;

/**
 *
 * @author Alejandra Trejo
 */
public class Listaenlazada {

    private nodo cabeza;
    private int tamaño;
   
    Listaenlazada(){
        cabeza =null;
        tamaño = 0;
    }
    void agregardelante (Object O){
        if(cabeza ==null){
            cabeza = new nodo (O);
        } else {
            nodo temp= cabeza;
            nodo nuevo = new nodo (O);
            nuevo.agregar(temp);
            cabeza = nuevo ;
        }
        tamaño++;
    }
    /**
     * @param args the command line arguments
     */
    Object ver(int indice){
        nodo temp= cabeza;
        
        for(int i=0; i < indice ;i++){
            temp=temp.versiguiente();
        }
        return temp.verdatos();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Listaenlazada milista = new Listaenlazada();
        milista.agregardelante(4);
        milista.agregardelante(2);
        milista.agregardelante(0);
        milista.agregardelante(1);
        milista.agregardelante(7);
        System.out.println(milista.ver(1));
    }

   

    
}
