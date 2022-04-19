public class Computer {
    public Computer(String versionOS, String key, String cpuName, String motherBoard, double memory) {
        this.versionOS = versionOS;
        this.key = key;
        this.cpuName = cpuName;
        this.motherBoard = motherBoard;
        this.memory = memory;
    }

    public Computer(String versionOS, String key, String cpuName, String motherBoard, double memory, boolean hasKeyboard, boolean hasScreen) {
        this(versionOS, key, cpuName, motherBoard, memory);
        this.hasScreen = hasScreen;
        this.hasKeyboard = hasKeyboard;
    }

    public String versionOS;
    private final String key;
    public String cpuName;
    public String motherBoard;
    public boolean hasScreen;
    public boolean hasKeyboard;
    public double memory;

    public String getKey() {
        return key;
    }

    public static void boot() {
        System.out.println("Computer is getting started!");
    }

    public static void shutDown() {
        System.out.println("Computer is getting shut down!");
    }

    public static void runProgram(String programName) {
        System.out.println("Computer is running " + programName + "!");
    }


    @Override
    public String toString() {
        return "Computer{" +
                "key='" + key + '\'' +
                ", cpuName='" + cpuName + '\'' +
                ", motherBoard='" + motherBoard + '\'' +
                ", hasScreen=" + hasScreen +
                ", hasKeyboard=" + hasKeyboard +
                ", memory=" + memory +
                '}';

    }
}
