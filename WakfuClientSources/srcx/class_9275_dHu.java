import com.ankamagames.wakfu.client.binaryStorage.NationLawBinaryData;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public final class dHu
  implements asq
{
  private static final Logger K = Logger.getLogger(dHu.class);
  private static final dHu lSw = new dHu();

  public static dHu dhU() {
    return lSw;
  }

  public void a(dnq paramdnq)
  {
    cze.cwb().a(new NationLawBinaryData(), new fa(this));

    dsh.luB.a(bpL.fKb);

    paramdnq.c(this);
  }

  private static ArrayList M(String[] paramArrayOfString) {
    ArrayList localArrayList1 = new ArrayList(paramArrayOfString.length);
    for (int i = 0; i < paramArrayOfString.length; i++) {
      try {
        ArrayList localArrayList2 = aVj.hl(paramArrayOfString[i]);
        if (localArrayList2 != null)
          localArrayList1.addAll(localArrayList2);
        else
          localArrayList1.add(null);
      } catch (Exception localException) {
        K.error("Erreur lors de la compilation de Paramètres sur une loi : " + paramArrayOfString[i], localException);
      }
    }
    return localArrayList1;
  }

  public String getName() {
    return bU.fH().getString("contentLoader.citizen.rules");
  }
}