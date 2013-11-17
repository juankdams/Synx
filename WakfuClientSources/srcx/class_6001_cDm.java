import java.util.Comparator;

public class cDm extends cGj
  implements Comparable
{
  public static final String bsS = "quantity";
  public static final String[] iwG = { "quantity" };
  private final short aFe;
  private final bVw bsZ;
  private final short cZu;
  private final cxg gtY;

  public cDm(int paramInt, short paramShort)
  {
    this.aFe = paramShort;
    this.bsZ = ((bVw)Hh.QM().dh(paramInt));
    this.cZu = this.bsZ.nU();
    this.gtY = this.bsZ.bKs();
  }

  public String[] getFields()
  {
    return iwG;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("quantity")) {
      return Short.valueOf(this.aFe);
    }
    return this.bsZ.getFieldValue(paramString);
  }

  public bVw Hu() {
    return this.bsZ;
  }

  public int b(cDm paramcDm) {
    if (paramcDm == null) {
      return -1;
    }
    int i = cxg.cuz().compare(this.gtY, paramcDm.gtY);

    if (i != 0) {
      return i;
    }

    return Integer.signum(paramcDm.cZu - this.cZu);
  }
}