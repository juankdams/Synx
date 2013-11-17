import java.util.ArrayList;

public class aeD extends bTk
{
  public static final String cWa = "resultText";
  public static final String bXN = "date";
  public static final String cWb = "nationIconUrl";
  public static final String cWc = "nationName";
  public static final String cWd = "partyMembers";
  public static final String[] bF = { "resultText", "date", "nationIconUrl", "nationName", "partyMembers" };
  private aEW cWe;
  private final Tl[] cWf = new Tl[6];

  public aeD(aEW paramaEW) {
    this.cWe = paramaEW;
    ArrayList localArrayList = this.cWe.aRy();
    for (int i = 0; i < this.cWf.length; i++) {
      dQa localdQa = i < localArrayList.size() ? (dQa)localArrayList.get(i) : null;
      this.cWf[i] = (localdQa == null ? null : new Tl(this, localdQa));
    }
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString)
  {
    Object localObject;
    if (paramString.equals("resultText")) {
      localObject = dJn.diF().diL().dhg().cGt();
      switch (bvl.gfg[localObject.Ll().ordinal()]) {
      case 1:
        return Long.valueOf(this.cWe.aRx());
      case 2:
        return dJn.CJ((int)(this.cWe.aRx() / 1000L));
      }
    } else {
      if (paramString.equals("date")) {
        localObject = this.cWe.VN();
        return bU.fH().c((dxL)localObject);
      }
      int i;
      if (paramString.equals("nationIconUrl")) {
        localObject = this.cWf[0];
        i = localObject == null ? 0 : ((Tl)localObject).agq().bP();
        return ay.bd().C(i != 0 ? i : -1);
      }if (paramString.equals("nationName")) {
        localObject = this.cWf[0];
        i = localObject == null ? 0 : ((Tl)localObject).agq().bP();
        return bU.fH().b(39, i, new Object[0]);
      }if (paramString.equals("partyMembers"))
        return this.cWf;
    }
    return null;
  }
}