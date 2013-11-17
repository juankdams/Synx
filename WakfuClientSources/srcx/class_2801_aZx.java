import java.util.ArrayList;
import org.apache.log4j.Logger;

public class aZx extends yJ
{
  public static final byte fgo = 0;
  public static final byte fgp = 1;
  public static final byte fgq = 2;
  public static final byte fgr = 4;
  private final dzU fgs;
  private final bRS aGy;

  public aZx()
  {
    this.fgs = new dzU(null);
    this.aGy = new bRS(this.fgs);
  }

  public static aZx a(byte paramByte, bIs parambIs)
  {
    aZx localaZx;
    switch (paramByte) {
    case 0:
      localaZx = new aZx();
      break;
    case 1:
      localaZx = new aZx();
      break;
    case 2:
      localaZx = new aZx();
      break;
    default:
      K.fatal("type de manager de propriété inconnu");
      return null;
    }

    localaZx.aGy.aP(parambIs);
    return localaZx;
  }

  public void aJ()
  {
    super.aJ();
    this.aGy.clear();
  }

  public void bc()
  {
    super.bc();
    this.aGy.clear();
  }

  public void a(bIs parambIs) {
    this.aGy.aP(parambIs);
  }

  public boolean b(bIs parambIs) {
    return this.aGy.aQ(parambIs);
  }

  private void k(Kf paramKf) {
    if (dzU.a(this.fgs) != null)
      K.error("Attention, écrasement de propriété dans le notifier", new Exception());
    dzU.a(this.fgs, paramKf);
    this.aGy.notifyListeners();
    dzU.a(this.fgs, null);
  }

  public boolean a(fV paramfV)
  {
    paramfV.clear();
    cQB localcQB = this.bsn.yt();
    for (int i = this.bsn.size(); i-- > 0; ) {
      localcQB.fl();
      boe localboe = new boe();
      localboe.ewr = localcQB.rC();
      localboe.fHn = localcQB.Gh();
      paramfV.aDq.add(localboe);
    }
    return true;
  }

  public boolean b(fV paramfV)
  {
    this.bsn.clear();
    for (boe localboe : paramfV.aDq) {
      this.bsn.d(localboe.ewr, localboe.fHn);
    }
    k(null);
    return true;
  }

  public byte e(Kf paramKf)
  {
    byte b = super.e(paramKf);
    k(paramKf);
    return b;
  }

  public byte f(Kf paramKf)
  {
    byte b = super.f(paramKf);
    k(paramKf);
    return b;
  }

  public void g(Kf paramKf)
  {
    super.g(paramKf);
    k(paramKf);
  }

  public void reset()
  {
    super.reset();
    k(null);
  }
}