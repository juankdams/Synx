import com.ankamagames.baseImpl.graphics.script.SoundFunctionsLibrary;
import org.apache.log4j.Logger;

public class cZP
  implements aZa
{
  private static final Logger K = Logger.getLogger(cZP.class);
  private int kNz;
  private byte Rd = 100;
  private int eMm = -1;

  public cZP() {
  }

  public cZP(aYQ paramaYQ) {
    d(paramaYQ);
  }

  public cZP(int paramInt1, byte paramByte, int paramInt2) {
    this.kNz = paramInt1;
    this.Rd = paramByte;
    this.eMm = paramInt2;
  }

  public void d(aYQ paramaYQ) {
    this.kNz = paramaYQ.readInt();
    this.Rd = paramaYQ.readByte();
    this.eMm = paramaYQ.readInt();
  }

  public void b(dSw paramdSw) {
    paramdSw.writeInt(this.kNz);
    paramdSw.writeByte(this.Rd);
    paramdSw.writeInt(this.eMm);
  }

  public void b(bjC parambjC) {
    if (!bWY.c(parambjC)) {
      return;
    }
    if (this.kNz == 0) {
      K.debug("Id du son nul");
      return;
    }
    try
    {
      avP localavP = SoundFunctionsLibrary.ckJ().a(this.kNz, (cbI)parambjC, this.eMm);
      if (localavP == null) {
        K.debug("Impossible de trouver de BarkData adéquat");
        return;
      }

      long l = localavP.alu();
      if (!parambjC.asT().bD(l)) {
        return;
      }

      if (!bWY.hd(l)) {
        return;
      }
      SoundFunctionsLibrary.ckJ().a(l, localavP.alh() * this.Rd / 100.0F, 1, -1L, -1L, parambjC.aeR(), (cbI)parambjC, localavP.alv());
    }
    catch (Exception localException)
    {
      K.debug("soundExtension or soundPath not initialized " + localException);
    }
  }

  public int getType() {
    return 1;
  }

  public void zt(int paramInt) {
    this.kNz = paramInt;
  }

  public void e(byte paramByte) {
    this.Rd = paramByte;
  }

  public void zu(int paramInt) {
    this.eMm = paramInt;
  }

  public void a(cbQ paramcbQ) {
    paramcbQ.add(this.kNz);
  }
}