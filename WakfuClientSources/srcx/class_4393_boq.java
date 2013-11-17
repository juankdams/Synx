import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

public class boq extends dNt
{
  protected long aJf;

  protected boq(String paramString, dNt paramdNt, dUl paramdUl)
  {
    super(paramString, paramdNt, paramdUl);
  }

  public final Map byb() {
    return Collections.emptyMap();
  }

  public final void clear() {
    this.aJf = 0L;
  }

  public final boolean hasValue() {
    return true;
  }

  public long getValue()
  {
    return this.aJf;
  }

  public void fM(long paramLong)
  {
    this.aJf = paramLong;
  }

  public void a(cXr paramcXr) {
    a(paramcXr, cdG.hxr);
    paramcXr.jn(this.aJf);
  }

  public void a(ByteBuffer paramByteBuffer, String paramString) {
    throw new UnsupportedOperationException("Un SimplePropertyNode doit être désérialisé en tant que FusioningSimplePropertyNode");
  }
}