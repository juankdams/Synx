import java.nio.ByteBuffer;

class bRT extends cCH
{
  bRT(cTf paramcTf, int paramInt)
  {
    super(paramInt);
  }
  public void b(ByteBuffer paramByteBuffer) {
    throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => par de sérialisation");
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    cTf.a(this.hbO, paramByteBuffer.getLong());
    this.hbO.setVisible(cTf.b(this.hbO) == 0L);

    Su localSu = CA.Lv().bj(cTf.b(this.hbO));
    if (localSu == null) {
      return;
    }
    aDq localaDq = localSu.bSB();
    if ((localaDq == null) || (localaDq.fU() != 16)) {
      return;
    }

    aYR localaYR = (aYR)localaDq;
    localaYR.a(this.hbO);
  }
}