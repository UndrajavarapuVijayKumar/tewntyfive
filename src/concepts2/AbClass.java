package concepts2;

public abstract class AbClass {
    public abstract void print();  // Abstract method

    public void show() {  // Concrete method
        System.out.println("show from abstract!");
    }
}

class Class2 {  // 🔹 Renamed class to "Class2"
    AbClass abc = new AbClass() {
        @Override
        public void print() {
            System.out.println("print method!");
        }
    };

    Class2() {  // 🔹 Constructor name should match the class name exactly
        abc.print();
    }

    public static void main(String[] args) {
        new Class2();  // ✅ Creates an instance and calls the constructor
    }
}
