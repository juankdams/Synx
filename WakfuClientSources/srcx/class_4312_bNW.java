import java.io.PrintStream;
import java.util.ArrayList;

public final class bNW extends cIX
{
  private static ArrayList aAG = new ArrayList();

  public bNW(ArrayList paramArrayList)
  {
    J(paramArrayList);
  }

  protected ArrayList Vs()
  {
    return aAG;
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    int i = 0;
    Object localObject = aAw.aj(paramObject3);

    while (localObject != null)
    {
      i++;
      doA localdoA = aAw.aj(localObject);
      if (localdoA != localObject)
        localObject = localdoA;
      else {
        localObject = null;
      }
    }
    System.err.println("Nombre d'ancètres : " + i);
    return i;
  }

  public boolean pH()
  {
    return true;
  }

  public Enum gm()
  {
    return Bz.bCI;
  }

  static
  {
    aAG.add(new Pq[0]);
  }
}