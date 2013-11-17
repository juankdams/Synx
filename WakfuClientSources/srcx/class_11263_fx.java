import java.util.ArrayList;

public class fx extends cGj
{
  public static final String aCC = "roomTypePermList";
  public static final String aCD = "individualList";
  public static final String aCE = "individualMaxSizeText";
  public static final String aCF = "individualMaxSizeReached";
  private final cub aCG;
  private aui[] aCH;

  public String[] getFields()
  {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("roomTypePermList")) {
      return this.aCH;
    }
    if (paramString.equals("individualList")) {
      return mx();
    }
    if (paramString.equals("individualMaxSizeReached")) {
      int i = this.aCG.csz().size();
      return Boolean.valueOf(i >= 25);
    }
    if (paramString.equals("individualMaxSizeText")) {
      lZ locallZ = new lZ();
      int j = this.aCG.csz().size();
      locallZ.a(bU.fH().getString("dimBag.individualCappedSize", new Object[] { Integer.valueOf(j), Integer.valueOf(25) }));
      return locallZ.tP();
    }
    return null;
  }

  private Object mx() {
    ArrayList localArrayList = new ArrayList();
    for (dym localdym : this.aCG.csz()) {
      localArrayList.add(new aog(this, localdym.getId(), localdym.getName()));
    }
    return localArrayList;
  }

  public void a(Xi paramXi)
  {
    this.aCG.a(paramXi);
  }

  public void a(dym paramdym) {
    int i = this.aCG.csz().size();
    if (i >= 25) {
      CM.LV().f(bU.fH().getString("desc.individualRightsMaxSizeReached"), 3);
      return;
    }
    this.aCG.a(paramdym);
    my();
    dLE.doY().a(this, new String[] { "individualList", "roomTypePermList", "individualMaxSizeText", "individualMaxSizeReached" });
  }

  public void C(long paramLong) {
    this.aCG.C(paramLong);
    my();
    dLE.doY().a(this, new String[] { "individualList", "roomTypePermList", "individualMaxSizeText", "individualMaxSizeReached" });
  }

  private void my()
  {
    for (aui localaui : this.aCH)
      localaui.my();
  }

  public fx(cub paramcub)
  {
    this.aCG = paramcub;
    this.aCH = mz();
  }

  public aui[] mz() {
    int[] arrayOfInt = mA();
    aui[] arrayOfaui = new aui[arrayOfInt.length];
    for (int i = 0; i < arrayOfInt.length; i++) {
      arrayOfaui[i] = new aui(arrayOfInt[i], this.aCG);
    }
    return arrayOfaui;
  }

  public int[] mA() {
    ArrayList localArrayList = new ArrayList();
    dwN localdwN = byv.bFN().bFO().bHa();
    for (byte b = 0; b < 9; b = (byte)(b + 1)) {
      localObject = localdwN.a(b, true);
      if (localObject != null) {
        j = ((gA)localObject).ok();
        if (!localArrayList.contains(Integer.valueOf(j))) {
          localArrayList.add(Integer.valueOf(j));
        }
      }
    }
    int i = localArrayList.size();
    Object localObject = new int[i];
    for (int j = 0; j < i; j++)
      localObject[j] = ((Integer)localArrayList.get(j)).intValue();
    return localObject;
  }

  public cub mB() {
    return this.aCG;
  }
}