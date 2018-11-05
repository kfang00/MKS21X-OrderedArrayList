import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList(){
    super();
  }

  public NoNullArrayList(int startingCapacity){
    super(startingCapacity);
  }

  public String set(int b, String c) {
    if (c.compareTo(null) == 0) {
      throw new IllegalArgumentException();
    }
    else {
      super.add(b, c);
    }
  }

  public boolean add(String a) {
    return true;
  }

  public void add(int e, String yay) {

  }

}
