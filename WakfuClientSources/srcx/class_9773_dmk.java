import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

public class dmk
{
  private static final int bt = 201;
  private final List edz = new ArrayList();

  private final ExecutorService edB = Executors.newSingleThreadExecutor();
  private final djj le;
  private final bSW lf;
  private ako lka;
  private final AtomicBoolean edF = new AtomicBoolean();

  private dCM lkb = dCM.lLe;

  public dmk(djj paramdjj, bSW parambSW)
  {
    if (caB.ceM().a(caB.hrq)) {
      this.le = paramdjj;
      this.lf = parambSW;
      aTS();
    }
    else {
      throw new RuntimeException("Native log requires libvlc 2.1.0 or later");
    }
  }

  public final void a(btJ parambtJ)
  {
    aHA.debug("addLogListener(listener={})", new Object[] { parambtJ });
    this.edz.add(parambtJ);
  }

  public final void b(btJ parambtJ)
  {
    aHA.debug("removeLogListener(listener={})", new Object[] { parambtJ });
    this.edz.remove(parambtJ);
  }

  public final void a(dCM paramdCM)
  {
    this.lkb = paramdCM;
  }

  public final dCM cUb()
  {
    return this.lkb;
  }

  public final void release()
  {
    aHA.debug("release()", new Object[0]);
    if (this.edF.compareAndSet(false, true))
      aSA();
  }

  private void aTS()
  {
    aHA.debug("createInstance()", new Object[0]);

    this.lka = new bPV(this, null);

    this.le.a(this.lf, this.lka, null);
  }

  private void aSA()
  {
    aHA.debug("destroyInstance()", new Object[0]);

    this.le.d(this.lf);

    this.edz.clear();

    aHA.debug("Shut down listeners...", new Object[0]);
    this.edB.shutdown();
    aHA.debug("Listeners shut down.", new Object[0]);
  }

  protected void finalize()
  {
    aHA.debug("finalize()", new Object[0]);
    aHA.debug("Native log has been garbage collected", new Object[0]);
    super.finalize();
  }

  private String a(cJv paramcJv)
  {
    axA localaxA = paramcJv.cDB();
    return localaxA != null ? localaxA.getString(0L) : null;
  }

  private void b(dCM paramdCM, String paramString1, String paramString2, Integer paramInteger1, String paramString3, String paramString4, Integer paramInteger2, String paramString5)
  {
    aHA.trace("raiseLogEvent(level={},module={},line={},name={},header={},id={},message={}", new Object[] { paramdCM, paramString1, paramString2, paramInteger1, paramString3, paramString4, paramInteger2, paramString5 });

    this.edB.submit(new dAv(this, paramdCM, paramString1, paramString2, paramInteger1, paramString3, paramString4, paramInteger2, paramString5, null));
  }
}