import java.util.ArrayList;
import org.apache.log4j.Logger;

public abstract class aEg
{
  protected static final Logger K = Logger.getLogger(Hh.class);

  protected final cSR dZB = new cSR();

  public void e(ge paramge)
  {
    this.dZB.put(paramge.nc(), paramge);
  }

  public ge g(int paramInt)
  {
    return (ge)this.dZB.get(paramInt);
  }

  public ArrayList aQn()
  {
    ArrayList localArrayList = new ArrayList(1);

    for (dmn localdmn = this.dZB.yF(); localdmn.hasNext(); ) {
      localdmn.fl();

      ge localge = (ge)localdmn.value();

      if (g(localge.nd()) == null) {
        localArrayList.add(localge);
      }
    }

    return localArrayList;
  }

  public void aQo()
  {
    ArrayList localArrayList = new ArrayList(1);

    for (dmn localdmn = this.dZB.yF(); localdmn.hasNext(); ) {
      localdmn.fl();

      localge1 = (ge)localdmn.value();

      ge localge2 = g(localge1.nd());
      localge1.a(localge2);

      if (localge2 == null) {
        localArrayList.add(localge1);
      }
      else
      {
        localge2.b(localge1);
      }
    }
    ge localge1;
    for (int i = localArrayList.size() - 1; i >= 0; i--) {
      localge1 = (ge)localArrayList.get(i);
      f(localge1);
    }
  }

  private void f(ge paramge)
  {
    if (!paramge.nf())
      return;
    cjT localcjT = paramge.ng();
    for (int i = localcjT.size() - 1; i >= 0; i--)
    {
      ge localge = (ge)localcjT.get(i);

      azO[] arrayOfazO1 = paramge.nh();
      azO[] arrayOfazO2 = localge.nh();
      if ((arrayOfazO1.length != 0) && (arrayOfazO2.length == 0)) {
        localge.a(arrayOfazO1);
      }

      if ((paramge.nj() != null) && (paramge.nj().length != 0) && ((localge.nj() == null) || (localge.nj().length == 0))) {
        localge.b(paramge.nj());
      }
      f(localge);
    }
  }

  public void aQp()
  {
    ArrayList localArrayList = new ArrayList(1);

    for (dmn localdmn = this.dZB.yF(); localdmn.hasNext(); ) {
      localdmn.fl();
      localge1 = (ge)localdmn.value();
      ge localge2 = localge1.ne();

      if (localge2 == null)
        localArrayList.add(localge1);
    }
    ge localge1;
    for (int i = localArrayList.size() - 1; i >= 0; i--) {
      localge1 = (ge)localArrayList.get(i);
      g(localge1);
    }
  }

  private void g(ge paramge)
  {
    if (!paramge.nf())
      return;
    cjT localcjT = paramge.ng();
    for (int i = localcjT.size() - 1; i >= 0; i--) {
      ge localge = (ge)localcjT.get(i);
      f(localge);
    }
  }
}