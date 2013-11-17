import java.util.ArrayList;

public class bHT extends cGj
{
  public final String bC = "name";
  public final String fLN = "shorctuts";

  private final String[] bF = { "name", "shorctuts" };

  private ArrayList bKi = new ArrayList();
  private final String m_name;

  public bHT(String paramString)
  {
    this.m_name = paramString;
  }

  public void L(ArrayList paramArrayList) {
    this.bKi = paramArrayList;
  }

  public String getName() {
    return this.m_name;
  }

  public String[] getFields() {
    return this.bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name"))
      return bU.fH().getString(this.m_name);
    if (paramString.equals("shorctuts")) {
      return this.bKi;
    }
    return null;
  }
}