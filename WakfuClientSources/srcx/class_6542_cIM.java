import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import org.apache.log4j.Logger;

public final class cIM
{
  protected static final Logger K = Logger.getLogger(cIM.class);
  private static final cIM iGC = new cIM();
  private abQ iGD;
  private final HashMap iGE = new HashMap();

  private final HashMap iGF = new HashMap();
  private final HashMap iGG = new HashMap();

  public static cIM cDe()
  {
    return iGC;
  }

  public void a(abQ paramabQ)
  {
    this.iGD = paramabQ;
  }

  public final void a(bXf parambXf, String paramString1, String paramString2, String paramString3, String paramString4, OM paramOM) {
    cij localcij = new cij(this, parambXf, paramString1, paramString2, paramString3, paramString4, null);
    this.iGE.put(localcij, paramOM);
  }

  public final OM a(bXf parambXf, String paramString1, String paramString2, String paramString3, String paramString4) {
    cij localcij = new cij(this, parambXf, paramString1, paramString2, paramString3, paramString4, null);
    return (OM)this.iGE.get(localcij);
  }

  public final OM b(bXf parambXf, String paramString1, String paramString2, String paramString3, String paramString4) {
    cij localcij = new cij(this, parambXf, paramString1, paramString2, paramString3, paramString4, null);
    return (OM)this.iGE.remove(localcij);
  }

  public final void a(String paramString, bnm parambnm) {
    this.iGG.put(paramString, parambnm);
    this.iGD.a(parambnm);
  }

  public final void nt(String paramString) {
    bnm localbnm = (bnm)this.iGG.remove(paramString);
    if (localbnm != null)
      this.iGD.b(localbnm);
    else
      K.error("Aucun DialogUnloadListener n'est enregistré pour " + paramString);
  }

  public final void a(String paramString, dvj paramdvj)
  {
    this.iGF.put(paramString, paramdvj);
    this.iGD.a(paramdvj);
  }

  public final void nu(String paramString) {
    dvj localdvj = (dvj)this.iGF.remove(paramString);
    if (localdvj != null)
      this.iGD.b(localdvj);
    else
      K.error("Aucun DialogLoadListener n'est enregistré pour " + paramString);
  }

  public void l(bXf parambXf)
  {
    Set localSet = this.iGE.entrySet();
    ArrayList localArrayList = new ArrayList();
    for (Map.Entry localEntry : localSet) {
      if (((cij)localEntry.getKey()).ckg() == parambXf) {
        localArrayList.add(localEntry.getKey());
      }
    }

    for (int i = localArrayList.size() - 1; i >= 0; i--)
      this.iGE.remove(localArrayList.get(i));
  }

  public void nv(String paramString)
  {
    Set localSet = this.iGE.entrySet();
    ArrayList localArrayList = new ArrayList();
    for (Map.Entry localEntry : localSet) {
      if (((cij)localEntry.getKey()).cke().equals(paramString)) {
        localArrayList.add(localEntry.getKey());
      }
    }

    for (int i = localArrayList.size() - 1; i >= 0; i--)
      this.iGE.remove(localArrayList.get(i));
  }

  public void clean()
  {
    this.iGE.clear();
  }
}