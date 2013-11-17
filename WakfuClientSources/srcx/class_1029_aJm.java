import com.ankamagames.wakfu.client.binaryStorage.InteractiveElementModelBinaryData;
import org.apache.log4j.Logger;

class aJm
  implements gd
{
  aJm(qW paramqW)
  {
  }

  public void a(InteractiveElementModelBinaryData paramInteractiveElementModelBinaryData)
  {
    int i = paramInteractiveElementModelBinaryData.getId();
    short s = paramInteractiveElementModelBinaryData.getType();
    int j = paramInteractiveElementModelBinaryData.ajB();
    int k = paramInteractiveElementModelBinaryData.aBc();
    byte b = paramInteractiveElementModelBinaryData.bY();
    int m = paramInteractiveElementModelBinaryData.ant();
    int n = paramInteractiveElementModelBinaryData.aPJ();

    qW.a(this.ejB).a(i, s, j, b, k, m, n);
    if (qW.i().isTraceEnabled())
      qW.i().trace("Loaded view id=" + i + " type=" + s + " gfx=" + j + " color=" + k + " height=" + b);
  }
}