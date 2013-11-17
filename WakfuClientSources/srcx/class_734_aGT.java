public class aGT extends kt
{
  private static final String SEPARATOR = " ";
  private static final byte ees = 3;

  public aGT(String paramString1, String paramString2, String paramString3, String paramString4, bTd parambTd)
  {
    super(paramString1, paramString2, paramString3, paramString4, parambTd);
  }

  public aGT(String paramString1, String paramString2, String paramString3, String paramString4) {
    super(paramString1, paramString2, paramString3, paramString4);
  }

  public aGT(String paramString1, String paramString2, bTd parambTd) {
    super(paramString1, paramString2, parambTd);
  }

  public aGT(String paramString1, String paramString2) {
    super(paramString1, paramString2);
  }

  public String A(boolean paramBoolean) {
    if (!(this.aOd instanceof Long)) {
      return super.A(paramBoolean);
    }
    String str = this.aOd.toString();
    StringBuffer localStringBuffer = new StringBuffer(str);
    if (str.length() > 3) {
      for (int i = str.length() - 3; i > 0; i -= 3) {
        localStringBuffer.insert(i, " ");
      }
    }
    if (this.m_prefix != null)
      localStringBuffer = new StringBuffer(this.m_prefix + " " + localStringBuffer.toString());
    if (this.aOc != null) {
      localStringBuffer.append(" " + this.aOc);
    }
    return paramBoolean ? format(localStringBuffer.toString()) : localStringBuffer.toString();
  }
}