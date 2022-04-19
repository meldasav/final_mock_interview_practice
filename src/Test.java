public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer("12.2.1", "45TG-56YH", "Intel", "Asus", 512.0);
        computer.hasScreen = false;
        computer.hasKeyboard = true;

        System.out.println(computer);

        Computer.boot();
        Computer.runProgram("Slack");
        Computer.runProgram("Zoom");
        Computer.shutDown();

    }
}