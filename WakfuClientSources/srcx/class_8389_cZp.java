import java.util.ArrayList;
import org.apache.log4j.Logger;

public class cZp
  implements cvW
{
  protected static final Logger K = Logger.getLogger(cZp.class);

  public static cZp kMU = new cZp();

  public void a(aqv paramaqv, boolean paramBoolean)
  {
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
  }

  public boolean a(cWG paramcWG)
  {
    Object localObject;
    switch (paramcWG.getId()) {
    case 13000:
      localObject = (bQB)paramcWG;
      a((bQB)localObject);

      return false;
    case 13004:
      localObject = (yr)paramcWG;
      a((yr)localObject);

      return false;
    }

    return true;
  }

  public void a(bQB parambQB)
  {
    ArrayList localArrayList1 = parambQB.bXB();

    ArrayList localArrayList2 = new ArrayList();
    for (int i = 0; i < localArrayList1.size(); i++) {
      cNH localcNH = (cNH)localArrayList1.get(i);
      bsf localbsf = new bsf();
      localbsf.a(localcNH);
      localArrayList2.add(localbsf);
    }

    gD.oL().e(localArrayList2);

    byv.bFN().a(dsU.cZd());
  }

  public void a(yr paramyr) {
    boolean bool = paramyr.Hm();
    gD.oL().s(bool);
    dsU.cZd().ko(true);

    if (gD.oL().isEmpty())
      byv.bFN().b(dsU.cZd());
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong)
  {
  }
}