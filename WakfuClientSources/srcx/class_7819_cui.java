import java.io.File;
import java.io.IOException;
import org.apache.log4j.Logger;

public class cui
{
  private static final Logger K = Logger.getLogger(cui.class);

  private final cSR ieA = new cSR();
  private String SL;
  private static final cui ieB = new cui();

  public static cui csF() {
    return ieB;
  }

  public String getFileName()
  {
    return this.SL;
  }

  public void setFile(String paramString) {
    this.SL = paramString;
  }

  public void load() {
    try {
      if ((!bB) && ((this.SL == null) || (new File(this.SL).isDirectory()))) throw new AssertionError();
      aYQ localaYQ = aYQ.V(dtb.readFile(this.SL));
      d(localaYQ);
      localaYQ.close();
    } catch (IOException localIOException) {
      K.error("", localIOException);
    }
  }

  private void d(aYQ paramaYQ) {
    int i = paramaYQ.readInt();
    for (int j = 0; j < i; j++) {
      cgc localcgc = new cgc();
      localcgc.d(paramaYQ);

      if (this.ieA.put(localcgc.getId(), localcgc) != null)
        K.error("SoundBank already loaded : " + localcgc.getId());
    }
  }

  public void b(dSw paramdSw) {
    dmn localdmn = this.ieA.yF();
    paramdSw.writeInt(this.ieA.size());
    while (localdmn.hasNext()) {
      localdmn.fl();
      ((cgc)localdmn.value()).b(paramdSw);
    }
  }

  public final cgc b(cgc paramcgc) {
    if ((!bB) && (this.ieA.contains(paramcgc.getId()))) throw new AssertionError();
    return (cgc)this.ieA.put(paramcgc.getId(), paramcgc);
  }

  public final cgc wP(int paramInt)
  {
    return (cgc)this.ieA.get(paramInt);
  }

  public final void clear()
  {
    this.ieA.clear();
  }
}