import java.lang.reflect.Field;

public class HE extends hT
{
  private bik bPS;
  private Field field;

  HE(bik parambik, Field paramField)
  {
    super(paramField.getType());
    this.bPS = parambik;
    this.field = paramField;
  }
  public bik QX() {
    return this.bPS;
  }
  public Field QY() { return this.field; }

}