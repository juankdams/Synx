import java.util.ArrayList;
import org.apache.log4j.Logger;

public class akb
{
  private static final Logger K = Logger.getLogger(akb.class);

  public static final akb dkL = new akb();

  private final ArrayList dkM = new ArrayList();

  public void a(cVH paramcVH)
  {
    if (this.dkM.contains(paramcVH)) {
      K.error("Tentative d'ajout multiple du TaxHandler=" + paramcVH.toString() + " à la liste des percepteurs de taxe globaux");
      return;
    }

    this.dkM.add(paramcVH);
  }

  public int a(dkl paramdkl, cVE paramcVE, int paramInt)
  {
    return a(paramdkl, paramcVE, paramInt, false);
  }

  public int b(dkl paramdkl, cVE paramcVE, int paramInt)
  {
    return a(paramdkl, paramcVE, paramInt, true);
  }

  private int a(dkl paramdkl, cVE paramcVE, int paramInt, boolean paramBoolean) {
    int i = 0;

    int j = 0; for (int k = this.dkM.size(); j < k; j++) {
      cVH localcVH = (cVH)this.dkM.get(j);
      if (localcVH.a(paramdkl))
      {
        int m = localcVH.c(paramdkl, paramcVE, paramInt);
        if ((m > 0) && (paramBoolean))
          localcVH.a(paramcVE, m);
        i += m;
      }
    }
    if (paramBoolean) {
      paramdkl.fO().BD(i);
    }
    return i;
  }

  public void b(cVH paramcVH) {
    if (this.dkM.contains(paramcVH))
      this.dkM.remove(paramcVH);
    else
      K.error("Tentative de suppression du TaxHandler=" + paramcVH.toString() + " alors qu'il n'est pas présent dans la liste");
  }

  public String toString()
  {
    return "TaxManager{m_taxHandlers=" + this.dkM.size() + '}';
  }
}