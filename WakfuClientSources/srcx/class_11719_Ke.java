import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class Ke extends bvw
{
  private static final Logger K = Logger.getLogger(Uc.class);

  public Ke(bCP parambCP) {
    this.gfI = parambCP;
    ArrayList localArrayList = dHn.lSk.dhT();

    Object localObject1 = null;
    for (Object localObject2 = localArrayList.iterator(); ((Iterator)localObject2).hasNext(); ) { localObject3 = (bXs)((Iterator)localObject2).next();
      int i = ((bXs)localObject3).getId();
      if (i == 4) {
        localObject1 = localObject3;
        break;
      }
    }

    if (localObject1 == null) {
      K.error("Problème d'export, pas de catégorie des quêtes !!!");
      return;
    }

    localObject2 = localObject1.getChildren();
    if (localObject2 == null) {
      K.error("Problème d'export, la catégorie des quêtes est vide !!!");
      return;
    }

    for (Object localObject3 = ((ArrayList)localObject2).iterator(); ((Iterator)localObject3).hasNext(); ) { bXs localbXs = (bXs)((Iterator)localObject3).next();
      int j = localbXs.getId();
      int k = !aUP.c(cPB.kyM, j) ? 1 : 0;

      cHT.iDr.a(localbXs, null);
      if (k != 0) {
        aMT localaMT = cHT.iDr.xR(localbXs.getId());
        this.gfF.put(j, localaMT);
        this.gfG.add(localaMT);
      }
    }

    this.gfH = ((aMT)this.gfG.get(0));
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("isQuestView")) {
      return Boolean.valueOf(UO());
    }
    return super.getFieldValue(paramString);
  }

  public boolean UO() {
    return true;
  }
}