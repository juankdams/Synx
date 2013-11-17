public class Dk extends LE
{
  private final int aSf;

  public Dk(int paramInt1, bcR parambcR, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    super(paramInt1, parambcR, paramArrayOfInt1, paramArrayOfInt2, paramInt2, paramBoolean, null);
    this.aSf = paramInt3;
  }

  public String getName()
  {
    return bU.fH().b(22, getId(), new Object[0]);
  }

  public String getDescription()
  {
    return bU.fH().b(23, getId(), new Object[0]);
  }

  public int oc() {
    return getId();
  }

  public int uN() {
    return this.aSf;
  }
}