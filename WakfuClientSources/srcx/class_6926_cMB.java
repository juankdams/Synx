import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;

public class cMB
{
  private static final Logger K = Logger.getLogger(cMB.class);

  public static final cMB krT = new cMB();

  private final dFu krU = new dFu();
  private final Map krV = new HashMap();
  private final dFu krW = new dFu();
  private final cSR bel = new cSR();

  public void a(cko paramcko, int paramInt) {
    adz localadz = (adz)this.krV.get(paramcko);
    if (localadz == null) {
      localadz = new adz();
      this.krV.put(paramcko, localadz);
    }
    localadz.hL(paramInt);
  }

  public boolean b(cko paramcko, int paramInt) {
    adz localadz = (adz)this.krV.get(paramcko);
    if (localadz == null)
      return false;
    return localadz.contains(paramInt);
  }

  public void eq(int paramInt1, int paramInt2) {
    if (this.krU.fg(paramInt1, paramInt2) != 0)
      K.error("Ajout multiple du gfx de buff de vélocité " + paramInt1, new UnsupportedOperationException());
  }

  public int yC(int paramInt) {
    return this.krU.get(paramInt);
  }

  public void a(dpI paramdpI, int paramInt) {
    this.bel.put(paramdpI.yR(), paramdpI);
    this.krW.fg(paramInt, paramdpI.yR());
  }

  public List qo() {
    dpI[] arrayOfdpI = new dpI[this.bel.size()];
    this.bel.d(arrayOfdpI);
    return Arrays.asList(arrayOfdpI);
  }

  public dpI aE(int paramInt) {
    return (dpI)this.bel.get(paramInt);
  }

  public dpI yD(int paramInt) {
    return (dpI)this.bel.get(this.krW.get(paramInt));
  }

  public static bqk b(long paramLong, dpI paramdpI) {
    return new Tx(paramLong, paramdpI);
  }
}