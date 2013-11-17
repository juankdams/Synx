import org.apache.log4j.Logger;

public class bSz
  implements dBv
{
  private static final Logger K = Logger.getLogger(bSz.class);
  public static final String hds = "isExtended";
  public static final String hdt = "hasAPrimaryGem";
  public static final String hdu = "primaryGem";
  public static final String hdv = "primaryGemIconUrl";
  public static final String hdw = "primaryGemIsLocked";
  public static final String hdx = "hasASecondaryGem";
  public static final String hdy = "secondaryGemIconUrl";
  public static final String hdz = "secondaryGem";
  private dQC hdA;

  public bSz(dQC paramdQC)
  {
    this.hdA = paramdQC;
  }

  public String[] getFields() {
    return new String[0];
  }

  public Object getFieldValue(String paramString)
  {
    gA localgA1;
    if (paramString.equals("isExtended")) {
      localgA1 = this.hdA.lm(true);
      if (localgA1 == null) {
        return Boolean.valueOf(false);
      }
      gA localgA2 = this.hdA.lm(false);
      if (localgA2 == null) {
        return Boolean.valueOf(false);
      }
      return Boolean.valueOf(localgA1.ok() == localgA2.ok());
    }if (paramString.equals("hasAPrimaryGem"))
      return Boolean.valueOf(this.hdA.lm(true) != null);
    if (paramString.equals("hasASecondaryGem"))
      return Boolean.valueOf(this.hdA.lm(false) != null);
    int i;
    if (paramString.equals("primaryGemIconUrl")) {
      localgA1 = this.hdA.lm(true);
      if (localgA1 == null) {
        return null;
      }

      i = af(localgA1);
      if (i == -1) {
        return null;
      }
      try
      {
        return String.format(ay.bd().getString("dimensionalBagPrimaryGemPath"), new Object[] { Integer.valueOf(i) });
      } catch (bdh localbdh1) {
        K.warn("Impossible de trouver la propriété dimensionalBagPrimaryGemPath");

        return null; } 
    }if (paramString.equals("secondaryGemIconUrl")) {
      localgA1 = this.hdA.lm(false);
      if (localgA1 == null) {
        return null;
      }

      i = af(localgA1);
      if (i == -1) {
        return null;
      }
      try
      {
        return String.format(ay.bd().getString("dimensionalBagSecondaryGemPath"), new Object[] { Integer.valueOf(i) });
      } catch (bdh localbdh2) {
        K.warn("Impossible de trouver la propriété dimensionalBagSecondaryGemPath");

        return null; } 
    }if (paramString.equals("primaryGem"))
      return new dui(this.hdA.lm(true), this.hdA.aCJ());
    if (paramString.equals("secondaryGem"))
      return new dui(this.hdA.lm(false), this.hdA.aCJ());
    if (paramString.equals("primaryGemIsLocked")) {
      return Boolean.valueOf(this.hdA.drC());
    }
    return null;
  }

  public void a(String paramString, Object paramObject) {
  }

  public void b(String paramString, Object paramObject) {
  }

  public void c(String paramString, Object paramObject) {
  }

  public boolean l(String paramString) {
    return false;
  }

  private int af(gA paramgA) {
    int i = paramgA.ok();
    Ka localKa = Ka.fv(i);
    switch (bwI.ghh[localKa.ordinal()]) {
    case 1:
      return 0;
    case 2:
      return 1;
    case 3:
      return 2;
    case 4:
      return 3;
    case 5:
      return 4;
    case 6:
      return 5;
    case 7:
      return 6;
    case 8:
      return 3;
    }
    return -1;
  }

  public void updateUI()
  {
    dLE.doY().a(this, new String[] { "isExtended", "hasAPrimaryGem", "primaryGemIconUrl", "hasASecondaryGem", "secondaryGemIconUrl", "primaryGem", "secondaryGem" });
  }
}