import java.util.ArrayList;

public class bhs
  implements bYw
{
  private String m_name;
  private String[] fwo;
  private boolean aDl = false;

  public bhs(K paramK) {
    if ((!paramK.getName().equalsIgnoreCase("fontDefinition")) || (paramK.e("name") == null))
    {
      return;
    }

    K localK1 = paramK.e("name");

    this.m_name = localK1.getStringValue();

    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = paramK.c("desc");
    int i = 0; for (int j = localArrayList2.size(); i < j; i++) {
      K localK2 = (K)localArrayList2.get(i);
      K localK3 = localK2.e("path");
      K localK4 = localK2.e("lang");
      K localK5 = localK2.e("size");
      if ((localK3 != null) && (localK4 != null) && (localK5 != null))
      {
        localArrayList1.add(localK3.getStringValue());
        localArrayList1.add(localK4.getStringValue());
        localArrayList1.add(localK5.getStringValue());
      }
    }
    this.fwo = ((String[])localArrayList1.toArray(new String[localArrayList1.size()]));

    this.aDl = true;
  }

  public void a(uk paramuk) {
    if (this.aDl)
      paramuk.a(this.m_name, this.fwo);
  }

  public void a(bKD parambKD)
  {
    if (!this.aDl) {
      return;
    }

    String str = parambKD.bSL();

    String[] arrayOfString = new String[this.fwo.length + 1];

    arrayOfString[0] = ('"' + this.m_name + '"');
    int i = 0; for (int j = this.fwo.length; i < j; i++) {
      arrayOfString[(i + 1)] = ('"' + this.fwo[i] + '"');
    }

    parambKD.a(new bol(null, "loadFontDefinition", str, arrayOfString));
  }

  public boolean isInitialized()
  {
    return true;
  }
}