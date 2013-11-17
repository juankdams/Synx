import org.apache.log4j.Logger;

public class cba extends dgQ
  implements bBz
{
  private static Logger K = Logger.getLogger(cba.class);
  public static final String TAG = "borderLayoutData";
  public static final String cwM = "bld";
  private cFu hrS;
  private static final aee aOr = new bOO(new Cv());

  public static final int hrT = "data".hashCode();

  public cba()
  {
    this.hrS = null;
  }

  public static cba checkOut()
  {
    cba localcba;
    try
    {
      localcba = (cba)aOr.Mm();
      localcba.fnG = aOr;
    }
    catch (Exception localException)
    {
      K.error("Problème au borrowObject.");
      localcba = new cba();
      localcba.aJ();
    }
    return localcba;
  }

  public String getTag()
  {
    return "borderLayoutData";
  }

  public cFu getData() {
    return this.hrS;
  }

  public void setData(cFu paramcFu) {
    this.hrS = paramcFu;
  }

  public void c(bdj parambdj)
  {
    cba localcba = (cba)parambdj;
    super.c(localcba);
    localcba.hrS = this.hrS;
  }

  public void bc()
  {
    super.bc();

    this.hrS = null;
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == hrT)
      setData(cFu.nl(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }
    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    return super.setPropertyAttribute(paramInt, paramObject);
  }
}