public class Droid{
    String name;
    int batteryLevel = 100;
  
    public Droid(String droidName){
      name = droidName;
    }
  
    public String toString(){
      return "Hello there. I am "+ name + ".";
    }
  
    public void energyReport(){
      System.out.println("My battery level is at " + batteryLevel + ".");
    }
  
    public void performTask(String task){
      System.out.println(name + " is preforming task: " + task);
      batteryLevel -= 10;
    }
    public static void main(String[] args){
      Droid myDroid = new Droid("Nathan");
      System.out.println(myDroid);
      myDroid.toString();
      myDroid.energyReport();
      myDroid.performTask("shoveling");
      myDroid.energyReport();
    }
  }