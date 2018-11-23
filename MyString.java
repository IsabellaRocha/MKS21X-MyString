public class MyString implements CharSequence {
  private char[] data;
  public MyString (CharSequence s) {
    data = new char[s.length()];
    for(int idx = 0; idx < s.length(); idx ++) {
      data[idx] = s.charAt(idx);
      // Goes and loops through the CharSequence and adds each element to the array
    }
  }
  public char charAt(int idx) {
    if (idx < 0 || idx >= length()) {
      throw new IndexOutOfBoundsException();
    }
    return data[idx];
  }
  public int length() {
    return data.length;
  }
  public CharSequence subSequence(int start, int end) {
    if (start < 0 || end < 0 || start > end || end > length()) {
      throw new IndexOutOfBoundsException();
    }
    // Creates a string from start to end to input into MyString since MyString is-a CharSequence
    String output = "";
    for (int idx = start; idx < end; idx ++) {
      output += data[idx];
    }
    return output;
  }
  public String toString() {
    String output = "";
    for (int idx = 0; idx < length(); idx ++) {
      output += data[idx];
    }
    return output;
  }

}
