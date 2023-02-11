package d8_interface;

import java.util.concurrent.Callable;

public class Peripherals implements ComputerInterface{
    @Override
    public void USB() {
        System.out.println("no");
    }

    @Override
    public void HDMI() {
        System.out.println("no");

    }

    @Override
    public void DP() {
        System.out.println("no");

    }

    @Override
    public void type_c() {
        System.out.println("yes");

    }

    public static void main(String[] args) {
        System.out.println(ComputerInterface.COMPUTER_NAME);
        ComputerInterface peripherals = new Peripherals();
        peripherals.USB();
        peripherals.HDMI();
        peripherals.DP();
        peripherals.type_c();

        ComputerInterface.show();
        peripherals.def();
    }
}
