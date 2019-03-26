
package listaenlazada;

/**
 *
 * @author Alejandra Trejo
 */
public class nodo {
    private nodo siguientes;
    private Object datos;
        nodo(Object datos){
            this.datos= datos;
            this. siguientes = null;
        }
   

 nodo versiguiente(){
     return this.siguientes;
 }    
 void agregar (nodo N){
     this.siguientes=N;
 }
 Object verdatos (){
     return this.datos;
 }


    

    
}
