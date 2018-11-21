public class MyString implements CharSequence {
  private char[] data;
  public MyString (CharSequence s) {
    for(int idx = 0; idx < s.length(); idx ++) {
      data[idx] = charAt(idx);
    }
  }
  public char charAt(int idx) {
    return data[idx];
  }
  public int length() {
    return data.length;
  }
  public CharSequence subSequence(int start, int end) {
    String output = "";
    for (int idx = start; idx < end; idx ++) {
      output += data[idx];
    }
    CharSequence out = new MyString(output);
    return out;
  }
  public String toString() {
    String output = "";
    for (int idx = 0; idx < data.length; idx ++) {
      output += data[idx];
    }
    return output;
  }

}
