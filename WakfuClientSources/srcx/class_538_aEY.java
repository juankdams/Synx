import java.util.ArrayList;

public class aEY extends dRq
  implements doT
{
  public static final String TAG = "RepeatableImage";
  private ArrayList eaO = new ArrayList();
  private aAR dnf = null;
  private bNa bPm = null;
  private int eaP = 0;

  private boolean eaQ = false;
  private boolean eaR = false;

  public static final int ct = "horizontal".hashCode();
  public static final int bFb = "modulationColor".hashCode();
  public static final int eaS = "repeatNumber".hashCode();

  public void a(aNL paramaNL)
  {
    if ((paramaNL instanceof aAR)) {
      setPixmap((aAR)paramaNL);
    }
    super.a(paramaNL);
  }

  public void a(crh paramcrh) {
    if (((paramcrh instanceof PT)) && ((this.mmt != null) || (!(paramcrh instanceof aId)))) {
      paramcrh.release();
      return;
    }

    super.a(paramcrh);
  }

  public String getTag()
  {
    return "RepeatableImage";
  }

  public void setHorizontal(boolean paramBoolean) {
    if ((this.mmt instanceof aId))
      ((aId)this.mmt).setHorizontal(paramBoolean);
  }

  public boolean getHorizontal()
  {
    if ((this.mmt instanceof aId)) {
      return ((aId)this.mmt).isHorizontal();
    }
    return false;
  }

  public void setRepeatNumber(int paramInt) {
    if (paramInt != this.eaP) {
      this.eaP = paramInt;
      this.eaQ = true;
      setNeedsToPreProcess();
    }
  }

  public int getRepeatNumber()
  {
    return this.eaP;
  }

  public void setPixmap(aAR paramaAR)
  {
    if (paramaAR != this.dnf) {
      this.dnf = paramaAR;
      this.eaR = true;
      setNeedsToPreProcess();
    }
  }

  public void setModulationColor(bNa parambNa) {
    if (this.bPm == parambNa) {
      return;
    }
    this.bPm = parambNa;

    for (int i = this.eaO.size() - 1; i >= 0; i--)
      ((czv)this.eaO.get(i)).setModulationColor(parambNa);
  }

  public bNa getModulationColor()
  {
    return this.bPm;
  }

  public void c(bdj parambdj)
  {
    aEY localaEY = (aEY)parambdj;
    super.c(localaEY);

    while (localaEY.mmr.size() > 0) {
      ((dOc)localaEY.mmr.get(0)).beH();
    }

    localaEY.setHorizontal(getHorizontal());
    localaEY.setRepeatNumber(this.eaP);
    localaEY.setModulationColor(this.bPm);
  }

  public void aRz()
  {
    if (this.eaQ)
    {
      while (this.eaP < this.eaO.size()) {
        ((czv)this.eaO.remove(this.eaP)).beH();
      }

      if (this.eaP > this.eaO.size())
      {
        czv localczv;
        if (this.eaO.size() == 0) {
          localczv = new czv();
          localczv.aJ();
          localczv.setNonBlocking(true);
          localczv.setModulationColor(this.bPm);
          a(localczv);
          localczv.a(this.dnf.beO());
          this.eaO.add(localczv);
        }

        while (this.eaP > this.eaO.size()) {
          localczv = (czv)((czv)this.eaO.get(0)).beO();
          a(localczv);
          this.eaO.add(localczv);
        }
      }

      this.eaQ = false;
    }

    if (this.eaR) {
      for (int i = this.eaO.size() - 1; i >= 0; i--) {
        ((czv)this.eaO.get(i)).a(this.dnf.beO());
      }
      this.eaR = false;
    }
  }

  public boolean bb(int paramInt)
  {
    boolean bool = super.bb(paramInt);

    if ((this.eaR) || (this.eaQ)) {
      aRz();
      cfM();
    }

    return bool;
  }

  public void bc()
  {
    super.bc();

    this.eaO.clear();
    this.eaP = 0;
    this.dnf = null;

    this.bPm = null;

    this.eaQ = false;
    this.eaR = false;
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == ct)
      setHorizontal(bUD.getBoolean(paramString));
    else if (paramInt == bFb)
      setModulationColor(paramaKN.gJ(paramString));
    else if (paramInt == eaS)
      setRepeatNumber(bUD.aR(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == ct)
      setHorizontal(bUD.getBoolean(paramObject));
    else if (paramInt == bFb)
      setModulationColor((bNa)paramObject);
    else if (paramInt == eaS)
      setRepeatNumber(bUD.aR(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}