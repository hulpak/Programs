import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Comparator<Employeer> comp = new EmployeerAverageCompare().thenComparing(new EmployeerComparator());
        TreeSet<Employeer> tree = new TreeSet<>(comp);
        tree.add(new Fixed(1, "Vasyl", "Hulpak", 450));
        tree.add(new Fixed(2, "Valeriy", "Istratiy", 450));
        tree.add(new Hourly(3, "Liumila", "Hulpak", 25));
        tree.add(new Hourly(4, "Albert", "Ciupak", 25));
        tree.add(new Fixed(5, "Anatoliy", "Mercuriy", 750));
        tree.add(new Fixed(7, "Serhiy", "Tkach", 5000));
        tree.add(new Fixed(6, "Roman", "Zayat", 950));

        System.out.println(" \t__ Sorting by Salary, if salary is equal then sorting by name __ ");
        for (Employeer e : tree) {
            System.out.println(e.information());       }

        System.out.println("  ");
        System.out.println("\t __ Problem A __");
        Iterator<Employeer> it = tree.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (i != 5) {
                System.out.println(it.next().information());
                i++;
            } else break;
        }

        System.out.println();
        System.out.println("\t __ Problem B __");
        Iterator<Employeer> it1 = tree.iterator();
        i = 0;
        int k =3;
        while (it1.hasNext()) {
            if (i ==tree.size()- k) {
                System.out.println(it1.next().information());
                --k;
                i++;
            }else
            {
                it1.next();
                i++;
            }
        }

        //Serializable input
        try(ObjectOutputStream ob = new ObjectOutputStream(new FileOutputStream("Employeer.txt")))
        {
             ob.writeObject(tree);
             }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        TreeSet<Employeer> newP= null;
        //Serializable output
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Employeer.txt")))
        {
                    newP=(TreeSet<Employeer>)ois.readObject();
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("\t ___ Serializable ___");
            for(Employeer p1:newP){
                System.out.println(p1.information());
}
    }
}

