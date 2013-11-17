import com.ankamagames.framework.graphics.engine.entity.Entity;
import org.apache.log4j.Logger;

public class Cx extends jH
  implements doT
{
  private static Logger K = Logger.getLogger(Cx.class);
  public static final String TAG = "PixmapBorder";
  private cvI bFa;
  public static final int bFb = "modulationColor".hashCode();

  public void a(aNL paramaNL)
  {
    if ((paramaNL instanceof aAR)) {
      setPixmap((aAR)paramaNL);
    }
    super.a(paramaNL);
  }

  public String getTag()
  {
    return "PixmapBorder";
  }

  public void setPixmap(aAR paramaAR) {
    switch (cGX.aHB[paramaAR.getPosition().ordinal()]) {
    case 1:
      this.bFa.e(paramaAR.getPixmap());
      break;
    case 2:
      this.bFa.c(paramaAR.getPixmap());
      break;
    case 3:
      this.bFa.d(paramaAR.getPixmap());
      break;
    case 4:
      this.bFa.i(paramaAR.getPixmap());
      break;
    case 5:
      this.bFa.b(paramaAR.getPixmap());
      break;
    case 6:
      this.bFa.h(paramaAR.getPixmap());
      break;
    case 7:
      this.bFa.f(paramaAR.getPixmap());
      break;
    case 8:
      this.bFa.g(paramaAR.getPixmap());
    }

    if (this.bFa.biY()) {
      Jg localJg = (Jg)getParentOfType(Jg.class);
      if (localJg != null) {
        this.bFa.a(this.aMo);
        localJg.setBorder(this.aMo);
      }
    }
  }

  public void setPixmaps(dDq paramdDq1, dDq paramdDq2, dDq paramdDq3, dDq paramdDq4, dDq paramdDq5, dDq paramdDq6, dDq paramdDq7, dDq paramdDq8)
  {
    this.bFa.setPixmaps(paramdDq1, paramdDq2, paramdDq3, paramdDq4, paramdDq5, paramdDq6, paramdDq7, paramdDq8);

    if (this.bFa.biY()) {
      this.bFa.a(this.aMo);
      Jg localJg = (Jg)getParentOfType(Jg.class);
      localJg.setBorder(this.aMo);
    }
  }

  public cvI getMesh()
  {
    return this.bFa;
  }

  public Entity getEntity()
  {
    return this.bFa.getEntity();
  }

  public void setModulationColor(bNa parambNa)
  {
    this.bFa.setModulationColor(parambNa);
  }

  public bNa getModulationColor()
  {
    return this.bFa.getModulationColor();
  }

  public boolean isValidAdd(bdj parambdj)
  {
    if ((parambdj instanceof aAR))
    {
      if (((aAR)parambdj).getPosition() == null) {
        K.error("Tentative d'ajout d'une Pixmap sans position");
        return false;
      }
    }
    return super.isValidAdd(parambdj);
  }

  public void c(bdj parambdj)
  {
    super.c(parambdj);
    Cx localCx = (Cx)parambdj;
    localCx.setModulationColor(getModulationColor());
  }

  public void bc() {
    super.bc();
    this.bFa.bc();
    this.bFa = null;
  }

  public void aJ() {
    super.aJ();
    this.bFa = new cvI();
    this.bFa.aJ();
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == bFb)
      setModulationColor(paramaKN.gJ(paramString));
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
}