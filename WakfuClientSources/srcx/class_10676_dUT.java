import java.io.Writer;

public abstract class dUT extends cVQ
{
  public final int a(CharSequence paramCharSequence, int paramInt, Writer paramWriter)
  {
    int i = Character.codePointAt(paramCharSequence, paramInt);
    boolean bool = a(i, paramWriter);
    if (bool) {
      return 1;
    }
    return 0;
  }

  public abstract boolean a(int paramInt, Writer paramWriter);
}