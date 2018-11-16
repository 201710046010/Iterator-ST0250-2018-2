
/**
 * Write a description of class Bolsa here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
    import java.util.ArrayList;
    import java.util.Iterator;
    
public class Bolsa<T> {

       private ArrayList<T> dato;
       
       public Bolsa(){
           dato = new ArrayList<T>();
        }
       
       public void add(T e){
           dato.add(e);
        }
        
       public String toString(){
           return dato.toString();
        }
       
       public class BolsaIterator<T> implements Iterator<T> {
          
          private int index;
          
          public BolsaIterator(){
              index = 0;
            }
           
          public boolean hasNext(){
              return index < dato.size();
          }
          
          public T next(){
              return (T) dato.get(index++);
          }
          
          public Iterator<T> iterator(){
              return new BolsaIterator<T>();
          }
          
       }
}

    

