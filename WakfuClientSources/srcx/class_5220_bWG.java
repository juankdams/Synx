import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public class bWG
  implements bqk, dBv, dsj, Comparable
{
  public static final byte hiR = 0;
  public static final byte hiS = 1;
  public static final byte hiT = 2;
  public static final byte hiU = 3;
  public static final byte hiV = 4;
  protected static final Logger K = Logger.getLogger(bWG.class);

  private static final Iterator hiW = new btA();
  protected final bJw hiX;
  protected short cZu;
  protected short hiY;

  public bWG(bJw parambJw)
  {
    if ((!bB) && (parambJw == null)) throw new AssertionError();
    this.hiX = parambJw;
  }

  public final short nU() {
    return this.cZu;
  }

  public short cbH() {
    return this.hiY;
  }

  public final short nV() {
    return this.hiX.nV();
  }

  public final void aQ(short paramShort) {
    this.cZu = paramShort;
    if (clL.cng() != null)
      clL.cng().b(this);
  }

  public bJw cbI()
  {
    return this.hiX;
  }

  public final void release()
  {
  }

  public final long oj()
  {
    return ok();
  }

  public final int ok()
  {
    return this.hiX.bQz();
  }

  public final short nP() {
    return 1;
  }

  public final void l(short paramShort) {
    throw new UnsupportedOperationException("Pas de quantité sur les aptitudes");
  }

  public final void a(short paramShort) {
    throw new UnsupportedOperationException("Pas de quantité sur les aptitudes");
  }

  public final boolean b(dsj paramdsj) {
    return false;
  }

  public final short nR() {
    return 1;
  }

  public final dsj r(boolean paramBoolean)
  {
    throw new UnsupportedOperationException("Pas de clone sur les aptitudes");
  }

  public final dsj ow()
  {
    throw new UnsupportedOperationException("Pas de clone sur les aptitudes");
  }

  public final boolean og()
  {
    return true;
  }

  public short nY() {
    return 0;
  }

  public short nZ() {
    return 0;
  }

  public short oa() {
    return 0;
  }

  public boolean aI(int paramInt) {
    return false;
  }

  public BitSet ob() {
    return null;
  }

  public int nS() {
    return 17;
  }

  public long nT()
  {
    return oj();
  }

  public Iterator iterator()
  {
    return cQ(nU()).iterator();
  }

  public List cQ(short paramShort) {
    if ((paramShort < 0) || (paramShort > this.hiX.nV())) {
      K.error("Pas d'effets définis pour l'aptitude " + this.hiX + " au level " + paramShort);
      return Collections.emptyList();
    }

    List localList = this.hiX.qo();
    ArrayList localArrayList = new ArrayList(localList.size());
    for (dpI localdpI : localList) {
      if ((paramShort >= localdpI.zB()) && (paramShort <= localdpI.zC())) {
        localArrayList.add(localdpI);
      }
    }
    return localArrayList;
  }

  public boolean cbJ()
  {
    return nU() >= this.hiX.nV();
  }

  public int aO(dhJ paramdhJ) {
    if (!cbJ()) {
      return a((short)(nU() + 1), paramdhJ);
    }
    return -1;
  }

  public int a(short paramShort, dhJ paramdhJ)
  {
    if (aPE.a(paramdhJ, ok(), paramShort)) {
      return 1;
    }
    return this.hiX.cE(paramShort);
  }

  public boolean a(Jz paramJz)
  {
    paramJz.bxv = ((short)ok());
    paramJz.bUp = this.cZu;
    paramJz.bUq = this.hiY;
    return true;
  }

  public String[] getFields() {
    return null;
  }

  public Object getFieldValue(String paramString) {
    return clL.cng().a(this, paramString);
  }

  public void a(String paramString, Object paramObject) {
  }

  public void b(String paramString, Object paramObject) {
  }

  public void c(String paramString, Object paramObject) {
  }

  public boolean l(String paramString) {
    return false;
  }

  public int q(bWG parambWG) {
    return cbI().b(parambWG.cbI());
  }

  public void cR(short paramShort) {
    this.hiY = paramShort;
  }
}