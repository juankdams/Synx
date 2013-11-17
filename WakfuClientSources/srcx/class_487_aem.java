import java.util.ArrayList;

public class aem
  implements cKY
{
  public static aem cVj = new aem();
  private int cVk = -1;
  private ArrayList cVl = new ArrayList();

  public void e(aYr paramaYr)
  {
    int i = paramaYr.bP();
    int j = (this.cVk == -1) || (this.cVk != i) ? 1 : 0;
    this.cVk = i;
    if (j != 0) {
      this.cVl.clear();
    }
    cWY localcWY = paramaYr.bnz();

    for (cHu localcHu = localcWY.cKQ(); localcHu.hasNext(); ) {
      localcHu.fl();
      long l = localcHu.bic();
      String str1;
      String str2;
      String str3;
      String str4;
      az localaz;
      if (localcWY.jm(l)) {
        if (!this.cVl.contains(Long.valueOf(l))) {
          this.cVl.add(Long.valueOf(l));

          if (j == 0) {
            str1 = bU.fH().b(39, i, new Object[0]);
            str2 = bU.fH().b(97, (int)l, new Object[0]);

            str3 = bU.fH().getString("notification.lawAddedTitle");

            str4 = cda.createLink(bU.fH().getString("notification.lawAddedText", new Object[] { str1, str2 }), ana.dqi, "2");

            localaz = new az(str3, str4, ana.dqi, 600132);
            cjO.clE().j(localaz);
          }
        }
      } else if ((j == 0) && (this.cVl.contains(Long.valueOf(l)))) {
        this.cVl.remove(Long.valueOf(l));

        str1 = bU.fH().b(39, i, new Object[0]);
        str2 = bU.fH().b(97, (int)l, new Object[0]);

        str3 = bU.fH().getString("notification.lawRemovedTitle");

        str4 = cda.createLink(bU.fH().getString("notification.lawRemovedText", new Object[] { str1, str2 }), ana.dqi, "2");

        localaz = new az(str3, str4, ana.dqi, 600132);
        cjO.clE().j(localaz);
      }

    }

    dLE.doY().a(bWW.ccf(), new String[] { "nation" });
  }

  public void clean() {
    this.cVl.clear();
    this.cVk = -1;
  }
}