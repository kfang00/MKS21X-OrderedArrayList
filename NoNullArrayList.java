public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList(){

  }

  public NoNullArrayList(int startingCapacity){
    value = startingCapacity;
  }

  public String set(int b, String c) {
    String d = data[b];
    if (b < 0 || b >= size()) {
      throw new IndexOutOfBoundsException();
    }
    data[b] = c;
    return d;
}
//no sorting just putting restrictions so that u add them in order
  public boolean add(String a) {
    if (size >= (data.length - 1)) {
      resize();

    }
    data[size] = a;
    size += 1;
    return true;
  }

public void add(int e, String yay) {
  int track = 0;
  String[] arrCopy = new String[size() + 1];
  if ( e < 0 || e > size()) {
    throw new IndexOutOfBoundsException();
  }
  else {
    for (int x = 0; x < e; x++) {
      arrCopy[x] = data[x];
      track += 1;
    }
    arrCopy[track] = yay;
    for (int x = track; x < size() ; x++) {
      arrCopy[x + 1] = data[x];
    }
    data = arrCopy;
    size += 1;
  }

}
