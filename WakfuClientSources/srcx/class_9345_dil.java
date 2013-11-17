import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class dil extends Jg
  implements bBz
{
  private static final Logger K = Logger.getLogger(dil.class);
  public static final String TAG = "ImageAppearance";
  private boolean iov;
  private boolean leb;
  private aAR dnf;
  private bNa bPm;
  private String gWd;
  private static final aee aOr = new bOO(new bB());

  public static final int bFb = "modulationColor".hashCode();
  public static final int ioC = "scaled".hashCode();
  public static final int aLd = "shader".hashCode();

  public static dil checkOut()
  {
    dil localdil;
    try
    {
      localdil = (dil)aOr.Mm();
      localdil.fnG = aOr;
    }
    catch (Exception localException)
    {
      K.error("Problème au borrowObject.");
      localdil = new dil();
      localdil.aJ();
    }
    return localdil;
  }

  public void a(aNL paramaNL)
  {
    if ((paramaNL instanceof aAR)) {
      this.dnf = ((aAR)paramaNL);
      if ((this.aPS instanceof czv)) {
        ((czv)this.aPS).setPixmap((aAR)paramaNL);
        if (this.leb)
          ((czv)this.aPS).setScaled(this.iov);
      }
      else if (this.aPS != null) {
        K.error("Un " + this.aPS.getClass() + " possède une ImageAppearance et ne peut pas recevoir de Pixmap");
      }
    }
    super.a(paramaNL);
  }

  public String getTag()
  {
    return "ImageAppearance";
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

    if ((this.aPS instanceof czv))
      ((czv)this.aPS).setModulationColor(parambNa);
  }

  public boolean isScaled()
  {
    return this.iov;
  }

  public void setScaled(boolean paramBoolean) {
    this.iov = paramBoolean;
    this.leb = true;
    if ((this.aPS instanceof czv))
      ((czv)this.aPS).setScaled(this.iov);
  }

  public void setWidget(dOc paramdOc)
  {
    super.setWidget(paramdOc);
    if ((paramdOc instanceof czv)) {
      czv localczv = (czv)paramdOc;
      if (this.leb) {
        localczv.setScaled(this.iov);
      }
      if (this.bPm != null) {
        localczv.setModulationColor(this.bPm);
      }
      setShader(this.gWd);
    }
  }

  public boolean bb(int paramInt)
  {
    if ((this.eQc) && 
      ((this.aPS instanceof czv))) {
      czv localczv = (czv)this.aPS;
      if (this.dnf != null) {
        localczv.setPixmap(this.dnf);
      }
      if (this.leb) {
        localczv.setScaled(this.iov);
      }
    }

    return super.bb(paramInt);
  }

  public void SW()
  {
    for (int i = this.bSQ.size() - 1; i >= 0; i--) {
      cfd localcfd = (cfd)this.bSQ.get(i);
      if ((localcfd instanceof aAR)) {
        this.aPS.getEntity().removeAllChildren();
      }
    }
    super.SW();
  }

  public void c(bdj parambdj)
  {
    dil localdil = (dil)parambdj;
    super.c(localdil);

    if (this.leb) {
      localdil.setScaled(this.iov);
    }

    localdil.setShader(this.gWd);
    localdil.setModulationColor(this.bPm);
  }

  public void bc()
  {
    super.bc();

    this.dnf = null;
    this.bPm = null;
    this.gWd = null;
  }

  public void aJ()
  {
    super.aJ();

    this.iov = false;
    this.leb = false;
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == bFb)
      setModulationColor(paramaKN.gJ(paramString));
    else if (paramInt == ioC)
      setScaled(bUD.getBoolean(paramString));
    else if (paramInt == aLd)
      setShader(paramString);
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public void setShader(String paramString) {
    this.gWd = paramString;
    dOc localdOc = getWidget();
    if (localdOc == null) {
      return;
    }

    ((czv)localdOc).setShader(paramString);
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject)
  {
    if (paramInt == bFb)
      setModulationColor((bNa)paramObject);
    else if (paramInt == ioC)
      setScaled(bUD.getBoolean(paramObject));
    else if (paramInt == aLd)
      setShader(paramObject.toString());
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}