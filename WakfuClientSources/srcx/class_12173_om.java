public class om
{
  public CG aTt;
  public int aTu;

  public om(CG paramCG, int paramInt)
  {
    this.aTt = paramCG;
    this.aTu = paramInt;
  }

  public boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof om))) {
      return false;
    }
    om localom = (om)paramObject;
    return (localom.aTt == this.aTt) && (localom.aTu == this.aTu);
  }
}