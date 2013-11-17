import java.util.ArrayList;
import java.util.Collections;

class afj
  implements Runnable
{
  afj(dd paramdd, cew paramcew, ArrayList paramArrayList)
  {
  }

  public void run()
  {
    this.bvZ.aty().c(this.cXJ);

    int i = 0; for (int j = this.cXJ.size(); i < j; i++) {
      String str1 = (String)this.cXJ.get(i);

      int k = -1;
      String str2 = str1.substring(2, k == -1 ? str1.length() : k);
      if (!dd.a(this.cXK).contains(str2)) {
        dd.a(this.cXK).add(str2);
      }
    }

    Collections.sort(dd.a(this.cXK));

    dLE.doY().a(this.cXK, new String[] { "linkages" });
    this.bvZ.aty().ie();

    if (dd.a(this.cXK).size() > 0)
      this.cXK.D((String)dd.a(this.cXK).get(0));
  }
}