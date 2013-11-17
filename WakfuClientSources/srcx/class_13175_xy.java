import java.util.EnumMap;

public class xy
{
  private final EnumMap bqe = new EnumMap(RS.class);

  public void a(RS paramRS) {
    if (this.bqe.containsKey(paramRS))
      throw new bFf("Un inventaire de type " + paramRS + " est déjà présent");
    this.bqe.put(paramRS, paramRS.adc());
  }

  public dOe b(RS paramRS) {
    dOe localdOe = (dOe)this.bqe.get(paramRS);
    if (localdOe == null)
      throw new bFf("inventaire de type " + paramRS + "inconnu");
    return localdOe;
  }

  public void a(dlk paramdlk) {
    dHi localdHi = (dHi)this.bqe.get(RS.cru);
    lR locallR = new lR(localdHi, paramdlk.gbh, Hh.QM());
    locallR.tq();

    aOX localaOX = (aOX)this.bqe.get(RS.crw);
    bLH localbLH = new bLH(localaOX, paramdlk.gbi);
    localbLH.tq();
  }

  public void b(dlk paramdlk)
  {
    dHi localdHi = (dHi)this.bqe.get(RS.cru);
    lR locallR = new lR(localdHi, paramdlk.gbh, Hh.QM());
    locallR.tr();

    aOX localaOX = (aOX)this.bqe.get(RS.crw);
    bLH localbLH = new bLH(localaOX, paramdlk.gbi);
    localbLH.tr();
  }

  public void clear()
  {
    dHi localdHi = (dHi)this.bqe.get(RS.cru);
    localdHi.clear();

    aOX localaOX = (aOX)this.bqe.get(RS.crw);
    localaOX.clear();
  }

  public String toString()
  {
    return "InventoryHandler{m_inventories=" + this.bqe.size() + '}';
  }
}