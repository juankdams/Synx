import java.util.ArrayList;

public class dMf extends cGj
{
  public static final String bC = "name";
  final NU mct;
  private ArrayList kZX = new ArrayList();

  public dMf(NU paramNU, ArrayList paramArrayList) {
    this.mct = paramNU;
    this.kZX = paramArrayList;
  }

  public String[] getFields() {
    return new String[0];
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("name")) {
      return getName();
    }
    return null;
  }

  public String getName() {
    return this.mct.getName();
  }

  public ArrayList dpi() {
    return this.kZX;
  }
}