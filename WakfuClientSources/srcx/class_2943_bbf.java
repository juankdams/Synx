import java.util.Collection;

public class bbf extends cmz
  implements chL
{
  private static final bbf fjh = new bbf();

  public bbf()
  {
    d(new cmC(this));

    a(this);
  }

  public static bbf bpt()
  {
    return fjh;
  }

  public dHb oG(int paramInt) {
    for (dHb localdHb : cnp()) {
      if (localdHb.getId() == paramInt) {
        return localdHb;
      }
    }
    return null;
  }

  public void a(cmz paramcmz)
  {
    cBQ.cxL().coO().czu().t("worldChoice.worldReferencesList", cnp().toArray());
  }
}