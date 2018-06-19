public class NoQuarterState implements State {
    GumballMachine gumballMachine;
    int sum =0;
    int total=0;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter(int coin) {

        if (gumballMachine.getMachinetype() == 25 && gumballMachine.getMachine() ==0) {
            checkmachine1(coin);

        }
        else if ( gumballMachine.getMachinetype() == 50 && gumballMachine.getMachine()== 0) {
            checkmachine2(coin);
        }
        else if( gumballMachine.getMachinetype() == 50 && gumballMachine.getMachine() == 1) {
            checkmachine3(coin);
        }
    }

    public void checkmachine1 (int coin){
        if (coin == 25) {
            this.gumballMachine.setHas_quarter(true);
            gumballMachine.setState(gumballMachine.getHasQuarterState());
        } else{
            this.gumballMachine.setHas_quarter(false);
        }
        System.out.println("You inserted a quarter");

        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    public void checkmachine2(int coin) {
        if (coin == 25) {
            System.out.println("hello");
            sum = sum + coin;
            if (sum == 50) {
                this.gumballMachine.setHas_quarter(true);
                gumballMachine.setState(gumballMachine.getHasQuarterState());
                sum = 0;
            } else
                this.gumballMachine.setHas_quarter(false);
        }
        else {
            System.out.println("The system cannot accept other than the quarters");
            sum=0;
        }
    }

    public void checkmachine3 (int coin) {
        if (coin == 25 || coin == 10 || coin == 5) {
            total = total + coin;
            if (total == 50) {
                this.gumballMachine.setHas_quarter(true);
                gumballMachine.setState(gumballMachine.getHasQuarterState());
                total=0;
            } else
                this.gumballMachine.setHas_quarter(false);
        }
        else{
            System.out.println("The system cannot accept other than quarter, nickels and dimes");
            total=0;
        }
    }

    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
    }

    public void dispense() {
        System.out.println("You need to pay first");
    }

    public String toString() {
        return "waiting for quarter";
    }
}