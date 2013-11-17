import java.util.ArrayList;
import org.apache.log4j.Logger;

class bEO
  implements buF
{
  bEO(azX paramazX)
  {
  }

  public void b(azX paramazX, boolean paramBoolean)
  {
    if ((this.gzP.dSk == null) || (!paramazX.isVisible())) {
      return;
    }

    if (paramBoolean) {
      dOc localdOc = bsP.getInstance().getMouseOver();
      if ((localdOc != null) && (localdOc != bsP.getInstance())) {
        return;
      }
      beo.c(paramazX);
      String str1 = azX.m(this.gzP);
      if (str1.length() == 0) {
        return;
      }

      ArrayList localArrayList = new ArrayList();
      ayn localayn = bWW.ccf().FB();
      short s = paramazX.aLV().bqt();
      if (localayn != null) {
        localObject = localayn.aKu();
        if (((aur)localObject).iB(s)) {
          localArrayList.add(ay.bd().a("ecosystemProtectedIconPath", "defaultIconPath", new Object[0]));
        }
      }

      Object localObject = new dD(paramazX, 0);
      bcz localbcz = bcz.bH(s);

      if (localbcz != null) {
        String str2 = null;
        try {
          str2 = String.format(ay.bd().getString("popupIconPath"), new Object[] { "resource" + localbcz.bJ() });
        }
        catch (bdh localbdh) {
          azX.an().error(localbdh.getMessage(), localbdh);
        }
        ((dD)localObject).G(str2);
      }

      ((dD)localObject).a(str1, this.gzP.l(paramazX), localArrayList);

      cjO.clE().j((cWG)localObject);
    } else {
      daO.cML().a(paramazX);
      beo.e(paramazX);
    }
  }
}