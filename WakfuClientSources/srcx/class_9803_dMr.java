import java.awt.event.MouseEvent;
import org.apache.log4j.Logger;

public class dMr extends bv
{
  private static Logger K = Logger.getLogger(dMr.class);

  private static final aee aOr = new bOO(new bdd());
  protected int kO;
  protected int kP;
  protected int bPg;
  protected int bPh;
  protected int mcx;
  private static int iyg = 0;
  private static int iyh = 0;

  public int y(dOc paramdOc)
  {
    if (paramdOc != null) {
      return this.kO - paramdOc.getDisplayX();
    }

    return 0;
  }

  public int getScreenX()
  {
    return this.kO;
  }

  public void setScreenX(int paramInt)
  {
    this.kO = paramInt;
  }

  public int z(dOc paramdOc)
  {
    if (paramdOc != null) {
      return this.kP - paramdOc.getDisplayY();
    }

    return 0;
  }

  public int getScreenY()
  {
    return this.kP;
  }

  public void setScreenY(int paramInt)
  {
    this.kP = paramInt;
  }

  public int getButton()
  {
    return this.bPg;
  }

  public void nS(int paramInt)
  {
    this.bPg = paramInt;
  }

  public int getClickCount()
  {
    return this.bPh;
  }

  public void CW(int paramInt)
  {
    this.bPh = paramInt;
  }

  public int dpj()
  {
    return this.mcx;
  }

  public void CX(int paramInt)
  {
    this.mcx = paramInt;
  }

  public static dMr m(MouseEvent paramMouseEvent)
  {
    dMr localdMr = dpk();

    localdMr.bPg = paramMouseEvent.getButton();
    localdMr.kr = paramMouseEvent.getModifiersEx();
    localdMr.bPh = paramMouseEvent.getClickCount();

    return localdMr;
  }

  public static dMr dpk()
  {
    iyg += 1;
    dMr localdMr;
    try
    {
      localdMr = (dMr)aOr.Mm();
      localdMr.fnG = aOr;
    } catch (Exception localException) {
      K.error("Problème au borrowObject.");
      localdMr = new dMr();
      localdMr.aJ();
    }
    return localdMr;
  }

  public static dMr l(dMr paramdMr)
  {
    dMr localdMr = dpk();
    localdMr.nS(paramdMr.bPg);
    localdMr.CW(paramdMr.bPh);
    localdMr.setModifiers(paramdMr.kr);

    localdMr.setScreenX(paramdMr.kO);
    localdMr.setScreenY(paramdMr.kP);
    localdMr.q(paramdMr.kET);
    return localdMr;
  }

  public void release()
  {
    super.release();
    iyh += 1;
  }

  public void bc()
  {
    super.bc();
  }
}