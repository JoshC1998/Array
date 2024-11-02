public class Main {
    public static void main(String[] args) {

        String[] cars = {"Camaro","Corvette","Tesla"};

        cars[0] = "Mustang";

        //System.out.println(cars[1]);

        String [] Gyms = new String[3];

        Gyms[0] = "LA Fitness";
        Gyms[1] = "Planet Fitness";
        Gyms[2] = "Equinox";

        //System.out.println(Gyms[0]);

        //for(int i = 0; i<cars.length; i++){
            //System.out.println(cars[i]);

       String[][] snacks = new String[3][3];
       snacks[0][0] = "Oreo";
       snacks[0][1] = "Popcorn";
       snacks[0][2] = "Doritos";
       snacks[1][0] = "Donuts";
       snacks[1][1] = "Luncables";
       snacks[1][2] = "Fries";
       snacks[2][0] = "Chicken Nuggets";
       snacks[2][1] = "Protein Bar";
       snacks[2][2] = "Smores";

       for(int i=0; i< snacks.length; i++){
           System.out.println();
           for(int j=0; j< snacks[i].length; j++){
               System.out.println(snacks[i][j]+ "");
           }

       }

        }
    }
