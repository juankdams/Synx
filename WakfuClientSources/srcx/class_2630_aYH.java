public abstract class aYH extends cdR
{
  private Object feB;

  protected aYH(agQ paramagQ)
  {
    super(paramagQ);
  }

  protected abstract Object getValue();

  public final Object get() {
    if (this.feB == null) {
      this.feB = getValue();
    }
    return this.feB;
  }

  public void update(int paramInt)
  {
    this.feB = null;
  }

  public abstract float floatValue();

  public abstract int intValue();

  public abstract String stringValue();
}