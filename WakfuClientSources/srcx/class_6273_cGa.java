import com.ankamagames.framework.graphics.engine.entity.Entity;
import org.apache.log4j.Logger;

public class cGa extends jH
  implements doT
{
  private static Logger K = Logger.getLogger(cGa.class);
  private btu iBn;
  public static final String TAG = "pixmapBorder16";
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
    return "pixmapBorder16";
  }

  public void setModulationColor(bNa parambNa) {
    this.iBn.setModulationColor(parambNa);
  }

  public bNa getModulationColor() {
    return this.iBn != null ? this.iBn.getModulationColor() : null;
  }

  public void setPixmap(aAR paramaAR)
  {
    this.iBn.a(paramaAR.getPixmap(), paramaAR.getPosition());
    this.aQS = true;

    if (this.iBn.biY()) {
      this.iBn.a(this.aMo);
      Jg localJg = (Jg)getParentOfType(Jg.class);
      if (localJg != null)
        localJg.setBorder(this.aMo);
    }
  }

  public void setPixmaps(dDq paramdDq1, dDq paramdDq2, dDq paramdDq3, dDq paramdDq4, dDq paramdDq5, dDq paramdDq6, dDq paramdDq7, dDq paramdDq8, dDq paramdDq9, dDq paramdDq10, dDq paramdDq11, dDq paramdDq12, dDq paramdDq13, dDq paramdDq14, dDq paramdDq15, dDq paramdDq16)
  {
    this.iBn.setPixmaps(paramdDq1, paramdDq2, paramdDq3, paramdDq4, paramdDq5, paramdDq6, paramdDq7, paramdDq8, paramdDq9, paramdDq10, paramdDq11, paramdDq12, paramdDq13, paramdDq14, paramdDq15, paramdDq16);

    this.aQS = true;

    if (this.iBn.biY()) {
      this.iBn.a(this.aMo);
      Jg localJg = (Jg)getParentOfType(Jg.class);
      localJg.setBorder(this.aMo);
    }
  }

  public void setPixmaps(dDq[] paramArrayOfdDq)
  {
    if (paramArrayOfdDq.length == 16)
      this.iBn.setPixmaps(paramArrayOfdDq);
    else {
      K.error("La taille du tableau passé en parametre ne correspond pas au nombre de pixmap donc on a besoin!");
    }

    this.aQS = true;

    if (this.iBn.biY()) {
      this.iBn.a(this.aMo);
      Jg localJg = (Jg)getParentOfType(Jg.class);
      localJg.setBorder(this.aMo);
    }
  }

  public btu getMesh()
  {
    return this.iBn;
  }

  public Entity getEntity()
  {
    return this.iBn.getEntity();
  }

  public void aJ()
  {
    super.aJ();
    this.iBn = new btu();
    this.iBn.aJ();
  }

  public void bc()
  {
    super.bc();
    this.iBn.bc();
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