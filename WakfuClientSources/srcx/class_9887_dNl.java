import java.util.ArrayList;
import org.apache.log4j.Logger;

public abstract class dNl
{
  protected static final Logger K = Logger.getLogger(dNl.class);

  private final dFq mdQ = new dFq(200, 30, 10, 6);
  private final aoL mdR = new aoL();
  protected final ArrayList bLX = new ArrayList(1);

  private final bbk mdS = new czs(this);

  protected dNl()
  {
    a(new czt(this));
  }

  public final dFq dpQ()
  {
    return this.mdQ;
  }

  public final void a(dFR paramdFR) {
    if (!this.bLX.contains(paramdFR))
      this.bLX.add(paramdFR);
  }

  public final void b(dFR paramdFR) {
    this.bLX.remove(paramdFR);
  }

  public final void e(bCI parambCI)
  {
    this.mdR.put(parambCI.EN(), parambCI);
    for (dFR localdFR : this.bLX)
      localdFR.a(parambCI);
  }

  public final void f(bCI parambCI)
  {
    kJ(parambCI.EN());
  }

  public final void kJ(long paramLong)
  {
    bCI localbCI = (bCI)this.mdR.remove(paramLong);
    for (dFR localdFR : this.bLX)
      localdFR.b(localbCI);
  }

  public final void ad(dGy paramdGy)
  {
    if (!this.mdR.isEmpty())
      this.mdR.s(paramdGy);
  }

  public final cHu dpR()
  {
    return this.mdR.aBa();
  }

  public final int dpS()
  {
    return this.mdR.size();
  }

  public final void clear()
  {
    this.mdQ.clear();
    this.mdR.s(new czq(this));

    this.mdR.clear();
  }

  public final bCI kK(long paramLong)
  {
    return (bCI)this.mdR.get(paramLong);
  }

  public final Cs kL(long paramLong)
  {
    cHu localcHu = this.mdR.aBa();
    while (localcHu.hasNext()) {
      localcHu.fl();
      aOm localaOm = (aOm)((bCI)localcHu.value()).ci(paramLong);
      if (localaOm != null)
        return new Cs(localcHu.value(), localaOm);
    }
    return null;
  }

  public final boolean Db(int paramInt)
  {
    cHu localcHu = this.mdR.aBa();
    while (localcHu.hasNext()) {
      localcHu.fl();
      if (((bCI)localcHu.value()).hg(paramInt))
        return true;
    }
    return false;
  }

  public final Cs kM(long paramLong)
  {
    cHu localcHu = this.mdR.aBa();
    while (localcHu.hasNext()) {
      localcHu.fl();
      aOm localaOm = (aOm)((bCI)localcHu.value()).cg(paramLong);
      if (localaOm != null)
        return new Cs(localcHu.value(), localaOm);
    }
    return null;
  }

  public final int Ke()
  {
    int i = 0;
    cHu localcHu = this.mdR.aBa();
    while (localcHu.hasNext()) {
      localcHu.fl();
      i += ((bCI)localcHu.value()).size();
    }
    return i;
  }

  public final int dda() {
    int i = 0;
    cHu localcHu = this.mdR.aBa();
    while (localcHu.hasNext()) {
      localcHu.fl();
      i += ((bCI)localcHu.value()).cFy();
    }
    return i;
  }

  public final Cs kN(long paramLong)
  {
    cHu localcHu = this.mdR.aBa();
    while (localcHu.hasNext()) {
      localcHu.fl();
      short s = ((bCI)localcHu.value()).il(paramLong);
      if (s != -1) {
        return new Cs(Long.valueOf(((bCI)localcHu.value()).EN()), Short.valueOf(s));
      }
    }
    return null;
  }

  public final boolean isLocked()
  {
    cHu localcHu = this.mdR.aBa();
    while (localcHu.hasNext()) {
      localcHu.fl();
      if (((bCI)localcHu.value()).isLocked()) {
        return true;
      }
    }
    return false;
  }

  public short dpT()
  {
    cHu localcHu = this.mdR.aBa();
    short s1 = 32767;
    while (localcHu.hasNext()) {
      localcHu.fl();
      short s2 = (short)((bCI)localcHu.value()).bLc();
      if (s2 < s1) {
        s1 = s2;
      }
    }
    return s1;
  }
}