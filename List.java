import java.util.ArrayList;

class List {
    
  public static void main(String[] args) {
    
    // Sherlock
    ArrayList<String> sherlocksToDos = new ArrayList<String>();
    
    sherlocksToDos.add("visit the crime scene");
    sherlocksToDos.add("play violin");
    sherlocksToDos.add("interview suspects");
    sherlocksToDos.add("listen to Dr. Watson for amusement");
    sherlocksToDos.add("solve the case");
    sherlocksToDos.add("apprehend the criminal");
    
    System.out.println(sherlocksToDos.get(2));
    sherlocksToDos.set(2, "play saxophone");

    System.out.println(sherlocksToDos.get(2));
    sherlocksToDos.remove("visit the crime scene");
    
    System.out.println(sherlocksToDos.indexOf("solve the case"));

  }
  
}