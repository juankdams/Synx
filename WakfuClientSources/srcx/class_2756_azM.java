import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class azM extends cGj
{
  public static final int dRo = 1;
  public static final String dRp = "currentSeason";
  public static final String dRq = "canGoBefore";
  public static final String dRr = "canGoAfter";
  public static final azM dRs = new azM();

  private final akR dRt = new akR();
  private boolean dRu = true;

  private int dRv = 1;

  private void aLA() {
    dFu localdFu = new dFu();
    dtG.lwJ.Z(new yU(this, localdFu));

    for (Object localObject = this.dRt.values().iterator(); ((Iterator)localObject).hasNext(); ) { diO localdiO = (diO)((Iterator)localObject).next();
      localdFu.ah(localdiO.cRD(), 1, 1);
    }

    for (localObject = localdFu.abR(); ((aso)localObject).hasNext(); ) {
      ((aso)localObject).fl();
      int i = ((aso)localObject).zY();
      int j = ((aso)localObject).value();
      auG localauG = dtG.lwJ.BH(i);
      if (localauG != null)
        localauG.setSize(j);
    }
  }

  public String[] getFields()
  {
    return null;
  }

  private boolean aLB() {
    return this.dRv + 1 <= wn.bmg.Fu();
  }

  private boolean aLC() {
    return this.dRv > 1;
  }

  private void lf(int paramInt) {
    this.dRv = paramInt;
    dLE.doY().a(this, new String[] { "currentSeason" });
  }

  public void aLD() {
    if (aLB())
      lf(this.dRv + 1);
  }

  public void aLE()
  {
    if (aLC())
      lf(this.dRv - 1);
  }

  public diO lg(int paramInt)
  {
    int i = 0;
    for (diO localdiO : this.dRt.values()) {
      if (localdiO.cRD() == paramInt) {
        if (blK.qe(localdiO.cRE())) {
          return localdiO;
        }
        i = 1;
      }

    }

    if (i != 0) {
      return blK.fCS;
    }
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("currentSeason"))
      return dtG.lwJ.BI(this.dRv);
    if (paramString.equals("canGoAfter"))
      return Boolean.valueOf(aLB());
    if (paramString.equals("canGoBefore")) {
      return Boolean.valueOf(aLC());
    }
    return null;
  }

  public void a(diO paramdiO) {
    this.dRt.put(paramdiO.aSq(), paramdiO);
    auG localauG = dtG.lwJ.BH(paramdiO.cRD());
    localauG.aGS();
  }

  public void b(diO paramdiO) {
    this.dRt.remove(paramdiO.aSq());
    auG localauG = dtG.lwJ.BH(paramdiO.cRD());
    localauG.aGT();
  }

  public void B(ArrayList paramArrayList) {
    this.dRt.clear();
    int i = 0; for (int j = paramArrayList.size(); i < j; i++) {
      diO localdiO = (diO)paramArrayList.get(i);
      if (!localdiO.isBound()) {
        this.dRt.put(localdiO.aSq(), localdiO);
      }
    }

    aLA();
    this.dRu = false;
  }

  public void clear() {
    this.dRt.clear();
    this.dRu = true;
  }

  public boolean aLF() {
    return this.dRu;
  }
}