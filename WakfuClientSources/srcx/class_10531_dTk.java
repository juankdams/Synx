import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class dTk extends cGj
{
  public static final Comparator mpH = new dJk();
  public static final String bD = "elements";
  public static final String bC = "name";
  public static final String hsn = "iconStyle";
  public static final String eMS = "enabled";
  public static final String[] bF = { "elements" };
  private final bUj mpI;
  final cSR cfe = new cSR();

  public String[] getFields()
  {
    return bF;
  }

  public dTk(bUj parambUj)
  {
    this.mpI = parambUj;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("elements")) {
      ArrayList localArrayList = dtj();
      bhZ localbhZ = (bhZ)localArrayList.get(0);
      if (!localbhZ.isOpen()) {
        localbhZ.ub();
      }
      return localArrayList;
    }
    if (paramString.equals("name")) {
      int i = this.mpI.getId();
      return i == -1 ? bU.fH().getString(this.mpI.getTag()) : Ab.IU().dO(i);
    }

    if (paramString.equals("iconStyle")) {
      return this.mpI.getStyle();
    }
    if (paramString.equals("enabled")) {
      return Boolean.valueOf(!this.cfe.isEmpty());
    }
    return null;
  }

  private ArrayList dtj() {
    ArrayList localArrayList = new ArrayList();
    this.cfe.s(new dJj(this, localArrayList));

    Collections.sort(localArrayList, mpH);
    return localArrayList;
  }

  public void b(bhZ parambhZ) {
    this.cfe.put(parambhZ.aTz(), parambhZ);
  }

  public bhZ DX(int paramInt) {
    return (bhZ)this.cfe.get(paramInt);
  }

  public byte bJ() {
    return (byte)this.mpI.getId();
  }

  public byte dtk() {
    return (byte)this.mpI.ordinal();
  }

  public void a(Comparator paramComparator)
  {
  }
}