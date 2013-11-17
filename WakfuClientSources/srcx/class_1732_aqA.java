import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import org.apache.log4j.Logger;

public abstract class aqA
{
  protected static final Logger K = Logger.getLogger(aqA.class);
  protected byte dyf;
  protected short dyg;
  protected short dyh;
  protected byte bSa;
  protected byte io;
  protected List dyi = new ArrayList();
  protected apG dyj;

  protected aqA()
  {
    this.dyf = 0;
    this.dyg = 0;
    this.dyh = 0;
    this.bSa = 1;
    this.io = 1;
  }

  public final apG aCI() {
    return this.dyj;
  }

  public final void a(apG paramapG) {
    this.dyj = paramapG;
  }

  public final void bl(byte paramByte) {
    this.dyf = paramByte;
  }

  public final byte aCJ() {
    return this.dyf;
  }

  public boolean bk(int paramInt1, int paramInt2) {
    if ((paramInt1 >= this.dyg) && (paramInt1 < this.dyg + this.bSa) && 
      (paramInt2 >= this.dyh) && (paramInt2 < this.dyh + this.io))
      return true;
    return false;
  }

  public final short aCK() {
    return this.dyg;
  }

  public final void aI(short paramShort) {
    this.dyg = paramShort;
  }

  public final short aCL() {
    return this.dyh;
  }

  public final void aJ(short paramShort) {
    this.dyh = paramShort;
  }

  public final byte So() {
    return this.bSa;
  }

  public final void bm(byte paramByte) {
    this.bSa = paramByte;
  }

  public final byte bY() {
    return this.io;
  }

  public final void bn(byte paramByte) {
    this.io = paramByte;
  }

  public final boolean a(dCa paramdCa, boolean paramBoolean)
  {
    paramdCa.clear();
    paramdCa.gdr = this.dyf;
    if (paramBoolean) {
      for (cVo localcVo : this.dyi) {
        try {
          cku localcku = new cku();
          localcVo.a(localcku.hLC);
          paramdCa.gds.add(localcku);
        } catch (Exception localException) {
          K.error("Erreur lors de la serialisation d'un room content ie=" + localcVo, localException);
        }
      }
    }
    paramdCa.gdt = aCO();
    return true;
  }

  public final boolean b(dCa paramdCa, boolean paramBoolean)
  {
    this.dyf = paramdCa.gdr;
    if (!paramBoolean) {
      a(paramdCa.gdt);
      return true;
    }

    aRX localaRX = this.dyj.aBB();
    for (cku localcku : paramdCa.gds) {
      try {
        cVo localcVo = localaRX.bhZ().a(localaRX, localcku.hLC);
        if (localcVo != null)
          localaRX.c(localcVo);
      } catch (Exception localException) {
        K.error("Erreur durant la récupération du roomContent " + localcku + " d'une pièce du sac " + paramdCa, localException);
      }
    }
    return true;
  }

  public boolean a(cVo paramcVo, int paramInt1, int paramInt2)
  {
    if ((paramInt1 < this.dyg) || (paramInt1 >= this.dyg + this.bSa) || (paramInt2 < this.dyh) || (paramInt2 >= this.dyh + this.io)) {
      return false;
    }
    if (bl(paramInt1, paramInt2) != null) {
      return false;
    }
    return true;
  }

  protected final boolean a(cVo paramcVo) {
    if (a(paramcVo, paramcVo.fa(), paramcVo.fb())) {
      this.dyi.add(paramcVo);
      return true;
    }
    return false;
  }

  protected final boolean b(cVo paramcVo) {
    return this.dyi.remove(paramcVo);
  }

  public final cVo i(byte paramByte1, byte paramByte2) {
    int i = this.dyg + paramByte1;
    int j = this.dyh + paramByte2;
    return bl(i, j);
  }

  public List aCM() {
    return this.dyi;
  }

  public cVo bl(int paramInt1, int paramInt2) {
    int i = this.dyi.size();
    for (int j = 0; j < i; j++) {
      cVo localcVo = (cVo)this.dyi.get(j);
      if ((localcVo.fa() == paramInt1) && (localcVo.fb() == paramInt2))
        return localcVo;
    }
    return null;
  }

  public final ArrayList i(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    ArrayList localArrayList = new ArrayList();

    int i = this.dyg + paramInt1;
    int j = this.dyh + paramInt2;
    int k = i + paramInt3;
    int m = j + paramInt4;

    int n = this.dyi.size();
    for (int i1 = 0; i1 < n; i1++) {
      cVo localcVo = (cVo)this.dyi.get(i1);
      int i2 = localcVo.fa();
      int i3 = localcVo.fb();
      if ((i2 >= i) && (i2 < k) && (i3 >= j) && (i3 < m)) {
        localArrayList.add(localcVo);
      }
    }
    return localArrayList;
  }

  public final ArrayList a(aFk paramaFk) {
    ArrayList localArrayList = new ArrayList();

    int i = this.dyi.size();
    for (int j = 0; j < i; j++) {
      cVo localcVo = (cVo)this.dyi.get(j);
      if (localcVo.sK() == paramaFk)
        localArrayList.add(localcVo);
    }
    return localArrayList;
  }

  public final EnumSet aCN() {
    EnumSet localEnumSet = EnumSet.noneOf(aFk.class);

    int i = this.dyi.size();
    for (int j = 0; j < i; j++) {
      localEnumSet.add(((cVo)this.dyi.get(j)).sK());
    }
    return localEnumSet;
  }

  public final boolean isEmpty() {
    return this.dyi.isEmpty();
  }

  public String toString()
  {
    return "Room : x=" + this.dyg + ", y=" + this.dyh + ", width=" + this.bSa + ", height=" + this.io;
  }

  public abstract boolean aBC();

  protected abstract uc aCO();

  protected abstract void a(uc paramuc);
}