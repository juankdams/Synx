import org.apache.log4j.Logger;

public class aRL extends cMb
{
  private static final Logger K = Logger.getLogger(aRL.class);
  public static final short aPi = 0;
  public static final short aPj = 1;
  public static final short dTO = 2;
  private coz eOL;
  private boolean eOM;
  private boolean eON;

  public void aJ()
  {
    super.aJ();
    this.kra = true;

    x((short)1);
    dO((short)1);
    eu(true);
    ev(true);

    this.eOL = coz.hWa;
    this.eOM = false;
    this.eON = false;
  }

  public csx[] am()
  {
    byz localbyz = byv.bFN().bFO();
    if (!this.eOL.a(this, localbyz)) {
      return csx.icw;
    }
    csl localcsl = (csl)aiI.dfO.avt();
    int i;
    String str;
    switch (this.aTn) {
    case 0:
      i = coH.hWs.aw;
      str = "close";
      break;
    case 1:
    case 2:
      i = coH.hXp.aw;
      str = "containerOpen";
      break;
    default:
      i = coH.hXp.aw;
      str = "containerOpen";
    }

    localcsl.iT(i);
    localcsl.ma("desc.mru." + str);

    return new csx[] { localcsl };
  }

  public short OL()
  {
    return 60;
  }

  public void a(abc paramabc)
  {
    K.info("[ON VIEW UPDATED] " + paramabc);
  }

  public boolean a(dJO paramdJO, bhL parambhL) {
    K.info("Action performed on interactive element : " + paramdJO.toString());

    if (!this.dgA) {
      return false;
    }
    if (!this.eOL.a(this, parambhL)) {
      return false;
    }
    d(paramdJO);
    a(paramdJO);

    return true;
  }

  public void setUsable(boolean paramBoolean)
  {
    super.setUsable(paramBoolean);
    setSelectable(paramBoolean);
  }

  public boolean ta()
  {
    return true;
  }

  public void al()
  {
    super.al();
    String[] arrayOfString = this.fgH.split(";");
    if ((arrayOfString.length < 0) || (arrayOfString.length > 3)) {
      K.error("[LD] La porte " + this.aTz + " doit avoir 0, 1, 2 ou 3 paramètre(s)");
      return;
    }
    if (arrayOfString.length == 0) {
      this.eOL = coz.hWa;
      this.eOM = false;
      this.eON = false;
      return;
    }

    if (arrayOfString.length == 1) {
      try {
        this.eOL = coz.valueOf(arrayOfString[0].toUpperCase());
      } catch (IllegalArgumentException localIllegalArgumentException) {
        this.eOL = coz.hWa;
      }
      this.eOM = false;
      this.eON = false;
    }

    if (arrayOfString.length == 2) {
      this.eOL = coz.hWa;
      this.eOM = Boolean.parseBoolean(arrayOfString[0]);
      this.eON = Boolean.parseBoolean(arrayOfString[1]);
    }

    if (arrayOfString.length == 3) {
      this.eOL = coz.valueOf(arrayOfString[0].toUpperCase());
      this.eOM = Boolean.parseBoolean(arrayOfString[1]);
      this.eON = Boolean.parseBoolean(arrayOfString[2]);
    }
  }

  public dJO eR()
  {
    return (this.aTn == 1) || (this.aTn == 2) ? dJO.lVM : dJO.lVN;
  }

  public dJO[] eS()
  {
    return new dJO[] { dJO.lVM, dJO.lVN, dJO.lVO, dJO.lVP };
  }

  protected void tf()
  {
    super.tf();
    switch (this.aTn) {
    case 0:
      eu(false);
      ev(false);
      dR(this.eOM);
      break;
    case 1:
    case 2:
      eu(true);
      ev(true);
      dR(this.eON);
    }
  }

  private void dR(boolean paramBoolean)
  {
    for (abc localabc : sL())
      localabc.H(paramBoolean);
  }

  public EA xN()
  {
    if (this.krh == null)
      this.krh = new aBk(this);
    return this.krh;
  }
}