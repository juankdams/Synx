import com.ankamagames.framework.graphics.engine.entity.Entity;
import org.apache.log4j.Logger;

public class aVT extends dqC
  implements doT
{
  private static Logger K = Logger.getLogger(aVT.class);
  public static final String TAG = "TiledPixmapBackground";
  private cya eYi = new cya();
  private boolean aKX = true;
  private boolean bY = true;

  private static final aee aOr = new bOO(new dem());

  public static final int bFb = "modulationColor".hashCode();
  public static final int aLc = "vertical".hashCode();
  public static final int eYj = "horizontal".hashCode();

  public static aVT checkOut()
  {
    aVT localaVT;
    try
    {
      localaVT = (aVT)aOr.Mm();
      localaVT.fnG = aOr;
    }
    catch (Exception localException)
    {
      K.error("Problème au borrowObject.");
      localaVT = new aVT();
      localaVT.aJ();
    }
    return localaVT;
  }

  public void a(aNL paramaNL)
  {
    if ((paramaNL instanceof aAR)) {
      setPixmap((aAR)paramaNL);
    }
    super.a(paramaNL);
  }

  public void ZW() {
    super.ZW();

    if (this.czl == null) {
      K.warn("Appearance null !?");
      return;
    }

    dOc localdOc = this.czl.getWidget();
    if (localdOc == null) {
      K.warn("Widget null !?");
      return;
    }

    dRq localdRq = localdOc.getContainer();
    if (localdRq != null)
      localdRq.setNeedsScissor(true);
  }

  public String getTag()
  {
    return "TiledPixmapBackground";
  }

  public void setModulationColor(bNa parambNa)
  {
    this.eYi.setModulationColor(parambNa);
  }

  public bNa getModulationColor()
  {
    return this.eYi.getModulationColor();
  }

  public void setPixmap(aAR paramaAR)
  {
    this.eYi.setPixmap(paramaAR.getPixmap());
  }

  public cya getMesh()
  {
    return this.eYi;
  }

  public Entity getEntity()
  {
    return this.eYi.getEntity();
  }

  public void bc()
  {
    super.bc();

    this.eYi.bc();
    this.eYi = null;
  }

  public void aJ()
  {
    super.aJ();
    this.eYi = new cya();
    this.eYi.aJ();
    aNL localaNL = getParent();
  }

  public void c(bdj parambdj)
  {
    super.c(parambdj);
    aVT localaVT = (aVT)parambdj;
    localaVT.setScaled(isScaled());
    localaVT.setModulationColor(getModulationColor());
    localaVT.setHorizontal(this.bY);
    localaVT.setVertical(this.aKX);
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == bFb)
      setModulationColor(paramaKN.gJ(paramString));
    else if (paramInt == aLc)
      setVertical(bUD.getBoolean(paramString));
    else if (paramInt == eYj)
      setHorizontal(bUD.getBoolean(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == bFb)
      setModulationColor((bNa)paramObject);
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }

  public void setVertical(boolean paramBoolean) {
    if (this.eYi != null)
      this.eYi.setVertical(paramBoolean);
    this.aKX = paramBoolean;
  }

  public void setHorizontal(boolean paramBoolean) {
    if (this.eYi != null)
      this.eYi.setHorizontal(paramBoolean);
    this.bY = paramBoolean;
  }
}