class Cars {
    public void carColor() {
        System.out.println("Car colors by models");
    }
}

class Mustang extends Cars {
    public void carColor() {
        System.out.println("Mustang is: Red");
    }
}

class Fiesta extends Cars {
    public void carColor() {
        System.out.println("Fiesta is: Blue");
    }
}

class Main {
    public static void main(String[] args) {
        Cars myCar = new Cars();  // Create a Animal object
        Cars MyMustang = new Mustang();  // Create a Pig object
        Cars Myfiesta = new Fiesta();  // Create a Dog object
        myCar.carColor();
        MyMustang.carColor();
        Myfiesta.carColor();
    }
}