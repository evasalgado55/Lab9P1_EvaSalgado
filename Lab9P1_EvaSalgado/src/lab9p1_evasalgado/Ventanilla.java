
package lab9p1_evasalgado;

import java.util.*;

public class Ventanilla {
    
    static Scanner leer = new Scanner(System.in);
    static Random rand = new Random();
    
    public ArrayList<Integer> colaPrioridad = new ArrayList<Integer>();
    
    public ArrayList<Integer> colaRegular = new ArrayList<Integer>();

    public Ventanilla() {

    }

    public ArrayList<Integer> getColaPrioridad() {
        return colaPrioridad;
    }

    public void setColaPrioridad(ArrayList<Integer> colaPrioridad) {
        this.colaPrioridad = colaPrioridad;
    }

    public ArrayList<Integer> getColaRegular() {
        return colaRegular;
    }

    public void setColaRegular(ArrayList<Integer> colaRegular) {
        this.colaRegular = colaRegular;
    }
    
    

   
    public void corrersimulacion(){
        System.out.println("Ingrese el numero de clientes a generar: ");
        int cantclient = leer.nextInt();
        System.out.println("Ingrese el numero de escritorios disponibles: ");
        int canttable = leer.nextInt();
        System.out.println("Tiempo total: ");
        int time = leer.nextInt();
        
        int iteracion = 1;
        for(int i =0;i<=time;i++){
            
        int[] temp = ventanilla(cantclient);
        System.out.println("Iteracion: "+iteracion);
        for(int j=0;j<temp.length;j++){
            
            System.out.print(temp[j]+" ");
             System.out.println(encontrarventanilladisponible());
            colaPrioridad.toString();
            colaRegular.toString();
        }  
        iteracion += 1;
        System.out.println();
       
      } 
    }//can´t
  
    public int[] ventanilla(int numcola){
        int [] temp = new int[numcola];
        
        for(int i=0;i<numcola;i++){
            temp[i] = numcola;
            colaPrioridad.toString();
            colaRegular.toString();
           
            
        } 
        return temp;
    }   
    public char clientesenventanilla (int clients){
        int num1 = agregarClienteRegular();
        int num2 = agregarClientePreferencial();
        char clientes = 0;
        int client =0;
        if(num1==1){
           clientes ='['+'R'+']'; 
           System.out.print(clientes);
        } else if(num2==0){
            clientes ='['+'P'+']';
            client = clientes;
            System.out.print(clientes);
        } else {
            clientes = ' ';
            client = clientes;
            System.out.print(clientes);
        }
        return clientes;
    } 
    public int agregarClienteRegular(){
       int num = 1;
       return num;
    }
    public int agregarClientePreferencial(){
        int num = 0;
        return num;
    }  
    public int encontrarventanilladisponible(){
        int dispo = actualizarVentanillas();
        for(int i=1;i<=dispo;i++){
            if (dispo==1){
               dispo = i; 
               System.out.print(dispo);
            } else{
                dispo -= 1;
                System.out.print(dispo);
            }
        }
        return dispo;
    }
    public int actualizarVentanillas(){
       int numregular = agregarClienteRegular();
       int numprioridad = agregarClientePreferencial();
       int numero=0;
                if(numregular==1){
               numero= rand.nextInt(5);
            } else if(numprioridad==0) {
              numero = rand.nextInt(5);
            }
        
       return numero;
    } 
} 
