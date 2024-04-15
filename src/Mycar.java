public class Mycar {
    public static class Car {
        public void m1() {
            System.out.println("car 1");
        }

        public void m2() {
            System.out.println("car 2");
        }
        public String toString() {
            return "vroom";
        }
    }
    public static class Truck extends Car {
        public void m1() {
            System.out.println("truck 1");
        }

        public void m2() {
            super.m1();
        }

        public String toString() {
            return super.toString() + super.toString();
        }
    }


    public static void main(String[] args) {

        Truck mytruck = new Truck();
        System.out.println(mytruck);
        mytruck.m1();
        mytruck.m2();

    }
}
