package constructor;
class Construtor {

    // constructor With Two parameters
    String n1;
    int n2;

    Construtor(String name, int age) {
        n1 = name;
        n2 = age;
        System.out.println("Name : " + n1 + "Age" + age);
    }

    // constructor With Three parameters but starting with int so it is different
    // from other
    int weight;
    int height;
    String ID;

    Construtor(int weight, int height, String ID) {

        this.weight = weight;
        this.height = height;
        this.ID = ID;

        System.out.println("\nWeight : " + weight + "\nHeight : " + height + "\nID : " + ID);
    }

    // constructor With Three parameters but starting with string so it is different
    // from other
    String name1;
    int marks;
    int age1;

    Construtor(String name1, int marks, int age1) {
        System.out.println("Name : " + name1 + "\nMarks : " + marks + "\nAge : " + age1);
    }

    // default
    Construtor() {
        System.out.println("Im Default coonstructor ");
    }
}

class Constructor {
    public static void main(String[] args) {
        Construtor s1 = new Construtor("paari ", 21);
        Construtor s2 = new Construtor();
        Construtor s3 = new Construtor(56, 156, "22105020");
        Construtor s4 = new Construtor("nadeem", 0, 16);
    }
}
