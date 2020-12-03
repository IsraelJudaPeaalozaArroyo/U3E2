import  java.util.Scanner ;

public  class  Main {
    public  static  void  main ( String [] args ) {
      Metodos lis =  new  Metodos ();  
     booleano  X = verdadero ;
     int opc;
     Lector de escáner =  nuevo  escáner ( System . In);
       while ( X ) {
        Sistema . fuera . println ( " \ n ------- MENÚ ------ " );
         Sistema . fuera . println ( " Seleccione una opcion " );
        Sistema . fuera . println ( " [1] Insertar dato " );
        Sistema . fuera . println ( " [2] Mostrar lista " );
        Sistema . fuera . println ( " [3] Borrar dato " );
        Sistema . fuera . println ( " [4] Salir " );
       
        opc = lector . nextInt ();
        cambiar (opc) {
            caso  1 :
            Elemento de cadena ;
            Scanner  Lector  =  nuevo  escáner ( System . In);
            Sistema . fuera . println ( " inserte un elemento " );
            elemento = Lector . línea siguiente();
            lis . insertar (elemento);
            romper ;
            
            caso  2 :
            lis . Mostrar ();
            romper ;
            
            caso  3 :
            lis . eliminar ();
            romper ;
            
            caso  4 :
            X =  falso ;
            romper ;
            
            por defecto :
                Sistema . fuera . println ( " opcion incorrecta " );
        }
        
        

       } 
    }
    
}
