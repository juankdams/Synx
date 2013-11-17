import java.util.ArrayList;
import java.util.List;

public final class cuy extends akN
{
  private static ArrayList aAG = new ArrayList();

  private boolean aXA = false;

  public cuy(ArrayList paramArrayList)
  {
    u(paramArrayList);
    this.aXA = false;
  }

  protected List kM() {
    return aAG;
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    dhJ localdhJ = aAw.a(this.aXA, paramObject1, paramObject2, paramObject4, paramObject3);

    aVc localaVc = localdhJ.zY(bsj.fVi.getId());
    if (localaVc == null) {
      return -1;
    }
    dle localdle = localaVc.bkf();
    if (localdle == null) {
      return -1;
    }

    if (((localdle instanceof cDg)) && 
      (((cDg)localdle).czh() == 3)) {
      return -1;
    }
    boolean bool = localdle.c(cfY.hBs);
    if (bool) {
      return -1;
    }
    return 0;
  }

  public Enum gm() {
    return Bz.bCg;
  }

  static
  {
    aAG.add(new Pq[0]);
  }
}