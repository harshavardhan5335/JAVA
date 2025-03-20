class vechicle {
    public void display() {
        System.out.println("Im a vechicle ");

    }
}
class twowheeler extends vechicle {

    public void bike() {
        System.out.println("Im Bike");
    }

    public void cycle() {
        System.out.println("Cycle");
    }
}

class fourwheeler extends vechicle {
    public void car() {
        System.out.println("Car");
    }

    public void jeep() {
        System.out.println("Im jeep");
    }
}

class eightwheeler extends vechicle {
    public void bus() {
        System.out.println("Im bus");
    }

    public void lorry() {
        System.out.println("Im lorry");
    }
}

public class Animals{

    public static void main(String[] args) {
        twowheeler tw = new twowheeler();
        tw.bike();
        tw.cycle();
        

System.out.println("da");


    }
}