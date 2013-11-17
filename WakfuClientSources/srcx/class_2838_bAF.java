import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public abstract class bAF extends dMM
  implements awH, bbk
{
  private static final Logger K = Logger.getLogger(bAF.class);
  public static final int gpQ = 2000;
  public static final int gpR = 1500;
  public final cyW glD = new cyW();

  private boolean gpS = false;
  private dtq gpT;
  private dtq gpU;
  private long gpV;
  private static int gpW = 1;
  private int gpX = 0;

  private boolean gpY = false;

  private final List gpZ = new ArrayList();

  private final bPu fMM = new bPu(ckh.values().length);

  protected static final Nm gqa = new Nm();

  private static final cGw gqb = new cGw();

  public bAF(long paramLong) {
    super(paramLong);

    this.mdc = 4;
  }

  public void a(buF parambuF)
  {
    super.a(parambuF);
  }

  public void a(int paramInt, short paramShort, boolean paramBoolean)
  {
    ckh localckh = ckh.de(paramShort);
    if (localckh == null) {
      return;
    }

    cg(paramShort);

    if (!paramBoolean) {
      return;
    }
    try
    {
      String str = ay.bd().getString("ANMEquipmentPath");
      Anm localAnm = eo(String.format(str, new Object[] { Integer.valueOf(paramInt) }));
      a(localAnm, localckh.hLl);
      this.fMM.c(paramShort, localAnm);
    } catch (Exception localException) {
      K.error("Erreur au chargement de l'équipment : " + paramInt, localException);
    }
  }

  public void a(bBn parambBn, short paramShort, byte paramByte) {
    int i = paramByte == 0 ? parambBn.oc() : parambBn.od();
    a(i, paramShort, parambBn.bKn().nm());
  }

  public void rT(int paramInt) {
    try {
      String str = ay.bd().getString("ANMEquipmentPath");
      Anm localAnm = eo(String.format(str, new Object[] { Integer.valueOf(paramInt) }));
      a(localAnm, new int[0]);
    } catch (Exception localException) {
      K.error("Erreur au chargement de l'équipment : " + paramInt, localException);
    }
  }

  public void bIR() {
    if (aty() == null) {
      return;
    }
    aty().im();
    asV();
  }

  public void bIS()
  {
    if (this.mdg == null) {
      return;
    }
    if (this.mdh + 1 > this.mdg.csW()) {
      return;
    }
    cuB localcuB = this.mdg.dM(this.mdh, this.mdh + 1);
    this.mdh = 0;
    this.mdi = -1;
    a(localcuB, true);
    if (this.mdo != null)
      a(null, (int)this.mdo.aki());
  }

  protected cuB a(dwN paramdwN, cuB paramcuB)
  {
    return paramdwN.a(getId(), paramcuB);
  }

  public boolean a(cuB paramcuB, boolean paramBoolean) {
    for (Object localObject1 = new ArrayList(this.gpZ).iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (bwe)((Iterator)localObject1).next();
      ((bwe)localObject2).a(this, paramcuB);
    }
    Object localObject2;
    paramcuB = b(paramcuB);

    if ((paramcuB == null) || (!paramcuB.csX())) {
      if (mdj) {
        K.warn("Aucun chemin n'a été trouvé pour le déplacement local.");
      }
      return false;
    }

    if (paramcuB.csW() > 1) {
      b(paramcuB, paramBoolean);

      if (mdj) {
        K.trace("setPath: " + paramcuB);
      }
      a(paramcuB, false, true);
    } else if ((paramcuB.csW() == 1) && (dpz() != null) && (dpz().csY() != null)) {
      localObject1 = null;
      for (localObject2 = dpz().iterator(); ((Iterator)localObject2).hasNext(); ) { int[] arrayOfInt = (int[])((Iterator)localObject2).next();
        if ((arrayOfInt[0] == paramcuB.csY()[0]) && (arrayOfInt[1] == paramcuB.csY()[1]) && (arrayOfInt[2] == paramcuB.csY()[2])) {
          cuB localcuB = new cuB(2);
          if (localObject1 == null) break;
          localcuB.i(0, (int[])localObject1);
          localcuB.i(1, arrayOfInt);
          b(localcuB, true);
          k(arrayOfInt[0], arrayOfInt[1], arrayOfInt[2]);

          K.trace("Envoi d'un chemin 'pseudo-stop' au serveur"); break;
        }

        localObject1 = arrayOfInt; }
    }
    else
    {
      return false;
    }

    return true;
  }

  private cuB b(cuB paramcuB) {
    if ((paramcuB == null) || (!paramcuB.csX())) {
      return paramcuB;
    }
    byz localbyz = byv.bFN().bFO();
    if (localbyz == null) {
      return null;
    }

    dwN localdwN = localbyz.bHa();
    if (localdwN == null) {
      return paramcuB;
    }
    return a(localdwN, paramcuB);
  }

  public cuB c(cYk paramcYk, boolean paramBoolean1, boolean paramBoolean2)
  {
    return b(paramcYk.getX(), paramcYk.getY(), paramcYk.IB(), paramBoolean1, paramBoolean2);
  }

  public cuB b(int paramInt1, int paramInt2, short paramShort, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = dpB();
    int j = dpC();

    p(paramBoolean1, paramBoolean2);
    cwO.a(i, j, paramInt1, paramInt2, gqb);

    dqg localdqg = dqg.cXq();
    localdqg.a(BC(), afD(), arG());
    localdqg.a(gqa);
    localdqg.af(paramInt1, paramInt2, paramShort);
    localdqg.a(gqb);

    localdqg.ae(i, j, dpD());
    localdqg.cXv();
    cuB localcuB = localdqg.coK();
    localdqg.release();
    return localcuB;
  }

  public cuB b(boolean paramBoolean1, boolean paramBoolean2, List paramList) {
    if (paramList.isEmpty()) {
      return cuB.ifk;
    }
    p(paramBoolean1, paramBoolean2);

    int i = dpB();
    int j = dpC();
    cYk localcYk1 = (cYk)paramList.get(0);
    cwO.a(i, j, localcYk1.getX(), localcYk1.getY(), gqb);

    dqg localdqg = dqg.cXq();
    bcm localbcm = new bcm(paramList.size());
    for (int k = 0; k < paramList.size(); k++) {
      cYk localcYk2 = (cYk)paramList.get(k);
      short s1 = cwO.U(localcYk2.getX(), localcYk2.getY(), localcYk2.IB());
      if (s1 != -32768)
      {
        short s2;
        if (Math.abs(s1 - localcYk2.IB()) <= 2)
          s2 = s1;
        else {
          s2 = localcYk2.IB();
        }
        if (localbcm.add(new cYk(localcYk2.getX(), localcYk2.getY(), s2)))
          localdqg.ae(localcYk2.getX(), localcYk2.getY(), s2);
      }
    }
    if (localbcm.isEmpty()) {
      localdqg.release();
      return cuB.ifk;
    }

    localdqg.a(BC(), afD(), arG());
    localdqg.a(gqa);
    localdqg.af(i, j, dpD());
    localdqg.a(gqb);
    localdqg.cXv();
    cuB localcuB = localdqg.cXu();
    localdqg.release();
    return localcuB;
  }

  private void p(boolean paramBoolean1, boolean paramBoolean2) {
    gqa.caF = paramBoolean1;
    gqa.caA = (!paramBoolean2);
    gqa.caJ = true;
    gqa.caH = gqa.caA;
    gqa.caL = bIT();
  }

  public boolean a(alr paramalr, boolean paramBoolean1, boolean paramBoolean2)
  {
    gqa.caJ = true;
    gqa.caF = false;
    gqa.caA = (!paramBoolean1);
    gqa.caH = gqa.caA;
    gqa.caI = true;
    gqa.caL = bIT();

    int i = dpB();
    int j = dpC();
    cwO.a(i, j, paramalr.fa(), paramalr.fb(), gqb);

    dqg localdqg = dqg.cXq();
    localdqg.af(i, j, dpD());
    int k = paramalr.fa() - paramalr.afD() - 1;
    int m = paramalr.fa() + paramalr.afD() + 1;
    int n = paramalr.fb() - paramalr.afD() - 1;
    int i1 = paramalr.fb() + paramalr.afD() + 1;

    for (int i2 = k; i2 <= m; i2++)
      for (int i3 = n; i3 <= i1; i3++)
      {
        if ((!paramBoolean2) || 
          ((i2 != k) && (i2 != m)) || (
          (i3 != n) && (i3 != i1)))
        {
          dNg localdNg = gqb.ei(i2, i3);
          if ((localdNg != null) && (cwO.v(i2, i3, paramalr.fc())))
          {
            localdqg.ae(i2, i3, paramalr.fc());
          }
        }
      }
    localdqg.a(BC(), afD(), arG());
    localdqg.a(gqa);
    localdqg.a(gqb);
    localdqg.cXv();
    cuB localcuB = localdqg.cXu();
    localdqg.release();

    gqa.caI = false;
    return (localcuB.csX()) && (a(localcuB, true));
  }

  protected boolean bIT() {
    return true;
  }

  public boolean b(cYk paramcYk, boolean paramBoolean1, boolean paramBoolean2)
  {
    return a(paramcYk.getX(), paramcYk.getY(), paramcYk.IB(), paramBoolean1, paramBoolean2);
  }

  public boolean a(int paramInt1, int paramInt2, short paramShort, boolean paramBoolean1, boolean paramBoolean2) {
    cuB localcuB = b(paramInt1, paramInt2, paramShort, paramBoolean1, paramBoolean2);
    return (localcuB.csX()) && (a(localcuB, true));
  }

  public boolean a(boolean paramBoolean1, boolean paramBoolean2, List paramList) {
    cuB localcuB = b(paramBoolean1, paramBoolean2, paramList);
    return (localcuB.csX()) && (a(localcuB, true));
  }

  public boolean a(cYk paramcYk, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    return a(paramcYk.getX(), paramcYk.getY(), paramcYk.IB(), paramBoolean1, paramBoolean2, paramBoolean3);
  }

  public boolean a(int paramInt1, int paramInt2, short paramShort, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    if (paramBoolean1) {
      cuB localcuB = b(paramInt1, paramInt2, paramShort, paramBoolean2, paramBoolean3);
      if ((localcuB != null) && (localcuB.csW() != 0)) {
        a(localcuB, false, true);
        return true;
      }
    }
    k(paramInt1, paramInt2, paramShort);
    return true;
  }

  dtq bIU() {
    return this.gpU;
  }

  public void bIV()
  {
    if (this.gpU == null) {
      return;
    }

    long l = System.currentTimeMillis();
    if ((this.gpT != null) && (this.gpT.c(this.gpU)) && (this.gpT.cZA().equals(this.gpU.cZA())))
    {
      if (mdj)
        K.info("Pas d'envoi du chemin (contenu dans le précédent envoyé)");
    }
    else {
      dgW localdgW = new dgW();
      localdgW.b(this.gpU);
      byv.bFN().aJK().d(localdgW);
      this.gpT = this.gpU;
      this.gpV = l;
      if (mdj) {
        K.info("Sent : " + this.gpT + " (" + this.gpT.cZC() + " steps)");
      }
    }
    this.gpU = null;
  }

  public void jz(String paramString)
  {
    try
    {
      if (paramString.equals(this.ki)) {
        return;
      }
      int i = Integer.parseInt(paramString);
      String str = rU(i);

      em(paramString);
      b(str, true);
    } catch (Exception localException) {
      K.error("Erreur lors de la création de la DescriptorLibrary : ", localException);
    }
  }

  public static String rU(int paramInt) {
    String str1 = xc.dz(paramInt);
    String str2 = ay.bd().getString(str1);
    return String.format(str2, new Object[] { Integer.toString(paramInt) });
  }

  public static String y(String paramString, int paramInt)
  {
    if (dzp.qF(paramString))
      return rU(paramInt);
    String str;
    if (paramString.equals("equipment"))
      str = ay.bd().getString("ANMEquipmentPath");
    else if (paramString.equals("npc"))
      str = ay.bd().getString("npcGfxPath");
    else if (paramString.equals("player"))
      str = ay.bd().getString("playerGfxPath");
    else {
      return null;
    }
    return String.format(str, new Object[] { Integer.toString(paramInt) });
  }

  public void bIW()
  {
    bM localbM = this.fMM.bVW();
    while (localbM.hasNext()) {
      localbM.fl();
      ckh localckh = ckh.de(localbM.fm());
      a(localckh, (Anm)localbM.value());
    }
    this.fMM.clear();
  }

  public void cg(short paramShort)
  {
    ckh localckh = ckh.de(paramShort);
    if (localckh == null) {
      return;
    }

    Anm localAnm = (Anm)this.fMM.cw(paramShort);
    if (localAnm != null)
      a(localckh, localAnm);
  }

  private void a(ckh paramckh, Anm paramAnm)
  {
    c(paramAnm, paramckh.hLl);
  }

  public void a(dtq paramdtq)
  {
    cuB localcuB = new cuB(paramdtq.cZC() + 1);
    localcuB.a(0, paramdtq.cZz().getX(), paramdtq.cZz().getY(), paramdtq.cZz().IB());
    cYk localcYk = new cYk(paramdtq.cZz());
    for (int i = 0; i < paramdtq.cZC(); i++) {
      om localom = paramdtq.BG(i);
      localcYk.k(localom.aTt);
      localcYk.p(0, 0, localom.aTu);

      localcuB.a(i + 1, localcYk.getX(), localcYk.getY(), localcYk.IB());
    }

    a(localcuB, true, cgR() != 4);
  }

  private void b(cuB paramcuB, boolean paramBoolean)
  {
    if (!this.gpS) {
      return;
    }

    long l1 = System.currentTimeMillis();

    dtq localdtq = dtq.d(paramcuB);
    if (localdtq == null) {
      K.error("Impossible d'émettre un chemin null en direction du serveur");
      return;
    }

    if (this.gpU == null)
      this.gpU = localdtq;
    else {
      this.gpU = dtq.a(this.gpU.cZz(), this.gpU, localdtq);
    }

    if (!paramBoolean) {
      if (l1 - this.gpV < 2000L) {
        if (mdj)
          K.info("Bufferisation des chemins non-stop... " + this.gpU);
      }
      else {
        if (mdj) {
          K.info("===> Envoi du chemin non-stop bufferisé au serveur: " + this.gpU);
        }
        bIV();
      }
    } else {
      long l2 = l1 - this.gpV;
      long l3 = 1500L - l2;
      int i = gpW++;
      if (l3 > 0L) {
        this.gpX = i;
        if (mdj) {
          K.info("Schedule de l'envoi d'un chemin stop tokenisé " + i + " dans " + l3 + " ms");
        }
        dka.cSF().a(new bmp(this, i), l3, 1);
      }
      else
      {
        if (mdj) {
          K.info("===> Envoi du chemin stop bufferisé au serveur: " + this.gpU);
        }
        bIV();
      }
    }
  }

  public cyW bHi() {
    return this.glD;
  }

  public boolean bIX() {
    return this.gpS;
  }

  public void fE(boolean paramBoolean) {
    this.gpS = paramBoolean;
  }

  public boolean bIY() {
    return this.gpY;
  }

  public void fF(boolean paramBoolean) {
    this.gpY = paramBoolean;
  }

  public void a(bwe parambwe) {
    this.gpZ.add(parambwe);
  }

  public void b(bwe parambwe) {
    this.gpZ.remove(parambwe);
  }

  public void b(bAF parambAF) {
    for (Iterator localIterator = this.gpZ.iterator(); localIterator.hasNext(); ) { localObject = (bwe)localIterator.next();
      parambAF.a((bwe)localObject);
    }
    Object localObject;
    for (localIterator = this.mcV.iterator(); localIterator.hasNext(); ) { localObject = (bye)localIterator.next();
      parambAF.b((bye)localObject); }
  }

  public void fG(boolean paramBoolean)
  {
    if (byv.bFN().bFO().aeL() == this)
      cc(WakfuClientInstance.awy().awB().a(bmz.fEs));
    else
      cc(paramBoolean);
  }

  public String fe()
  {
    return "";
  }

  protected void reset()
  {
    super.reset();
    this.fMM.clear();
  }

  static
  {
    gqa.caB = 400;
  }
}