import org.apache.log4j.Logger;

public class CY extends cGj
{
  private static final Logger K = Logger.getLogger(CY.class);
  public static final String RI = "description";
  public static final String RH = "iconUrl";
  public static final String[] bF = { "description", "iconUrl" };
  private cLE bHu;

  public CY(cLE paramcLE)
  {
    this.bHu = paramcLE;
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("description")) {
      return getDescription();
    }
    if (paramString.equals("iconUrl")) {
      if (this.bHu.cEJ() == aqF.dyk) {
        bVw localbVw = (bVw)Hh.QM().dh(this.bHu.getValue());
        return localbVw.getFieldValue(paramString);
      }if (this.bHu.cEJ() == aqF.dyl) {
        try {
          return String.format(ay.bd().getString("rewardTypeIconsPath"), new Object[] { Integer.valueOf(bSa.hbZ.getId()) });
        } catch (bdh localbdh) {
          K.warn(localbdh.getMessage(), localbdh);
          return null;
        }
      }
      return null;
    }
    return null;
  }

  public String getDescription() {
    if (this.bHu.cEJ() == aqF.dyk) {
      bVw localbVw = (bVw)Hh.QM().dh(this.bHu.getValue());
      return localbVw.getName();
    }
    return bU.fH().getString("xpGain", new Object[] { Integer.valueOf(this.bHu.getValue()) });
  }

  public cLE Me()
  {
    return this.bHu;
  }
}