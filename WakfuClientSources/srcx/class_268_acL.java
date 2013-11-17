import com.ankamagames.wakfu.client.console.command.display.HideFightOccluders;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class acL extends IT
{
  public static final Logger K = Logger.getLogger(acL.class);

  private static acL cSP = new acL();

  private static final int[] cSQ = new int[1];
  protected aoL cSR;
  ArrayList cSS = new ArrayList(8);

  private boolean cST = true;
  private final ArrayList cSU;
  private final ArrayList cSV;
  private final ArrayList cSW;
  private final ArrayList cSX;

  public acL()
  {
    this.cSR = new aoL();

    this.cSU = new ArrayList();
    this.cSV = new ArrayList();
    this.cSW = new ArrayList();
    this.cSX = new ArrayList();
  }

  public void a(cXf paramcXf, int paramInt) {
    byz localbyz = byv.bFN().bFO();
    if (localbyz == null) {
      return;
    }
    cSQ[0] = 2;

    this.kSP.clear();
    this.cSR.s(new cef(this, paramcXf, paramInt));

    int i = this.cSS.size();
    for (int j = 0; j < i; j++) {
      h((azX)this.cSS.get(j));
    }
    this.cSS.clear();
  }

  public void a(cXf paramcXf, float paramFloat1, float paramFloat2)
  {
    this.kSP.clear();
    if (!this.cST) {
      return;
    }
    this.cSR.s(new cei(this, paramcXf));
  }

  private void e(azX paramazX)
  {
    int i = 0; for (int j = this.cSW.size(); i < j; i++)
      ((bUL)this.cSW.get(i)).b(paramazX);
  }

  private void f(azX paramazX)
  {
    int i = 0; for (int j = this.cSX.size(); i < j; i++)
      ((fd)this.cSX.get(i)).a(paramazX);
  }

  public void g(azX paramazX)
  {
    long l = bCO.cM(paramazX.fa(), paramazX.fb());
    if (!this.cSR.containsKey(l)) {
      this.cSR.put(l, paramazX);
      ayg.aJQ().k(paramazX);
      a(paramazX, paramazX.fa(), paramazX.fb(), paramazX.fc());

      paramazX.aLP();
      e(paramazX);
    } else {
      K.warn("Impossible d'ajouter une resource en " + paramazX.fa() + ':' + paramazX.fb() + " car il en existe déjà une.");
    }
  }

  public void clear() {
    cHu localcHu = this.cSR.aBa();
    while (localcHu.hasNext()) {
      localcHu.fl();
      azX localazX = (azX)localcHu.value();
      localazX.dispose();
      localazX.release();
    }
    this.cSR.clear();
    this.kSP.clear();

    this.cSW.clear();
    this.cSW.addAll(this.cSU);
    this.cSX.clear();
    this.cSX.addAll(this.cSV);
  }

  public azX aP(int paramInt1, int paramInt2) {
    return (azX)this.cSR.get(bCO.cM(paramInt1, paramInt2));
  }

  public void m(dGy paramdGy) {
    this.cSR.s(paramdGy);
  }

  public void apc() {
    K.info("Supression de toutes les resources du ResourceManager.");
    this.cSR.s(new ceg(this));

    if (!this.cSR.isEmpty()) {
      K.error("Il reste encore " + this.cSR.size() + " après la supression !!!");
    }

    this.cSW.clear();
    this.cSW.addAll(this.cSU);
    this.cSX.clear();
    this.cSX.addAll(this.cSV);
  }

  public void h(azX paramazX) {
    if (paramazX != null) {
      this.cSR.remove(paramazX.getId());

      ayg.aJQ().h(paramazX);
      tF localtF = cwO.dV((short)paramazX.fa(), (short)paramazX.fb());
      if (localtF != null)
        localtF.a(paramazX.fa(), paramazX.fb(), false);
      else {
        K.warn("retrait d'une ressource en (" + paramazX.fa() + ", " + paramazX.fb() + ") alors que la map est inconnue/pas chargée\t");
      }
      f(paramazX);
      paramazX.release();
    } else {
      K.error("Impossible de retirer une resource null");
    }
  }

  public void cD(long paramLong) {
    azX localazX = (azX)this.cSR.get(paramLong);
    if (localazX != null)
      h(localazX);
    else
      K.warn("Impossible de supprimer une resource d'ID " + paramLong + " qui n'existe pas");
  }

  public boolean aQ(int paramInt1, int paramInt2)
  {
    return this.cSR.N(bCO.cM(paramInt1, paramInt2));
  }

  public static acL apd() {
    return cSP;
  }

  public void a(bUL parambUL) {
    if (!this.cSU.contains(parambUL))
      this.cSU.add(parambUL);
  }

  public void a(fd paramfd) {
    if (!this.cSV.contains(paramfd))
      this.cSV.add(paramfd);
  }

  public void b(bUL parambUL) {
    if (!this.cSW.contains(parambUL))
      this.cSW.add(parambUL);
  }

  public void b(fd paramfd) {
    if (!this.cSX.contains(paramfd))
      this.cSX.add(paramfd);
  }

  public boolean c(bUL parambUL) {
    return this.cSW.remove(parambUL);
  }

  public boolean c(fd paramfd) {
    return this.cSX.remove(paramfd);
  }

  protected void a(azX paramazX, int paramInt1, int paramInt2, int paramInt3)
  {
    super.a(paramazX, paramInt1, paramInt2, paramInt3);
    HideFightOccluders.i(paramazX);
  }

  public void ape()
  {
    this.cSR.s(new ced(this));
  }
}