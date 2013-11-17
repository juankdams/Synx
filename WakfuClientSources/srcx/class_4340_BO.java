import org.apache.log4j.Logger;

public abstract class BO extends aoe
  implements cfd
{
  private static Logger K = Logger.getLogger(BO.class);
  private boolean bEb;
  public static final int bEc = "decoratorSwitch".hashCode();

  public boolean isDecoratorSwitch()
  {
    return this.bEb;
  }

  public void setDecoratorSwitch(boolean paramBoolean) {
    this.bEb = paramBoolean;
  }

  public abstract void setup(dFD paramdFD);

  public void aJ()
  {
    super.aJ();

    this.bEb = false;
  }

  public void c(bdj parambdj)
  {
    super.c(parambdj);

    BO localBO = (BO)parambdj;
    localBO.setDecoratorSwitch(this.bEb);
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == bEc)
      setDecoratorSwitch(bUD.getBoolean(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == bEc)
      setDecoratorSwitch(bUD.getBoolean(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}