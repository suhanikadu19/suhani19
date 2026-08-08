public class Car {
    // Static nested class
    static class Engine {
        private String engineType;

        public Engine(String engineType) {
            this.engineType = engineType;
        }

        public void displaySpecs() {
            System.out.println("Engine Type: " + engineType);
        }
    }
}


    public static void main(String[] args) {
        // Instantiate static nested class without creating a Car object
        Car.Engine v8Engine = new Car.Engine("V8 Turbo");
        v8Engine.displaySpecs();
    }

    

