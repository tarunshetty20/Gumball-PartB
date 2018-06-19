public class Main {

    public static void main(String[] args) {

        ///// Pass parameters (number_of_balls, 25, 0) for the first gumball machine
        ///// Pass parameters (number_of_balls, 50, 0) for the second gumball machine
        ///// Pass parameters (number_of_balls, 50, 1) for the third gumball machine

        GumballMachine gumballMachine = new GumballMachine(100,50,1);
        //Pass parameters and check for the first machine
//        gumballMachine.insertQuarter(25);
//        gumballMachine.turnCrank();

        //Pass parameters and check for the second machine
//        gumballMachine.insertQuarter(25);
//        gumballMachine.insertQuarter(25);
//        gumballMachine.turnCrank();

        //Pass parameters and check for the third machine
        gumballMachine.insertQuarter(25);
        gumballMachine.insertQuarter(25);
        gumballMachine.turnCrank();


    }
}