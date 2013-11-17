import java.util.concurrent.atomic.AtomicBoolean;

public class aHO
{
  private final djj le;
  private final bSW lf;
  private final String name;
  private cbP efZ;
  private final AtomicBoolean edF = new AtomicBoolean();

  public aHO(djj paramdjj, bSW parambSW, String paramString)
  {
    this.le = paramdjj;
    this.lf = parambSW;
    this.name = paramString;
    aTS();
  }

  public final String getName()
  {
    return this.name;
  }

  public final String aTQ()
  {
    return dBU.a(this.le, this.le.b(this.efZ));
  }

  public final aGC aTR()
  {
    bEv localbEv = this.le.c(this.efZ);
    aGC localaGC = new aGC(this.le, this.lf, localbEv);
    this.le.b(localbEv);
    return localaGC;
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

    this.efZ = this.le.g(this.lf, this.name);
    aHA.debug("mediaDiscovererInstance={}", new Object[] { this.efZ });

    if (this.efZ == null)
      throw new IllegalArgumentException("No media discoverer for '" + this.name + "' is available on this platform");
  }

  private void aSA()
  {
    aHA.debug("destroyInstance()", new Object[0]);

    if (this.efZ != null) {
      aHA.debug("Release media discoverer...", new Object[0]);
      this.le.a(this.efZ);
      aHA.debug("Media discoverer released.", new Object[0]);
    }
  }
}