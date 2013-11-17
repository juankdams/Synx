public class hg extends cGj
{
  private static final String aGm = "tutorialType";
  public static final String aGn = "imageUrl";
  public static final String aGo = "title";
  public static final String RI = "description";
  public static final String aGp = "style";
  private final String aGq;
  private final String hh;
  private final String aGr;
  private final int aGs;
  private int aGt = -1;

  public hg(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2) {
    this(paramString1, paramString2, paramString3, paramInt1);
    this.aGt = paramInt2;
  }

  public hg(String paramString1, String paramString2, String paramString3, int paramInt) {
    this.aGq = paramString1;
    this.hh = paramString2;
    this.aGr = paramString3;
    this.aGs = paramInt;
  }

  public String[] getFields() {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("imageUrl")) {
      return ay.bd().o(this.aGq);
    }
    if (paramString.equals("title")) {
      return this.hh;
    }
    if (paramString.equals("description")) {
      return this.aGr;
    }
    if (paramString.equals("style")) {
      switch (this.aGs) {
      case 1:
        return "tutorialType" + this.aGs;
      }

      return null;
    }

    return null;
  }

  public String getTitle() {
    return this.hh;
  }

  public int pi() {
    return this.aGt;
  }

  public boolean equals(Object paramObject) {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof hg)) {
      return false;
    }

    hg localhg = (hg)paramObject;

    if (this.aGt != localhg.aGt) {
      return false;
    }
    if (this.aGs != localhg.aGs) {
      return false;
    }
    if (!this.aGr.equals(localhg.aGr)) {
      return false;
    }
    if (!this.aGq.equals(localhg.aGq)) {
      return false;
    }
    if (!this.hh.equals(localhg.hh)) {
      return false;
    }

    return true;
  }

  public int hashCode() {
    return 0;
  }
}