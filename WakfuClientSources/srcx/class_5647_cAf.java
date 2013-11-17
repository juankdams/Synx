import org.apache.log4j.Logger;

public class cAf extends BO
  implements bBz
{
  private static Logger K = Logger.getLogger(cAf.class);
  public static final String TAG = "Color";
  public static final String iqc = "NamedColor";
  private bNa bPo = null;

  private cke iqd = null;

  private String m_name = null;

  private static final aee aOr = new bOO(new bQz(), 800);

  public static final int aMw = "color".hashCode();
  public static final int cex = "name".hashCode();
  public static final int dUa = "position".hashCode();

  public static cAf checkOut()
  {
    cAf localcAf;
    try
    {
      localcAf = (cAf)aOr.Mm();
      localcAf.fnG = aOr;
    }
    catch (Exception localException)
    {
      K.error("Problème au borrowObject.");
      localcAf = new cAf();
      localcAf.aJ();
    }
    return localcAf;
  }

  public String getTag()
  {
    return "Color";
  }

  public void setColor(bNa parambNa)
  {
    if (this.bPo == parambNa) {
      return;
    }
    this.bPo = parambNa;
    g(new cTn(this));
  }

  public bNa getColor()
  {
    return this.bPo;
  }

  public cke getPosition()
  {
    return this.iqd;
  }

  public void setPosition(cke paramcke)
  {
    this.iqd = paramcke;
    g(new cTn(this));
  }

  public String getName()
  {
    return this.m_name;
  }

  public void setName(String paramString)
  {
    this.m_name = paramString;
    g(new cTn(this));
  }

  public void setup(dFD paramdFD)
  {
    if ((paramdFD instanceof Qe))
      ((Qe)paramdFD).setColor(this.bPo, this.m_name);
  }

  public void bc()
  {
    super.bc();
    this.bPo = null;

    this.m_name = null;
    this.iqd = null;
  }

  public void aJ()
  {
    super.aJ();
  }

  public void c(bdj parambdj)
  {
    cAf localcAf = (cAf)parambdj;
    super.c(localcAf);
    localcAf.setColor(getColor());
    localcAf.m_name = this.m_name;
    localcAf.iqd = this.iqd;
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == aMw)
      setColor(paramaKN.gJ(paramString));
    else if (paramInt == cex)
      setName(paramaKN.gL(paramString));
    else if (paramInt == dUa)
      setPosition(cke.lj(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject)
  {
    if (paramInt == aMw)
      setColor((bNa)paramObject);
    else if (paramInt == cex)
      setName(String.valueOf(paramObject));
    else if (paramInt == dUa)
      setPosition((cke)paramObject);
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}