import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class cZo extends doA
{
  private static final aee bx = new bOO(new aza());

  private static final qM by = new dzQ(new ec[] { new dLx("Param standard : toutes les auras", new dmb[0]) });
  private long aDR;

  public qM aF()
  {
    return by;
  }

  public cZo cMh()
  {
    cZo localcZo;
    try
    {
      localcZo = (cZo)bx.Mm();
      localcZo.aOr = bx;
    } catch (Exception localException) {
      localcZo = new cZo();
      localcZo.aOr = null;
      localcZo.eXg = false;
      K.error("Erreur lors d'un checkOut sur un ArenaRunningEffect : " + localException.getMessage());
    }
    localcZo.aDR = this.aDR;
    return localcZo;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.evp.atO().iterator();
    while (localIterator.hasNext()) {
      localObject = (aVc)localIterator.next();
      if (((aVc)localObject).getId() == bsj.fSn.getId()) {
        localArrayList.add(localObject);
      }
    }

    Object localObject = localArrayList.iterator();
    while (((Iterator)localObject).hasNext()) {
      aVc localaVc = (aVc)((Iterator)localObject).next();
      localaVc.bkD();
    }
  }

  public void a(aVc paramaVc)
  {
  }

  public void aK()
  {
    super.aK();
  }

  public boolean aL()
  {
    return false;
  }

  public boolean aM()
  {
    return true;
  }

  public boolean aN()
  {
    return true;
  }
}