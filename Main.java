
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Iterator;

public class Main
{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(6);
        list.add(11);
        for(Iterator<Integer> it = list.iterator(); it.hasNext();){
            Integer i = it.next();
        }
        Bolsa<Integer> bolsa = new Bolsa<Integer>();
        bolsa.add(4);
        bolsa.add(8);
        bolsa.add(16);
        System.out.println(bolsa); 
        for(Iterator<Integer> it = bolsa.iterator(); it.hasNext();){
            System.out.println(it.next()); 
        }
        
    }
}
