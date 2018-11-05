import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }

  public int getIndex(T k) {
    int store = 0;
    for (int x = 0; x < this.size(); x++) {
      if (this.get(x).compareTo(k) < 0) {
        store += 1;
      }
    }
    return store;
  }

  public boolean add(T a) {
    if (a == null) {
      throw new IllegalArgumentException("add null!!");
    }
    super.add(getIndex(a), a);
    return true;
  }

  public void add(int e, T yay) {
    if (yay == null) {
      throw new IllegalArgumentException("add null!!");
    }
    super.add(getIndex(yay), yay);  
  }

  public T set(int b, T c) {
    if (c == null) {
      throw new IllegalArgumentException("set null!!");
    }
    T oldelm = this.get(b);
    super.remove(b);
    super.add(getIndex(c), c); 
    return oldelm;
  }

  
}

