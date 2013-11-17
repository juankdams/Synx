import java.nio.ByteBuffer;

class cLj extends cCH
{
  cLj(cyj paramcyj, int paramInt)
  {
    super(paramInt);
  }
  public void b(ByteBuffer paramByteBuffer) {
    throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => client par de sérialisation");
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    cyj.a(this.iKL, paramByteBuffer);
    switch (cyj.a(this.iKL)) {
    case 0:
    case 1:
      this.iKL.eu(true);
      this.iKL.ev(true);
      this.iKL.a(XV.cIy);

      break;
    case 2:
      this.iKL.eu(false);
      this.iKL.ev(false);
      ckT localckT = cjS.clP().vz(this.iKL.csY);

      UG localUG = localckT.LB();
      if (!cyj.a(this.iKL, localckT)) {
        if ((localckT instanceof arl))
          ((arl)localckT).jv(this.iKL.getId());
        return;
      }

      bnc.bxw().a(this.iKL.csY, new dJB(this, dqt.cXz(), 0, 0, localUG));

      this.iKL.a(XV.cIx);
    }
  }
}