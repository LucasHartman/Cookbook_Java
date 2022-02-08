public class SwitchEx1 {
    public static void main(String[] args) {

    int colorOfRainbow = 10;
    final int red = 5;          // must be constant (final)

    switch(colorOfRainbow) {
        default:
        System.out.print("Home");
        break;
        case red:
        System.out.print("Away");
        }

    }
}