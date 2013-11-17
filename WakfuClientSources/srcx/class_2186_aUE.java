import java.util.BitSet;

public class aUE extends cFp
  implements aAU
{
  private int eVJ;
  private float eVK;
  private boolean eVL;
  private boolean aOE;
  private int eVM;
  private float eVN;
  private boolean bbp;

  public aUE(int paramInt1, int paramInt2, bbH parambbH1, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int[] paramArrayOfInt3, int[] paramArrayOfInt4, int[] paramArrayOfInt5, int[] paramArrayOfInt6, int[] paramArrayOfInt7, long paramLong, dRh paramdRh, boolean paramBoolean1, int paramInt3, float paramFloat1, boolean paramBoolean2, boolean paramBoolean3, int paramInt4, float paramFloat2, float[] paramArrayOfFloat, float paramFloat3, float paramFloat4, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, boolean paramBoolean7, int paramInt5, int paramInt6, bZA parambZA, short paramShort, float paramFloat5, byte paramByte, boolean paramBoolean8, boolean paramBoolean9, boolean paramBoolean10, boolean paramBoolean11, bbH parambbH2, boolean paramBoolean12, boolean paramBoolean13, boolean paramBoolean14, boolean paramBoolean15)
  {
    super(paramInt1, paramInt2, parambbH1, paramArrayOfInt1, paramArrayOfInt2, paramArrayOfInt3, paramArrayOfInt4, paramArrayOfInt5, paramArrayOfInt6, paramArrayOfInt7, paramLong, paramdRh, paramBoolean1, paramArrayOfFloat, paramFloat3, paramFloat4, paramBoolean4, paramBoolean5, paramBoolean6, paramBoolean7, paramInt5, paramInt6, parambZA, paramShort, paramFloat5, paramByte, paramBoolean8, paramBoolean9, paramBoolean10, false, paramBoolean11, parambbH2, paramBoolean13, paramBoolean14, paramBoolean15);
    this.eVJ = paramInt3;
    this.eVK = paramFloat1;
    this.eVM = paramInt4;
    this.eVN = paramFloat2;

    this.eVL = paramBoolean3;
    this.aOE = paramBoolean2;
    this.bbp = paramBoolean12;
  }

  private aUE(int paramInt1, int paramInt2, bbH parambbH1, BitSet paramBitSet1, BitSet paramBitSet2, BitSet paramBitSet3, BitSet paramBitSet4, BitSet paramBitSet5, BitSet paramBitSet6, BitSet paramBitSet7, long paramLong, dRh paramdRh, boolean paramBoolean1, int paramInt3, float paramFloat1, boolean paramBoolean2, boolean paramBoolean3, int paramInt4, float paramFloat2, float[] paramArrayOfFloat, float paramFloat3, float paramFloat4, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, boolean paramBoolean7, int paramInt5, int paramInt6, bZA parambZA, short paramShort, float paramFloat5, boolean paramBoolean8, boolean paramBoolean9, boolean paramBoolean10, boolean paramBoolean11, bbH parambbH2, boolean paramBoolean12, boolean paramBoolean13, boolean paramBoolean14)
  {
    super(paramInt1, paramInt2, parambbH1, paramBitSet1, paramBitSet2, paramBitSet3, paramBitSet4, paramBitSet5, paramBitSet6, paramBitSet7, paramLong, paramdRh, paramBoolean1, paramArrayOfFloat, paramFloat3, paramFloat4, paramBoolean4, paramBoolean5, paramBoolean6, paramBoolean7, paramInt5, paramInt6, parambZA, paramShort, paramFloat5, paramBoolean8, paramBoolean9, false, paramBoolean10, paramBoolean11, parambbH2, paramBoolean12, paramBoolean13, paramBoolean14);

    this.eVJ = paramInt3;
    this.eVK = paramFloat1;
    this.eVM = paramInt4;
    this.eVN = paramFloat2;
  }

  public byte aMG()
  {
    return 2;
  }

  public cuf aV(short paramShort) {
    int i = (short)(this.eVJ + (int)Math.floor(this.eVK * paramShort));
    return cuf.wN(i).hG(this.aOE).hH(this.eVL).dl((short)(i + 1));
  }

  public cuf aW(short paramShort) {
    int i = (short)(this.eVM + (int)Math.floor(this.eVN * paramShort));
    return cuf.wN(i).hG(this.aOE);
  }

  public cFp bjQ()
  {
    aUE localaUE = new aUE(yR(), eo(), aui(), aua(), aub(), auc(), aud(), aue(), auf(), auh(), getFlags(), atZ(), zi(), this.eVJ, this.eVK, this.aOE, this.eVL, this.eVM, this.eVN, beo(), bex(), cAS(), yL(), atU(), atT(), atX(), zB(), zC(), bew(), auj(), zx(), aiz(), bev(), beq(), zH(), beA(), ber(), bes(), bet());
    localaUE.ddc = this.ddc;
    return localaUE;
  }

  public boolean zI() {
    return this.bbp;
  }
}