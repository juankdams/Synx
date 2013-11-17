import java.util.ArrayList;

public class qj extends byK
{
  private final String m_name;
  private ArrayList cm = new ArrayList();

  public qj(String paramString) {
    this.m_name = paramString;
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("bagNameSize"))
      return this.m_name;
    if (paramString.equals("bagInventory")) {
      return this.cm;
    }
    return null;
  }

  public void g(ArrayList paramArrayList) {
    this.cm = paramArrayList;
  }
}