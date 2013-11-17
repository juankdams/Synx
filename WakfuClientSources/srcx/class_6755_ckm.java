public class ckm
{
  private int hLp;
  private int hLq;
  private int hLr;

  public ckm(aWE paramaWE, int paramInt1, int paramInt2, int paramInt3)
  {
    this.hLp = paramInt1;
    this.hLq = paramInt2;
    this.hLr = paramInt3;
  }

  public ckm(aWE paramaWE, String paramString)
  {
    this.hLp = 0;
    this.hLq = 0;
    this.hLr = 0;

    if ((paramString != null) && (paramString.length() > 0)) {
      String[] arrayOfString = paramString.split("(\\s|\\.)");
      try
      {
        this.hLp = Integer.valueOf(arrayOfString[0]).intValue();
      } catch (NumberFormatException localNumberFormatException1) {
        this.hLp = 0;
      }

      if (arrayOfString.length >= 2) {
        try {
          this.hLq = Integer.valueOf(arrayOfString[1]).intValue();
        } catch (NumberFormatException localNumberFormatException2) {
          this.hLq = 0;
        }
      }

      if (arrayOfString.length >= 3)
        try {
          this.hLr = Integer.valueOf(arrayOfString[2]).intValue();
        } catch (NumberFormatException localNumberFormatException3) {
          this.hLr = 0;
        }
    }
  }

  public int cmo()
  {
    return this.hLr;
  }

  public int getMajor() {
    return this.hLp;
  }

  public int getMinor() {
    return this.hLq;
  }

  public int a(ckm paramckm, boolean paramBoolean) {
    int i = this.hLp - paramckm.getMajor();
    if (i == 0) {
      i = this.hLq - paramckm.getMinor();
      if ((i == 0) && (paramBoolean)) {
        i = this.hLr - paramckm.cmo();
      }
    }
    return i;
  }

  public int a(ckm paramckm) {
    return a(paramckm, false);
  }
}