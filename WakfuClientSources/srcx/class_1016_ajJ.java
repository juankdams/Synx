import java.util.List;

public class ajJ extends awD
{
  private static final long serialVersionUID = -1708388017160694542L;
  protected final dsr djq;

  public static List a(List paramList, dsr paramdsr)
  {
    return new ajJ(paramList, paramdsr);
  }

  protected ajJ(List paramList, dsr paramdsr)
  {
    super(paramList);
    if (paramdsr == null) {
      throw new IllegalArgumentException("Factory must not be null");
    }
    this.djq = paramdsr;
  }

  public Object get(int paramInt)
  {
    int i = getList().size();
    if (paramInt < i)
    {
      Object localObject1 = getList().get(paramInt);
      if (localObject1 == null)
      {
        localObject1 = this.djq.create();
        getList().set(paramInt, localObject1);
        return localObject1;
      }

      return localObject1;
    }

    for (int j = i; j < paramInt; j++) {
      getList().add(null);
    }

    Object localObject2 = this.djq.create();
    getList().add(localObject2);
    return localObject2;
  }

  public List subList(int paramInt1, int paramInt2)
  {
    List localList = getList().subList(paramInt1, paramInt2);
    return new ajJ(localList, this.djq);
  }
}