import java.io.Serializable;

public abstract class djh
  implements Serializable, Cloneable
{
  protected aTe kyj = null;

  public Object clone()
  {
    try
    {
      djh localdjh = (djh)super.clone();
      localdjh.kyj = null;
      return localdjh;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException) {
    }
    return null;
  }

  public djh cRR()
  {
    if (this.kyj != null) {
      this.kyj.c(this);
    }
    return this;
  }

  public final boolean equals(Object paramObject)
  {
    return paramObject == this;
  }

  public aFz getDocument()
  {
    if (this.kyj == null) return null;
    return this.kyj.getDocument();
  }

  public aTe aRY()
  {
    return this.kyj;
  }

  public dRW cRS()
  {
    aTe localaTe = aRY();
    return (dRW)((localaTe instanceof dRW) ? localaTe : null);
  }

  public abstract String getValue();

  public final int hashCode()
  {
    return super.hashCode();
  }

  protected djh a(aTe paramaTe)
  {
    this.kyj = paramaTe;
    return this;
  }
}