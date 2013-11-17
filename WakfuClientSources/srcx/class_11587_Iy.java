import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class Iy extends bik
{
  private bJW bRo;
  bJW bRp;
  static Class bRq;
  static Class bRr;
  static Class bRs;

  protected Iy()
  {
  }

  protected Iy(axA paramaxA)
  {
    super(paramaxA);
  }

  protected Iy(axA paramaxA, int paramInt) {
    super(paramaxA, paramInt);
  }

  protected Iy(bXj parambXj) {
    super(parambXj);
  }

  protected Iy(axA paramaxA, int paramInt, bXj parambXj) {
    super(paramaxA, paramInt, parambXj);
  }

  protected List aR()
  {
    List localList = buk();
    ArrayList localArrayList = new ArrayList();
    for (Iterator localIterator = localList.iterator(); localIterator.hasNext(); ) {
      Field localField = (Field)localIterator.next();
      localArrayList.add(localField.getName());
    }
    return localArrayList;
  }

  public void g(Class paramClass)
  {
    buf();
    for (Iterator localIterator = buc().values().iterator(); localIterator.hasNext(); ) {
      bJW localbJW = (bJW)localIterator.next();
      if (localbJW.type == paramClass) {
        this.bRo = localbJW;
        return;
      }
    }
    throw new IllegalArgumentException("No field of type " + paramClass + " in " + this);
  }

  public void setType(String paramString)
  {
    buf();
    bJW localbJW = (bJW)buc().get(paramString);
    if (localbJW != null) {
      this.bRo = localbJW;
    }
    else
      throw new IllegalArgumentException("No field named " + paramString + " in " + this);
  }

  public Object cb(String paramString)
  {
    buf();
    setType(paramString);
    return super.cb(paramString);
  }

  public void cc(String paramString)
  {
    buf();
    setType(paramString);
    super.cc(paramString);
  }

  public void h(String paramString, Object paramObject)
  {
    buf();
    setType(paramString);
    super.h(paramString, paramObject);
  }

  public Object h(Class paramClass)
  {
    buf();
    for (Iterator localIterator = buc().values().iterator(); localIterator.hasNext(); ) {
      bJW localbJW = (bJW)localIterator.next();
      if (localbJW.type == paramClass) {
        this.bRo = localbJW;
        hb();
        return a(this.bRo.field);
      }
    }
    throw new IllegalArgumentException("No field of type " + paramClass + " in " + this);
  }

  public Object H(Object paramObject)
  {
    bJW localbJW = i(paramObject.getClass());
    if (localbJW != null) {
      this.bRo = localbJW;
      a(localbJW.field, paramObject);
      return this;
    }
    throw new IllegalArgumentException("No field of type " + paramObject.getClass() + " in " + this);
  }

  private bJW i(Class paramClass)
  {
    buf();
    for (Iterator localIterator = buc().values().iterator(); localIterator.hasNext(); ) {
      bJW localbJW = (bJW)localIterator.next();
      if (localbJW.type.isAssignableFrom(paramClass)) {
        return localbJW;
      }
    }
    return null;
  }

  void a(bJW parambJW)
  {
    if (parambJW == this.bRo)
      super.a(parambJW);
  }

  Object b(bJW parambJW)
  {
    if (parambJW != this.bRo) { if (!(bRq == null ? (Iy.bRq = cd("bik")) : bRq).isAssignableFrom(parambJW.type)) if (!(bRr == null ? (Iy.bRr = cd("java.lang.String")) : bRr).isAssignableFrom(parambJW.type))
          if ((bRs == null ? (Iy.bRs = cd("cFg")) : bRs).isAssignableFrom(parambJW.type));
    }
    else {
      return super.b(parambJW);
    }

    return null;
  }

  int g(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = super.g(paramBoolean1, paramBoolean2);
    if (i != -1) {
      int j = 0;
      for (Iterator localIterator = buc().values().iterator(); localIterator.hasNext(); ) {
        bJW localbJW = (bJW)localIterator.next();
        localbJW.offset = 0;
        if (localbJW.size <= j) { if (localbJW.size == j)
          {
            if (!(bRq == null ? (Iy.bRq = cd("bik")) : bRq).isAssignableFrom(localbJW.type));
          }

        }
        else
        {
          j = localbJW.size;
          this.bRp = localbJW;
        }
      }
      i = pR(j);
      if (i > 0)
      {
        if (((this instanceof qR)) && (!paramBoolean2)) {
          RT();
        }
      }
    }
    return i;
  }

  protected int a(Class paramClass, Object paramObject, boolean paramBoolean) {
    return super.a(paramClass, paramObject, true);
  }

  axA RT()
  {
    if (this.bRp == null)
    {
      return null;
    }
    return super.RT();
  }

  static Class cd(String paramString)
  {
    try
    {
      return Class.forName(paramString); } catch (ClassNotFoundException localClassNotFoundException) { throw new NoClassDefFoundError().initCause(localClassNotFoundException); }

  }
}