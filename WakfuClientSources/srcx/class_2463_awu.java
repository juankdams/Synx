public class awu
{
  private String hi;
  private long ctZ;
  private brV dLF;
  private boolean dLG;

  awu(String paramString, boolean paramBoolean, long paramLong, brV parambrV)
  {
    this.hi = paramString;
    this.dLG = paramBoolean;
    this.ctZ = Math.max(0L, paramLong);
    this.dLF = parambrV;
  }

  awu(String paramString, boolean paramBoolean, long paramLong) {
    this(paramString, paramBoolean, paramLong, brV.fNZ);
  }

  awu(String paramString, long paramLong) {
    this(paramString, paramLong <= 0L, paramLong);
  }

  awu(String paramString)
  {
    this(paramString, 0L);
  }

  public boolean aIr() {
    return this.dLG;
  }

  public long getDuration() {
    return this.ctZ;
  }

  public String getText() {
    return this.hi;
  }

  public brV aIs() {
    return this.dLF;
  }
}