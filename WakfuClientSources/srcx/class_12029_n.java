import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class n
{
  private static final Logger K = Logger.getLogger(n.class);
  private static final dFu ai = new dFu();

  private final cSR aj = new cSR();
  private final dOj ak;

  public n(aYr paramaYr)
  {
    this.ak = new dOj(paramaYr);
  }

  private void a(bkQ parambkQ) {
    this.aj.put(parambkQ.getId(), parambkQ);
    this.ak.Dd(parambkQ.aAM());

    ai.fg(parambkQ.getId(), parambkQ.bP());

    parambkQ.UI().lz(parambkQ.getId());
  }

  private void b(bkQ parambkQ) {
    this.aj.remove(parambkQ.getId());
    this.ak.Dd(-parambkQ.aAM());

    ai.wH(parambkQ.getId());
  }

  private void a(int paramInt1, cQn paramcQn, int paramInt2) {
    this.ak.a(paramcQn, paramInt2);
  }

  private void a(int paramInt1, cVE paramcVE, int paramInt2) {
    this.ak.b(paramcVE, paramInt2);
  }

  private void a(int paramInt1, int paramInt2) {
    ((bkQ)this.aj.get(paramInt1)).qa(paramInt2);
    this.ak.Dd(paramInt2);
  }

  private void a(int paramInt, boolean paramBoolean) {
    ((bkQ)this.aj.get(paramInt)).k(paramBoolean);
  }

  private void b(int paramInt1, int paramInt2) {
    bkQ localbkQ = (bkQ)this.aj.get(paramInt1);
    if (localbkQ == null) {
      K.error("Mise a jour de la satisfaction d'un protecteur inconnu " + paramInt1);
      return;
    }
    localbkQ.qb(paramInt2);
  }

  private void a(int paramInt, cVE paramcVE, float paramFloat) {
    ((bkQ)this.aj.get(paramInt)).b(paramcVE, paramFloat);
  }

  private void a(int paramInt, aYr paramaYr) {
    bkQ localbkQ = (bkQ)this.aj.get(paramInt);
    b(localbkQ);
    localbkQ.m(paramaYr);
    paramaYr.aMO().a(localbkQ);
  }

  public boolean a(int paramInt)
  {
    return this.aj.containsKey(paramInt);
  }

  public bkQ b(int paramInt) {
    return (bkQ)this.aj.get(paramInt);
  }

  public dmn s() {
    return this.aj.yF();
  }

  public int size() {
    return this.aj.size();
  }

  public dOj t() {
    return this.ak;
  }

  public int u() {
    return this.aj.size();
  }

  public void v()
  {
    Object[] arrayOfObject = this.aj.getValues();
    for (int i = 0; i < arrayOfObject.length; i++)
      b((bkQ)arrayOfObject[i]);
  }

  public void c(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putInt(this.aj.size());
    for (dmn localdmn = this.aj.yF(); localdmn.hasNext(); ) {
      localdmn.fl();
      ((bkQ)localdmn.value()).b(paramByteBuffer);
    }
  }

  public void d(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getInt();
    for (int j = 0; j < i; j++)
      a(bkQ.as(paramByteBuffer));
  }

  public int w() {
    return 4 + this.aj.size() * bkQ.O();
  }

  public static void c(bkQ parambkQ)
  {
    int i = parambkQ.bP();
    int j = parambkQ.getId();
    aYr localaYr = dsh.luB.BA(i);
    if (localaYr == null) {
      K.error("Nation " + i + " inconnue pour le protecteur " + j);
      return;
    }

    n localn = localaYr.aMO();
    bkQ localbkQ = (bkQ)localn.aj.get(j);
    if (localbkQ != null) {
      K.warn("Demande de remplacement des informations du protecteur " + localbkQ);
      localn.b(localbkQ);
      return;
    }

    K.info("Enregistrement du protecteur " + parambkQ);
    localn.a(parambkQ);
  }

  public static void a(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, float paramFloat1, float paramFloat2, int paramInt4, int paramInt5, String paramString) {
    aYr localaYr = dsh.luB.BA(paramInt2);
    if (localaYr == null) {
      K.error("Nation " + paramInt2 + " inconnue pour le protecteur " + paramInt1);
      return;
    }

    n localn = localaYr.aMO();
    bkQ localbkQ1 = (bkQ)localn.aj.get(paramInt1);
    if (localbkQ1 != null) {
      K.warn("Demande de remplacement des informations du protecteur " + localbkQ1);
      localn.b(localbkQ1);
      return;
    }

    bkQ localbkQ2 = new bkQ(paramInt1, localaYr, paramBoolean, paramInt3, paramFloat1, paramFloat2, paramInt4, paramInt5, paramString);
    K.info("Enregistrement du protecteur " + localbkQ2);
    localn.a(localbkQ2);
  }

  public static void b(int paramInt1, cQn paramcQn, int paramInt2) {
    int i = ai.get(paramInt1);
    aYr localaYr = dsh.luB.BA(i);
    if (localaYr == null) {
      K.error("Nation " + i + " inconnue pour le protecteur " + paramInt1);
      return;
    }

    n localn = localaYr.aMO();

    K.info("Achat d'un item de type " + paramcQn + " au prix de " + paramInt2 + " sur le protecteur " + paramInt1);
    localn.a(paramInt1, paramcQn, paramInt2);
  }

  public static void b(int paramInt1, cVE paramcVE, int paramInt2) {
    int i = ai.get(paramInt1);
    aYr localaYr = dsh.luB.BA(i);
    if (localaYr == null) {
      K.error("Nation " + i + " inconnue pour le protecteur " + paramInt1);
      return;
    }

    n localn = localaYr.aMO();

    K.info("Taxes de type " + paramcVE + " d'un montant de " + paramInt2 + " prélevées pour le protecteur " + paramInt1);
    localn.a(paramInt1, paramcVE, paramInt2);
  }

  public static void c(int paramInt1, int paramInt2) {
    int i = ai.get(paramInt1);
    aYr localaYr = dsh.luB.BA(i);
    if (localaYr == null) {
      K.error("Nation " + i + " inconnue pour le protecteur " + paramInt1);
      return;
    }

    n localn = localaYr.aMO();

    K.info("Update de wallet du protecteur " + paramInt1 + " pour un montant de " + paramInt2);
    localn.a(paramInt1, paramInt2);
  }

  public static void b(int paramInt, boolean paramBoolean) {
    int i = ai.get(paramInt);
    aYr localaYr = dsh.luB.BA(i);
    if (localaYr == null) {
      K.error("Nation " + i + " inconnue pour le protecteur " + paramInt);
      return;
    }

    n localn = localaYr.aMO();

    K.info("Update de chaos du protecteur " + paramInt + ", chaos = " + paramBoolean);
    localn.a(paramInt, paramBoolean);
  }

  public static void d(int paramInt1, int paramInt2) {
    int i = ai.get(paramInt1);
    aYr localaYr = dsh.luB.BA(i);
    if (localaYr == null) {
      K.error("Nation " + i + " inconnue pour le protecteur " + paramInt1);
      return;
    }

    n localn = localaYr.aMO();

    K.info("Update de la satisfaction du protecteur " + paramInt1 + ". Nouvelle satisfaction : " + paramInt2);
    localn.b(paramInt1, paramInt2);
  }

  public static void b(int paramInt, cVE paramcVE, float paramFloat) {
    int i = ai.get(paramInt);
    aYr localaYr = dsh.luB.BA(i);
    if (localaYr == null) {
      K.error("Nation " + i + " inconnue pour le protecteur " + paramInt);
      return;
    }

    n localn = localaYr.aMO();

    K.info("Update de la valeur de taxe " + paramcVE + " à une valeur de " + paramFloat + " pour le protecteur " + paramInt);
    localn.a(paramInt, paramcVE, paramFloat);
  }

  public static void e(int paramInt1, int paramInt2) {
    int i = ai.get(paramInt1);
    aYr localaYr = dsh.luB.BA(i);
    if (localaYr == null) {
      K.error("Nation " + i + " inconnue pour le protecteur " + paramInt1);
      return;
    }

    n localn = localaYr.aMO();

    K.info("Update de la nation du protecteur " + paramInt1 + ". Nouvelle nation : " + paramInt2);
    localn.a(paramInt1, dsh.luB.BA(paramInt2));
  }

  public static int c(int paramInt) {
    return ai.get(paramInt);
  }
}