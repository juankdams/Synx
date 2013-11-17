import java.util.Stack;
import java.util.Vector;

public final class bma extends cwV
  implements Cloneable
{
  private String className;
  private final Vector parameters = new Vector();
  private aoo cdY;

  public void setClassName(String paramString)
  {
    if (cum()) {
      throw cuq();
    }
    this.className = paramString;
  }

  public String getClassName()
  {
    if (cum()) {
      return ((bma)cup()).getClassName();
    }
    cuo();
    return this.className;
  }

  public void a(daL paramdaL)
  {
    if (cum()) {
      throw cur();
    }
    this.parameters.addElement(paramdaL);
  }

  public void h(aoo paramaoo)
  {
    if (cum()) {
      throw cuq();
    }
    if (this.cdY == null)
      this.cdY = paramaoo;
    else {
      this.cdY.e(paramaoo);
    }
    setChecked(false);
  }

  public aoo aKw()
  {
    if (cum()) {
      throw cur();
    }
    if (this.cdY == null) {
      this.cdY = new aoo(Ga());
    }
    setChecked(false);
    return this.cdY.aAD();
  }

  public aoo bwY()
  {
    if (cum()) {
      ((bma)cup()).bwY();
    }
    cuo();
    return this.cdY;
  }

  public void b(cxK paramcxK)
  {
    if (cum()) {
      throw cuq();
    }
    aKw().a(paramcxK);
  }

  public daL[] bwZ()
  {
    if (cum()) {
      ((bma)cup()).bwZ();
    }
    cuo();
    daL[] arrayOfdaL = new daL[this.parameters.size()];
    this.parameters.copyInto(arrayOfdaL);
    return arrayOfdaL;
  }

  public void a(cxK paramcxK)
  {
    if ((!this.parameters.isEmpty()) || (this.className != null) || (this.cdY != null))
    {
      throw cuq();
    }
    super.a(paramcxK);
  }

  protected synchronized void a(Stack paramStack, FF paramFF)
  {
    if (isChecked()) {
      return;
    }
    if (cum()) {
      super.a(paramStack, paramFF);
    } else {
      if (this.cdY != null) {
        b(this.cdY, paramStack, paramFF);
      }
      setChecked(true);
    }
  }
}