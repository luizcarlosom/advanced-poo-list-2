package devices;

public class CeilingFan {
    private int speed;

    public CeilingFan() {
        speed = 0;
    }

    public void high() {
        speed = 3;
        System.out.println("Ventilador na velocidade alta!");
    }

    public void medium() {
        speed = 2;
        System.out.println("Ventilador na velocidade média!");
    }

    public void low() {
        speed = 1;
        System.out.println("Ventilador na velocidade baixa!");
    }

    public void off() {
        speed = 0;
        System.out.println("Deligando ventilador!");
    }

    public void getSpeed() {
        String speedStr;
        switch(speed) {
            case 3:
                speedStr = "alta";
                break;
            case 2:
                speedStr = "média";
                break;
            case 1:
                speedStr = "baixa";
                break;
            default:
                speedStr = "desligado";
        }
        System.out.println("O ventilador atualmente está na velocidade: " + speedStr);
    }
}
