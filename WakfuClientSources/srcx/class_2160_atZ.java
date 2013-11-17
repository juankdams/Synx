import java.util.ArrayList;
import org.apache.log4j.Logger;

final class atZ extends Mo
{
  private final aNv dFX;

  private atZ(byz parambyz, aNv paramaNv)
  {
    this.dFX = paramaNv;
    this.dFX.ao().a(this);
  }

  public void aS() {
    byz.bHE().error("Les Locks ne sont pas serialisés par le client");
  }

  public void aT() {
    byz.a(this.iZ, new se());
    NB.cdZ.a(byz.s(this.iZ));

    ArrayList localArrayList = this.dFX.brr;
    int i = 0; for (int j = localArrayList.size(); i < j; i++) {
      cKu localcKu = (cKu)localArrayList.get(i);
      byz.s(this.iZ).a(localcKu.bua, cYq.jq(localcKu.bub), cYq.jq(localcKu.buc));
      byz.s(this.iZ).H(localcKu.bua, localcKu.bud);
      byz.s(this.iZ).c(localcKu.bua, cYq.jq(localcKu.bue));
    }
  }
}