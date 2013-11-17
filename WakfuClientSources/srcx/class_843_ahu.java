import java.util.BitSet;
import org.apache.log4j.Logger;

public abstract class ahu
  implements duF
{
  protected static final Logger K = Logger.getLogger(duF.class);
  private final int baA;
  private final int aRQ;
  private final bbH dcQ;
  private final dRh dcR;
  private final long dcS;
  private short dcT;
  private boolean bbn;
  protected boolean dcU = true;
  private BitSet dcV;
  private BitSet dcW;
  private BitSet dcX;
  private BitSet dcY;
  private BitSet dcZ;
  private BitSet dda;
  private BitSet ddb;
  protected aGX ddc = aGX.eev;
  private boolean ddd = false;
  private boolean dde = false;

  private boolean ddf = false;
  private final boolean baR;
  private boolean bbu = false;

  public ahu(int paramInt1, int paramInt2, bbH parambbH, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int[] paramArrayOfInt3, int[] paramArrayOfInt4, int[] paramArrayOfInt5, int[] paramArrayOfInt6, int[] paramArrayOfInt7, long paramLong, dRh paramdRh, boolean paramBoolean1, boolean paramBoolean2, short paramShort, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6)
  {
    this.baA = paramInt1;
    this.aRQ = paramInt2;

    this.dcQ = parambbH;
    this.dcS = paramLong;
    this.dcR = paramdRh;

    if (paramArrayOfInt1.length > 0) {
      this.dcV = new BitSet();
      a(paramArrayOfInt1, this.dcV);
    }
    if (paramArrayOfInt2.length > 0) {
      this.dcW = new BitSet();
      a(paramArrayOfInt2, this.dcW);
    }
    if (paramArrayOfInt3.length > 0) {
      this.dda = new BitSet();
      a(paramArrayOfInt3, this.dda);
    }
    if (paramArrayOfInt4.length > 0) {
      this.dcX = new BitSet();
      a(paramArrayOfInt4, this.dcX);
    }
    if (paramArrayOfInt5.length > 0) {
      this.dcY = new BitSet();
      a(paramArrayOfInt5, this.dcY);
    }
    if (paramArrayOfInt6.length > 0) {
      this.dcZ = new BitSet();
      a(paramArrayOfInt6, this.dcZ);
    }
    if (paramArrayOfInt7.length > 0) {
      this.ddb = new BitSet();
      a(paramArrayOfInt7, this.ddb);
    }

    this.baR = paramBoolean1;
    if (paramBoolean2)
      this.ddc = aGX.eeu;
    this.dde = paramBoolean3;
    this.ddf = paramBoolean5;
    this.ddd = paramBoolean4;
    this.dcT = paramShort;
    this.bbn = paramBoolean6;
  }

  private void a(int[] paramArrayOfInt, BitSet paramBitSet)
  {
    if ((paramArrayOfInt == null) || (paramBitSet == null)) {
      return;
    }
    for (int i = 0; i < paramArrayOfInt.length; i++)
    {
      int j;
      if ((j = paramArrayOfInt[i]) >= 0)
        paramBitSet.set(j);
    }
  }

  public boolean yL() {
    return this.ddc == aGX.eeu;
  }

  public boolean atS() {
    return this.ddc == aGX.eew;
  }

  public boolean atT() {
    return this.ddd;
  }

  public boolean atU() {
    return this.dde;
  }

  public aVe atV() {
    return null;
  }

  public cSp atW() {
    return null;
  }

  public boolean atX() {
    return this.ddf;
  }

  public boolean aiz() {
    return this.bbn;
  }

  public boolean atY() {
    return false;
  }

  protected ahu(int paramInt1, int paramInt2, bbH parambbH, BitSet paramBitSet1, BitSet paramBitSet2, BitSet paramBitSet3, BitSet paramBitSet4, BitSet paramBitSet5, BitSet paramBitSet6, BitSet paramBitSet7, long paramLong, dRh paramdRh, boolean paramBoolean1, boolean paramBoolean2, short paramShort, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6)
  {
    this.baA = paramInt1;
    this.aRQ = paramInt2;
    this.dcQ = parambbH;
    this.dcS = paramLong;
    this.dcR = paramdRh;
    int i;
    if (paramBitSet1 != null) {
      for (i = 0; i < paramBitSet1.size(); i++)
        if ((i > 0) && 
          (paramBitSet1.get(i))) {
          this.dcV = new BitSet();
          this.dcV.set(i);
        }
    }
    if (paramBitSet2 != null) {
      for (i = 0; i < paramBitSet2.size(); i++)
        if ((i > 0) && 
          (paramBitSet2.get(i))) {
          this.dcW = new BitSet();
          this.dcW.set(i);
        }
    }
    if (paramBitSet3 != null) {
      for (i = 0; i < paramBitSet3.size(); i++)
        if ((i > 0) && 
          (paramBitSet3.get(i))) {
          this.dda = new BitSet();
          this.dda.set(i);
        }
    }
    if (paramBitSet4 != null) {
      for (i = 0; i < paramBitSet4.size(); i++)
        if ((i > 0) && 
          (paramBitSet4.get(i))) {
          this.dcX = new BitSet();
          this.dcX.set(i);
        }
    }
    if (paramBitSet5 != null) {
      for (i = 0; i < paramBitSet5.size(); i++)
        if ((i > 0) && 
          (paramBitSet5.get(i))) {
          this.dcY = new BitSet();
          this.dcY.set(i);
        }
    }
    if (paramBitSet6 != null) {
      for (i = 0; i < paramBitSet6.size(); i++)
        if ((i > 0) && 
          (paramBitSet6.get(i))) {
          this.dcZ = new BitSet();
          this.dcZ.set(i);
        }
    }
    if (paramBitSet7 != null) {
      for (i = 0; i < paramBitSet7.size(); i++)
        if ((i > 0) && 
          (paramBitSet7.get(i))) {
          this.ddb = new BitSet();
          this.ddb.set(i);
        }
    }
    this.baR = paramBoolean1;
    if (paramBoolean2)
      this.ddc = aGX.eeu;
    this.dde = paramBoolean3;
    this.ddd = paramBoolean4;
    this.ddf = paramBoolean5;
    this.dcT = paramShort;
    this.bbn = paramBoolean6;
  }

  public int yR()
  {
    return this.baA;
  }

  public int eo() {
    return this.aRQ;
  }

  public boolean cL(long paramLong) {
    return (this.dcS & paramLong) == paramLong;
  }

  public dRh atZ() {
    return this.dcR;
  }

  public BitSet aua() {
    return this.dcV;
  }

  public BitSet aub() {
    return this.dcW;
  }

  public BitSet auc() {
    return this.dda;
  }

  public BitSet aud() {
    return this.dcX;
  }

  public BitSet aue() {
    return this.dcY;
  }

  public BitSet auf() {
    return this.dcZ;
  }

  public boolean aug() {
    if ((aub() != null) && (aub().length() > 0))
      return true;
    if ((aua() != null) && (aua().length() > 0))
      return true;
    if ((aud() != null) && (aud().length() > 0))
      return true;
    if ((aue() != null) && (aue().length() > 0))
      return true;
    if ((auf() != null) && (auf().length() > 0)) {
      return true;
    }
    return false;
  }

  public BitSet auh() {
    return this.ddb;
  }

  public bbq a(Ce paramCe, dle paramdle1, cOE paramcOE, avY paramavY, int paramInt1, int paramInt2, short paramShort, dle paramdle2, ZS paramZS)
  {
    uY localuY = (uY)paramavY.kD(eo());

    return localuY.a(this, paramCe, paramcOE, paramdle1, paramInt1, paramInt2, paramShort, paramdle2, paramZS);
  }

  public bbH aui() {
    return this.dcQ;
  }

  public boolean zi() {
    return this.baR;
  }

  public long getFlags() {
    return this.dcS;
  }

  public short auj() {
    return this.dcT;
  }

  public boolean auk() {
    return this.dcU;
  }

  public void ay(short paramShort) {
    this.dcT = paramShort;
  }

  protected void ck(boolean paramBoolean) {
    this.bbu = paramBoolean;
  }

  public boolean zN() {
    return this.bbu;
  }

  public boolean aul() {
    return !this.bbu;
  }
}