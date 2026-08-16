 class X {
    // Class X Members
    private int xValue;
}

class Y extends X {
    // Class Y Members
    private int yValue;
}

class Z extends Y {
    // Class Z Members (inherits both X and Y)
    private int zValue;
}
public class Main2 {
    public static void main(String[] args) {
        Z objZ = new Z();
        // objZ can access members of X, Y, and Z
    }
}