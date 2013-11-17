import java.util.ArrayList;

public abstract class aMT extends cGj
{
  public static final String bC = "name";
  public static final String bMU = "categories";
  public static final String ess = "achievements";
  public static final String est = "isHistory";
  public static final String esu = "achievementsQuickList";
  protected int esv;

  public String[] getFields()
  {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name"))
      return getName();
    if (paramString.equals("isHistory"))
      return Boolean.valueOf(bdT());
    if (paramString.equals("achievements"))
      return bdV();
    if (paramString.equals("achievementsQuickList")) {
      return bdS();
    }
    return null;
  }

  public ckJ bdQ() {
    ArrayList localArrayList = bdV();
    ckJ localckJ = (ckJ)dLE.doY().rv("selectedAchievement");
    if (localckJ == null)
      return null;
    int i = localArrayList.indexOf(localckJ) - 1;
    if (i < 0) {
      i = localArrayList.size() - 1;
    }
    return (ckJ)localArrayList.get(i);
  }

  public ckJ bdR() {
    ArrayList localArrayList = bdV();
    ckJ localckJ = (ckJ)dLE.doY().rv("selectedAchievement");
    if (localckJ == null)
      return null;
    int i = localArrayList.indexOf(localckJ) + 1;
    if (i > localArrayList.size() - 1) {
      i = 0;
    }
    return (ckJ)localArrayList.get(i);
  }

  public ArrayList bdS() {
    ArrayList localArrayList1 = bdV();
    ckJ localckJ = (ckJ)dLE.doY().rv("selectedAchievement");
    if (localckJ == null)
      return null;
    int i = localArrayList1.indexOf(localckJ);
    if (i == -1)
      return null;
    ArrayList localArrayList2 = new ArrayList();
    int j = Math.min(3, localArrayList1.size());
    if (j < 1)
      return null;
    for (int k = i - j; k <= i + j; k++)
    {
      int m;
      if (k < 0)
        m = localArrayList1.size() + k;
      else if (k >= localArrayList1.size())
        m = k % localArrayList1.size();
      else {
        m = k;
      }
      localArrayList2.add(localArrayList1.get(m));
    }
    return localArrayList2;
  }

  protected abstract String getName();

  public abstract boolean bdT();

  public abstract int getId();

  public abstract void a(cPH paramcPH);

  public abstract cSR bdU();

  protected abstract ArrayList bdV();

  public void ng(int paramInt) {
    this.esv = paramInt;
    dLE.doY().a(this, new String[] { "achievements", "achievementsQuickList" });
  }

  public void bdW() {
    dLE.doY().a(this, new String[] { "achievements", "achievementsQuickList" });
  }
}