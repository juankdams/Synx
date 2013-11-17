import java.util.ArrayList;

public class bcx
{
  public static final String TAG = "SOAP-ENV:Body";
  private final ArrayList aDd = new ArrayList();

  public void a(cVe paramcVe) {
    this.aDd.add(paramcVe);
  }

  public ArrayList nw() {
    return this.aDd;
  }

  public cVe hX(String paramString) {
    int i = 0; for (int j = this.aDd.size(); i < j; i++) {
      cVe localcVe = (cVe)this.aDd.get(i);
      if (localcVe.getName().equalsIgnoreCase(paramString)) {
        return localcVe;
      }
    }
    return null;
  }

  public CC bqC() {
    CC localCC = new CC("SOAP-ENV:Body", "");

    int i = 0; for (int j = this.aDd.size(); i < j; i++) {
      cVe localcVe = (cVe)this.aDd.get(i);
      localCC.a(localcVe.bqC());
    }

    return localCC;
  }

  public static bcx v(K paramK) {
    String str = paramK.getName();
    if (!str.equalsIgnoreCase("SOAP-ENV:Body")) {
      throw new IllegalArgumentException("Le nom de l'élément ne respecte pas la norme : " + str);
    }
    bcx localbcx = new bcx();
    for (K localK : paramK.getChildren()) {
      localbcx.a(cVe.I(localK));
    }

    return localbcx;
  }
}