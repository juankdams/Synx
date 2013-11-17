final class Ge
  implements dQA
{
  private final dwr bOt;

  private Ge(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    this.bOt = new dwr(paramString, paramInt1, paramInt2, new int[] { paramInt3 }, new int[] { paramInt2 });
  }

  public dwr getBufferFormat(int paramInt1, int paramInt2)
  {
    return this.bOt;
  }
}