import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import org.apache.log4j.Logger;

public class aal extends aLA
{
  private static final Logger K = Logger.getLogger(aal.class);
  private int cOu;
  private short cOv;
  private short cOw;
  private short cOx;

  public int ant()
  {
    return this.cOu;
  }

  public boolean a(bjC parambjC)
  {
    try {
      FreeParticleSystem localFreeParticleSystem = cof.cop().vY(this.cOu);
      localFreeParticleSystem.cS(parambjC.aeR());
      cWS.cKD().b(localFreeParticleSystem);
      if ((parambjC instanceof ahm)) {
        ahm localahm = (ahm)parambjC;
        localFreeParticleSystem.f(localahm.getWorldX() + this.cOv, localahm.getWorldY() + this.cOw, localahm.fc() + this.cOx);
        bdB.b(localFreeParticleSystem);
      }
    } catch (Exception localException) {
      K.error("AddParticle (" + this.cOu + ") depuis un animatedElement " + parambjC, localException);
    }
    return false;
  }

  public void a(byte paramByte, aYQ paramaYQ)
  {
    this.cOu = paramaYQ.readInt();

    if (paramByte == 3) {
      this.cOv = paramaYQ.readShort();
      this.cOw = paramaYQ.readShort();
    }
    else if (paramByte == 4) {
      this.cOv = paramaYQ.readShort();
      this.cOw = paramaYQ.readShort();
      this.cOx = paramaYQ.readShort();
    }
  }

  public void a(dSw paramdSw)
  {
    super.a(paramdSw);
    int i = 1;
    if ((this.cOv != 0) || (this.cOw != 0) || (this.cOx != 0)) {
      i = 4;
    }

    paramdSw.writeByte((byte)i);
    paramdSw.writeInt(this.cOu);
    if (i == 4) {
      paramdSw.writeShort(this.cOv);
      paramdSw.writeShort(this.cOw);
      paramdSw.writeShort(this.cOx);
    }
  }

  public cuh en()
  {
    return cuh.iew;
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject)
      return true;
    if (!(paramObject instanceof aal)) {
      return false;
    }
    aal localaal = (aal)paramObject;

    if (this.cOu != localaal.cOu)
      return false;
    if (this.cOv != localaal.cOv)
      return false;
    if (this.cOw != localaal.cOw)
      return false;
    if (this.cOx != localaal.cOx) {
      return false;
    }
    return true;
  }

  public final int hashCode()
  {
    int i = en().bJ();
    i = 31 * i + this.cOu;
    i = 31 * i + this.cOv;
    i = 31 * i + this.cOw;
    i = 31 * i + this.cOx;
    return i;
  }
}