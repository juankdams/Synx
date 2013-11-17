import java.util.ArrayList;

public class aQG extends cGj
{
  public static final String eNt = "quests";
  public static final String eNu = "achievementIndexText";
  private final ArrayList eNv = new ArrayList();
  private int eNw = -1;
  private int eNx = -1;

  public void b(dmz paramdmz) {
    if (paramdmz.getId() == this.eNw) {
      return;
    }
    this.eNw = paramdmz.getId();

    this.eNv.clear();
    int i = 0; for (int j = paramdmz.size(); i < j; i++) {
      this.eNv.add(cHT.iDr.xQ(paramdmz.AK(i)));
    }

    dLE.doY().a(this, new String[] { "quests" });
  }

  public void ny(int paramInt) {
    if (this.eNw == -1) {
      return;
    }
    this.eNx = -1;

    int i = 0; for (int j = this.eNv.size(); i < j; i++) {
      ckJ localckJ = (ckJ)this.eNv.get(i);
      if (localckJ.getId() == paramInt) {
        this.eNx = i;
        break;
      }
    }

    dLE.doY().a(this, new String[] { "achievementIndexText" });
  }

  public String[] getFields() {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("quests"))
      return this.eNv;
    if (paramString.equals("achievementIndexText")) {
      return String.valueOf(this.eNx + 1);
    }
    return null;
  }
}