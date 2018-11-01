public class NoNullArrayList<T> extends ArrayList<T>{
  private T value;
  public NoNullArrayList(){

  }

  public NoNullArrayList(int startingCapacity){
    value = startingCapacity;
  }

  public T getValue() {
    return value;
  }
  
}
