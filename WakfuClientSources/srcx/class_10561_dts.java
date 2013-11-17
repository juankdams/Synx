import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.log4j.Logger;

public class dts
  implements cOm
{
  protected static final Logger K = Logger.getLogger(dts.class);

  private static final dts lvV = new dts();

  private dRI lvW = dwS.lCP;
  private bvm lvX;
  private final LinkedList lvY = new LinkedList();

  private boolean lvZ = false;

  public static dts cZE()
  {
    return lvV;
  }

  public bvm e(bSR parambSR)
  {
    if (this.lvX == null)
      this.lvX = this.lvW.dci();
    this.lvX.a(parambSR);
    parambSR.a(this.lvX);
    return this.lvX;
  }

  public bvm f(bSR parambSR) {
    bvm localbvm = this.lvW.dci();
    localbvm.a(parambSR);
    this.lvY.add(localbvm);
    parambSR.a(localbvm);
    return localbvm;
  }

  public void cZF() {
    if (this.lvX != null)
      this.lvX.kill();
    this.lvX = null;
  }

  public void clear() {
    cZF();
    int i = 0; for (int j = this.lvY.size(); i < j; i++) {
      try {
        ((bvm)this.lvY.get(i)).kill();
      } catch (Exception localException) {
        K.error("", localException);
      }
    }
    this.lvY.clear();
    this.lvZ = false;
  }

  public bvm cZG()
  {
    return this.lvX;
  }

  public LinkedList cZH()
  {
    return this.lvY;
  }

  public void cZI()
  {
    if (this.lvX == null) {
      return;
    }
    this.lvY.add(this.lvX);
    this.lvX = null;

    if (!this.lvZ)
      cZJ();
  }

  private void cZJ()
  {
    if ((!this.lvZ) && (!this.lvY.isEmpty())) {
      this.lvZ = true;

      bvm localbvm = (bvm)this.lvY.getFirst();

      localbvm.a(this);
      localbvm.RD();
    }
  }

  public void b(bvm parambvm)
  {
    this.lvY.remove(parambvm);

    this.lvZ = false;

    cZJ();
  }

  public void cZK() {
    K.info("Action In Execution : " + this.lvZ);
    Iterator localIterator1;
    if (!this.lvY.isEmpty())
      for (localIterator1 = this.lvY.iterator(); localIterator1.hasNext(); ) { localObject = (bvm)localIterator1.next();
        K.info("Executing Action Group (" + ((bvm)localObject).RG().size() + " actions)");

        for (bSR localbSR : ((bvm)localObject).RG())
          K.info(" * " + localbSR.getClass().getSimpleName());
      }
    Object localObject;
    if (this.lvX != null) {
      K.info("Pending Action Group (" + this.lvX.RG().size() + " groupes)");
      for (localIterator1 = this.lvX.RG().iterator(); localIterator1.hasNext(); ) { localObject = (bSR)localIterator1.next();
        K.info(" - " + localObject.getClass().getSimpleName()); }
    }
    else {
      K.info("Pending Action Group is null");
    }
  }

  public void RF() {
    while (!this.lvY.isEmpty()) {
      bvm localbvm = (bvm)this.lvY.getFirst();
      localbvm.b(this);
      localbvm.RF();
      this.lvY.remove(localbvm);
    }
  }

  public void a(dRI paramdRI) {
    this.lvW = paramdRI;
  }
}