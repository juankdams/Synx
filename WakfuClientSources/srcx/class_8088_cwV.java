import java.util.Stack;

public abstract class cwV extends dwE
  implements Cloneable
{
  protected cxK ijI;
  protected boolean ijJ = true;

  public boolean cum()
  {
    return this.ijI != null;
  }

  public void a(cxK paramcxK)
  {
    this.ijI = paramcxK;
    this.ijJ = false;
  }

  protected String cun()
  {
    return aXW.a(Ga(), this, true);
  }

  protected void cuo()
  {
    T(Ga());
  }

  protected void T(FF paramFF)
  {
    if ((this.ijJ) || (!cum())) {
      return;
    }
    a(new bxi(this), paramFF);
  }

  protected void a(Stack paramStack, FF paramFF)
  {
    if ((this.ijJ) || (!cum())) {
      return;
    }
    Object localObject = this.ijI.V(paramFF);

    if ((localObject instanceof cwV)) {
      bxi localbxi = bxi.a(paramStack);

      if (localbxi.contains(localObject)) {
        throw cus();
      }
      localbxi.push(localObject);
      ((cwV)localObject).a(localbxi, paramFF);
      localbxi.pop();
    }

    this.ijJ = true;
  }

  public static void a(cwV paramcwV, Stack paramStack, FF paramFF)
  {
    paramcwV.a(paramStack, paramFF);
  }

  public static void b(cwV paramcwV, Stack paramStack, FF paramFF)
  {
    paramStack.push(paramcwV);
    paramcwV.a(paramStack, paramFF);
    paramStack.pop();
  }

  protected Object cup()
  {
    return U(Ga());
  }

  protected Object U(FF paramFF)
  {
    return a(getClass(), cun(), paramFF);
  }

  protected Object i(Class paramClass, String paramString)
  {
    return a(paramClass, paramString, Ga());
  }

  protected Object a(Class paramClass, String paramString, FF paramFF)
  {
    if (paramFF == null) {
      throw new cJ("No Project specified");
    }
    T(paramFF);
    Object localObject1 = this.ijI.V(paramFF);
    if (!paramClass.isAssignableFrom(localObject1.getClass())) {
      d("Class " + localObject1.getClass() + " is not a subclass of " + paramClass, 3);

      localObject2 = this.ijI.cuW() + " doesn't denote a " + paramString;
      throw new cJ((String)localObject2);
    }

    Object localObject2 = localObject1;
    return localObject2;
  }

  protected cJ cuq()
  {
    return new cJ("You must not specify more than one attribute when using refid");
  }

  protected cJ cur()
  {
    return new cJ("You must not specify nested elements when using refid");
  }

  protected cJ cus()
  {
    return new cJ("This data type contains a circular reference.");
  }

  protected boolean isChecked()
  {
    return this.ijJ;
  }

  protected void setChecked(boolean paramBoolean)
  {
    this.ijJ = paramBoolean;
  }

  public cxK cut()
  {
    return this.ijI;
  }

  protected void cuu()
  {
    if (cum())
      throw cuq();
  }

  protected void cuv()
  {
    if (cum())
      throw cur();
  }

  public String toString()
  {
    String str = getDescription();
    return cun() + " " + str;
  }

  public Object clone()
  {
    cwV localcwV = (cwV)super.clone();
    localcwV.setDescription(getDescription());
    if (cut() != null) {
      localcwV.a(cut());
    }
    localcwV.setChecked(isChecked());
    return localcwV;
  }
}