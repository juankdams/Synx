import java.util.ArrayList;
import java.util.Collections;

public class NC extends cGj
{
  public static final String cea = "currentFilter";
  public static final String ceb = "currentDungeon";
  public static final String cec = "filters";
  public static final String ced = "dungeons";
  private final ArrayList cee = new ArrayList();
  private final cSR cef = new cSR();
  private ddX ceg;
  private final ArrayList ceh = new ArrayList();
  private int cei = -1;

  public NC() {
    this.cei = -1;
    ZN();
    ZO();
    ZP();
  }

  private void ZN() {
    for (cWb localcWb : cWb.values()) {
      this.cee.add(new ddX(localcWb));
    }

    this.ceg = ((ddX)this.cee.get(0));
  }

  private void ZO() {
    bGh.gCn.M(new cM(this));
  }

  public void ga(int paramInt)
  {
    this.cei = paramInt;
    dLE.doY().a(this, new String[] { "currentDungeon" });
  }

  public void ai(byte paramByte) {
    int i = 0; for (int j = this.cee.size(); i < j; i++) {
      ddX localddX = (ddX)this.cee.get(i);
      if (localddX.cOR().bJ() == paramByte) {
        a(localddX);
        return;
      }
    }
  }

  public void a(ddX paramddX) {
    if (this.ceg == paramddX) {
      return;
    }

    this.ceg = paramddX;
    ZP();
  }

  public String[] getFields() {
    return null;
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("currentDungeon"))
      return this.cef.get(this.cei);
    if (paramString.equals("dungeons"))
      return this.ceh;
    if (paramString.equals("filters"))
      return this.cee;
    if (paramString.equals("currentFilter")) {
      return this.ceg;
    }

    return null;
  }

  private void ZP() {
    this.ceh.clear();
    this.cef.s(new cO(this));

    Collections.sort(this.ceh, Bj.bxh);
    if ((this.cei == -1) && (!this.ceh.isEmpty())) {
      this.cei = ((aiA)this.ceh.get(0)).getId();
    }

    dLE.doY().a(this, new String[] { "dungeons", "currentDungeon" });
  }
}