import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class aDN
{
  private static final Logger K = Logger.getLogger(aDN.class);
  private static final String dYS = "action";

  public static void a(URL paramURL, cZy paramcZy, int paramInt)
  {
    bpA localbpA = new bpA();
    bwZ localbwZ = new bwZ();
    try {
      InputStream localInputStream = paramURL.openStream();
      localbpA.i(localInputStream);
      localbpA.a(localbwZ, new cdJ[0]);
      localInputStream.close();
    } catch (Exception localException) {
      K.warn("Problème à l'ouverture : ", localException);
      return;
    }

    List localList = a(localbwZ, paramInt);

    a(localList, paramcZy);
  }

  private static List a(bwZ parambwZ, int paramInt) {
    CC localCC = parambwZ.bEx();
    ArrayList localArrayList1 = localCC.c("action");

    ArrayList localArrayList2 = new ArrayList(localArrayList1.size());

    int i = 0; for (int j = localArrayList1.size(); i < j; i++) {
      K localK = (K)localArrayList1.get(i);
      localArrayList2.add(ccz.huw.a(localK, paramInt));
    }

    return localArrayList2;
  }

  private static void a(List paramList, cZy paramcZy) {
    int i = 0; for (int j = paramList.size(); i < j; i++)
      ((cMc)paramList.get(i)).a(paramcZy);
  }
}