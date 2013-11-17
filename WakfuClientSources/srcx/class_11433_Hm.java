import java.util.ArrayList;

public final class Hm
{
  private static final Hm bPt = new Hm();

  private final cSR bPu = new cSR();

  public static Hm QP()
  {
    return bPt;
  }

  public cKX a(NW paramNW) {
    if (paramNW.aap()) {
      localObject = eQ(paramNW.aan());
      if (localObject != null) {
        int i = 0; for (int j = ((ArrayList)localObject).size(); i < j; i++) {
          cKX localcKX = (cKX)((ArrayList)localObject).get(i);
          if (localcKX.getLevel() >= paramNW.getLevel())
          {
            return null;
          }if (localcKX.aap())
          {
            localcKX.cEn();
            break;
          }
        }
      }
    }
    Object localObject = cBQ.cxL().a(paramNW.getMessage(), paramNW.getTitle(), paramNW.fJ(), paramNW.getType(), paramNW.getOptions(), paramNW.aao());
    ((cKX)localObject).b(paramNW);
    a((cKX)localObject);

    return localObject;
  }

  private void a(cKX paramcKX) {
    Cu.a(this.bPu, paramcKX.aan(), paramcKX);
  }

  public void b(cKX paramcKX) {
    ArrayList localArrayList = (ArrayList)this.bPu.get(paramcKX.aan());
    if (localArrayList == null) {
      return;
    }
    localArrayList.remove(paramcKX);
  }

  private ArrayList eQ(int paramInt) {
    return (ArrayList)this.bPu.get(paramInt);
  }
}