public class Droid{
  int batteryLevel = 100;
  String name;
  
  public Droid(String droidName){
    name = droidName; 
  }
public String toString(){
  return "Hello, I'm the droid: " + name;
}

public void performTask(String task){
  System.out.println(name + " is performing task " + task);

  batteryLevel = batteryLevel - 10;
}




  public static void main(String[] args){
    Droid Codey = new Droid("Charles");
    System.out.println(Codey);
    System.out.println(Codey.name);
    System.out.println(Codey.batteryLevel);
    //System.out.println(Codey.performTask);
    Codey.performTask("run");
    System.out.println(Codey.batteryLevel);





  }



}
