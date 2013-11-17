import java.util.ArrayList;
import java.util.List;

public class eV
  implements aBt, caY
{
  private static final String[] aBO = { "worldAndFightBarDialog" };
  public static final String aBP = "pandaBarrelLabel";
  private static final String aBQ = "-";
  private final bKm aBR;
  private ddn aBS;
  private final List aBT = new ArrayList();

  public eV(bKm parambKm) {
    this.aBR = parambKm;

    for (String str : aBO) {
      cpa localcpa = cBQ.cxL().coO().nf(str);
      if (localcpa != null)
      {
        caF localcaF = (caF)localcpa.fi("pandaBarrelLabel");
        if (localcaF != null)
          this.aBT.add(localcaF); 
      }
    }
  }

  public void a(bXL parambXL) {
  }

  public void a(cjK paramcjK) { if (this.aBS != null) {
      return;
    }
    if (paramcjK.getType() != xj.bpz.xj()) {
      return;
    }
    ddn localddn = (ddn)paramcjK;
    if (localddn.axG() != this.aBR) {
      return;
    }
    this.aBS = localddn;
    cqm localcqm = this.aBS.a(eu.aAg);
    localcqm.a(this);

    aF(localcqm.value()); }

  public void b(cjK paramcjK)
  {
    if (paramcjK == this.aBS) {
      this.aBS = null;
      aF(0);
    }
  }

  public void a(cqm paramcqm) {
    if (paramcqm.adb() != eu.aAg) {
      return;
    }
    int i = paramcqm.value();
    aF(i);
  }

  private void aF(int paramInt) {
    for (int i = this.aBT.size() - 1; i >= 0; i--)
      ((caF)this.aBT.get(i)).setText(paramInt == 0 ? "-" : String.valueOf(paramInt));
  }

  public void clear() {
    cmO.hSn.a(this.aBR);
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("PandawaFightListener");
    localStringBuilder.append("{m_character=").append(this.aBR);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}