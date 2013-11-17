import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public class UG extends cGw
{
  protected short[] cym;
  protected int cyn;
  protected int cyo;
  protected int cyp;
  protected int cyq;
  protected short cyr;
  protected boolean cys;
  protected short cyt;
  protected short cyu;
  protected short az;
  protected short TD;
  private final cpy cyv = new cpy();
  private final cpy cyw = new cpy();
  private boolean cyx = false;

  private final cdO[] cyy = new cdO[63];
  protected final vc cyz = new vc();
  private boolean cyA;
  private byte[] cyB;
  private final axw cyC = new axw();
  protected byte cyD = 0;
  protected byte cyE = 0;
  private alz cyF;
  public static final byte cyG = 62;
  protected static final int cyH = 512;
  protected static final int cyI = 256;
  protected static final int cyJ = 128;
  protected static final int cyK = 63;
  protected static final int cyL = 10;
  protected static final int cyM = 0;
  protected static final int cyN = 65279;
  protected static final boolean cyO = false;
  private static final Logger cyP;
  protected static final bep[] iL;
  private static final Logger K;
  private List cyQ;

  public boolean s(int paramInt1, int paramInt2, short paramShort)
  {
    int i = av(paramInt1, paramInt2);
    if ((i < 0) || (i >= this.cyn)) {
      K.info("trying to get information in a fightmap on a out of bounds cell");
      return true;
    }

    int j = this.cym[i];

    if ((j & 0x300) != 0) {
      return true;
    }

    if (this.cyx) {
      return false;
    }

    cpy localcpy = at(paramInt1, paramInt2);
    if ((localcpy == null) || (localcpy.isEmpty())) {
      return false;
    }

    cQE localcQE = localcpy.cpa();
    while (localcQE.hasNext()) {
      byte b = localcQE.cHr();

      cdO localcdO = this.cyy[b];
      if (localcdO == null) {
        return false;
      }
      boolean bool = localcdO.aeH();
      if ((bool) && (!this.cyv.contains(b))) {
        return true;
      }
    }

    return false;
  }

  public boolean t(int paramInt1, int paramInt2, short paramShort)
  {
    int i = av(paramInt1, paramInt2);
    if ((i < 0) || (i >= this.cyn)) {
      K.info("trying to get information in a fightmap on a out of bounds cell");
      return true;
    }

    int j = this.cym[i];

    if ((j & 0x100) == 256) {
      return true;
    }

    cpy localcpy = at(paramInt1, paramInt2);
    if ((localcpy == null) || (localcpy.isEmpty())) {
      return false;
    }

    cQE localcQE = localcpy.cpa();
    while (localcQE.hasNext()) {
      byte b = localcQE.cHr();

      cdO localcdO = this.cyy[b];
      if (localcdO == null) {
        return false;
      }
      boolean bool = localcdO.atQ();
      if ((bool) && (!this.cyw.contains(b))) {
        return true;
      }
    }

    return false;
  }

  public short[] ahE()
  {
    return this.cym;
  }

  public int ahF()
  {
    return this.cyn;
  }

  public int ahG() {
    return this.cyo;
  }

  public byte ahH() {
    return this.cyD;
  }

  public byte ahI() {
    return this.cyE;
  }

  public boolean ahJ() {
    return this.cyA;
  }

  public byte[] ahK() {
    return this.cyB;
  }

  public boolean a(bbH parambbH, int paramInt1, int paramInt2, short paramShort1, int paramInt3, int paramInt4, short paramShort2, CG paramCG) {
    if (parambbH == null) {
      return true;
    }
    Iterable localIterable = parambbH.b(paramInt1, paramInt2, paramShort1, paramInt3, paramInt4, paramShort2, paramCG);
    if (localIterable == null) {
      return true;
    }
    Iterator localIterator = localIterable.iterator();
    while (localIterator.hasNext()) {
      int[] arrayOfInt = (int[])localIterator.next();
      if (!aq(arrayOfInt[0], arrayOfInt[1])) {
        return false;
      }
      if (au(arrayOfInt[0], arrayOfInt[1]) != null) {
        return false;
      }
    }
    return true;
  }

  public boolean ap(int paramInt1, int paramInt2)
  {
    if (!p(paramInt1, paramInt2)) {
      return false;
    }
    int i = av(paramInt1, paramInt2);
    return (this.cym[i] != -257) && ((this.cym[i] & 0x80) != 0);
  }

  public boolean am(int paramInt1, int paramInt2)
  {
    if (!p(paramInt1, paramInt2)) {
      return false;
    }
    int i = av(paramInt1, paramInt2);
    return gP(i);
  }

  private boolean gP(int paramInt) {
    return (this.cym[paramInt] & 0x80) == 0;
  }

  public boolean aq(int paramInt1, int paramInt2)
  {
    if (!p(paramInt1, paramInt2)) {
      return false;
    }
    int i = av(paramInt1, paramInt2);
    return gQ(i);
  }

  private boolean gQ(int paramInt) {
    return (this.cym[paramInt] & 0xFFFFFEFF) != -257;
  }

  public cdO[] ahL() {
    return this.cyy;
  }

  public cdO au(byte paramByte)
  {
    if (!aw(paramByte)) {
      return null;
    }
    return this.cyy[paramByte];
  }

  public boolean ar(int paramInt1, int paramInt2) {
    if (!p(paramInt1, paramInt2)) {
      return false;
    }
    return (aq(paramInt1, paramInt2)) || (am(paramInt1 - 1, paramInt2)) || (am(paramInt1, paramInt2 - 1)) || (am(paramInt1 + 1, paramInt2)) || (am(paramInt1, paramInt2 + 1));
  }

  public byte as(int paramInt1, int paramInt2)
  {
    if ((paramInt1 < this.aEf) || (paramInt1 >= this.aEf + this.ia) || (paramInt2 < this.aEg) || (paramInt2 >= this.aEg + this.ib)) {
      return -1;
    }

    cpy localcpy = this.cyz.dd(av(paramInt1, paramInt2));
    if ((localcpy == null) || (localcpy.isEmpty())) {
      return -1;
    }

    return localcpy.cpa().cHr();
  }

  public cpy at(int paramInt1, int paramInt2) {
    cpy localcpy = new cpy();
    if ((paramInt1 < this.aEf) || (paramInt1 >= this.aEf + this.ia) || (paramInt2 < this.aEg) || (paramInt2 >= this.aEg + this.ib)) {
      return localcpy;
    }

    return this.cyz.dd(av(paramInt1, paramInt2));
  }

  public int av(byte paramByte) {
    return this.cyz.J(paramByte);
  }

  public byte[] DY() {
    return this.cyz.DY();
  }

  protected int b(cdO paramcdO) {
    return av(paramcdO.fa(), paramcdO.fb());
  }

  public cdO au(int paramInt1, int paramInt2) {
    int i = as(paramInt1, paramInt2);
    if (i < 0) {
      return null;
    }

    return this.cyy[i];
  }

  public void c(cdO paramcdO)
  {
    if ((!bB) && (paramcdO == null)) throw new AssertionError("can't work on a null obstacle");
    this.cyv.dP(paramcdO.cgE());
  }

  public void d(cdO paramcdO) {
    if ((!bB) && (paramcdO == null)) throw new AssertionError("can't work on a null obstacle");
    this.cyv.dQ(paramcdO.cgE());
  }

  public void ahM() {
    this.cyv.clear();
  }

  public boolean ahN() {
    return this.cyx;
  }

  public void bw(boolean paramBoolean) {
    this.cyx = paramBoolean;
  }

  public void e(cdO paramcdO)
  {
    if ((!bB) && (paramcdO == null)) throw new AssertionError("can't work on a null obstacle");
    this.cyw.dP(paramcdO.cgE());
  }

  public void f(cdO paramcdO) {
    if ((!bB) && (paramcdO == null)) throw new AssertionError("can't work on a null obstacle");
    this.cyw.dQ(paramcdO.cgE());
  }

  public void ahO() {
    this.cyw.clear();
  }

  public void g(cdO paramcdO)
  {
    if (paramcdO == null) {
      return;
    }
    if (!paramcdO.atP()) {
      return;
    }
    k(paramcdO);

    if (p(paramcdO.fa(), paramcdO.fb()))
      b(paramcdO, paramcdO.fa(), paramcdO.fb());
  }

  public void f(byte paramByte, int paramInt)
  {
    this.cyz.a(paramByte, paramInt);
  }

  public void h(cdO paramcdO) {
    if (paramcdO == null) {
      return;
    }
    if (!paramcdO.atP()) {
      return;
    }
    if (!aw(paramcdO.cgE())) {
      return;
    }
    if (this.cyy[paramcdO.cgE()] == paramcdO) {
      if (p(paramcdO.fa(), paramcdO.fb())) {
        i(paramcdO);
      }
      this.cyy[paramcdO.cgE()] = null;
    }
    paramcdO.dF((byte)-1);
  }

  public void a(cdO paramcdO, boolean paramBoolean)
  {
    if ((!bB) && (!paramcdO.atP())) throw new AssertionError();
    if ((!bB) && (this.cyy[paramcdO.cgE()] != paramcdO)) throw new AssertionError("This obstacle must have been added with addObstacle");
    int i = paramcdO.fa();
    int j = paramcdO.fb();
    if (!p(i, j)) {
      return;
    }
    if (paramBoolean)
      b(paramcdO, i, j);
    else
      i(paramcdO);
  }

  public void a(cdO paramcdO, int paramInt1, int paramInt2)
  {
    if ((!bB) && (paramcdO == null)) throw new AssertionError("can't work on a null obstacle");
    if (!paramcdO.atP()) {
      return;
    }
    if (p(paramcdO.fa(), paramcdO.fb())) {
      i(paramcdO);
    }
    if (p(paramInt1, paramInt2))
      b(paramcdO, paramInt1, paramInt2);
  }

  private void b(cdO paramcdO, int paramInt1, int paramInt2)
  {
    if (paramcdO == null) {
      K.error("On passe un obstacle null");
      return;
    }
    if (!aw(paramcdO.cgE())) {
      K.error(" l'id de l'obstacle est invalide : " + paramcdO.cgE() + " : " + paramcdO);
      return;
    }
    byte b = paramcdO.cgE();
    if ((this.cyy[b] != null) && (this.cyy[b] != paramcdO)) {
      K.error("ATTENTION !!! On veut placer un obstacle dans la FightMap mais il existe deja un obstacle avec le meme ID " + b);
      return;
    }

    int i = paramcdO.afD();
    if ((i <= 0) && 
      (!p(paramInt1, paramInt2))) {
      K.error("Les coordonnées doivent etre dans la FightMap");
      return;
    }

    if (this.cyy[b] == null) {
      this.cyy[b] = paramcdO;
    }

    this.cyz.a(b, av(paramInt1, paramInt2));

    if (i <= 0) {
      return;
    }

    for (int j = paramInt1 - i; j <= paramInt1 + i; j++)
      for (int k = paramInt2 - i; k <= paramInt2 + i; k++)
        if (p(j, k))
        {
          if ((j != paramInt1) || (k != paramInt2))
          {
            int m = av(j, k);
            this.cyz.b(b, m);
          }
        }
  }

  private void i(cdO paramcdO) {
    if (paramcdO == null) {
      return;
    }

    if (paramcdO.afD() <= 0)
      this.cyz.H(paramcdO.cgE());
    else if (paramcdO.afD() > 0)
      this.cyz.I(paramcdO.cgE());
  }

  protected int av(int paramInt1, int paramInt2)
  {
    return (paramInt2 - this.aEg) * this.ia + (paramInt1 - this.aEf);
  }

  public int gR(int paramInt) {
    return paramInt / this.ia + this.aEg;
  }

  public int gS(int paramInt)
  {
    return paramInt % this.ia + this.aEf;
  }

  public void j(cdO paramcdO)
  {
    if (paramcdO == null) {
      return;
    }
    int i = paramcdO.cgE();
    if (this.cyy[i] != paramcdO) {
      i(this.cyy[i]);
      b(paramcdO, paramcdO.fa(), paramcdO.fb());
    }

    this.cyy[i] = paramcdO;
  }

  private byte k(cdO paramcdO)
  {
    if ((!bB) && (paramcdO == null)) throw new AssertionError();

    int i = this.cyy.length;
    int k;
    for (int j = 0; j < i; k = (byte)(j + 1)) {
      if (this.cyy[j] == null) {
        this.cyy[j] = paramcdO;
        paramcdO.dF(j);
        return j;
      }
    }

    return -1;
  }

  public void j(boolean paramBoolean1, boolean paramBoolean2) {
    for (int i = this.aEf; i < this.aEf + this.ia; i++)
      for (int j = this.aEg; j < this.aEg + this.ib; j++)
        if (aq(i, j)) {
          tF localtF = cwO.b(this.az, i, j, (short)(paramBoolean2 ? this.TD : 0));
          if (localtF != null)
            localtF.b(i, j, paramBoolean1);
        }
  }

  public boolean aw(byte paramByte)
  {
    return (paramByte >= 0) && (paramByte <= 62);
  }

  public short aw(int paramInt1, int paramInt2)
  {
    if ((!bB) && ((paramInt1 < this.aEf) || (paramInt1 >= this.aEf + this.ia) || (paramInt2 < this.aEg) || (paramInt2 >= this.aEg + this.ib))) throw new AssertionError("Coords must be in the fightMap, you can call isInMap to do make sure that's the case");
    int i = av(paramInt1, paramInt2);
    int j = (this.cym[i] & 0x3F) >>> 0;
    int k = this.gaM.size();
    for (int m = 0; m < k; m++) {
      tF localtF = (tF)this.gaM.get(m);
      dNg localdNg = localtF.BV();
      if (localdNg.p(paramInt1, paramInt2))
      {
        int n = localdNg.a(paramInt1, paramInt2, iL, 0);
        if (j >= n) {
          return -32768;
        }
        return iL[j].aOl;
      }
    }
    return -32768;
  }

  public short ahP() {
    return this.cyt;
  }

  public short ahQ() {
    return this.cyu;
  }

  public boolean ahR() {
    return this.cys;
  }

  public short D() {
    return this.az;
  }

  public void h(short paramShort) {
    this.az = paramShort;
  }

  public short Lk() {
    return this.TD;
  }

  public void Y(short paramShort) {
    this.TD = paramShort;
  }

  public void ax(byte paramByte) {
    this.cyD = paramByte;
  }

  public void ay(byte paramByte) {
    this.cyE = paramByte;
  }

  public void Z(short paramShort) {
    this.cyu = paramShort;
  }

  public void aa(short paramShort) {
    this.cyt = paramShort;
  }

  public void s(byte[] paramArrayOfByte) {
    this.cyB = paramArrayOfByte;
  }

  public void bx(boolean paramBoolean) {
    this.cyA = paramBoolean;
  }

  public void gT(int paramInt) {
    this.aEf = paramInt;
  }

  public void gU(int paramInt) {
    this.aEg = paramInt;
  }

  public void gV(int paramInt) {
    this.cyn = paramInt;
  }

  public void c(short[] paramArrayOfShort) {
    this.cym = paramArrayOfShort;
  }

  public void setWidth(int paramInt) {
    this.ia = paramInt;
  }

  public void setHeight(int paramInt) {
    this.ib = paramInt;
  }

  public cbQ az(byte paramByte) {
    return this.cyC.az(paramByte);
  }

  public void ahS() {
    for (int i = this.aEf; i < this.aEh; i++)
      for (int j = this.aEg; j < this.aEi; j++) {
        byte b = ax(i, j);
        if (b != -1)
        {
          this.cyC.c(b, i, j);
        }
      }
  }

  public void gW(int paramInt) {
    this.cyB = new byte[this.cyn];
    cSi localcSi = new cSi();
    int k;
    for (int i = this.aEf; i < this.aEh; i++) {
      for (j = this.aEg; j < this.aEi; j++) {
        k = ax(i, j);
        if (k != -1)
        {
          localcSi.add(av(i, j));
        }
      }
    }
    if (localcSi.size() < paramInt * 2) {
      return;
    }
    cYk[][] arrayOfcYk = new cYk[2][paramInt];
    for (int j = 0; j < paramInt; j++) {
      k = localcSi.wH(bCO.sf(localcSi.size()));
      arrayOfcYk[0][j] = new cYk(gS(k), gR(k));
      k = localcSi.wH(bCO.sf(localcSi.size()));
      arrayOfcYk[1][j] = new cYk(gS(k), gR(k));
    }
    for (j = 0; j < arrayOfcYk.length; j++) {
      cYk[] arrayOfcYk1 = arrayOfcYk[j];
      a(arrayOfcYk1, (byte)j);
    }
  }

  public void a(cYk[] paramArrayOfcYk, byte paramByte) {
    if ((!bB) && (paramByte == -1)) throw new AssertionError("Id can't be equal to -1 since this value is used when the cell is not a valid position");
    if ((!bB) && (this.cyn == 0)) throw new AssertionError("The fight map must be created before custom teams are added");

    if (!this.cyA) {
      this.cyA = true;
      this.cyB = new byte[this.cyn];
      this.cyF = new alz(2);

      for (i = 0; i < this.cyB.length; i++) {
        this.cyB[i] = -1;
      }
    }

    int i = 0;
    int j = 0;

    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;

    int i2 = paramArrayOfcYk.length;
    for (int i3 = 0; i3 < i2; i3++) {
      cYk localcYk = paramArrayOfcYk[i3];
      if (localcYk != null)
      {
        int i4 = localcYk.getX();
        int i5 = localcYk.getY();

        if ((!bB) && (!am(i4, i5))) throw new AssertionError("The start position (" + i4 + "; " + i5 + ") is not in the fightMap");

        if (i3 == 0) {
          i = i4;
          j = i5;
          k = i4;
          m = i5;
          n = i4;
          i1 = i5;
        }
        else {
          if (i4 < k) {
            k = i4;
          }
          if (i5 < m) {
            m = i5;
          }
          if (i4 > n) {
            n = i4;
          }
          if (i5 > i1) {
            i1 = i5;
          }

          int i6 = n - (n - k) / 2;
          int i7 = i1 - (i1 - m) / 2;

          if (Math.abs(i4 - i6) + Math.abs(i5 - i7) < Math.abs(i - i6) + Math.abs(j - i7)) {
            i = i4;
            j = i5;
          }
        }

        this.cyB[av(i4, i5)] = paramByte;
        this.cyC.c(paramByte, i4, i5);
      }
    }
    this.cyF.a(paramByte, new int[] { i, j });
  }

  public byte ax(int paramInt1, int paramInt2)
  {
    if (!am(paramInt1, paramInt2)) {
      return -1;
    }

    if (this.cyA) {
      return this.cyB[av(paramInt1, paramInt2)];
    }
    if (this.ia >= this.ib) {
      i = this.ia / 2;
      return paramInt1 < this.aEf + i ? this.cyD : (byte)(1 - this.cyD);
    }
    int i = this.ib / 2;
    return paramInt2 < this.aEg + i ? this.cyE : (byte)(1 - this.cyE);
  }

  public byte b(cYk paramcYk1, cYk paramcYk2)
  {
    if (this.ia >= this.ib) {
      return paramcYk1.getX() <= paramcYk2.getX() ? 0 : 1;
    }
    return paramcYk1.getY() <= paramcYk2.getY() ? 0 : 1;
  }

  public cYk ahT()
  {
    return new cYk(this.ia / 2 + this.aEf, this.ib / 2 + this.aEg, (short)0);
  }

  public final bep u(int paramInt1, int paramInt2, short paramShort)
  {
    if (!p(paramInt1, paramInt2)) {
      return null;
    }

    int i = av(paramInt1, paramInt2);
    int j = (this.cym[i] & 0x3F) >>> 0;
    int k = this.gaM.size();
    for (int m = 0; m < k; m++) {
      tF localtF = (tF)this.gaM.get(m);
      dNg localdNg = localtF.BV();
      if (localdNg.p(paramInt1, paramInt2))
      {
        int n = localdNg.a(paramInt1, paramInt2, iL, 0);
        if (j >= n) {
          return null;
        }
        if (paramShort != iL[j].aOl) {
          return null;
        }
        return iL[j];
      }
    }
    return null;
  }

  public final boolean v(int paramInt1, int paramInt2, short paramShort) {
    bep localbep = u(paramInt1, paramInt2, paramShort);
    if (localbep == null) {
      return false;
    }
    return localbep.flI != -1;
  }

  public final boolean ay(int paramInt1, int paramInt2)
  {
    int i = av(paramInt1, paramInt2);
    if ((i < 0) || (i >= this.cyn)) {
      return false;
    }

    int j = this.cym[i];

    return (j & 0x300) != 0;
  }

  public short az(int paramInt1, int paramInt2)
  {
    int i = this.aEf + this.ia - paramInt1 > paramInt1 - this.aEf ? this.aEf + this.ia - paramInt1 : paramInt1 - this.aEf;
    int j = this.aEg + this.ib - paramInt1 > paramInt2 - this.aEg ? this.aEg + this.ib - paramInt2 : paramInt2 - this.aEg;
    return (short)(i > j ? i : j);
  }

  public CG aA(byte paramByte) {
    if (this.ia >= this.ib) {
      return paramByte == 0 ? CG.bFG : CG.bFK;
    }
    return paramByte == 0 ? CG.bFI : CG.bFM;
  }

  public void clear()
  {
    this.cyn = 0;
    this.gaM.clear();
    this.cyB = null;
  }

  public void ahU() {
    int i = this.TD == 0 ? 1 : 0;
    if ((!cwO.cuj()) && (i == 0))
    {
      dQx localdQx = asc.k(this.aEf, this.aEg, this.ia, this.ib);

      for (int j = localdQx.hqw; j < localdQx.hqx; j++)
        for (int k = localdQx.hqu; k < localdQx.hqv; k++)
          cwO.c(this.az, (short)k, (short)j, this.TD);
    }
  }

  public int getDataSize()
  {
    int i = 0;
    i += 4;
    i += 16;
    i += 4;
    i += 2;
    i += this.cyn * 2;
    i++;
    if (this.cyA) {
      i += this.cyB.length;
    }
    i += 2;
    return i;
  }

  public void U(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.position();
    this.az = paramByteBuffer.getShort();
    this.TD = paramByteBuffer.getShort();
    this.aEf = paramByteBuffer.getInt();
    this.aEg = paramByteBuffer.getInt();
    this.ia = paramByteBuffer.getInt();
    this.ib = paramByteBuffer.getInt();
    this.cyt = paramByteBuffer.getShort();
    this.cyu = paramByteBuffer.getShort();
    this.cyn = paramByteBuffer.getShort();
    if ((!bB) && (paramByteBuffer.remaining() <= this.cyn * 2)) throw new AssertionError();
    this.cym = new short[this.cyn];
    for (int j = 0; j < this.cyn; j++) {
      this.cym[j] = paramByteBuffer.getShort();
    }
    this.cyA = (paramByteBuffer.get() == 1);
    if (this.cyA) {
      this.cyB = new byte[this.cyn];
      paramByteBuffer.get(this.cyB);
    }

    dQx localdQx = asc.k(this.aEf, this.aEg, this.ia, this.ib);
    int k;
    int m;
    tF localtF;
    if (cwO.cuj()) {
      for (k = localdQx.hqw; k < localdQx.hqx; k++) {
        for (m = localdQx.hqu; m < localdQx.hqv; m++) {
          localtF = cwO.t((short)m, (short)k);
          if (localtF != null)
            this.gaM.add(localtF);
        }
      }
    }
    else {
      for (k = localdQx.hqw; k < localdQx.hqx; k++) {
        for (m = localdQx.hqu; m < localdQx.hqv; m++) {
          try {
            cwO.c(this.az, (short)m, (short)k);
            localtF = cwO.b(this.az, (short)m, (short)k, this.TD);
            if (localtF != null)
              this.gaM.add(localtF);
          }
          catch (IOException localIOException) {
            K.error("Unable to load map (" + (short)m + "; " + (short)k + ')');
          }
        }
      }
    }

    this.cyD = paramByteBuffer.get();
    this.cyE = paramByteBuffer.get();

    if ((!bB) && (paramByteBuffer.position() - i != getDataSize())) throw new AssertionError("Unserialized data don't have the right size");
  }

  public boolean a(alr paramalr, cYk paramcYk)
  {
    int i = paramcYk.getX();
    int j = paramcYk.getY();
    if (!p(i, j)) {
      return false;
    }
    int k = paramalr.afD();
    short s = paramcYk.IB();
    if (k == 0) {
      if ((paramalr instanceof cdO)) {
        c((cdO)paramalr);
      }
      boolean bool = s(i, j, s);
      if ((paramalr instanceof cdO)) {
        ahM();
      }
      return !bool;
    }

    if ((paramalr instanceof cdO)) {
      c((cdO)paramalr);
    }

    for (int m = i - k; m <= i + k; m++) {
      for (int n = j - k; n <= j + k; n++) {
        if ((!p(i, j)) || (s(m, n, s))) {
          if ((paramalr instanceof cdO)) {
            ahM();
          }
          return false;
        }
      }

    }

    if ((paramalr instanceof cdO)) {
      c((cdO)paramalr);
    }
    return true;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("boundingBox={(");
    localStringBuilder.append(this.aEf).append(", ").append(this.aEg).append(") => (");
    localStringBuilder.append(this.aEh).append(", ").append(this.aEi).append(')');
    localStringBuilder.append("}, numCells=");
    localStringBuilder.append(this.cyn);
    localStringBuilder.append(", width=").append(this.ia).append(", height=").append(this.ib);
    localStringBuilder.append(", center=(").append(this.cyp).append(", ").append(this.cyq).append(", ").append(this.cyr).append(')');
    return localStringBuilder.toString();
  }

  protected int aA(int paramInt1, int paramInt2)
  {
    int i = this.gaM.size();
    for (int j = 0; j < i; j++) {
      dNg localdNg = ((tF)this.gaM.get(j)).BV();
      int k = localdNg.hY;
      int m = localdNg.hZ;
      if ((paramInt1 >= k) && (paramInt1 < k + 18) && (paramInt2 >= m) && (paramInt2 < m + 18)) {
        return j;
      }
    }
    return -1;
  }

  public void b(tF paramtF) {
    this.gaM.add(paramtF);
  }

  public cYk ahV() {
    ahW();

    int[] arrayOfInt = (int[])this.cyQ.get(bCO.sf(this.cyQ.size()));
    return new cYk(arrayOfInt);
  }

  private void ahW() {
    if (this.cyQ != null) {
      return;
    }

    this.cyQ = new ArrayList();
    for (int i = 0; i < this.cym.length; i++)
      if (gP(i))
      {
        int j = i % this.ia + this.aEf;
        int k = i / this.ia + this.aEg;

        this.cyQ.add(new int[] { j, k });
      }
  }

  public List ahX() {
    ahW();
    return new ArrayList(this.cyQ);
  }

  public void ahY() {
    for (int i = 0; i < this.cym.length; i++) {
      int j = this.cym[i];
      if ((j & 0x80) != 0)
      {
        int tmp31_30 = i;
        short[] tmp31_27 = this.cym; tmp31_27[tmp31_30] = ((short)(tmp31_27[tmp31_30] | 0x200));
      }
    }
  }

  static
  {
    cyP = Logger.getLogger("debug");

    iL = new bep[32];
    K = Logger.getLogger(UG.class);

    for (int i = 0; i < iL.length; i++)
      iL[i] = new bep();
  }
}