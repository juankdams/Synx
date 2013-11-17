import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class azi extends cGj
{
  public static final String dQp = "currentList";
  public static final String dQq = "currentPage";
  public static final String dQr = "totalPage";
  public static final String[] bF = { "currentList" };

  private final ArrayList dQs = new ArrayList();
  private short dQt = 0;
  private int dQu;

  public void aT(short paramShort)
  {
    this.dQt = paramShort;
  }

  public short aLb() {
    return this.dQt;
  }

  public void y(ArrayList paramArrayList) {
    dOh localdOh = rV.yw().yz();
    this.dQs.clear();
    Object localObject = null;
    if (localdOh == null) {
      localdOh = dOh.mfM;
    }
    switch (aOl.euF[localdOh.ordinal()]) {
    case 1:
      localObject = new aQe(this);

      break;
    case 2:
      localObject = new aQf(this);

      break;
    case 3:
      localObject = new aQb(this);

      break;
    case 4:
      localObject = new aQd(this);

      break;
    case 5:
      localObject = new aOi(this);

      break;
    case 6:
      localObject = new aOj(this);
    }

    if (localObject != null) {
      Collections.sort(paramArrayList, (Comparator)localObject);
    }
    for (int i = 0; i < paramArrayList.size(); i++)
    {
      int j;
      if (localdOh.dqi())
        j = this.dQt * 9 + i + 1;
      else {
        j = (aLc() - this.dQt - 1) * 9 + (paramArrayList.size() - i);
      }
      this.dQs.add(new brY((aJw)paramArrayList.get(i), j));
    }
    dLE.doY().a(this, new String[] { "currentList" });
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("currentList")) {
      return this.dQs;
    }
    if (paramString.equals("currentPage")) {
      return Integer.valueOf(this.dQt + 1);
    }
    if (paramString.equals("totalPage")) {
      return Integer.valueOf(aLc());
    }
    return null;
  }

  private int aLc() {
    return bCO.aB(this.dQu / 9.0F);
  }

  public void ld(int paramInt) {
    this.dQu = paramInt;
    dLE.doY().a(this, new String[] { "currentPage", "totalPage" });
  }
}