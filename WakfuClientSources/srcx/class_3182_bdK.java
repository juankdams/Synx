import java.util.Arrays;
import java.util.List;

public abstract class bdK
{
  public static final int fpJ = 9;
  public static final int fpK = 0;
  public static final int fpL = 1;
  public static final int fpM = 2;
  public static final int fpN = 3;
  public static final int fpO = 4;
  public static final int fpP = 5;
  public static final int fpQ = 6;
  public static final int fpR = 7;
  public static final int fpS = 8;
  protected int hY;
  protected int hZ;
  protected int ia;
  protected int ib;
  private bdK[] fpT;
  private List fpU;

  public int getX()
  {
    return this.hY;
  }

  public int getY() {
    return this.hZ;
  }

  public int getWidth() {
    return this.ia;
  }

  public int getHeight() {
    return this.ib;
  }

  public List brO() {
    return this.fpU;
  }

  public bdK[] brP() {
    return this.fpT;
  }

  public void a(bdK[] paramArrayOfbdK) {
    if ((!bB) && (paramArrayOfbdK.length != 9)) throw new AssertionError();

    this.fpT = paramArrayOfbdK;
    this.fpU = Arrays.asList(paramArrayOfbdK);
  }

  public bdK pa(int paramInt) {
    if ((paramInt >= 0) && (paramInt <= 8)) {
      return this.fpT[paramInt];
    }
    return null;
  }

  public void a(int paramInt, bdK parambdK) {
    if ((paramInt >= 0) && (paramInt <= 8))
      this.fpT[paramInt] = parambdK;
  }

  public boolean cl(int paramInt1, int paramInt2)
  {
    int i = this.hZ * this.ib;
    if ((paramInt2 >= i) && (paramInt2 < i + this.ib)) {
      int j = this.hY * this.ia;
      if ((paramInt1 >= j) && (paramInt1 < j + this.ia)) {
        return true;
      }
    }
    return false;
  }

  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.hY = paramInt1;
    this.hZ = paramInt2;
    this.ia = paramInt3;
    this.ib = paramInt4;
  }
}