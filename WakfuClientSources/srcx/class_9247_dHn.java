import java.util.ArrayList;
import org.apache.log4j.Logger;

public final class dHn
{
  public static final dHn lSk = new dHn();

  private static final Logger K = Logger.getLogger(dHn.class);

  private final cSR lSl = new cSR();
  private final cSR lSm = new cSR();
  private final cSR lSn = new cSR();
  private final cSR lSo = new cSR();
  private final cSR lSp = new cSR();

  private final ArrayList lSq = new ArrayList();
  private bCP lSr;

  public boolean g(int paramInt, String paramString)
  {
    this.lSl.put(paramInt, new dpg(paramInt, paramString));
    return true;
  }

  public boolean a(int paramInt1, int paramInt2, String paramString) {
    bXs localbXs1 = (bXs)this.lSm.get(paramInt2);
    if ((localbXs1 == null) && (paramInt2 != 0)) {
      K.error("Categorie parente non enregistrée : " + paramInt2);
      return false;
    }

    bXs localbXs2 = new bXs(paramInt1, localbXs1, paramString);

    if (localbXs1 != null) {
      localbXs1.a(localbXs2);
    }

    this.lSm.put(paramInt1, localbXs2);

    if ((localbXs1 == null) && (!this.lSq.contains(localbXs2))) {
      this.lSq.add(localbXs2);
    }

    return true;
  }

  public boolean a(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, String paramString1, String paramString2, bZA parambZA, int paramInt3, long paramLong, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, int paramInt4, int paramInt5, boolean paramBoolean6, int paramInt6, dxL paramdxL, cds paramcds, boolean paramBoolean7, boolean paramBoolean8, int paramInt7)
  {
    bXs localbXs = (bXs)this.lSm.get(paramInt2);
    if (localbXs != null) {
      dEE localdEE = new dEE(paramInt1, localbXs, paramBoolean1, paramBoolean2, paramString1, paramString2, parambZA, paramInt3, paramLong, paramBoolean3, paramBoolean4, paramBoolean5, paramInt4, paramInt5, paramBoolean6, paramInt6, paramdxL, paramcds, paramBoolean8, paramInt7);
      localdEE.setActive(paramBoolean7);
      this.lSn.put(paramInt1, localdEE);
      localbXs.b(localdEE);
      return true;
    }
    K.error("La catégorie spécifiée n'est pas enregistrée : " + paramInt2);
    return false;
  }

  public boolean a(int paramInt1, int paramInt2, int[] paramArrayOfInt, String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2, short paramShort1, short paramShort2, short paramShort3, short paramShort4) {
    dEE localdEE = (dEE)this.lSn.get(paramInt2);
    if (localdEE != null) {
      dpg[] arrayOfdpg = null;
      if ((paramArrayOfInt != null) && (paramArrayOfInt.length > 0)) {
        arrayOfdpg = new dpg[paramArrayOfInt.length];
        for (int i = 0; i < paramArrayOfInt.length; i++) {
          arrayOfdpg[i] = ((dpg)this.lSl.get(paramArrayOfInt[i]));
          if (arrayOfdpg[i] == null) {
            K.error("Une variable spécifiée n'est pas enregistrée : " + paramArrayOfInt[i]);
            return false;
          }
        }
      }

      aiJ localaiJ = new aiJ(paramInt1, localdEE, arrayOfdpg, paramString1, paramString2, paramBoolean1, paramBoolean2, paramShort1, paramShort2, paramShort3, paramShort4);
      this.lSo.put(paramInt1, localaiJ);
      localdEE.c(localaiJ);
      return true;
    }
    K.error("L'achievement spécifié n'est pas enregistré : " + paramInt2);
    return false;
  }

  public boolean a(int paramInt1, int paramInt2, doV paramdoV, int[] paramArrayOfInt) {
    dEE localdEE = (dEE)this.lSn.get(paramInt2);
    if (localdEE == null) {
      K.error("L'achievement spécifié n'est pas enregistré : " + paramInt2);
      return false;
    }
    if (paramdoV == null) {
      K.error("Le type de reward spécifié n'existe pas : " + paramdoV);
      return false;
    }
    acg localacg = new acg(paramInt1, localdEE, paramdoV, paramArrayOfInt);
    this.lSp.put(paramInt1, localacg);
    localdEE.a(localacg);
    return true;
  }

  public dEE CH(int paramInt) {
    return (dEE)this.lSn.get(paramInt);
  }

  public bCP dhS() {
    if (this.lSr == null) {
      this.lSr = new bCP(0, this.lSl, this.lSn);
    }
    return new bCP(this.lSr);
  }

  public ArrayList dhT() {
    return this.lSq;
  }

  public aiJ CI(int paramInt) {
    return (aiJ)this.lSo.get(paramInt);
  }

  public aTX gn(String paramString) {
    for (dmn localdmn = this.lSl.yF(); localdmn.hasNext(); ) {
      localdmn.fl();
      dpg localdpg = (dpg)localdmn.value();
      if (localdpg.getName().equals(paramString)) {
        return localdpg;
      }
    }
    return null;
  }
}