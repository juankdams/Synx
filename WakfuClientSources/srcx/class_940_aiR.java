import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;

public class aiR
  implements cLh
{
  private static final int[] dhc = { 0 };
  public static final int dhd = 1;
  public static final int dhe = 2;
  public static final int dhf = 4;
  public static final int dhg = 8;
  private final int[] dhh;
  private final int[] dhi;
  private final int[] dhj;
  private final int[] dhk;
  private final int dhl;
  private final int dhm;
  private final int dhn;
  private final int dho;

  public aiR(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int[] paramArrayOfInt3, int[] paramArrayOfInt4, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.dhh = paramArrayOfInt1;
    this.dhi = paramArrayOfInt2;
    this.dhj = paramArrayOfInt3;
    this.dhk = paramArrayOfInt4;
    this.dhl = paramInt1;
    this.dhm = paramInt2;
    this.dhn = paramInt3;
    this.dho = paramInt4;
  }

  public aiR(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this(paramArrayOfInt1, paramArrayOfInt2, dhc, dhc, paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public aiR() {
    this(dhc, dhc, dhc, dhc, 0, 0, 0, 0);
  }

  public int iL(int paramInt)
  {
    switch (paramInt) {
    case 0:
      return this.dhl;
    case 1:
      return q(this.dhh);
    case 2:
      return this.dhm;
    case 3:
      return q(this.dhi);
    case 4:
      return this.dhn;
    case 5:
      return q(this.dhj);
    case 6:
      return this.dho;
    case 7:
      return q(this.dhk);
    }
    return 0;
  }

  public int iM(int paramInt) {
    switch (paramInt) {
    case 0:
      return 0;
    case 2:
      return iL(1);
    case 4:
      return iL(3);
    case 8:
      return iL(5);
    case 1:
      return iL(7);
    case 3:
      return iL(0);
    case 6:
      return iL(2);
    case 12:
      return iL(4);
    case 9:
      return iL(6);
    case 5:
    case 7:
    case 10:
    case 11:
    case 13:
    case 14:
    case 15:
      return -1;
    }
    return -1;
  }

  private static int q(int[] paramArrayOfInt) {
    return paramArrayOfInt[bCO.sf(paramArrayOfInt.length)];
  }

  public void a(adz paramadz) {
    paramadz.n(this.dhh);
    paramadz.n(this.dhi);
    paramadz.n(this.dhj);
    paramadz.n(this.dhk);

    paramadz.hL(this.dhl);
    paramadz.hL(this.dhm);
    paramadz.hL(this.dhn);
    paramadz.hL(this.dho);
  }

  public static void a(DisplayedScreenElement paramDisplayedScreenElement, int paramInt) {
    if ((paramInt == 8) || (paramInt == 1) || (paramInt == 9))
      paramDisplayedScreenElement.oC(-2);
  }
}