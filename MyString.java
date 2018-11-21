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
    CharSequence output = "";
    for (int idx = start; idx < end; idx ++) {
      output.charAt
    }
}
