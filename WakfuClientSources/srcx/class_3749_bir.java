import java.util.ArrayList;

public class bir
{
  private final cSR aRb;

  public bir(int paramInt)
  {
    this.aRb = new cSR(paramInt);
  }

  public cMu pT(int paramInt) {
    return (cMu)this.aRb.get(paramInt);
  }

  public int size() {
    return this.aRb.size();
  }

  public dmn ahp() {
    return this.aRb.yF();
  }

  public cMu a(cLD paramcLD) {
    cMu localcMu = new cMu(paramcLD.getId(), paramcLD.afS());
    this.aRb.put(paramcLD.getId(), localcMu);
    return localcMu;
  }

  public void a(azr paramazr) {
    for (dmn localdmn = this.aRb.yF(); localdmn.hasNext(); ) {
      localdmn.fl();
      cMu localcMu = (cMu)localdmn.value();

      cqY localcqY = new cqY();
      localcMu.b(localcqY.cfP);
      paramazr.dQE.add(localcqY);
    }
  }

  public void a(TU paramTU, azr paramazr) {
    this.aRb.clear();
    int i = 0; for (int j = paramazr.dQE.size(); i < j; i++) {
      cqY localcqY = (cqY)paramazr.dQE.get(i);
      cMu localcMu = (cMu)this.aRb.get(localcqY.cfP.id);
      if (localcMu == null)
        localcMu = a(paramTU.gM(localcqY.cfP.id));
      localcMu.c(localcqY.cfP);
    }
  }

  public String toString()
  {
    return "StorageBoxInventory{m_compartments=" + this.aRb.size() + '}';
  }
}