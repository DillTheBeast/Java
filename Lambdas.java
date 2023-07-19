public class Lambdas {
    public static void main(String[] args) {
        //Lambdas = only with interfaces
        //Using printables file and cat file

        Cat myCat = new Cat();
        myCat.print();
        // or
        printThing(myCat);

    }

    static void printThing(Printable thing) {
        thing.print();
    }
}
