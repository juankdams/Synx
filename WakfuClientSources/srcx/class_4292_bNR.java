import java.util.ArrayList;
import java.util.HashMap;

public class bNR extends dRq
{
  public static final String TAG = "DisplayContainer";
  private int aKS = 30;

  private int gSR = 10;

  private final HashMap gSS = new HashMap();

  public static final int gST = "contentSize".hashCode();
  public static final int aLa = "duration".hashCode();

  public boolean a(dOc paramdOc, int paramInt)
  {
    boolean bool = super.a(paramdOc, paramInt);

    if (bool) {
      if (this.mmr.size() > this.gSR) {
        ((dOc)this.mmr.get(0)).beH();
      }
      this.gSS.put(paramdOc, new lV(paramdOc, this.aKS * 1000));

      biw localbiw = new biw(this, this.mmr.size() == this.gSR);
      localbiw.aJ();
      g(localbiw);
    }

    return bool;
  }

  public void j(dOc paramdOc)
  {
    lV locallV = (lV)this.gSS.remove(paramdOc);
    if (locallV != null) {
      locallV.stop();
    }

    super.j(paramdOc);

    biw localbiw = new biw(this, this.mmr.size() == this.gSR);
    localbiw.aJ();
    g(localbiw);
  }

  public String getTag()
  {
    return "DisplayContainer";
  }

  public int getDuration()
  {
    return this.aKS;
  }

  public void setDuration(int paramInt)
  {
    this.aKS = paramInt;
  }

  public int getContentSize()
  {
    return this.gSR;
  }

  public void setContentSize(int paramInt)
  {
    this.gSR = paramInt;
  }

  public boolean isFull()
  {
    return this.gSR == this.mmr.size();
  }

  public void c(bdj parambdj)
  {
    super.c(parambdj);

    bNR localbNR = (bNR)parambdj;
    localbNR.setDuration(this.aKS);
    localbNR.setContentSize(this.gSR);
  }

  public void bc()
  {
    super.bc();

    for (lV locallV : this.gSS.values()) {
      locallV.stop();
    }
    this.gSS.clear();
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == gST)
      setContentSize(bUD.aR(paramString));
    else if (paramInt == aLa)
      setDuration(bUD.aR(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }
    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == gST)
      setContentSize(bUD.aR(paramObject));
    else if (paramInt == aLa)
      setDuration(bUD.aR(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }
    return true;
  }
}