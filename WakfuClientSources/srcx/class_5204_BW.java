public enum BW
{
  public boolean KR()
  {
    switch (abr.cPQ[ordinal()]) {
    case 1:
    case 2:
      return false;
    case 3:
    case 4:
    case 5:
      return true;
    }
    throw new IllegalArgumentException("Résultat " + this + " non géré");
  }

  public String KS()
  {
    switch (abr.cPQ[ordinal()]) {
    case 3:
    case 4:
      return "dimensionalBag.error.ie.badPosition";
    case 5:
      return "dimensionalBag.error.ie.maxContentReached";
    }
    throw new IllegalArgumentException("Résultat " + this + " non géré");
  }
}