public abstract interface cds
{
  public static final cds hwK = new kb(0, 0, 6, 365);
  public static final cds hwL = new kb(0, 0, 0, 7);
  public static final cds hwM = new kb(0, 0, 0, 1);
  public static final cds hwN = new kb(0, 0, 1, 0);
  public static final cds hwO = new kb(0, 1, 0, 0);
  public static final cds hwP = new kb(1, 0, 0, 0);
  public static final cds hwQ = new kb(0, 0, 0, 0);

  public abstract int getSeconds();

  public abstract int getMinutes();

  public abstract int getHours();

  public abstract int getDays();

  public abstract int d(cds paramcds);

  public abstract boolean rN();

  public abstract boolean isEmpty();

  public abstract long rO();

  public abstract long rP();

  public abstract boolean b(cds paramcds);

  public abstract boolean c(cds paramcds);
}