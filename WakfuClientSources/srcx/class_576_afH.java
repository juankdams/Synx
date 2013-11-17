import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import com.ankamagames.baseImpl.graphics.script.SoundFunctionsLibrary;
import org.apache.log4j.Logger;

public class afH
  implements aZa
{
  private static final Logger K = Logger.getLogger(afH.class);
  private byte cYK;
  private byte Rd = 100;

  public afH() {
  }

  public afH(aYQ paramaYQ) {
    d(paramaYQ);
  }

  public afH(byte paramByte1, byte paramByte2) {
    this.cYK = paramByte1;
    this.Rd = paramByte2;
  }

  public void b(bjC parambjC) {
    if (!bWY.c(parambjC)) {
      return;
    }
    if (!parambjC.asT().Si()) {
      return;
    }
    ahm localahm = (ahm)parambjC;
    byte b = d(localahm);
    try
    {
      ZI localZI = SoundFunctionsLibrary.ckJ().n(b, this.cYK);
      if (localZI == null) {
        K.debug("Impossible de trouver de GroundSoundData adéquat");
        return;
      }

      if (!localahm.asT().bD(localZI.alu())) {
        return;
      }

      if (!bWY.hd(localZI.alu())) {
        return;
      }
      SoundFunctionsLibrary.ckJ().a(localZI.alu(), localZI.alh() * this.Rd / 100.0F, 1, -1L, -1L, localahm.aeR(), localahm, localZI.alv());
    }
    catch (Exception localException) {
      K.debug("soundExtension or soundPath not initialized " + localException);
    }
  }

  private static byte d(ahm paramahm) {
    int i = cwO.U(paramahm.fa(), paramahm.fb(), paramahm.fc());
    DisplayedScreenElement localDisplayedScreenElement = btb.bBd().b(paramahm.fa(), paramahm.fb(), i, cWj.kJk);
    if (localDisplayedScreenElement == null) {
      return aKU.eoX.getType();
    }

    cid localcid = localDisplayedScreenElement.bpc().ddL();
    if (localcid != null) {
      return localcid.cjL();
    }
    return aKU.eoX.getType();
  }

  public int getType() {
    return 2;
  }

  public void d(aYQ paramaYQ) {
    this.cYK = paramaYQ.readByte();
    this.Rd = paramaYQ.readByte();
  }

  public void b(dSw paramdSw) {
    paramdSw.writeByte(this.cYK);
    paramdSw.writeByte(this.Rd);
  }

  public void aP(byte paramByte) {
    this.cYK = paramByte;
  }

  public void e(byte paramByte) {
    this.Rd = paramByte;
  }

  public void a(cbQ paramcbQ)
  {
  }
}