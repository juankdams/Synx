import com.sun.jna.Native;
import java.nio.CharBuffer;

class cpn
  implements CharSequence, Comparable
{
  private axA hYy;
  private boolean dPT;

  public cpn(String paramString)
  {
    this(paramString, false);
  }

  public cpn(String paramString, boolean paramBoolean)
  {
    if (paramString == null) {
      throw new NullPointerException("String must not be null");
    }

    this.dPT = paramBoolean;
    if (paramBoolean) {
      int i = (paramString.length() + 1) * Native.cuL;
      this.hYy = new dcj(i);
      this.hYy.setString(0L, paramString, true);
    }
    else {
      byte[] arrayOfByte = Native.getBytes(paramString);
      this.hYy = new dcj(arrayOfByte.length + 1);
      this.hYy.write(0L, arrayOfByte, 0, arrayOfByte.length);
      this.hYy.setByte(arrayOfByte.length, (byte)0);
    }
  }

  public int hashCode() {
    return toString().hashCode();
  }

  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof Comparable)) {
      return compareTo(paramObject) == 0;
    }
    return false;
  }

  public String toString() {
    String str = this.dPT ? "const wchar_t*" : "const char*";
    str = str + "(" + this.hYy.getString(0L, this.dPT) + ")";
    return str;
  }

  public axA sF() {
    return this.hYy;
  }

  public char charAt(int paramInt) {
    return toString().charAt(paramInt);
  }

  public int length() {
    return toString().length();
  }

  public CharSequence subSequence(int paramInt1, int paramInt2) {
    return CharBuffer.wrap(toString()).subSequence(paramInt1, paramInt2);
  }

  public int compareTo(Object paramObject)
  {
    if (paramObject == null) {
      return 1;
    }
    return toString().compareTo(paramObject.toString());
  }
}