public abstract class dva extends adf
{
  public final dpI nc(int paramInt)
  {
    if (ahV.auP().is(paramInt)) {
      return ahV.auP().it(paramInt);
    }
    dpI localdpI = (dpI)super.hI(paramInt);
    if (localdpI == null) {
      localdpI = vs(paramInt);
      if (localdpI != null)
        a(localdpI);
    }
    return localdpI;
  }

  protected abstract dpI vs(int paramInt);
}