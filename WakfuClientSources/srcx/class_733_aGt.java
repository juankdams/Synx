import com.ankamagames.wakfu.client.binaryStorage.ClientEventBinaryData;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class aGt
  implements asq
{
  protected static Logger K = Logger.getLogger(aGt.class);

  public static final aGt edv = new aGt();

  public void a(dnq paramdnq)
  {
    aSx();
    paramdnq.c(this);
  }

  private boolean aSx()
  {
    cze.cwb().a(new ClientEventBinaryData(), new uq(this));

    bOU.gUc.initialize();

    return true;
  }
  private void a(ayJ paramayJ, Qq paramQq) { int i = paramQq.getId();
    short s = paramQq.si();
    String str = paramQq.gB();
    bZA localbZA;
    try {
      localbZA = aVj.hn(str);
    } catch (Exception localException) {
      K.error("Exception à la compilation du critère " + str, localException);
      localbZA = null;
    }

    aTY localaTY = new aTY(i, s, localbZA);
    paramayJ.a(localaTY);

    for (dJH localdJH : paramQq.ace())
      a(localaTY, localdJH);
  }

  private void a(aTY paramaTY, dJH paramdJH)
  {
    int i = paramdJH.getId();
    int j = paramdJH.getType();

    Ig localIg = cwy.dU(j, i);

    ArrayList localArrayList = new ArrayList();

    String[] arrayOfString = paramdJH.getParams();

    qM localqM = localIg.aF();
    ec localec = localqM.cs(arrayOfString.length);

    if (localec != null) {
      int k = 1;
      try
      {
        for (int m = 0; m < arrayOfString.length; m++) {
          String str = arrayOfString[m];
          dDZ localdDZ = (dDZ)localec.aC(m);
          dKY localdKY = localdDZ.aNE().abq().ax(str);
          localArrayList.add(localdKY);
        }
      } catch (Exception localException1) {
        K.error("Exception pendant le chargement des paramètres de l'action id=" + localIg.getId() + " : ", localException1);
        k = 0;
      }
      try
      {
        if (k != 0) {
          localIg.k(localArrayList);
          paramaTY.a(localIg);
        } else {
          K.error("impossible de charger l'action id=" + localIg.getId() + " : échec du chargement des paramètres");
        }
      } catch (Exception localException2) {
        K.error("Exception pendant l'application des paramètres du comportement id=" + localIg.getId() + " : ", localException2);
      }
    } else {
      K.error("L'action client id=" + localIg.getId() + " n'a pas un paramètrage correct (pas de template défini avec " + arrayOfString.length + " paramètres)");
    }
  }

  public String getName()
  {
    return bU.fH().getString("contentLoader.scriptAction");
  }
}