public class aSF
  implements Sl
{
  public static final byte ePU = 2;
  private String hi;

  public aSF(String paramString)
  {
    this.hi = paramString;
  }

  public String getText() {
    return this.hi;
  }

  public void setText(String paramString) {
    this.hi = paramString;
  }

  public byte getType() {
    return 2;
  }
}