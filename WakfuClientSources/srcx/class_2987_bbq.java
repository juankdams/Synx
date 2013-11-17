import java.util.BitSet;
import java.util.Collection;
import java.util.HashSet;
import org.apache.log4j.Logger;

public class bbq
  implements bWU
{
  private static final Logger K = Logger.getLogger(bbq.class);

  private final BitSet fky = new BitSet();
  private final HashSet fkz = new HashSet();
  private int fkA = 0;

  private static final bOO aCJ = new bOO(new bEt());

  public static bbq bpU()
  {
    bbq localbbq;
    try
    {
      localbbq = (bbq)aCJ.Mm();
    } catch (Exception localException) {
      localbbq = new bbq();
      K.error("Erreur de checkout : " + localException.getMessage());
    }
    return localbbq;
  }

  public void b(BitSet paramBitSet) {
    this.fky.or(paramBitSet);
  }

  public void k(Collection paramCollection) {
    this.fkz.addAll(paramCollection);
  }

  public void n(dle paramdle) {
    this.fkz.add(paramdle);
  }

  public void bpV() {
    this.fkA += 1;
  }

  public BitSet bpW() {
    return this.fky;
  }

  public HashSet bpX() {
    return this.fkz;
  }

  public void a(bbq parambbq) {
    if (parambbq == null) {
      return;
    }
    b(parambbq.bpW());
    k(parambbq.bpX());
    this.fkA += parambbq.bpY();
  }

  public int bpY() {
    return this.fkA;
  }

  public void clear() {
    this.fkA = 0;
    this.fkz.clear();
    this.fky.clear();
  }

  public void release() {
    if (aCJ != null)
      try {
        aCJ.y(this);
      } catch (Exception localException) {
        K.error("Impossible de retourner l'événement " + this + " au pool", localException);
      }
    else
      K.error("Aucun pool n'a été défini pour l'événement " + this);
  }

  public void aJ()
  {
    this.fkA = 0;
  }

  public void bc() {
    this.fky.clear();
    this.fkz.clear();
  }
}