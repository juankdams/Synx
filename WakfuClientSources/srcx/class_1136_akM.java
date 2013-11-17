import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class akM extends akN
{
  private static final List aWC = Collections.singletonList(Pq.chC);

  protected List kM()
  {
    return aWC;
  }

  public akM(ArrayList paramArrayList) {
    u(paramArrayList);
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    if (!(paramObject1 instanceof ajF))
      throw new aIh("On essaie de vérifer la distance du pet d'autre chose qu'un joueur");
    if (!(paramObject4 instanceof dbE))
      throw new aIh("On essaie de vérifer la distance du pet ailleurs qu'en combat");
    if (!(paramObject3 instanceof bfE))
      throw new aIh("On essaie de vérifer la distance du pet en utilisant autre chose qu'un sort");
    if (((ajF)paramObject1).awq().aac() == null) {
      return -1;
    }
    long l = ((ajF)paramObject1).awq().aac().cqG();
    if (l == -1L)
      return -1;
    dhJ localdhJ1 = ((dbE)paramObject4).eu(l);
    if (localdhJ1 == null) {
      return -1;
    }

    dhJ localdhJ2 = (dhJ)paramObject1;
    int i = 0;
    if (localdhJ2.b(eu.ayU)) {
      i = localdhJ2.e(eu.ayU);
    }

    bzj localbzj = ((bfE)paramObject3).bsL();
    int j = localbzj.f((bfE)paramObject3, paramObject1, paramObject2, paramObject4);
    int k = localbzj.bIc() ? j + i : j;

    if (cqJ.c(localdhJ2, localdhJ1) <= k) {
      return 0;
    }
    return -1;
  }

  public Enum gm()
  {
    return Bz.bxT;
  }
}