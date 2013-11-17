import java.util.Iterator;
import org.apache.log4j.Logger;

public final class AS
{
  protected static final Logger K = Logger.getLogger(AS.class);
  private long bwF;
  private long bwG;
  private String bwH;
  private final cSi bwI = new cSi(1);
  private final bHu bwJ = new bHu(1);
  private long bwK;

  public long getDate()
  {
    return this.bwF;
  }

  public void bb(long paramLong) {
    this.bwF = paramLong;
  }

  public long Kb() {
    return this.bwG;
  }

  public void bc(long paramLong) {
    this.bwG = paramLong;
  }

  public String Kc() {
    return this.bwH;
  }

  public void bn(String paramString) {
    this.bwH = paramString;
  }

  public void g(int paramInt, short paramShort) {
    for (int i = this.bwI.size() - 1; i >= 0; i--) {
      if (this.bwI.wm(i) == paramInt) {
        this.bwJ.x(i, (short)(this.bwJ.sV(i) + paramShort));
        return;
      }
    }
    this.bwI.add(paramInt);
    this.bwJ.add(paramShort);
  }

  public Iterator Kd() {
    return new aQV(this);
  }

  public int Ke()
  {
    return this.bwI.size();
  }

  public long Kf() {
    return this.bwK;
  }

  public void bd(long paramLong) {
    this.bwK = paramLong;
  }

  public boolean a(AS paramAS)
  {
    if ((paramAS.Kb() != this.bwG) || (!paramAS.Kc().equals(this.bwH))) {
      return false;
    }
    Iterator localIterator = paramAS.Kd();
    while (localIterator.hasNext()) {
      Cs localCs = (Cs)localIterator.next();
      g(((Integer)localCs.getFirst()).intValue(), ((Short)localCs.Lp()).shortValue());
    }
    this.bwK += paramAS.Kf();
    return true;
  }
}