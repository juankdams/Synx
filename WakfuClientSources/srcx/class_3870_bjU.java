import org.apache.log4j.Logger;

public final class bjU
  implements Comparable
{
  protected static final Logger K = Logger.getLogger(bjU.class);
  private final SH fAn;
  private final long fAo;

  public bjU(SH paramSH)
  {
    this.fAn = paramSH;
    this.fAo = System.currentTimeMillis();
  }

  public bjU(SH paramSH, int paramInt)
  {
    if ((!bB) && (paramInt > paramSH.getDuration())) throw new AssertionError("Temps restant trop court");
    this.fAn = paramSH;
    this.fAo = (System.currentTimeMillis() + paramInt - paramSH.getDuration());
  }

  public final SH buX()
  {
    return this.fAn;
  }

  public final int acm()
  {
    return this.fAn.getId();
  }

  public final long buY()
  {
    return this.fAo;
  }

  public final long getEndTime()
  {
    if (this.fAn.isInfinite()) {
      return 9223372036854775807L;
    }
    return this.fAo + this.fAn.getDuration();
  }

  public final int bcN()
  {
    if (this.fAn.isInfinite()) {
      return -1;
    }
    long l = getEndTime() - System.currentTimeMillis();
    return l <= 2147483647L ? (int)l : -1;
  }

  public final int c(bjU parambjU) {
    long l = getEndTime() - parambjU.getEndTime();
    if (l > 0L)
      return 1;
    if (l < 0L) {
      return -1;
    }
    return 0;
  }
}