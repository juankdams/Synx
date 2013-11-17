import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public class gA
  implements Bm, bBz, bKu, bXd, bqk, dBv, dNP, ddA, dsj, eo
{
  private static final Logger K = Logger.getLogger(gA.class);

  protected static final boT aEQ = new boT();

  private static final aee aER = new bOO(new dWo());
  public static final short aES = 1;
  public static final short aET = 1;
  private static final short aEU = 0;
  private static final short aEV = 1;
  private static final int aEW = 20;
  private static boolean aEX;
  private static int aEY;
  private final List aEZ = new ArrayList();
  private long aFa;
  private long aFb;
  private boolean aFc;
  private bBn aFd;
  private short aFe;
  private boolean aFf;
  private boolean aFg;
  private cUb aFh;
  private dHJ aFi;
  private cdI aFj;
  private wz aFk;

  public gA()
  {
    this.aFf = true;
    this.aFc = true;
  }

  public gA(long paramLong) {
    this.aFa = paramLong;
    this.aFf = true;
    this.aFc = true;
    of();
  }

  public static gA a(bBn parambBn) {
    return a(dsE.cYX(), parambBn);
  }

  public static gA a(long paramLong, bBn parambBn) {
    try {
      gA localgA = new gA();
      localgA.aFa = paramLong;
      localgA.aFd = parambBn;
      dlp localdlp = cBF.isG.xn(parambBn.getId());
      if (localdlp != null) {
        localgA.aFh = cxD.ilA.b(localdlp);
      }
      bkH localbkH = byM.gml.rF(parambBn.bKy());
      if (localbkH != null) {
        localgA.aFi = bPC.b(localbkH);
      }
      if (parambBn.bKA()) {
        localgA.aFj = doI.j(parambBn);
      }
      localgA.aFb = 0L;
      localgA.aFf = true;
      localgA.aFc = true;
      localgA.of();
      return localgA;
    } catch (Exception localException) {
      K.error("Erreur lors d'un checkOut sur un Item : ", localException);
    }return null;
  }

  public void b(bBn parambBn)
  {
    this.aFd = parambBn;

    dlp localdlp = cBF.isG.xn(parambBn.getId());
    if (localdlp != null) {
      this.aFh = cxD.ilA.b(localdlp);
    }

    bkH localbkH = byM.gml.rF(parambBn.bKy());
    if (localbkH != null) {
      this.aFi = bPC.b(localbkH);
    }

    if (parambBn.bKA())
      this.aFj = doI.j(parambBn);
  }

  public gA q(boolean paramBoolean)
  {
    return a(aEQ.byv().asd(), paramBoolean);
  }

  public gA nG() {
    uu localuu = new uu(aEQ.byv().asd(), this.aFd, this);
    localuu.l(this.aFe);
    localuu.aFb = this.aFb;
    localuu.aFc = false;
    return localuu;
  }

  public gA a(long paramLong, boolean paramBoolean)
  {
    gA localgA;
    if (paramBoolean) {
      localgA = a(paramLong, this.aFd);
    } else {
      localgA = new gA(paramLong);
      localgA.aFd = this.aFd;
    }

    if (this.aFh != null) {
      localgA.aFh = cxD.ilA.c(this.aFh);
    }

    if (this.aFi != null) {
      localgA.aFi = bPC.a(this.aFi);
    }

    if (this.aFj != null) {
      localgA.aFj = doI.a(this.aFd, this.aFj);
    }

    if (this.aFk != null) {
      localgA.aFk = this.aFk;
    }

    localgA.l(this.aFe);
    localgA.aFb = this.aFb;
    return localgA;
  }

  public gA nH() {
    return a(this.aFa, aEQ.byw());
  }

  public void release()
  {
    if (this.aFf) {
      return;
    }

    if (aEX) {
      K.info("On release un Item, hashCode = " + hashCode() + " StackTrace = " + bBd.cH(1, 1));
    }

    if (this.aFg) {
      ot();
      return;
    }
  }

  public void aJ()
  {
    if (aEX) {
      K.info("Item checkout, hashCode = " + hashCode() + " stackTrace = " + bBd.cH(5, 1));
    }
    this.aFg = false;
  }

  public void bc() {
    bpG localbpG = aEQ.byx();
    if (localbpG != null) {
      localbpG.X(this);
    }

    this.aFd = null;
    this.aFh = null;
    this.aFi = null;
    this.aFj = null;
    this.aFg = true;

    this.aFa = 0L;
    this.aFb = 0L;

    this.aFc = false;
    this.aFe = 0;

    this.aEZ.clear();
  }

  public boolean a(dEf paramdEf)
  {
    return (!this.aEZ.contains(paramdEf)) && (this.aEZ.add(paramdEf));
  }

  public boolean b(dEf paramdEf) {
    return this.aEZ.remove(paramdEf);
  }

  public boolean nI()
  {
    return this.aFh != null;
  }

  public cUb nJ() {
    if (this.aFh == null) {
      throw new ml("Aucun familier défini sur l'item " + this);
    }
    return this.aFh;
  }

  public boolean nK()
  {
    return this.aFi != null;
  }

  public dHJ nL() {
    if (this.aFi == null) {
      throw new aAe("Aucune xp définie sur l'item " + this);
    }
    return this.aFi;
  }

  public boolean nM() {
    return this.aFj != null;
  }

  public boolean nN() {
    return (nM()) && (nO().nM());
  }

  public cdI nO() {
    if (this.aFj == null) {
      throw new dEi("Aucune gemme définie sur l'item " + this);
    }
    return this.aFj;
  }

  public short nP()
  {
    return this.aFe;
  }

  public void l(short paramShort) {
    if ((nI()) && (paramShort > 1)) {
      throw new ml("Les stacks d'item ne sont pas autorisés pour l'item " + this);
    }
    if (paramShort == 0) {
      throw new IllegalArgumentException("Impossible de fixer la quantité de l'item " + ok() + " à 0 : il doit être détruit.");
    }
    if (paramShort < 0) {
      throw new IllegalArgumentException("Impossible de fixer une quantité négative pour l'item " + ok());
    }
    if (paramShort > nR()) {
      throw new IllegalArgumentException("Impossible de fixer la quantité de l'objet " + ok() + " à " + paramShort + " : stackMaximumHeight=" + nR());
    }

    this.aFe = paramShort;
    aaj localaaj = aEQ.byy();
    if (localaaj != null)
      localaaj.m(this);
  }

  public void a(short paramShort)
  {
    l((short)(this.aFe + paramShort));
  }

  public short nQ() {
    return (short)(nR() - this.aFe);
  }

  public short nR() {
    return this.aFd.nR();
  }

  public int nS()
  {
    return 12;
  }

  public long nT() {
    return this.aFd.getId();
  }

  public short nU() {
    if (this.aFh != null) {
      return this.aFh.nU();
    }

    if (this.aFi != null) {
      return this.aFi.nU();
    }

    if (this.aFd != null) {
      return this.aFd.nU();
    }

    return 0;
  }

  public short nV() {
    if (this.aFh != null) {
      return this.aFh.nV();
    }

    if (this.aFi != null) {
      return this.aFi.nV();
    }

    if (this.aFd != null) {
      return this.aFd.nU();
    }

    return 0;
  }

  public Iterator iterator() {
    if (!nM()) {
      return this.aFd.bKh();
    }

    return nX();
  }

  public Iterator nW() {
    anZ localanZ = new anZ();
    cdI localcdI = nO();
    byte b1 = 0; for (byte b2 = localcdI.cgx(); b1 < b2; b1 = (byte)(b1 + 1)) {
      if (localcdI.dE(b1))
      {
        int i = localcdI.uS(b1);
        bBn localbBn = Hh.QM().dh(i);
        localanZ.b(localbBn.bKh());
      }
    }
    return localanZ;
  }

  private Iterator nX() {
    anZ localanZ = new anZ();
    localanZ.b(this.aFd.bKh());

    cdI localcdI = nO();
    byte b1 = 0; for (byte b2 = localcdI.cgx(); b1 < b2; b1 = (byte)(b1 + 1)) {
      if (localcdI.dE(b1))
      {
        int i = localcdI.uS(b1);
        bBn localbBn = Hh.QM().dh(i);
        localanZ.b(localbBn.bKh());
      }
    }
    return localanZ;
  }

  public short nY() {
    return 1;
  }

  public short nZ() {
    return 0;
  }

  public short oa() {
    return 1;
  }

  public boolean aI(int paramInt) {
    return false;
  }

  public BitSet ob()
  {
    return null;
  }

  public int oc()
  {
    return this.aFd.oc();
  }

  public int od() {
    return this.aFd.od();
  }

  public int oe() {
    return this.aFd.oe();
  }

  public String getName()
  {
    bpG localbpG = aEQ.byx();
    return localbpG != null ? localbpG.U(this) : "<unknown>";
  }

  public String fJ() {
    bpG localbpG = aEQ.byx();
    return localbpG != null ? localbpG.T(this) : "<unknown>";
  }

  public String[] getFields() {
    bpG localbpG = aEQ.byx();
    return localbpG != null ? localbpG.getFields() : null;
  }

  public Object getFieldValue(String paramString) {
    bpG localbpG = aEQ.byx();
    return localbpG != null ? localbpG.b(this, paramString) : null;
  }

  public void of() {
    bpG localbpG = aEQ.byx();
    if (localbpG != null)
      localbpG.W(this);
  }

  public void a(String paramString, Object paramObject)
  {
  }

  public void b(String paramString, Object paramObject) {
  }

  public void c(String paramString, Object paramObject) {
  }

  public boolean l(String paramString) {
    return false;
  }

  public byte[] j()
  {
    dGD localdGD = new dGD();
    if (a(localdGD)) {
      byte[] arrayOfByte = new byte[localdGD.O()];
      if (localdGD.g(ByteBuffer.wrap(arrayOfByte))) {
        return arrayOfByte;
      }
    }
    return null;
  }

  public boolean a(dGD paramdGD) {
    paramdGD.bPv = this.aFa;
    paramdGD.aDe = this.aFd.getId();
    paramdGD.aDf = this.aFe;
    if (this.aFb > 0L) {
      paramdGD.hok = new btR();
      paramdGD.hok.gcN = this.aFb;
    } else {
      paramdGD.hok = null;
    }
    if (this.aFh != null) {
      paramdGD.hol = new aBA();
      this.aFh.j(paramdGD.hol.dVA);
    } else {
      paramdGD.hol = null;
    }
    if (this.aFi != null) {
      paramdGD.hom = new bAJ();
      this.aFi.j(paramdGD.hom.Ui);
    } else {
      paramdGD.hom = null;
    }
    if (this.aFj != null) {
      paramdGD.hoo = new agU();
      this.aFj.a(paramdGD.hoo.daT);
    } else {
      paramdGD.hoo = null;
    }

    if (this.aFk != null) {
      paramdGD.hop = new VP();
      this.aFk.a(paramdGD.hop.cAY);
    } else {
      paramdGD.hop = null;
    }
    return true;
  }

  public boolean b(dGD paramdGD) {
    this.aFa = paramdGD.bPv;
    this.aFd = Hh.QM().dh(paramdGD.aDe);
    if (this.aFd == null) {
      K.error("Impossible de désérialiser un item : item d'id " + paramdGD.aDe + " inconnu UID : " + this.aFa, new Exception());
      return false;
    }

    this.aFe = paramdGD.aDf;
    this.aFb = (paramdGD.hok != null ? paramdGD.hok.gcN : 0L);
    if (paramdGD.hol != null) {
      this.aFh = cxD.ilA.a(paramdGD.hol.dVA);
    }

    if (paramdGD.hom != null) {
      this.aFi = bPC.a(paramdGD.hom.Ui);
    }

    if (paramdGD.hoo != null)
      this.aFj = doI.a(this.aFd, paramdGD.hoo.daT);
    else if (this.aFd.bKA()) {
      this.aFj = doI.j(this.aFd);
    }

    if (paramdGD.hop != null)
      this.aFk = bYs.c(paramdGD.hop.cAY);
    else {
      this.aFk = null;
    }
    return true;
  }

  public boolean og() {
    return this.aFc;
  }

  public static boT oh()
  {
    return aEQ;
  }

  public bBn oi() {
    return this.aFd;
  }

  public long oj() {
    return this.aFa;
  }

  public int ok() {
    return this.aFd.getId();
  }

  public ge ol() {
    return this.aFd.bKn();
  }

  public boolean om() {
    return this.aFd.om();
  }

  public boolean on() {
    return this.aFd.on();
  }

  public long getTimeStamp() {
    return this.aFb;
  }

  public void setTimeStamp(long paramLong) {
    this.aFb = paramLong;
  }

  public boolean isActive() {
    return this.aFc;
  }

  public boolean isUsable() {
    return (this.aFd.om()) || (this.aFd.on());
  }

  public boolean oo() {
    return b(this);
  }

  public boolean b(dsj paramdsj) {
    if (!(paramdsj instanceof gA)) {
      return false;
    }
    gA localgA = (gA)paramdsj;
    return (ok() == localgA.ok()) && (!nK()) && (!localgA.nK()) && (!nI()) && (!localgA.nI()) && (!nN()) && (!localgA.nN()) && (!or()) && (!localgA.or()) && ((this.aFb <= 0L) || (this.aFb == localgA.aFb));
  }

  public dnm op()
  {
    if (this.aFh != null) {
      return new qV(this.aFh);
    }
    if (this.aFi != null) {
      return new buM(this.aFi);
    }
    if (this.aFj != null) {
      return new ceB(this.aFj);
    }

    return dIi.lTg;
  }

  public void a(dnm paramdnm, boolean paramBoolean) {
    if (paramdnm.xH() == dIi.lTc.ewr) {
      return;
    }

    if (paramdnm.xH() == dIi.lTd.ewr) {
      this.aFh = cxD.ilA.a(((qV)paramdnm).xI());
      aCu localaCu = new aCu(this);
      localaCu.aOH();
      return;
    }

    if (paramdnm.xH() == dIi.lTe.ewr) {
      this.aFi = bPC.a(((buM)paramdnm).bCE());
      return;
    }

    if (paramdnm.xH() == dIi.lTf.ewr) {
      this.aFj = doI.a(this.aFd, ((ceB)paramdnm).chD(), true);
      return;
    }
  }

  public wz oq()
  {
    return this.aFk;
  }

  public void a(wz paramwz) {
    this.aFk = paramwz;
  }

  public boolean or() {
    return this.aFk != null;
  }

  public boolean os() {
    if (this.aFk == null)
      return false;
    return this.aFk.FC();
  }

  private void ot() {
    K.error(new bFf("Attention : Double release sur un Item, Hashcode = " + hashCode()));
    if (aEX)
    {
      K.info("Double release sur un item qu'on a trace, hashCode = " + hashCode());
      aEY += 1;
      if (aEY >= 20) {
        aEX = false;
      }
    }
    this.aFf = true;
  }

  public String ou() {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append('[').append(this.aFa).append(']');
    if (!this.aFc) {
      localStringBuilder.append('i');
    }
    localStringBuilder.append(ok());
    if (this.aFe != 1) {
      localStringBuilder.append('x').append(this.aFe);
    }
    return localStringBuilder.toString();
  }

  public String ov() {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append('{');
    localStringBuilder.append("uid=").append(this.aFa);
    localStringBuilder.append(", refId=").append(ok());
    localStringBuilder.append(", qty=").append(this.aFe);

    localStringBuilder.append(", opt=");
    if ((nM()) && (this.aFj != null))
      localStringBuilder.append(this.aFj.ov());
    else if ((nK()) && (this.aFi != null))
      localStringBuilder.append(this.aFi.ov());
    else if ((nI()) && (this.aFh != null))
      localStringBuilder.append(this.aFh.ov());
    else {
      localStringBuilder.append("none");
    }

    if (this.aFk != null) {
      localStringBuilder.append("rentInfo=").append(this.aFk);
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }

  public String toString()
  {
    return "Item{m_uniqueId=" + this.aFa + ", m_referenceItem=" + this.aFd + ", m_quantity=" + this.aFe + ", m_pet=" + this.aFh + ", m_xp=" + this.aFi + ", m_gems=" + this.aFj + ", m_rentInfo=" + this.aFk + '}';
  }
}