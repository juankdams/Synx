public class Do
{
  private final dMy bHV = new dMy();
  private final cds bHW;
  private final cds bHX;
  private final byte bHY;

  public Do(long paramLong1, long paramLong2, byte paramByte)
  {
    this.bHW = kb.I(paramLong1);
    this.bHX = kb.I(paramLong2);
    this.bHY = paramByte;
  }

  public cds MC() {
    return this.bHW;
  }

  public cds MD() {
    return this.bHX;
  }

  public byte ME() {
    return this.bHY;
  }

  public void d(int paramInt, boolean paramBoolean) {
    this.bHV.K(paramInt, paramBoolean);
  }

  public boolean eB(int paramInt) {
    return this.bHV.contains(paramInt);
  }

  public boolean c(cIw paramcIw) {
    int i = 0; for (int j = this.bHV.size(); i < j; i++)
      if (this.bHV.CY(i))
      {
        if (!paramcIw.R(this.bHV.uM(i)))
          return false;
      }
    return true;
  }

  public String toString()
  {
    return "PetDefinitionMeal{m_mealItemRefIds=" + this.bHV.size() + ", m_mealMinInterval=" + this.bHW + ", m_mealMaxInterval=" + this.bHX + ", m_xpPerMeal=" + this.bHY + '}';
  }
}