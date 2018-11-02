import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList(){
    super();
  }

  public NoNullArrayList(int startingCapacity){
    super(startingCapacity);
  }

  public String set(int b, String c) {
    return "";
  }
//no sorting just putting restrictions so that u add them in order
  public boolean add(String a) {
    return true;
  }

  public void add(int e, String yay) {

  }

}
