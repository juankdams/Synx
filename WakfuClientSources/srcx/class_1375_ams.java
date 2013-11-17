import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class ams extends jH
  implements dKW
{
  private static Logger K = Logger.getLogger(ams.class);
  public static final String TAG = "PlainBorder";
  private Hb doT = new Hb();

  public static final int aMw = "color".hashCode();

  public void a(aNL paramaNL)
  {
    if ((paramaNL instanceof cAf)) {
      paramaNL.a(CH.bFV, new cyM(this), false);

      setColor((cAf)paramaNL);
      a((cAf)paramaNL);
    }
    super.a(paramaNL);
  }

  public String getTag()
  {
    return "PlainBorder";
  }

  public boolean isValidAdd(bdj parambdj)
  {
    if (((parambdj instanceof cAf)) && 
      (((cAf)parambdj).getColor() == null)) {
      K.error("Tentative d'ajout d'un ColorElement sans couleur");
      return false;
    }

    return super.isValidAdd(parambdj);
  }

  public Hb getMesh()
  {
    return this.doT;
  }

  public Entity getEntity()
  {
    return this.doT.getEntity();
  }

  public void setColor(cAf paramcAf)
  {
    setColor(paramcAf.getColor());
  }

  public void setColor(bNa parambNa)
  {
    this.doT.setColor(parambNa);
  }

  public bNa getColor()
  {
    return this.doT.getColor();
  }

  public void setModulationColor(bNa parambNa) {
    this.doT.setModulationColor(parambNa);
  }

  public bNa getModulationColor() {
    return this.doT.getModulationColor();
  }

  protected void a(cAf paramcAf)
  {
    if (this.bFw == null) {
      return;
    }
    for (int i = this.bFw.size() - 1; i >= 0; i--) {
      aNL localaNL = (aNL)this.bFw.get(i);
      if ((localaNL instanceof cAf))
        i(localaNL);
    }
  }

  public void c(bdj parambdj)
  {
    super.c(parambdj);
    ams localams = (ams)parambdj;
    localams.setColor(this.doT.getColor());
    localams.setModulationColor(getModulationColor());
  }

  public void bc()
  {
    super.bc();
    this.doT.bc();
  }

  public void aJ()
  {
    super.aJ();
    this.doT.aJ();
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == aMw)
      setColor(paramaKN.gJ(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == aMw) {
      if (paramObject != null)
        setColor((bNa)paramObject);
    }
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}