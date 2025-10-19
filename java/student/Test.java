package student;

public class Test {
    public static void main(String[] args) {

        Major math = new Major("45", "math");
        Major cs  = new Major(); // default Computer Science major

        Student s1 = new Student("AIT LHADJ", "Soufiane", "212", "soufiane@", "8489446", math);
        Student s2 = new Student("BOUCHOUK", "Houssam", "33", "houssam@", "48949456", cs);
        Student s3 = new Student("HOUSNI", "Marouane", "33", "marouane@", "4985925");

        cs.displayStudents();
        math.displayStudents();

        System.out.println();
        cs.getOccupiedRate();
    }
}
