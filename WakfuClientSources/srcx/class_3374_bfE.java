import java.util.BitSet;
import java.util.Iterator;
import org.apache.log4j.Logger;

public abstract class bfE
  implements bqk, dsj, dxl, eo
{
  protected static final Logger K = Logger.getLogger(bfE.class);
  private static final int fsS = 10;
  private static final int fsT = 15;
  private static final int fsU = 20;
  public static final short aET = 1;
  public static final short aEU = 1;
  public static final short aEV = 1;
  public static final byte fsV = 1;
  public static final byte fsW = 2;
  private static final int fsX = 0;
  private final bGl fsY = new bGl(ble());
  protected bzj fsZ;
  protected long bkH;
  protected int fta;

  public bzj bsL()
  {
    return this.fsZ;
  }

  public abstract czE aBR();

  public int nS() {
    if (this.fsZ == null) {
      K.error("ATTENTION, on essaie de vérifier le type de conteneur mais le spell est inconnu, uid : " + this.bkH);
      return 11;
    }
    if (this.fsZ.bHY()) {
      return 25;
    }
    return 11;
  }

  public long nT() {
    if (this.fsZ == null) {
      K.error("On cherche a récupérer l'id d'un SpellLevel mais son spell associé est null ", new Exception("Exception pour etude de stack"));
      return 0L;
    }
    return s(this.fsZ.getId(), nU());
  }

  public static long s(int paramInt, short paramShort) {
    return (paramInt << 16) + (paramShort & 0xFF);
  }

  public static int fu(long paramLong) {
    return (int)(paramLong >> 16);
  }

  public static short fv(long paramLong) {
    return (short)(int)(paramLong & 0xFF);
  }

  public Iterator iterator()
  {
    return this.fsZ.cc(nU());
  }

  public void release()
  {
  }

  protected void clear()
  {
    this.fsZ = null;
    this.fta = 0;
    this.bkH = -1L;
    this.fsY.clear();
  }

  public long oj()
  {
    return this.bkH;
  }

  public int ok()
  {
    return this.fsZ.getId();
  }

  public abstract byte getType();

  public boolean b(aiZ paramaiZ)
  {
    paramaiZ.type = getType();
    paramaiZ.bPv = this.bkH;
    paramaiZ.dhO = this.fsZ.getId();
    paramaiZ.bUp = this.fsY.nU();
    paramaiZ.aGh = this.fsY.ayX();
    return true;
  }

  public boolean c(aiZ paramaiZ)
  {
    this.bkH = paramaiZ.bPv;
    this.fsZ = aBR().eb(paramaiZ.dhO);
    e(paramaiZ.bUp, paramaiZ.aGh);
    if (this.fsZ == null) {
      K.error("Impossible de désérialiser un sort : sort d'id " + paramaiZ.dhO + " inconnu UID : " + this.bkH);
      return false;
    }
    return true;
  }

  public short nP() {
    return 1;
  }

  public void l(short paramShort) {
  }

  public void a(short paramShort) {
  }

  public boolean b(dsj paramdsj) {
    return false;
  }

  public short nR() {
    return 1;
  }

  public boolean og() {
    return true;
  }

  public float bsM() {
    int i = nU();
    int j = this.fsZ.vn();
    if (j <= 0) {
      return this.fsZ.rI(i) * 10 + this.fsZ.rK(i) * 15 + this.fsZ.rJ(i) * 20;
    }
    return j;
  }

  public short nY() {
    return 1;
  }

  public short nZ() {
    return 1;
  }

  public short oa() {
    return 1;
  }

  public boolean aI(int paramInt) {
    return this.fsZ.aI(paramInt);
  }

  public BitSet ob() {
    return this.fsZ.ob();
  }

  public void jv(int paramInt) {
    this.fta += paramInt;
  }

  public int aBV() {
    return this.fta;
  }

  public short nU() {
    return (short)bCO.J(this.fsY.nU() + this.fta, 0, this.fsZ.PY());
  }

  public short bsN() {
    return (short)Math.min(this.fsY.nU(), this.fsZ.PY());
  }

  public int PY() {
    return this.fsZ.PY();
  }

  public long bsO() {
    return ble().cH(ayX());
  }

  public float ayY() {
    return this.fsY.ayY();
  }

  public uP e(short paramShort, long paramLong) {
    return this.fsY.e(paramShort, paramLong);
  }

  public long ayX() {
    return this.fsY.ayX();
  }

  public uP da(long paramLong) {
    if (paramLong >= 0L) {
      return this.fsY.da(paramLong);
    }
    return this.fsY.gD(-paramLong);
  }

  public uP d(short paramShort, boolean paramBoolean)
  {
    if (paramShort > this.fsZ.PY()) {
      paramShort = (short)this.fsZ.PY();
    }

    if (paramShort > ble().nV()) {
      paramShort = ble().nV();
    }

    return this.fsY.d(paramShort, paramBoolean);
  }

  public cOB ble() {
    return dMu.abu();
  }

  public String ayZ() {
    return ble().cH(ayX()) + '/' + ble().aq(bsN());
  }

  public bTI Cz()
  {
    if (this.fsZ == null) {
      return null;
    }
    return bTI.dx(this.fsZ.bHU());
  }

  public bPk d(Object paramObject1, Object paramObject2, Object paramObject3) {
    if (this.fsZ == null) {
      return null;
    }
    return this.fsZ.b(this, paramObject1, paramObject2, paramObject3);
  }

  public long bsP() {
    if (this.fsZ != null) {
      return this.fsZ.getId();
    }
    return -1L;
  }

  public byte bsQ() {
    return (byte)(int)(this.fsZ.bsQ() + this.fsZ.uR() * nU());
  }
}