import java.util.BitSet;

public class aXT extends cFp
  implements dBu
{
  private final int fdr;
  private final float fds;

  public aXT(int paramInt1, int paramInt2, bbH parambbH1, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int[] paramArrayOfInt3, int[] paramArrayOfInt4, int[] paramArrayOfInt5, int[] paramArrayOfInt6, int[] paramArrayOfInt7, long paramLong, dRh paramdRh, boolean paramBoolean1, int paramInt3, float paramFloat1, float[] paramArrayOfFloat, float paramFloat2, float paramFloat3, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, int paramInt4, int paramInt5, bZA parambZA, short paramShort, float paramFloat4, byte paramByte, boolean paramBoolean6, boolean paramBoolean7, boolean paramBoolean8, boolean paramBoolean9, bbH parambbH2, boolean paramBoolean10, boolean paramBoolean11, boolean paramBoolean12)
  {
    super(paramInt1, paramInt2, parambbH1, paramArrayOfInt1, paramArrayOfInt2, paramArrayOfInt3, paramArrayOfInt4, paramArrayOfInt5, paramArrayOfInt6, paramArrayOfInt7, paramLong, paramdRh, paramBoolean1, paramArrayOfFloat, paramFloat2, paramFloat3, paramBoolean2, paramBoolean3, paramBoolean4, paramBoolean5, paramInt4, paramInt5, parambZA, paramShort, paramFloat4, paramByte, paramBoolean6, paramBoolean7, false, paramBoolean8, paramBoolean9, parambbH2, paramBoolean10, paramBoolean11, paramBoolean12);
    this.fdr = paramInt3;
    this.fds = paramFloat1;
  }

  private aXT(int paramInt1, int paramInt2, bbH parambbH1, BitSet paramBitSet1, BitSet paramBitSet2, BitSet paramBitSet3, BitSet paramBitSet4, BitSet paramBitSet5, BitSet paramBitSet6, BitSet paramBitSet7, long paramLong, dRh paramdRh, boolean paramBoolean1, int paramInt3, float paramFloat1, float[] paramArrayOfFloat, float paramFloat2, float paramFloat3, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, int paramInt4, int paramInt5, bZA parambZA, short paramShort, float paramFloat4, boolean paramBoolean6, boolean paramBoolean7, boolean paramBoolean8, boolean paramBoolean9, bbH parambbH2, boolean paramBoolean10, boolean paramBoolean11, boolean paramBoolean12) {
    super(paramInt1, paramInt2, parambbH1, paramBitSet1, paramBitSet2, paramBitSet3, paramBitSet4, paramBitSet5, paramBitSet6, paramBitSet7, paramLong, paramdRh, paramBoolean1, paramArrayOfFloat, paramFloat2, paramFloat3, paramBoolean2, paramBoolean3, paramBoolean4, paramBoolean5, paramInt4, paramInt5, parambZA, paramShort, paramShort, paramBoolean6, false, paramBoolean7, paramBoolean8, paramBoolean9, parambbH2, paramBoolean10, paramBoolean11, paramBoolean12);
    this.fdr = paramInt3;
    this.fds = paramFloat1;
  }

  public byte aMG()
  {
    return 1;
  }

  public int bz(short paramShort)
  {
    return this.fdr + (int)Math.floor(this.fds * paramShort);
  }

  public aXT bnh()
  {
    aXT localaXT = new aXT(yR(), eo(), aui(), aua(), aub(), auc(), aud(), aue(), auf(), auh(), getFlags(), atZ(), zi(), this.fdr, this.fds, beo(), bex(), cAS(), yL(), atU(), atT(), atX(), zB(), zC(), bew(), auj(), zx(), aiz(), bev(), beq(), zH(), beA(), ber(), bes(), bet());
    localaXT.ddc = this.ddc;
    return localaXT;
  }
}