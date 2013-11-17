import com.ankamagames.wakfu.client.binaryStorage.ArcadeDungeonBinaryData;

class bqM
  implements gd
{
  bqM(aqx paramaqx, dVR paramdVR)
  {
  }

  public void a(ArcadeDungeonBinaryData paramArcadeDungeonBinaryData)
  {
    this.fMa.fv(paramArcadeDungeonBinaryData.dhx(), paramArcadeDungeonBinaryData.dhy());
    fH localfH;
    for (localfH : paramArcadeDungeonBinaryData.dhu()) {
      this.fMa.b(aqx.a(this.fLZ, localfH.getId(), localfH.W()));
    }
    for (localfH : paramArcadeDungeonBinaryData.dhw()) {
      this.fMa.a(localfH, aUP.n(paramArcadeDungeonBinaryData.dhu()));
    }
    for (localfH : paramArcadeDungeonBinaryData.dhv())
      this.fMa.a(localfH);
  }
}