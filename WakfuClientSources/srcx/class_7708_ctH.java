import org.apache.log4j.Logger;

public class ctH extends bv
{
  private static Logger K = Logger.getLogger(ctH.class);

  private static final aee aOr = new bOO(new box());
  private int hMw;
  private char idR;

  public char getKeyChar()
  {
    return this.idR;
  }

  public void setKeyChar(char paramChar)
  {
    this.idR = paramChar;
  }

  public int getKeyCode()
  {
    return this.hMw;
  }

  public void setKeyCode(int paramInt)
  {
    this.hMw = paramInt;
  }

  public static ctH crh()
  {
    ctH localctH;
    try
    {
      localctH = (ctH)aOr.Mm();
      localctH.fnG = aOr;
    } catch (Exception localException) {
      K.error("Problème au borrowObject.");
      localctH = new ctH();
      localctH.aJ();
    }
    return localctH;
  }

  public void bc()
  {
    this.idR = 65535;

    this.hMw = -1;
  }
}