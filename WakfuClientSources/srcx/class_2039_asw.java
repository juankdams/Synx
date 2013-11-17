public class asw extends kt
{
  private final byte dCo;
  protected String dCp = null;

  public asw(String paramString, byte paramByte) {
    super(paramString, null, new bdW());

    this.dCo = paramByte;
  }

  public void update()
  {
    double d1 = aFi.aRF().bF(this.dCo);
    double d2 = aFi.aRF().bG(this.dCo);

    this.aOd = String.format("%1.1f", new Object[] { Double.valueOf(d1) });
    this.dCp = String.format("Total: %1.1f ms\nProcessing: %1.1f ms", new Object[] { Double.valueOf(d1), Double.valueOf(d2) });

    for (kt localkt : this.aOe) {
      localkt.update();
    }
    super.update();
  }

  protected String getTooltipText() {
    if (this.aOe == null) {
      return this.dCp;
    }

    StringBuilder localStringBuilder = new StringBuilder();
    if (this.dCp != null)
      localStringBuilder.append(this.dCp);
    for (kt localkt : this.aOe) {
      localStringBuilder.append("\n");
      localStringBuilder.append(localkt.getName()).append(" : ").append(localkt.A(false));
    }

    return localStringBuilder.toString();
  }
}