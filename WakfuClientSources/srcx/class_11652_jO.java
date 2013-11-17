import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class jO extends dqC
  implements dKW
{
  private static Logger K = Logger.getLogger(jO.class);
  public static final String TAG = "PlainBackground";
  private Kc aMv;
  public static final int aMw = "color".hashCode();

  public void b(aNL paramaNL)
  {
    super.b(paramaNL);
  }

  public void a(aNL paramaNL)
  {
    if ((paramaNL instanceof cAf)) {
      paramaNL.a(CH.bFV, new aJK(this), false);

      setColor((cAf)paramaNL);
      a((cAf)paramaNL);
    }
    super.a(paramaNL);
  }

  public String getTag()
  {
    return "PlainBackground";
  }

  public void c(bdj parambdj)
  {
    jO localjO = (jO)parambdj;
    localjO.setColor(getColor());
    super.c(parambdj);
  }

  public void setColor(cAf paramcAf)
  {
    setColor(paramcAf.getColor());
  }

  public void setColor(bNa parambNa)
  {
    if (parambNa != null)
      getMesh().setColor(parambNa);
  }

  public bNa getColor()
  {
    return getMesh().getColor();
  }

  public Kc getMesh()
  {
    return this.aMv;
  }

  public Entity getEntity() {
    return getMesh().UM();
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

  public void aJ()
  {
    super.aJ();
    this.aMv = new Kc();
    this.aMv.aJ();
  }

  public void bc()
  {
    super.bc();
    this.aMv.bc();
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
    if (paramInt == aMw)
      setColor((bNa)paramObject);
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }

  public void setModulationColor(bNa parambNa) {
    this.aMv.setModulationColor(parambNa);
  }

  public bNa getModulationColor() {
    return this.aMv.getModulationColor();
  }
}