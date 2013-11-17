import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public class Jq extends bxG
{
  private static final Logger K = Logger.getLogger(Jq.class);
  private static final boolean DEBUG = true;
  private final apl bTC;
  private final Wr bTD;

  public Jq(int paramInt1, int paramInt2, int paramInt3, int paramInt4, apl paramapl, Wr paramWr)
  {
    super(paramInt1, paramInt2, paramInt3, paramInt4);
    this.bTC = paramapl;
    this.bTD = paramWr;
  }

  protected long mC()
  {
    Tz();

    if (!byv.bFN().c(aPh.bgd())) {
      byv.bFN().a(aPh.bgd());
    }

    anf localanf = new anf(this.bTC, this.bTD);

    dLE.doY().t("fight.resultDescription", localanf);

    return 0L;
  }

  private void Tz() {
    Iterator localIterator1 = this.bTC.iterator();
    StringBuilder localStringBuilder = new StringBuilder();
    while (localIterator1.hasNext()) {
      localObject = (pq)localIterator1.next();
      localStringBuilder.append("Historique du fighter ").append(((pq)localObject).getName()).append(", ID = ").append(((pq)localObject).eq()).append("\n").append("A gagné : ").append(((pq)localObject).wD()).append(", A fuis : ").append(((pq)localObject).wL()).append("\n");
    }

    Object localObject = this.bTC.aBt();
    for (bQE localbQE : (List)localObject) {
      localStringBuilder.append("Loot ").append(localbQE.getSecond()).append("  pris a ").append(localbQE.bXC()).append('\n');
    }
    localStringBuilder.append("Kamas collectés ").append(this.bTC.bvp()).append('\n');
    K.info(localStringBuilder.toString());
  }
}