import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Set;

class aGy extends cCH
{
  aGy(lP paramlP)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    Set localSet = this.edy.aPA.aok();

    paramByteBuffer.putInt(localSet.size());

    aHR localaHR = aHR.aTT();
    for (Iterator localIterator = localSet.iterator(); localIterator.hasNext(); ) {
      vL localvL = (vL)localIterator.next();
      localaHR.o(localvL);
      localaHR.b(paramByteBuffer);
    }
    localaHR.release();
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    this.edy.aPA.clear();

    int i = paramByteBuffer.getInt();

    aHR localaHR = aHR.aTT();

    for (int j = 0; j < i; j++) {
      localaHR.U(paramByteBuffer);
      this.edy.aPA.a(localaHR.qI());
      localaHR.o(null);
    }
    localaHR.release();
  }

  public int cc()
  {
    if (this.edy.aPA == null)
      return 0;
    Set localSet = this.edy.aPA.aok();
    int i = 0;
    aHR localaHR = aHR.aTT();
    for (Iterator localIterator = localSet.iterator(); localIterator.hasNext(); ) {
      vL localvL = (vL)localIterator.next();
      localaHR.o(localvL);
      i += localaHR.cc();
    }
    localaHR.release();
    return 4 + i;
  }
}