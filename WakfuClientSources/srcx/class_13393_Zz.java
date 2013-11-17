import java.util.ArrayList;

public class Zz extends cGj
{
  public static final String bC = "name";
  public static final String bke = "rewards";
  public static final String RI = "description";
  public static final String[] bF = { "name", "rewards", "description" };
  private final String m_name;
  private final String aLm;
  private final ArrayList cLh = new ArrayList();

  public Zz(String paramString1, String paramString2, int[] paramArrayOfInt) {
    this.m_name = paramString1;
    this.aLm = paramString2;
    for (int k : paramArrayOfInt)
      this.cLh.add((bVw)Hh.QM().dh(k));
  }

  public String[] getFields()
  {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name")) {
      return this.m_name;
    }
    if (paramString.equals("rewards")) {
      return this.cLh.size() > 0 ? this.cLh : null;
    }
    if (paramString.equals("description")) {
      return this.aLm;
    }
    return null;
  }
}