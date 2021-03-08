package third_week.packages;

public class dziedziczenieExample {

    public static class Vehicle {
        protected final int tankCapacity = 60;
        protected int fuelLevel = 40;

        public void fillTank() {
            int toFill = tankCapacity - fuelLevel;
            fillTank(toFill);
        }

        public void fillTank(int toFill){
            if (toFill + fuelLevel > tankCapacity){
                System.out.println("Nie moge wypelnic baku " + toFill + " litrami.");
            }
            else{
                fuelLevel += toFill; //uzupełnienie paliwa ilością "toFill"
                System.out.println("Wypelniono bak " + toFill + " litrami.");
            }
        }
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        System.out.println("Pojemność baku: " + vehicle.tankCapacity);
        System.out.println("Poziom paliwa: " + vehicle.fuelLevel);
        vehicle.fillTank(); //uzupełnienie paliwa do maksa
        System.out.println("Poziom paliwa: " + vehicle.fuelLevel);
        vehicle.fillTank(10); //nieudana próba dolania paliwa

    }

}
