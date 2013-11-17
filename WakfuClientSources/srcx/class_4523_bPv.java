public final class bPv extends bxG
{
  private static final ddt gWc = new ddt();
  private bKR fJZ;

  public bPv(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  protected long mC() {
    bKT localbKT = this.fJZ.bTc();
    StringBuilder localStringBuilder = null;
    while (localbKT.hasNext()) {
      localObject = dX(localbKT.bTd());
      if (localObject != null)
      {
        if (localStringBuilder == null) {
          localStringBuilder = new StringBuilder();
        }
        localStringBuilder.append(((Su)localObject).getName());
        if (localbKT.hasNext())
          localStringBuilder.append(", ");
      }
    }
    if (localStringBuilder == null) {
      return 0L;
    }
    Object localObject = new StringBuilder(bU.fH().getString("fight.waiting.for"));
    ((StringBuilder)localObject).append(localStringBuilder);

    gWc.error(localObject);
    return 0L;
  }

  public void a(bKR parambKR) {
    this.fJZ = parambKR;
  }
}