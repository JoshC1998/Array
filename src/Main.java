public class Main {
    public static void main(String[] args) {

        String[] cars = {"Camaro","Corvette","Tesla"};

        cars[0] = "Mustang";

        System.out.println(cars[1]);

        String [] Gyms = new String[3];

        Gyms[0] = "LA Fitness";
        Gyms[1] = "Planet Fitness";
        Gyms[2] = "Equinox";

        System.out.println(Gyms[0]);

        for(int i = 0; i<cars.length; i++){
            System.out.println(cars[i]);
        }
    }
}
