public class MyString implements CharSequence, Comparable<CharSequence> {
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
    CharSequence out = new MyString(output);
    return out;
  }
  public String toString() {
    String output = "";
    for (int idx = 0; idx < length(); idx ++) {
      output += data[idx];
    }
    return output;
  }
  public int compareTo(CharSequence s) {
    if (s == null) {
      throw new NullPointerException();
    }
    int len = 0;
    if (length() > s.length()) {
      len = s.length();
    }
    if (s.length() > length()) {
      len = length();
    }
    //Makes sure chars are still compared even if the CharSequence's are different lengths
    for (int idx = 0; idx < len; idx ++) {
      if ((int) charAt(idx) > (int) s.charAt(idx)) {
        return 1;
      }
      if ((int) charAt(idx) < (int) s.charAt(idx)) {
        return -1;
      }
    }
    //If all char's are the same, compares the lengths of the CharSequence's
    if (length() > s.length()) {
      return 1;
    }
    if (s.length() > length()) {
      return -1;
    }
    return 0;
  }
}
