import java.util.ArrayList;
import java.util.Comparator;

/*
Creare una classe Student che accetti nel costruttore il parametro name (String e age Int)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un ArrayList con 12 elementi e stamparlo in console.
Mettere in ordine la collezione e stampare il risultato
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<Student>  students = new ArrayList<>();
        students.add(new Student("Charlie", 20));
        students.add(new Student("Alice", 19));
        students.add(new Student("Eve", 21));
        students.add(new Student("Nathan", 22));
        students.add(new Student("Mia",18));
        students.add(new Student("Paul", 20));
        students.add(new Student("David", 19));
        students.add(new Student("Grace", 22));
        students.add(new Student("Frank", 20));
        students.add(new Student("John", 19));
        students.add(new Student("Harry", 23));
        students.add(new Student("Brook", 25));

        students.forEach(System.out::println);

        students.sort(Comparator.comparing(Student::getName));
        System.out.println("ArrayList ordinato in ordine alfabetico: ");
        students.forEach(System.out::println);



    }
}