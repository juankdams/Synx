import java.util.ArrayList;
import java.util.Iterator;

public class dQY
  implements cvW
{
  private static dQY mlM = new dQY();
  private TZ mlN;
  private ArrayList mlO;
  private bnm N;

  public static dQY drX()
  {
    return mlM;
  }

  public boolean a(cWG paramcWG)
  {
    paramcWG.getId();

    return true;
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong)
  {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      this.N = new aiv(this);

      cBQ.cxL().a(this.N);

      this.mlN = new TZ(this, null);
      if (this.mlO != null) {
        for (localObject = this.mlO.iterator(); ((Iterator)localObject).hasNext(); ) { cDm localcDm = (cDm)((Iterator)localObject).next();
          this.mlN.a(localcDm); }
        this.mlO.clear();
      }

      Object localObject = new TZ[1];
      localObject[0] = this.mlN;
      dLE.doY().t("chestLoot", localObject);

      cBQ.cxL().a("chestLootDialog", VV.dJ("chestLootDialog"), 257L, (short)10000);

      aWc.blo().eO(600068L);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      this.mlN = null;
      this.mlO = null;

      cBQ.cxL().mW("chestLootDialog");

      cBQ.cxL().b(this.N);

      dLE.doY().removeProperty("chestLoot");
    }
  }

  public void m(int paramInt, short paramShort) {
    if (this.mlN == null) {
      if (this.mlO == null)
        this.mlO = new ArrayList();
      this.mlO.add(new cDm(paramInt, paramShort));
      return;
    }
    this.mlN.m(paramInt, paramShort);
    dLE.doY().a(this.mlN, new String[] { "loots" });
  }
}