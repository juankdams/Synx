import java.util.Collection;
import java.util.EnumSet;

public class dLd extends cGx
{
  public static final bmj lWl = new bmj(-2, (short)0);
  public static final byte lZD = -2;
  private final cGx lZE;

  public dLd(cGx paramcGx, int paramInt, short paramShort)
  {
    super(-2, paramInt, paramShort, paramcGx.cBv(), paramcGx.cBw(), paramcGx.F(), EnumSet.noneOf(yK.class), null);
    this.lZE = paramcGx;
  }

  public int getId()
  {
    return this.lZE.getId();
  }

  public byte getType()
  {
    return -2;
  }

  public void a(yK paramyK)
  {
    throw new UnsupportedOperationException("Impossible de rajouter une propriété sur une SecretRecipe");
  }

  public void h(Collection paramCollection)
  {
    throw new UnsupportedOperationException("Impossible de rajouter une propriété sur une SecretRecipe");
  }

  public void b(yK paramyK)
  {
    throw new UnsupportedOperationException("Impossible de rajouter une propriété sur une SecretRecipe");
  }

  public void j(Collection paramCollection)
  {
    throw new UnsupportedOperationException("Impossible de rajouter une propriété sur une SecretRecipe");
  }

  public double dE(short paramShort)
  {
    return 1.0D;
  }

  public long a(short paramShort, aGH paramaGH)
  {
    return 0L;
  }

  public bmj dF(short paramShort)
  {
    return lWl;
  }

  public BZ cBy()
  {
    return this.lZE.cBy();
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("FailingSecretCraftRecipe");
    localStringBuilder.append("{m_secretRecipe=").append(this.lZE);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}