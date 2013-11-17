import java.util.Stack;
import org.apache.log4j.Logger;

public class bJA extends BO
  implements bBz
{
  private static Logger K = Logger.getLogger(bJA.class);
  public static final String TAG = "Font";
  private P gKX = null;

  private static final aee aOr = new bOO(new bMi(), 500);

  public static final int gKY = "renderer".hashCode();

  public static bJA checkOut()
  {
    bJA localbJA;
    try
    {
      localbJA = (bJA)aOr.Mm();
      localbJA.fnG = aOr;
    }
    catch (Exception localException)
    {
      K.error("Problème au borrowObject.");
      localbJA = new bJA();
      localbJA.aJ();
    }
    return localbJA;
  }

  public String getTag()
  {
    return "Font";
  }

  public void setRenderer(P paramP)
  {
    this.gKX = paramP;
  }

  public P getRenderer()
  {
    return this.gKX;
  }

  public void setup(dFD paramdFD)
  {
    if ((paramdFD instanceof dbR))
      ((dbR)paramdFD).setFont(this.gKX);
  }

  public void bc()
  {
    super.bc();
    this.gKX = null;
  }

  public void aJ()
  {
    super.aJ();
  }

  public void c(bdj parambdj)
  {
    bJA localbJA = (bJA)parambdj;
    super.c(localbJA);
    localbJA.gKX = this.gKX;
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == gKY)
      setRenderer(paramaKN.gO(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject)
  {
    if (paramInt == gKY)
      setRenderer((bMR)paramObject);
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }

  public void a(K paramK, aNL paramaNL, Stack paramStack, cDA paramcDA)
  {
    super.a(paramK, paramaNL, paramStack, paramcDA);

    K localK = paramK.e("ref");
    if (localK != null) {
      setRenderer(cBQ.cxL().bSM().aI(localK.getStringValue()));
    }

    paramK.b(localK);
  }
}