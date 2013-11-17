import com.ankamagames.framework.graphics.engine.entity.Entity;
import org.apache.log4j.Logger;

public class aen extends dqC
  implements doT
{
  private static Logger K = Logger.getLogger(aen.class);
  public static final String TAG = "PixmapBackground";
  private duy cVm = new duy();

  private static final aee aOr = new bOO(new ic());

  public static final int bFb = "modulationColor".hashCode();

  public static aen checkOut()
  {
    aen localaen;
    try
    {
      localaen = (aen)aOr.Mm();
      localaen.fnG = aOr;
    }
    catch (Exception localException)
    {
      K.error("Problème au borrowObject.");
      localaen = new aen();
      localaen.aJ();
    }
    return localaen;
  }

  public void a(aNL paramaNL)
  {
    if ((paramaNL instanceof aAR)) {
      setPixmap((aAR)paramaNL);
    }
    super.a(paramaNL);
  }

  public String getTag()
  {
    return "PixmapBackground";
  }

  public void setModulationColor(bNa parambNa)
  {
    this.cVm.setModulationColor(parambNa);
  }

  public bNa getModulationColor()
  {
    return this.cVm.getModulationColor();
  }

  public void setPixmap(aAR paramaAR)
  {
    switch (ia.aHB[paramaAR.getPosition().ordinal()]) {
    case 1:
      this.cVm.e(paramaAR.getPixmap());
      break;
    case 2:
      this.cVm.c(paramaAR.getPixmap());
      break;
    case 3:
      this.cVm.d(paramaAR.getPixmap());
      break;
    case 4:
      this.cVm.i(paramaAR.getPixmap());
      break;
    case 5:
      this.cVm.j(paramaAR.getPixmap());
      break;
    case 6:
      this.cVm.b(paramaAR.getPixmap());
      break;
    case 7:
      this.cVm.h(paramaAR.getPixmap());
      break;
    case 8:
      this.cVm.f(paramaAR.getPixmap());
      break;
    case 9:
      this.cVm.g(paramaAR.getPixmap());
    }
  }

  public void setPixmaps(dDq paramdDq1, dDq paramdDq2, dDq paramdDq3, dDq paramdDq4, dDq paramdDq5, dDq paramdDq6, dDq paramdDq7, dDq paramdDq8, dDq paramdDq9)
  {
    this.cVm.setPixmaps(paramdDq1, paramdDq2, paramdDq3, paramdDq4, paramdDq5, paramdDq6, paramdDq7, paramdDq8, paramdDq9);

    if ((paramdDq1 == null) || (paramdDq2 == null) || (paramdDq3 == null) || (paramdDq4 == null) || (paramdDq5 == null) || (paramdDq6 == null) || (paramdDq7 == null) || (paramdDq8 == null) || (paramdDq9 == null))
    {
      K.error("Une des pixmaps passée est nulle !");
    }
  }

  public void setPixmaps(dDq[] paramArrayOfdDq)
  {
    if (paramArrayOfdDq.length == 9)
      this.cVm.setPixmaps(paramArrayOfdDq);
    else {
      K.error("La taille du tableau passé en parametre ne correspond pas au nombre de pixmap donc on a besoin!");
    }

    if ((paramArrayOfdDq[0] == null) || (paramArrayOfdDq[1] == null) || (paramArrayOfdDq[2] == null) || (paramArrayOfdDq[3] == null) || (paramArrayOfdDq[4] == null) || (paramArrayOfdDq[5] == null) || (paramArrayOfdDq[6] == null) || (paramArrayOfdDq[7] == null) || (paramArrayOfdDq[8] == null))
    {
      K.error("Une des pixmaps passée est nulle !");
    }
  }

  public void setPixmaps(dDq paramdDq)
  {
    this.cVm.setPixmaps(paramdDq);

    if (paramdDq == null)
      K.error("Une des pixmaps passée est nulle !");
  }

  public duy getMesh()
  {
    return this.cVm;
  }

  public Entity getEntity()
  {
    return this.cVm.getEntity();
  }

  public void setScaled(boolean paramBoolean)
  {
    super.setScaled(paramBoolean);
    this.cVm.setScaled(paramBoolean);
  }

  public void bc()
  {
    super.bc();

    this.cVm.bc();
    this.cVm = null;
  }

  public void aJ()
  {
    super.aJ();
    this.cVm = new duy();
    this.cVm.aJ();
  }

  public void c(bdj parambdj)
  {
    super.c(parambdj);
    aen localaen = (aen)parambdj;
    localaen.setScaled(isScaled());
    localaen.setModulationColor(getModulationColor());
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