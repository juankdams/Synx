import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public final class dFq
  implements eo
{
  protected static final Logger K = Logger.getLogger(dFq.class);

  private static final Comparator lPi = new cQc();
  private final int lPj;
  private final int lPk;
  private final int lPl;
  private final int lPm;
  private final List lPn = new ArrayList();
  private short lPo;
  private long lPp;
  private long lPq;

  public dFq(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.lPj = paramInt1;
    this.lPk = paramInt2;
    this.lPl = paramInt3;
    this.lPm = paramInt4;
  }

  public void d(AS paramAS)
  {
    boolean bool = false;
    for (AS localAS : this.lPn) {
      long l = Math.abs(paramAS.getDate() - localAS.getDate());
      if (l > this.lPl * 1000 * 60) {
        break;
      }
      if (localAS.Ke() + paramAS.Ke() <= this.lPm) {
        bool = localAS.a(paramAS);
        if (bool)
        {
          break;
        }
      }
    }

    if (!bool) {
      this.lPn.add(paramAS);
    }

    Collections.sort(this.lPn, lPi);
    dgO();

    this.lPo = ((short)(this.lPo + 1));
    this.lPp += paramAS.Kf();
  }

  private void dgO() {
    while (!this.lPn.isEmpty())
      if ((this.lPn.size() > this.lPj) || (System.currentTimeMillis() - ((AS)this.lPn.get(this.lPn.size() - 1)).getDate() > this.lPk * 1000L * 60L * 60L * 24L))
      {
        this.lPn.remove(this.lPn.size() - 1);
      }
      else;
  }

  public short dgP()
  {
    return this.lPo;
  }

  public long dgQ()
  {
    return this.lPp;
  }

  public long dgR()
  {
    return this.lPq;
  }

  public void kz(long paramLong)
  {
    this.lPq = paramLong;
  }

  public void dgS()
  {
    this.lPo = 0;
    this.lPp = 0L;
  }

  public List dgT()
  {
    return this.lPn;
  }

  public int size()
  {
    return this.lPn.size();
  }

  public void clear()
  {
    this.lPn.clear();
  }

  public boolean b(dnk paramdnk)
  {
    paramdnk.lmy.clear();
    for (AS localAS : this.lPn) {
      ayi localayi = new ayi();
      localayi.dNQ = localAS.getDate();
      localayi.dNR = localAS.Kb();
      localayi.dNS = localAS.Kc();
      Iterator localIterator2 = localAS.Kd();
      while (localIterator2.hasNext()) {
        Cs localCs = (Cs)localIterator2.next();
        fP localfP = new fP();
        localfP.aDe = ((Integer)localCs.getFirst()).intValue();
        localfP.aDf = ((Short)localCs.Lp()).shortValue();
        localayi.dNT.add(localfP);
      }
      localayi.dNU = localAS.Kf();
      paramdnk.lmy.add(localayi);
    }
    paramdnk.lmz = this.lPo;
    paramdnk.lmA = this.lPp;
    paramdnk.lmB = this.lPq;
    return true;
  }

  public boolean c(dnk paramdnk)
  {
    this.lPn.clear();
    for (ayi localayi : paramdnk.lmy) {
      try {
        AS localAS = new AS();
        localAS.bc(localayi.dNR);
        localAS.bn(localayi.dNS);
        localAS.bb(localayi.dNQ);
        for (fP localfP : localayi.dNT) {
          localAS.g(localfP.aDe, localfP.aDf);
        }
        localAS.bd(localayi.dNU);
        this.lPn.add(localAS);
      } catch (Exception localException) {
        K.error("Exception lors de la dé-serialisation du log de transaction " + localayi, localException);
      }
    }
    this.lPo = paramdnk.lmz;
    this.lPp = paramdnk.lmA;
    this.lPq = paramdnk.lmB;
    return true;
  }
}