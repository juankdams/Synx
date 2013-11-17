import org.apache.log4j.Logger;

public class bXR extends Jg
  implements bBz
{
  private static Logger K = Logger.getLogger(bXR.class);
  public static final String TAG = "mapAppearance";
  private aAR dnf = null;
  private bNa bPm = null;
  private int aVc;
  private int fmq;
  private int aVd;
  private int fmr;
  private boolean hnN = false; private boolean hnO = false; private boolean hnP = false; private boolean hnQ = false;

  public static final int bFb = "modulationColor".hashCode();
  public static final int hnR = "startX".hashCode();
  public static final int hnS = "startY".hashCode();
  public static final int hnT = "endX".hashCode();
  public static final int hnU = "endY".hashCode();

  public void a(aNL paramaNL)
  {
    if ((paramaNL instanceof aAR)) {
      this.dnf = ((aAR)paramaNL);
      if ((this.aPS instanceof acq)) {
        ((acq)this.aPS).setMapBackgroundPixmap(((aAR)paramaNL).getPixmap());
      }
    }
    super.a(paramaNL);
  }

  public String getTag()
  {
    return "mapAppearance";
  }

  public bNa getModulationColor()
  {
    return this.bPm;
  }

  public void setModulationColor(bNa parambNa)
  {
    if (this.bPm == parambNa) {
      return;
    }
    this.bPm = parambNa;

    if ((this.aPS instanceof acq))
      ((acq)this.aPS).setModulationColor(parambNa);
  }

  public int getStartX()
  {
    return this.aVc;
  }

  public void setStartX(int paramInt) {
    this.aVc = paramInt;
    this.hnN = true;
    acq localacq = (acq)this.aPS;
    if (localacq != null)
      localacq.setMapBackgroundStartX(this.aVc);
  }

  public int getEndX()
  {
    return this.fmq;
  }

  public void setEndX(int paramInt) {
    this.fmq = paramInt;
    this.hnO = true;
    acq localacq = (acq)this.aPS;
    if (localacq != null)
      localacq.setMapBackgroundEndX(this.fmq);
  }

  public int getStartY()
  {
    return this.aVd;
  }

  public void setStartY(int paramInt) {
    this.aVd = paramInt;
    this.hnP = true;
    acq localacq = (acq)this.aPS;
    if (localacq != null)
      localacq.setMapBackgroundStartY(this.aVd);
  }

  public int getEndY()
  {
    return this.fmr;
  }

  public void setEndY(int paramInt) {
    this.fmr = paramInt;
    this.hnQ = true;
    acq localacq = (acq)this.aPS;
    if (localacq != null)
      localacq.setMapBackgroundEndY(this.fmr);
  }

  public void setWidget(dOc paramdOc)
  {
    super.setWidget(paramdOc);
    if ((paramdOc instanceof acq)) {
      acq localacq = (acq)paramdOc;
      if (this.bPm != null) {
        localacq.setModulationColor(this.bPm);
      }

      if (this.dnf != null) {
        localacq.setMapBackgroundPixmap(this.dnf.getPixmap());
      }
      localacq.setMapBackgroundStartX(this.aVc);
      localacq.setMapBackgroundStartY(this.aVd);
      localacq.setMapBackgroundEndX(this.fmq);
      localacq.setMapBackgroundEndY(this.fmr);
    }
  }

  public boolean bb(int paramInt)
  {
    if ((this.eQc) && 
      ((this.aPS instanceof acq))) {
      acq localacq = (acq)this.aPS;
      if (this.dnf != null) {
        localacq.setMapBackgroundPixmap(this.dnf.getPixmap());
      }
      localacq.setMapBackgroundStartX(this.aVc);
      localacq.setMapBackgroundStartY(this.aVd);
      localacq.setMapBackgroundEndX(this.fmq);
      localacq.setMapBackgroundEndY(this.fmr);
    }

    return super.bb(paramInt);
  }

  public void c(bdj parambdj)
  {
    bXR localbXR = (bXR)parambdj;
    super.c(localbXR);

    if (this.hnN)
      localbXR.setStartX(this.aVc);
    if (this.hnP)
      localbXR.setStartY(this.aVd);
    if (this.hnO)
      localbXR.setEndX(this.fmq);
    if (this.hnQ) {
      localbXR.setEndY(this.fmr);
    }
    localbXR.setModulationColor(this.bPm);
  }

  public void bc()
  {
    super.bc();

    this.dnf = null;

    this.bPm = null;
  }

  public void aJ()
  {
    super.aJ();
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == bFb)
      setModulationColor(paramaKN.gJ(paramString));
    else if (paramInt == hnR)
      setStartX(bUD.aR(paramString));
    else if (paramInt == hnS)
      setStartY(bUD.aR(paramString));
    else if (paramInt == hnT)
      setEndX(bUD.aR(paramString));
    else if (paramInt == hnU)
      setEndY(bUD.aR(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == bFb)
      setModulationColor((bNa)paramObject);
    else if (paramInt == hnR)
      setStartX(bUD.aR(paramObject));
    else if (paramInt == hnS)
      setStartY(bUD.aR(paramObject));
    else if (paramInt == hnT)
      setEndX(bUD.aR(paramObject));
    else if (paramInt == hnU)
      setEndY(bUD.aR(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}