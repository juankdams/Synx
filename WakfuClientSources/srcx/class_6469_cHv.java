import javax.media.opengl.GL;

class cHv
  implements chT
{
  cHv(Jj paramJj, String paramString, dsP paramdsP)
  {
  }

  public boolean cjD()
  {
    if (this.iCz.bvA) {
      this.iCz.cleanup();
      return false;
    }

    if (!this.iCz.dfe()) {
      return true;
    }
    ayc localayc = dHL.lSB.dhZ();
    GL localGL = (GL)localayc.bZk();
    int i = Jj.a(this.iCz, localGL);
    byte[] arrayOfByte = Jj.a(this.iCz, i, localayc, this.iCx);
    if ((!bB) && (this.iCy == null)) throw new AssertionError();
    this.iCy.af(arrayOfByte);
    localGL.glDeleteTextures(1, new int[] { i }, 0);
    this.iCz.cleanup();
    return false;
  }
}