import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public class dwN
  implements aHT, dBv, dTz
{
  protected static final Logger K = Logger.getLogger(dwN.class);
  public static final String lCm = "selectedName";
  public static final String lCn = "fleaList";
  public static final String lCo = "currentFlea";
  public static final String lCp = "selectedRoom";
  private static final int lCq = -1;
  private static final int lCr = -2;
  public static final String lCs = "room0";
  public static final String lCt = "room1";
  public static final String lCu = "room2";
  public static final String lCv = "room3";
  public static final String lCw = "room4";
  public static final String lCx = "room5";
  public static final String lCy = "room6";
  public static final String lCz = "room7";
  public static final String lCA = "room8";
  public static final String[] bF = { "selectedName", "fleaList", "currentFlea", "selectedRoom", "room0", "room1", "room2", "room3", "room4", "room5", "room6", "room7", "room8" };
  private final bhu lCB;
  private dag lCC;
  private final cfG lCD;
  private boolean dVE = true;

  private boolean dVF = false;
  private final byte lCE = 0;
  private final byte lCF = 0;
  private int dVG = 0;

  private String lCG = "";
  private String lCH = "";
  private short TD;
  private final int cIL;
  private final int cIM;
  private short cYh;
  private final bHu lCI = new bHu(3);
  private final bvv lCJ = new bvv(3);
  private final bvv lCK = new bvv(3);

  private final ArrayList lCL = new ArrayList();
  private final ArrayList lCM = new ArrayList();

  public static String a(bKk parambKk) {
    return bU.fH().getString("dimensionalBag.gem.error." + parambKk.name());
  }

  public dwN() {
    this.lCD = new cfG();
    this.lCB = new bhu();
    this.lCB.a(new biL(this));

    this.cIL = 0;
    this.cIM = 0;
    this.cYh = 0;
  }

  public void dbT() {
    d(null);
  }

  private void d(bCI parambCI) {
    if ((parambCI == null) || (parambCI.equals(this.lCC))) {
      dtN.cZR().cZS();
      this.lCC = null;
    }
    dLE.doY().a(this, new String[] { "fleaList", "currentFlea" });
  }

  public boolean dbU() {
    K.debug("DimensionalBag.initializeToEnter()");
    update();
    return true;
  }

  private void update() {
    tF localtF = cwO.t((short)0, (short)0);
    this.lCD.a(localtF);
    dJN localdJN = (dJN)cPV.cGZ().V((short)0, (short)0);
    this.lCD.a(localdJN);
    btb.bBd().bBf();
    dcd();
  }

  public void b(drq paramdrq) {
    if (paramdrq != null) {
      a(paramdrq);
      update();
    }
  }

  public void BS(int paramInt) {
    this.lCD.U(paramInt);
  }

  public int dbV() {
    return this.lCD.fQ();
  }

  public int ajM() {
    return this.cIL;
  }

  public int ajN() {
    return this.cIM;
  }

  public short biy() {
    return this.cYh;
  }

  public void ed(short paramShort) {
    this.cYh = paramShort;
  }

  public short Lk() {
    return this.TD;
  }

  public void Y(short paramShort) {
    this.TD = paramShort;
  }

  public ArrayList dbW() {
    return this.lCM;
  }

  public void c(String paramString, Object paramObject) {
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("selectedName")) {
      return dbY();
    }

    if (paramString.equals("fleaList")) {
      ArrayList localArrayList = new ArrayList();
      for (cHu localcHu = this.lCB.dpR(); localcHu.hasNext(); ) {
        localcHu.fl();
        localArrayList.add(localcHu.value());
      }
      return localArrayList;
    }if (paramString.equals("currentFlea")) {
      return this.lCC;
    }
    if (paramString.equals("room0"))
      return this.lCL.get(0);
    if (paramString.equals("room1"))
      return this.lCL.get(1);
    if (paramString.equals("room2"))
      return this.lCL.get(2);
    if (paramString.equals("room3"))
      return this.lCL.get(3);
    if (paramString.equals("room4"))
      return this.lCL.get(4);
    if (paramString.equals("room5"))
      return this.lCL.get(5);
    if (paramString.equals("room6"))
      return this.lCL.get(6);
    if (paramString.equals("room7"))
      return this.lCL.get(7);
    if (paramString.equals("room8")) {
      return this.lCL.get(8);
    }

    return null;
  }

  public boolean l(String paramString) {
    if (paramString.equals("selectedName")) {
      return true;
    }
    return false;
  }

  public void b(String paramString, Object paramObject) {
  }

  public void a(String paramString, Object paramObject) {
    if ((paramString.equals("selectedName")) && 
      (paramObject != null))
      qA(paramObject.toString());
  }

  public cuB a(long paramLong, cuB paramcuB)
  {
    ArrayList localArrayList = new ArrayList();
    int i = paramLong == this.lCD.sN() ? 1 : 0;

    int j = paramcuB.csW();
    for (int k = 0; k < j; k++) {
      localObject = paramcuB.wR(k);
      m = (short)localObject[0];
      short s = (short)localObject[1];

      if ((m >= 0) && (m < 18) && (s < 0) && (i == 0))
      {
        break;
      }

      if ((m >= 0) && (m < 18) && (s >= 0) && (s <= 18)) {
        aqA localaqA = this.lCD.aCI().bj(m, s);
        if (localaqA == null) {
          if (!this.lCD.a(m, s))
            break;
        }
        else if ((localaqA instanceof dQC)) {
          dQC localdQC = (dQC)localaqA;
          gA localgA = localdQC.lm(true);
          if (localgA == null)
          {
            break;
          }
          int n = localgA.ok();

          boolean bool = this.lCD.y(paramLong, n);

          if (!bool) {
            K.info("[Checkpath] L'acces à ce type de salle est interdite au joueur ID=" + paramLong);
            break;
          }
        }
      }

      localArrayList.add(localObject);
    }

    if (localArrayList.isEmpty()) {
      return null;
    }

    k = localArrayList.size();
    Object localObject = new cuB(k);
    for (int m = 0; m < k; m++) {
      ((cuB)localObject).i(m, (int[])localArrayList.get(m));
    }

    return localObject;
  }

  public void kL(boolean paramBoolean) {
    this.dVE = paramBoolean;
  }

  public void kM(boolean paramBoolean) {
    this.dVF = paramBoolean;
  }

  public void BT(int paramInt) {
    this.dVG = paramInt;
  }

  public boolean aNN() {
    return this.dVE;
  }

  public boolean aNM() {
    return this.dVF;
  }

  public int aNK() {
    return this.dVG;
  }

  public String dbX() {
    return this.lCG;
  }

  public void qz(String paramString) {
    this.lCG = paramString;
  }

  public String dbY() {
    return this.lCH;
  }

  public void qA(String paramString) {
    this.lCH = paramString;
  }

  public long sN() {
    return this.lCD.sN();
  }

  public String bhX() {
    return this.lCD.bhX();
  }

  public dsl fO() {
    return this.lCD.fO();
  }

  public apG aCI() {
    return this.lCD.aCI();
  }

  public cfG dbZ() {
    return this.lCD;
  }

  public boolean a(drq paramdrq) {
    boolean bool = this.lCD.a(paramdrq);
    dca();
    return bool;
  }

  public boolean a(bsQ parambsQ)
  {
    this.lCD.aI(parambsQ.ayt);
    this.lCD.hf(parambsQ.ayu);
    this.lCD.eC(parambsQ.ayv);
    this.lCD.U(parambsQ.ayx);
    this.lCI.reset();
    this.lCJ.reset();
    this.lCK.reset();
    this.lCM.clear();
    for (Iterator localIterator = parambsQ.gat.iterator(); localIterator.hasNext(); ) { localObject = (aWK)localIterator.next();
      BG localBG = BG.KH();
      localBG.b(((aWK)localObject).fbN);
      this.lCM.add(localBG);
    }
    Object localObject;
    for (localIterator = parambsQ.gau.iterator(); localIterator.hasNext(); ) { localObject = (ayP)localIterator.next();
      this.lCI.add((short)((ayP)localObject).dPW);
      this.lCJ.add(((ayP)localObject).dPX);
      this.lCK.add(((ayP)localObject).dPY);
    }
    return true;
  }

  private void dca() {
    this.lCL.clear();
    apG localapG = this.lCD.aCI();

    byte b1 = 0; for (byte b2 = localapG.aBD(); b1 < b2; b1 = (byte)(b1 + 1))
      this.lCL.add(new bSz((dQC)localapG.bi(b1)));
  }

  public void fB(byte paramByte)
  {
    bSz localbSz = (bSz)this.lCL.get(paramByte);
    if (localbSz != null)
      localbSz.updateUI();
  }

  public bhu dcb()
  {
    return this.lCB;
  }

  public boolean R(short paramShort1, short paramShort2) {
    return this.lCD.R(paramShort1, paramShort2);
  }

  public dQC fC(byte paramByte) {
    return (dQC)this.lCD.aCI().bi(paramByte);
  }

  public int Y(short paramShort1, short paramShort2) {
    aqA localaqA = this.lCD.aCI().bj(paramShort1, paramShort2);
    if ((localaqA != null) && ((localaqA instanceof dQC))) {
      gA localgA = ((dQC)localaqA).lm(true);
      if (localgA != null) {
        return localgA.ok();
      }
      return -2;
    }

    return -1;
  }

  private boolean a(int paramInt1, int paramInt2, boolean[][] paramArrayOfBoolean)
  {
    if ((!bB) && ((paramArrayOfBoolean.length != 18) || (paramArrayOfBoolean[0].length != 18))) throw new AssertionError("Array for ground must be of size [MapConstants.MAP_WIDTH][MapConstants.MAP_LENGTH]");
    if ((paramInt1 < 0) || (paramInt2 < 0) || (paramInt1 >= 18) || (paramInt2 >= 18)) {
      return true;
    }
    return paramArrayOfBoolean[paramInt1][paramInt2];
  }

  public void dcc() {
    dcd();
  }

  public int awv() {
    return cbp.hsN.uw(dbV());
  }

  public void aTY() {
    dcd();
  }

  private void dcd() {
    bCO.setSeed(sN());

    btb localbtb = btb.bBd();
    boolean[][] arrayOfBoolean = new boolean[18][18];
    aku[][] arrayOfaku = new aku[18][18];
    dEN localdEN = dEN.dgB();

    aku localaku1 = localdEN.dgz();
    short s2;
    DisplayedScreenElement localDisplayedScreenElement;
    int i;
    aku localaku2;
    int j;
    for (short s1 = 0; s1 < 18; s1 = (short)(s1 + 1)) {
      for (s2 = 0; s2 < 18; s2 = (short)(s2 + 1))
      {
        localDisplayedScreenElement = localbtb.a(1, s1, s2, cWj.kJi);
        if (localDisplayedScreenElement == null) {
          arrayOfBoolean[s1][s2] = 1;
        }
        else
        {
          i = Y(s1, s2);

          if (i == -1)
          {
            if (R(s1, s2)) {
              arrayOfBoolean[s1][s2] = 0;
              localaku2 = localaku1;
            }
            else
            {
              arrayOfBoolean[s1][s2] = 1;
              localDisplayedScreenElement.setVisible(false);
              continue;
            }
          }
          else {
            if (i == -2) {
              arrayOfBoolean[s1][s2] = 1;
              localDisplayedScreenElement.setVisible(false);
              continue;
            }

            arrayOfBoolean[s1][s2] = 0;
            localaku2 = localdEN.CD(i);
            if (localaku2 == null) {
              K.error("Pas de pattern pour les salles de type " + i + ". Sélection du premier type disponible'.");
              localaku2 = localdEN.dgA();
            }
          }

          localDisplayedScreenElement.setVisible(true);
          arrayOfaku[s1][s2] = localaku2;

          if (localaku2 != localaku1) {
            j = localaku2.q(s1, s2);
            localDisplayedScreenElement.oD(j);
          }
        }
      }
    }

    a(localbtb, arrayOfBoolean, arrayOfaku, localaku1);

    for (s1 = 0; s1 < 18; s1 = (short)(s1 + 1))
      for (s2 = 0; s2 < 18; s2 = (short)(s2 + 1))
      {
        localDisplayedScreenElement = localbtb.a(s1, s2, cWj.kJi);
        if (localDisplayedScreenElement != null)
        {
          if (arrayOfBoolean[s1][s2] != 0) {
            localDisplayedScreenElement.setVisible(false);
          }
          else
          {
            i = 0;

            if ((a(s1 - 1, s2, arrayOfBoolean)) || (arrayOfaku[(s1 - 1)][s2] == localaku1)) {
              i |= 8;
            }
            if ((a(s1 + 1, s2, arrayOfBoolean)) || (arrayOfaku[(s1 + 1)][s2] == localaku1)) {
              i |= 2;
            }
            if ((a(s1, s2 - 1, arrayOfBoolean)) || (arrayOfaku[s1][(s2 * 1)] == localaku1)) {
              i |= 1;
            }
            if ((a(s1, s2 + 1, arrayOfBoolean)) || (arrayOfaku[s1][(s2 + 1)] == localaku1)) {
              i |= 4;
            }

            localaku2 = arrayOfaku[s1][s2];
            if (localaku2 == null) {
              localDisplayedScreenElement.setVisible(false);
            }
            else
            {
              j = localaku2.iY(i);

              if (j == -1) {
                localDisplayedScreenElement.setVisible(false);
              }
              else if (j == 0) {
                localDisplayedScreenElement.setVisible(false);
              } else {
                localDisplayedScreenElement.setVisible(true);
                localDisplayedScreenElement.oD(j);
                aku.a(localDisplayedScreenElement, i); } 
            }
          }
        }
      }
  }

  private static void a(btb parambtb, boolean[][] paramArrayOfBoolean, aku[][] paramArrayOfaku, aku paramaku) { for (int i = 0; i < 18; i = (short)(i + 1))
      for (int j = 0; j < 18; j = (short)(j + 1))
        if (paramArrayOfaku[i][j] == paramaku)
        {
          DisplayedScreenElement localDisplayedScreenElement = parambtb.a(1, i, j, cWj.kJi);

          if ((paramArrayOfBoolean[(i - 1)][j] != 0) || (paramArrayOfBoolean[(i + 1)][j] != 0))
            localDisplayedScreenElement.oD(paramaku.q((short)0, (short)1));
          else
            localDisplayedScreenElement.oD(paramaku.q((short)1, (short)0));
        }
  }

  public bKk a(byte paramByte, gA paramgA, boolean paramBoolean)
  {
    return this.lCD.a(paramByte, paramgA, paramBoolean, false);
  }

  public bKk r(byte paramByte, boolean paramBoolean) {
    return this.lCD.a(paramByte, paramBoolean, false);
  }

  public bKk a(byte paramByte1, boolean paramBoolean1, byte paramByte2, boolean paramBoolean2) {
    if (paramByte1 == paramByte2) {
      return bKk.gMe;
    }

    return this.lCD.a(paramByte1, paramBoolean1, paramByte2, paramBoolean2, false);
  }

  public bKk b(byte paramByte1, boolean paramBoolean1, byte paramByte2, boolean paramBoolean2, boolean paramBoolean3) {
    bKk localbKk = a(paramByte1, paramBoolean1, paramByte2, paramBoolean2);
    if (localbKk == bKk.gLV)
    {
      byz localbyz = WakfuClientInstance.awy().awz().bFO();
      if (localbyz != null) {
        if (paramBoolean3) {
          K.info("[EXCHANGE GEM] commit ! sprimary=" + paramBoolean1 + " (pos:" + paramByte1 + "), dprimary=" + paramBoolean2 + " (pos:" + paramByte2 + ')');

          this.lCD.a(paramByte1, paramBoolean1, paramByte2, paramBoolean2, true);
          update();
        } else {
          K.info("[EXCHANGE GEM] query ! sprimary=" + paramBoolean1 + " (pos:" + paramByte1 + "), dprimary=" + paramBoolean2 + " (pos:" + paramByte2 + ')');

          btw localbtw = new btw();
          localbtw.fl(paramBoolean1);
          localbtw.fm(paramBoolean2);
          localbtw.dc(paramByte1);
          localbtw.dd(paramByte2);
          WakfuClientInstance.awy().awz().aJK().d(localbtw);
        }
      }
      else localbKk = bKk.gMe;

    }

    return localbKk;
  }

  public bKk a(byte paramByte, gA paramgA, long paramLong, boolean paramBoolean1, boolean paramBoolean2) {
    bKk localbKk = a(paramByte, paramgA, paramBoolean1);
    if (localbKk != bKk.gLV) {
      return localbKk;
    }

    if (paramLong == 0L) {
      K.error("Cas non traité");
      return localbKk;
    }

    byz localbyz = WakfuClientInstance.awy().awz().bFO();
    if (localbyz == null) {
      return localbKk;
    }

    bMD localbMD = localbyz.bGP();
    cRs localcRs = localbMD.iP(paramLong);
    if (localcRs == null) {
      return bKk.gMe;
    }
    if (!localcRs.j(paramgA)) {
      return bKk.gMe;
    }

    if (paramBoolean2) {
      K.info("[PUT GEM] commit ! primary=" + paramBoolean1 + ", gemUID=" + paramgA.oj() + ", bagUID=" + paramLong + ", room=" + paramByte);

      localcRs.K(paramgA);
      this.lCD.a(paramByte, paramgA, paramBoolean1, true);
      update();
    } else {
      K.info("[PUT GEM] query ! primary=" + paramBoolean1 + ", gemUID=" + paramgA.oj() + ", bagUID=" + paramLong + ", room=" + paramByte);

      aHI localaHI = new aHI();
      localaHI.dT(paramgA.oj());
      localaHI.bL(paramBoolean1);
      localaHI.bL(paramByte);
      WakfuClientInstance.awy().awz().aJK().d(localaHI);
    }

    return localbKk;
  }

  public bKk a(byte paramByte1, long paramLong, byte paramByte2, boolean paramBoolean1, boolean paramBoolean2)
  {
    bKk localbKk = r(paramByte1, paramBoolean1);
    if (localbKk == bKk.gLV) {
      if (paramLong == 0L) {
        K.error("Cas non traité");
      } else {
        byz localbyz = WakfuClientInstance.awy().awz().bFO();
        if (localbyz != null) {
          cRs localcRs = localbyz.bGP().iP(paramLong);
          if (localcRs != null)
            try {
              gA localgA = a(paramByte1, paramBoolean1);
              if (localcRs.h(localgA, (short)paramByte2)) {
                if (paramBoolean2) {
                  K.info("[REMOVE GEM] commit ! primary=" + paramBoolean1 + ", gemUID=" + localgA.oj() + ", bagUID=" + paramLong + ", room=" + paramByte1);

                  this.lCD.a(paramByte1, paramBoolean1, true);
                  localcRs.i(localgA, (short)paramByte2);
                  update();
                } else {
                  K.info("[REMOVE GEM] query ! primary=" + paramBoolean1 + ", gemUID=" + localgA.oj() + ", bagUID=" + paramLong + ", room=" + paramByte1);

                  abL localabL = new abL();
                  localabL.cx(paramLong);
                  localabL.aH(paramByte2);
                  localabL.bL(paramBoolean1);
                  localabL.aG(paramByte1);
                  WakfuClientInstance.awy().awz().aJK().d(localabL);
                }
              }
              else localbKk = bKk.gMe; 
            }
            catch (Exception localException)
            {
              K.error("Exception", localException);
              localbKk = bKk.gMe;
            }
          else
            localbKk = bKk.gMe;
        }
        else {
          localbKk = bKk.gMe;
        }
      }
    }
    return localbKk;
  }

  public gA a(byte paramByte, boolean paramBoolean) {
    return this.lCD.a(paramByte, paramBoolean);
  }

  public cub dce() {
    byz localbyz = WakfuClientInstance.awy().awz().bFO();
    dwN localdwN = localbyz.bHa();
    if (localdwN != null) {
      return this.lCD.fP();
    }
    return null;
  }

  public void a(cub paramcub)
  {
    byz localbyz = WakfuClientInstance.awy().awz().bFO();
    dwN localdwN = localbyz.bHa();
    if ((localdwN != null) && (localdwN == localbyz.bHb()))
    {
      bIq localbIq = new bIq();
      paramcub.b(localbIq);
      int i = localbIq.O();
      ByteBuffer localByteBuffer = ByteBuffer.allocate(i);
      localbIq.g(localByteBuffer);
      localByteBuffer.flip();

      this.lCD.a(localbIq);

      dUn localdUn = new dUn();
      localdUn.aS(localByteBuffer.array());
      WakfuClientInstance.awy().awz().aJK().d(localdUn);
    }
  }

  public void h(bIq parambIq) {
    K.info("[DIMENSIONAL BAG PERMISSIONS UPDATE]");
    this.lCD.a(parambIq);
  }

  public void s(long paramLong, boolean paramBoolean) {
    if (byv.bFN().bFO().bHb() != this) {
      dag localdag = (dag)this.lCB.kK(paramLong);
      if (localdag != null) {
        localdag.setLocked(paramBoolean);
        if ((paramBoolean) && 
          (cBQ.cxL().mZ("confirmFleaPurchaseDialog"))) {
          cBQ.cxL().mW("confirmFleaPurchaseDialog");
        }

        localdag.cMG();
        dLE.doY().a(this, new String[] { "fleaList" });
      }
    }
  }

  public void dcf() {
    byv localbyv = WakfuClientInstance.awy().awz();
    dei localdei = new dei();
    localbyv.aJK().d(localdei);
  }

  public aqA c(cVo paramcVo) {
    return this.lCD.c(paramcVo);
  }

  public boolean d(cVo paramcVo) {
    return this.lCD.d(paramcVo);
  }

  public List dcg() {
    ArrayList localArrayList = new ArrayList();
    for (aqA localaqA : this.lCD.aCI()) {
      localArrayList.addAll(localaqA.aCM());
    }
    return localArrayList;
  }

  public boolean a(byz parambyz, int paramInt1, int paramInt2)
  {
    if (parambyz.bHb() == this) {
      return true;
    }

    dQC localdQC = (dQC)this.lCD.aCI().bj(paramInt1, paramInt2);

    gA localgA = localdQC.lm(true);
    if (localgA != null) {
      return this.lCD.y(parambyz.getId(), localgA.ok());
    }

    return false;
  }

  public void release() {
    this.lCD.release();
  }

  public void c(dag paramdag) {
    this.lCC = paramdag;
    dKc localdKc = byv.bFN().bFO().bSe();
    if ((localdKc != null) && (this.lCC != null))
    {
      Object localObject;
      if ((localdKc instanceof diG)) {
        localObject = (diG)localdKc;
        this.lCC.oG(((diG)localObject).MF().getName());
        this.lCC.iT(((diG)localObject).MF().oc());
        this.lCC.iV(((diG)localObject).MF().ajK());
      } else {
        localObject = dtN.cZR().kk(this.lCC.EN());
        bBn localbBn = (bBn)((Cs)localObject).Lp();
        this.lCC.oG(localbBn.getName());
        this.lCC.iT(localbBn.oc());
        this.lCC.setSize(((Byte)((Cs)localObject).getFirst()).byteValue());
      }
      this.lCC.cMG();
    }
    dLE.doY().a(this, new String[] { "currentFlea" });
  }

  public dag dch() {
    return this.lCC;
  }
}