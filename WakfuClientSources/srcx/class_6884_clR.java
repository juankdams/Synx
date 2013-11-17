import org.apache.log4j.Logger;

public class clR
{
  protected static final Logger K = Logger.getLogger(clR.class);

  private static final clR hQP = new clR();

  private final cSR fIJ = new cSR();

  public static clR cni() {
    return hQP;
  }

  public void b(aCH paramaCH) {
    this.fIJ.put(paramaCH.gC(), paramaCH);
  }

  public aCH vL(int paramInt) {
    return (aCH)this.fIJ.get(paramInt);
  }

  public boolean isEmpty() {
    return this.fIJ.isEmpty();
  }
}