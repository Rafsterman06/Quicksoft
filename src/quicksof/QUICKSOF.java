
package quicksof;

/**
 *
 * @author f
 */
public class QUICKSOF {


int vector[]={1,2,3,4,5,6,4,5,6,7,8,9,1,2,3,7,8,9};

public void quick(int[] arreglo, int primero, int ultimo){
    int i,j,pivote,auxiliar;
    i=primero;
    j=ultimo;
    pivote=arreglo[(primero+ultimo)/2];
    
    do{
        
        while(arreglo[i]<pivote){
            
            i++;
            
        }
        
        while(arreglo[j]>pivote){
            
            j--;
            
        }
    if(i<=j){
    
        auxiliar=arreglo[i];
        arreglo[i]=arreglo[j];
        arreglo[j]=auxiliar;
        i++;
        j--;
        
    }  
    
    
    }while(i<=j);
    
    if(primero<j){
        
        quick(arreglo, primero, j);
    
    }
    
    if(i<ultimo){
    
        quick(arreglo, i, ultimo);
    
    }
    mostrar(arreglo);
}
public void mostrar(int[] arreglo){
    for(int m=0;m<arreglo.length;m++){
        System.out.print(arreglo[m]+" ");
    }
    System.out.println("");
}

    public static void main(String[] args) {
        QUICKSOF sal=new QUICKSOF();
        sal.mostrar(sal.vector);
        sal.quick(sal.vector, 0, sal.vector.length-1);
        
    }
    
}
