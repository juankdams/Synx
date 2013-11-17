import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.log4j.Logger;

public final class dkx
{
  private static final Logger K = Logger.getLogger(dkx.class);
  private static final dkx lhI = new dkx();
  private String SL;
  private final bPu lhJ = new bPu();

  private short lhK = 0;

  public static dkx cSX()
  {
    return lhI;
  }

  public String getFileName() {
    return this.SL;
  }

  public void setFile(String paramString) {
    this.SL = paramString;
  }

  public short cSY() {
    return this.lhK++;
  }

  public void load() {
    clear();
    if (this.SL == null)
      return;
    try {
      String str = String.format(this.SL, new Object[0]);
      aYQ localaYQ = aYQ.V(dtb.readFile(str));
      d(localaYQ);
      localaYQ.close();
    } catch (IOException localIOException) {
      K.error("Error while loading PlayList file : " + this.SL, localIOException);
    }
  }

  public void save() {
    if (this.SL == null)
      return;
    try {
      FileOutputStream localFileOutputStream = dtb.qd(this.SL);
      dSw localdSw = new dSw(localFileOutputStream);
      b(localdSw);
      localdSw.close();
      localFileOutputStream.close();
    } catch (IOException localIOException) {
      K.error("Error while saving PlayList file : " + this.SL, localIOException);
    }
  }

  public void d(aYQ paramaYQ) {
    int i = paramaYQ.readShort();
    this.lhJ.ensureCapacity(i);
    for (int j = 0; j < i; j = (short)(j + 1)) {
      cFX localcFX = new cFX();
      localcFX.d(paramaYQ);
      b(localcFX);
    }
  }

  public void b(dSw paramdSw) {
    paramdSw.writeShort((short)this.lhJ.size());
    bM localbM = this.lhJ.bVW();
    while (localbM.hasNext()) {
      localbM.fl();
      ((cFX)localbM.value()).b(paramdSw);
    }
  }

  public final void b(cFX paramcFX) {
    this.lhJ.c(paramcFX.cBq(), paramcFX);
  }

  public cFX eh(short paramShort)
  {
    return (cFX)this.lhJ.cx(paramShort);
  }

  public short c(cFX paramcFX)
  {
    bM localbM = this.lhJ.bVW();
    while (localbM.hasNext()) {
      localbM.fl();
      if (((cFX)localbM.value()).a(paramcFX)) {
        return localbM.fm();
      }
    }

    return -1;
  }

  public void clear()
  {
    this.lhJ.clear();
  }
}