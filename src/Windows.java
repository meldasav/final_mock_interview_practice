public class Windows extends Computer{
    public Windows(String versionOS, String key, String cpuName, String motherBoard, double memory) {
        super(versionOS, key, cpuName, motherBoard, memory);
    }

    public Windows(String versionOS, String key, String cpuName, String motherBoard, double memory,
                   boolean hasKeyboard, boolean hasScreen, boolean hasPaint, boolean hasViruses) {
        super(versionOS, key, cpuName, motherBoard, memory, hasKeyboard, hasScreen);
        this.hasPaint = hasPaint;
        this.hasViruses = hasViruses;
    }

    // variables
    public static final boolean hasStart = true;
    public static final boolean hasTaskManager = true;
    public boolean hasPaint;
    public boolean hasViruses;

    //methods

    public void cleanViruses(){
        System.out.println("Cleaning the viruses!");
    }

    @Override
    public String toString() {
        return "Windows{" +
                "versionOS='" + versionOS + '\'' +
                ", cpuName='" + cpuName + '\'' +
                ", motherBoard='" + motherBoard + '\'' +
                ", hasScreen=" + hasScreen +
                ", hasKeyboard=" + hasKeyboard +
                ", memory=" + memory +
                ", hasPaint=" + hasPaint +
                ", hasViruses=" + hasViruses +
                '}';
    }
}


