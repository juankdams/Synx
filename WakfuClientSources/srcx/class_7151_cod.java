import org.apache.log4j.Logger;

public class cod extends bYT
{
  private final int baj;

  public cod(ld paramld, int paramInt)
  {
    super(paramld);
    this.baj = paramInt;
  }

  public String getName() {
    dDU localdDU = qn.xw().cl(this.baj);
    return localdDU.dfQ();
  }

  public bmt aaN() {
    return bmt.fDU;
  }

  public Object getFieldValue(String paramString) {
    dDU localdDU = qn.xw().cl(this.baj);

    if (localdDU != null) {
      if (paramString.equals("description"))
        return localdDU.dfR();
      if (paramString.equals("title"))
        return getName();
      if (paramString.equals("nameWithRemainingTime")) {
        Object localObject = cdx();
        if (localObject == null) {
          return getName();
        }
        return new StringBuilder(getName()).append(" (").append(localObject).append(")");
      }if (paramString.equals("nameWithDuration"))
        return new StringBuilder(getName()).append(" (").append(cdy()).append(")");
      if (paramString.equals("name"))
        return getName();
      if (paramString.equals("iconUrl")) {
        return localdDU.fJ();
      }
      return super.getFieldValue(paramString);
    }

    K.error("Impossible de créer la vue pour le challenge id=" + this.baj);

    return null;
  }

  public int yC() {
    return this.baj;
  }
}