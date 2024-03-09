public class HelloWorld {
    private int roll;
    private String name;
    private boolean passed;
    public HelloWorld(){ /* Constructor */
        roll = 100;
        name = "CSE";
        passed = true;
    }
 public HelloWorld(int roll, String name, boolean passed ) { /* Constructor */
        this.roll = roll;
        this.name = name;
        this.passed = passed;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getRoll() {
        return roll;
    }

    public boolean isPassed() {
        return passed;
    }

    public static void main(String[] args) {
        HelloWorld helloworld = new HelloWorld();
        HelloWorld helloworld2 = new HelloWorld(300,"SHU", true);
        helloworld.setName("ICE");
        helloworld.setRoll(400);
        helloworld.setPassed(false);
        System.out.println(helloworld2.getName());
        System.out.println(helloworld.getRoll());
        System.out.println(helloworld2.isPassed());
    }
}
