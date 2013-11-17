import java.util.HashMap;

public enum aax
{
  public static final HashMap cOP;
  public static String cOQ;
  private final char cOR;
  private final String cOS;

  private aax(char arg3, String arg4)
  {
    char c;
    this.cOR = c;
    Object localObject;
    this.cOS = localObject;
  }

  public char getChar() {
    return this.cOR;
  }

  public String getPattern() {
    return this.cOS;
  }

  static
  {
    cOP = new HashMap();
    cOQ = "";

    for (int i = 0; i < values().length; i++) {
      aax localaax = values()[i];
      char c = localaax.cOR;
      cOP.put(Character.valueOf(c), localaax);
      if (localaax != cOH)
        cOQ += c;
    }
  }
}