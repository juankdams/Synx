import org.apache.log4j.Logger;

public class NK extends bxE
  implements bBz
{
  private static Logger K = Logger.getLogger(NK.class);
  public static final String TAG = "Property";
  private String m_name = null;

  private String cer = null;

  private String ces = null;

  private boolean cet = false;

  private bbo ceu = null;

  private fu cev = null;

  private static final aee aOr = new bOO(new aGc(), 500);

  public static final int cew = "local".hashCode();
  public static final int cex = "name".hashCode();
  public static final int cey = "attribute".hashCode();
  public static final int cez = "field".hashCode();

  public static NK checkOut()
  {
    NK localNK;
    try
    {
      localNK = (NK)aOr.Mm();
      localNK.fnG = aOr;
    }
    catch (Exception localException)
    {
      K.error("Problème au borrowObject.");
      localNK = new NK();
      localNK.aJ();
    }
    return localNK;
  }

  public void a(aNL paramaNL)
  {
    if ((paramaNL instanceof fu)) {
      this.cev = ((fu)paramaNL);
    }
    super.a(paramaNL);
  }

  public String getTag()
  {
    return "Property";
  }

  public String getName() {
    return this.m_name;
  }

  public void setName(String paramString) {
    this.m_name = paramString;
  }

  public void setField(String paramString) {
    this.cer = paramString;
  }

  public void setAttribute(String paramString) {
    this.ces = paramString;
  }

  public void setLocal(boolean paramBoolean) {
    this.cet = paramBoolean;
  }

  public bbo getProperty() {
    return this.ceu;
  }

  public void aI(bdj parambdj)
  {
    if ((this.ceu != null) && (parambdj != null))
      this.ceu.b(new dBf(parambdj, IZ.Sq().dc(parambdj.getTag()), this.ces, this.cer, this.cev), false);
  }

  public void ZV()
  {
    if (this.ceu == null)
    {
      this.ceu = dLE.doY().l(this.m_name, this.cet ? this.cUY : null);

      if (this.ceu == null) {
        this.ceu = new bbo(this.m_name, this.cet ? this.cUY : null);
        dLE.doY().c(this.ceu);
      }

      cDA localcDA = this.cUY.coO();
      if (localcDA == null) {
        localcDA = cBQ.cxL().coO();
      }
      dso[] arrayOfdso = localcDA.czw();
      if (arrayOfdso != null) {
        for (Object localObject2 : arrayOfdso) {
          localObject2.c(this.ceu);
        }
      }

      ??? = new dBf(this.fnK, IZ.Sq().dc(this.fnK.getTag()), this.ces, this.cer, this.cev);

      this.ceu.b((dBf)???, false);
    }
  }

  public void rV()
  {
    super.rV();

    ZV();
  }

  public void ZW()
  {
    super.ZW();
    ZV();
  }

  public void bc()
  {
    super.bc();
    this.m_name = null;
    this.cer = null;
    this.ces = null;
    this.cev = null;
    this.ceu = null;
  }

  public void aJ()
  {
    this.cet = false;
    super.aJ();
  }

  public void c(bdj parambdj)
  {
    NK localNK = (NK)parambdj;
    super.c(localNK);
    localNK.ces = this.ces;
    localNK.cer = this.cer;
    localNK.m_name = this.m_name;
    localNK.cet = this.cet;
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == cew)
      setLocal(bUD.getBoolean(paramString));
    else if (paramInt == cex)
      setName(paramaKN.gL(paramString));
    else if (paramInt == cey)
      setAttribute(paramaKN.gL(paramString));
    else if (paramInt == cez)
      setField(paramaKN.gL(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject)
  {
    if (paramInt == cew)
      setLocal(bUD.getBoolean(paramObject));
    else if (paramInt == cex)
      setName(String.valueOf(paramObject));
    else if (paramInt == cey)
      setAttribute(String.valueOf(paramObject));
    else if (paramInt == cez)
      setField(String.valueOf(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}