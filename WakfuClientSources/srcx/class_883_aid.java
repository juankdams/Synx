import java.util.ArrayList;
import org.apache.log4j.Logger;

public abstract class aid
  implements cRg
{
  protected static Logger K = Logger.getLogger(aid.class);
  private int aw;
  private aYr dee;
  private aYr deg;
  private bGI deh;
  private final ArrayList aBf = new ArrayList();

  protected aid(int paramInt)
  {
    this.aw = paramInt;
    this.dee = null;
    this.deg = null;
  }

  protected void d(int paramInt) {
    this.aw = paramInt;
  }

  public int getId()
  {
    return this.aw;
  }

  public long auX() {
    return this.aw;
  }

  public aik auY() {
    return ctr.idk;
  }

  public void a(Qt paramQt) {
    if (!this.aBf.contains(paramQt))
      this.aBf.add(paramQt);
  }

  public void b(Qt paramQt) {
    this.aBf.remove(paramQt);
  }

  public aYr auZ()
  {
    return this.dee;
  }

  public void f(aYr paramaYr)
  {
    this.dee = paramaYr;
    if (this.deg == null)
      g(this.dee);
  }

  public aYr ava()
  {
    return this.deg;
  }

  public void g(aYr paramaYr)
  {
    aYr localaYr = this.deg;
    this.deg = paramaYr;

    for (int i = 0; i < this.aBf.size(); i++) {
      ((Qt)this.aBf.get(i)).a(this, paramaYr);
    }
    a(paramaYr, localaYr);
  }

  protected void a(aYr paramaYr1, aYr paramaYr2)
  {
  }

  public bGI avb()
  {
    return this.deh;
  }

  public void b(bGI parambGI)
  {
    if (this.deh != null) {
      this.deh.o(null);
    }
    this.deh = parambGI;

    if (this.deh != null)
      this.deh.o(this);
  }

  public String toString()
  {
    return "Protector {" + "id=" + this.aw + ", nativeNation=" + (this.dee != null ? Integer.valueOf(this.dee.bP()) : null) + ", currentNation=" + (this.deg != null ? Integer.valueOf(this.deg.bP()) : null) + ", territory=" + (this.deh != null ? Integer.valueOf(this.deh.getId()) : null) + '}';
  }

  public int avc()
  {
    if (this.deg == null)
      return -1;
    return this.deg.bP();
  }

  public int avd() {
    if (this.dee == null)
      return -1;
    return this.dee.bP();
  }

  public abstract cIZ ave();
}