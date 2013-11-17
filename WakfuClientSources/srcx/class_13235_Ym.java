import org.apache.log4j.Logger;

public class Ym extends dQk
{
  private static final Logger K = Logger.getLogger(Ym.class);
  private Aa cIO;
  private boolean bun = true;

  public Ym(Aa paramAa) {
    this.cIO = paramAa;
  }

  public int getId() {
    return this.cIO.getId();
  }

  public String[] getFields()
  {
    return bF;
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("item")) {
      return Hh.QM().dh(this.cIO.gw());
    }
    if (paramString.equals("quantity")) {
      return Short.valueOf(this.cIO.nP());
    }
    if (paramString.equals("xp")) {
      return bU.fH().getString("xpGain", new Object[] { Integer.valueOf(this.cIO.IT()) });
    }
    if (paramString.equals("kama")) {
      return bU.fH().getString("kama.gain", new Object[] { Integer.valueOf(this.cIO.IQ()) });
    }
    if (paramString.equals("xpIconUrl")) {
      try {
        return String.format(ay.bd().getString("rewardTypeIconsPath"), new Object[] { Integer.valueOf(bSa.hbZ.getId()) });
      } catch (bdh localbdh) {
        K.warn(localbdh.getMessage(), localbdh);
        return null;
      }
    }
    if (paramString.equals("rankDescription")) {
      return bU.fH().getString("challenge.reward.rank." + this.cIO.IS());
    }
    return null;
  }

  protected bBn ajR()
  {
    return Hh.QM().dh(this.cIO.gw());
  }

  protected int ajS()
  {
    return this.cIO.nP();
  }

  protected int IT()
  {
    return this.cIO.IT();
  }

  protected int IQ() {
    return this.cIO.IQ();
  }

  protected String ajT()
  {
    try {
      return String.format(ay.bd().getString("rewardTypeIconsPath"), new Object[] { Integer.valueOf(bSa.hbZ.getId()) });
    } catch (bdh localbdh) {
      K.warn(localbdh.getMessage(), localbdh);
    }return null;
  }

  protected String ajU()
  {
    return bU.fH().getString("challenge.reward.rank." + this.cIO.IS());
  }

  public void bC(boolean paramBoolean) {
    this.bun = paramBoolean;
  }

  public boolean isValid() {
    return this.bun;
  }

  public boolean IR() {
    return this.cIO.IR();
  }
}