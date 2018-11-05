public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }

  public T set(int b, T c) {
    super.remove(b);
    return super.add(b, c);
  }

  public int getIndex(T k) {
    int store = 0;
    for (int x = 0; x < this.size(); x++) {
      if (this.get(x).compareTo(k) > 0) {
        store = x;
      }
    }
    return store;
  }

  public boolean add(T a) {
    super.add(getIndex(a), a);
    return true;
  }

  public void add(int e, T yay) {
    super.add(getIndex(a), a);
}

