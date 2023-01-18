package exercise;

// BEGIN
class ReversedSequence implements CharSequence {
    String str;

    public String getStr() {
        return new StringBuilder(str).reverse().toString();
    }

    public ReversedSequence(String str) {
        this.str = str;
    }

    public String toString() {
        return getStr();
    }

    public char charAt(int num) {
        return getStr().charAt(num);
    }

    public int length() {
        return getStr().length();
    }

    public CharSequence subSequence(int start, int end) {
        return getStr().subSequence(start, end);
    }
}
// END
