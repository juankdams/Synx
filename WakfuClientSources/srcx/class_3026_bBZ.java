class bBZ
  implements dsP
{
  bBZ(aZr paramaZr, long paramLong)
  {
  }

  public void af(byte[] paramArrayOfByte)
  {
    crX localcrX = aZr.a(this.gwi, paramArrayOfByte, this.fdW);
    uz localuz;
    if (localcrX != null) {
      long l = aZr.a(this.gwi);
      localuz = tq.Bg().b(dHL.lSB.dhZ(), l, localcrX, true);
      aZr.b(this.gwi).B(this.fdW, l);
      localcrX.axl();
    } else {
      aZr.c(this.gwi).remove(this.fdW);
      return;
    }

    aZr.a(this.gwi, this.fdW, localuz, null);
    aZr.c(this.gwi).remove(this.fdW);
  }
}