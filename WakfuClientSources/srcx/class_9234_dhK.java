import java.util.LinkedHashSet;
import java.util.Vector;

public class dhK extends bZL
{
  private final LinkedHashSet ldB;

  public dhK(String paramString, Vector paramVector)
  {
    super(paramString);
    if (paramVector == null) {
      throw new IllegalArgumentException("choices must not be null");
    }
    this.ldB = new LinkedHashSet(paramVector);
  }

  public Vector cRr()
  {
    return new Vector(this.ldB);
  }

  public boolean cep()
  {
    return (this.ldB.contains(getInput())) || (("".equals(getInput())) && (getDefaultValue() != null));
  }
}