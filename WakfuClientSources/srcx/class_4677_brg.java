abstract class brg extends akN
{
  protected boolean aMu;
  protected aWq fMN;

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    dhJ localdhJ = aAw.a(false, paramObject1, paramObject2, paramObject4, paramObject3);
    if (localdhJ == null) {
      return -1;
    }
    dbE localdbE = aAw.ah(paramObject4);
    if (localdbE == null) {
      return -1;
    }
    cYk localcYk = null;
    if (this.aMu) {
      if ((paramObject2 instanceof dhJ))
        localcYk = ((dhJ)paramObject2).aKb();
      else if ((paramObject2 instanceof cYk)) {
        localcYk = (cYk)paramObject2;
      }
      if (localcYk == null)
        return 0;
    } else {
      localcYk = localdhJ.ML();
    }

    boolean bool = a(localdhJ, localdbE, localcYk);
    if (bool)
      return 0;
    return -1;
  }

  protected abstract boolean a(dhJ paramdhJ, dbE paramdbE, cYk paramcYk);

  protected void iN(String paramString) {
    if (paramString.equalsIgnoreCase(aWq.fbB.toString()))
      this.fMN = aWq.fbB;
    else if (paramString.equalsIgnoreCase(aWq.fbC.toString()))
      this.fMN = aWq.fbC;
  }
}