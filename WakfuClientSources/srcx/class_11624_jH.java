import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.awt.Insets;

public abstract class jH extends csD
{
  protected Insets aMo;
  protected boolean aMp;
  public static final int aMq = "spacing".hashCode();
  public static final int aMr = "insets".hashCode();

  public Insets getInsets()
  {
    return this.aMo;
  }

  public void setInsets(Insets paramInsets)
  {
    this.aMo.set(paramInsets.top, paramInsets.left, paramInsets.bottom, paramInsets.right);
  }

  public void setSpacing(Insets paramInsets)
  {
    setInsets(paramInsets);
  }

  public abstract Entity getEntity();

  public void bc()
  {
    super.bc();
    this.aMo = null;
  }

  public void aJ()
  {
    super.aJ();
    this.aMo = new Insets(0, 0, 0, 0);
  }

  public void c(bdj parambdj)
  {
    jH localjH = (jH)parambdj;
    super.c(localjH);
    localjH.setInsets(this.aMo);
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if ((paramInt == aMq) || (paramInt == aMr))
      setInsets(paramaKN.gM(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if ((paramInt == aMq) || (paramInt == aMr))
      setInsets((Insets)paramObject);
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}