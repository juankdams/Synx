import java.lang.reflect.Field;

class bJW
{
  public String name;
  public Class type;
  public Field field;
  public int size = -1;
  public int offset = -1;
  public boolean gLN;
  public boolean isReadOnly;
  public bYH gLO;
  public aEQ gLP;
  public hT gLQ;

  public String toString()
  {
    return this.name + "@" + this.offset + "[" + this.size + "] (" + this.type + ")";
  }
}