import java.util.ArrayList;

public final class Bw extends djF
{
  public Bw(ArrayList paramArrayList)
  {
    super(paramArrayList);
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    Object localObject = aAw.a(this.bUJ, paramObject1, paramObject2, paramObject4, paramObject3);
    axQ localaxQ = aAw.b(false, paramObject1, paramObject2, paramObject4, paramObject3);
    if ((localObject == null) && ((paramObject3 instanceof apn))) {
      localObject = ((apn)paramObject3).aBv();
    }
    if (localObject == null)
      return -1;
    boolean bool;
    if (this.lgI == null)
      bool = ((axQ)localObject).a(this.ddu.b(paramObject1, paramObject2, paramObject3, paramObject4), localaxQ);
    else {
      bool = ((axQ)localObject).a(this.ddu.b(paramObject1, paramObject2, paramObject3, paramObject4), this.lgI.b(paramObject1, paramObject2, paramObject3, paramObject4), localaxQ);
    }

    if (bool)
      return 0;
    return -1;
  }

  public Enum gm()
  {
    return Bz.bDt;
  }
}