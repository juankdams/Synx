import java.util.ArrayList;
import org.apache.log4j.Logger;

public class axL extends jO
{
  private static Logger K = Logger.getLogger(axL.class);
  public static final String TAG = "GradientBackground";
  private dhQ dMW;

  public String getTag()
  {
    return "GradientBackground";
  }

  public void setColor(cAf paramcAf)
  {
    setColor(paramcAf.getColor(), paramcAf.getPosition());
  }

  public void setColor(bNa parambNa, cke paramcke)
  {
    getMesh().setColor(parambNa, paramcke);
  }

  public dhQ getMesh()
  {
    return this.dMW;
  }

  public boolean isValidAdd(bdj parambdj)
  {
    if (((parambdj instanceof cAf)) && 
      (((cAf)parambdj).getPosition() == null)) {
      K.error("Tentative d'ajout d'un ColorElement sans position");
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
      if (((localaNL instanceof cAf)) && (((cAf)localaNL).getPosition().equals(paramcAf.getPosition())))
        i(localaNL);
    }
  }

  public void aJ()
  {
    super.aJ();
    this.dMW = new dhQ();
    this.dMW.aJ();
  }

  public void bc()
  {
    super.bc();
    this.dMW.bc();
  }
}