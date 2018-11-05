import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList(){
    super();
  }

  public NoNullArrayList(int startingCapacity){
    super(startingCapacity);
  }

  public T set(int b, T c) {
    if (c == null) {
      throw new IllegalArgumentException("set null!!");
    }
    else {
      return super.set(b, c);
    }
  }

  public boolean add(T a) {
    if (a == null) {
      throw new IllegalArgumentException("added null!!");
    }
    else {
      return super.add(a);
    }
  }

  public void add(int e, T yay) {
    if (yay == null) {
      throw new IllegalArgumentException("added null!!");
    }
    else {
      super.add(e, yay);
    }
  }

}
