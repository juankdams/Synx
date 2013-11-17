import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public final class bqY extends cIX
{
  private static ArrayList aAG = new ArrayList();

  protected List kM()
  {
    return aAG;
  }

  public bqY(ArrayList paramArrayList)
  {
    J(paramArrayList);
  }

  public boolean pH() {
    return true;
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    if (!(paramObject3 instanceof doA)) {
      return -1L;
    }
    dDN localdDN = ((doA)paramObject3).bkq();
    if (localdDN == null) {
      K.error("On ne peut pas calculer la distance a partir du porteur d'un effet, l'effet n'est pas stocké dans un manager ");
      return -1L;
    }

    dle localdle = localdDN.axG();
    if (localdle == null)
      return -1L;
    Object localObject;
    if ((paramObject2 instanceof cDW)) {
      localObject = (cDW)paramObject2;
      return cqJ.c(localdle, (cDW)localObject);
    }if ((paramObject2 instanceof cYk)) {
      localObject = (cYk)paramObject2;
      return cqJ.c(localdle, (cYk)localObject);
    }
    return -1L;
  }

  public Enum gm() {
    return Bz.bCC;
  }

  static
  {
    aAG.add(new Pq[0]);
  }
}