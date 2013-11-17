final class bpC
  implements dkm
{
  private bpC(Mx paramMx)
  {
  }

  public int a(cJv paramcJv1, cJv paramcJv2, cjs paramcjs1, cjs paramcjs2, cJv paramcJv3, cJv paramcJv4)
  {
    aHA.debug("format(chroma={},width={},height={})", new Object[] { paramcJv2.sF().getString(0L, false), Integer.valueOf(paramcjs1.getValue()), Integer.valueOf(paramcjs2.getValue()) });
    Mx.a(this.cgZ, Mx.a(this.cgZ).getBufferFormat(paramcjs1.getValue(), paramcjs2.getValue()));
    aHA.debug("bufferFormat={}", new Object[] { Mx.b(this.cgZ) });
    if (Mx.b(this.cgZ) == null) {
      throw new IllegalStateException("buffer format can not be null");
    }

    byte[] arrayOfByte = Mx.b(this.cgZ).dbI().getBytes();

    paramcJv2.sF().write(0L, arrayOfByte, 0, arrayOfByte.length > 4 ? 4 : arrayOfByte.length);
    paramcjs1.setValue(Mx.b(this.cgZ).getWidth());
    paramcjs2.setValue(Mx.b(this.cgZ).getHeight());
    int[] arrayOfInt1 = Mx.b(this.cgZ).dbJ();
    int[] arrayOfInt2 = Mx.b(this.cgZ).dbK();
    paramcJv3.sF().write(0L, arrayOfInt1, 0, arrayOfInt1.length);
    paramcJv4.sF().write(0L, arrayOfInt2, 0, arrayOfInt2.length);

    Mx.a(this.cgZ, new dcj[Mx.b(this.cgZ).dbL()]);
    for (int i = 0; i < Mx.b(this.cgZ).dbL(); i++) {
      Mx.c(this.cgZ)[i] = new dcj(arrayOfInt1[i] * arrayOfInt2[i] + 32).zF(32);
    }
    aHA.trace("format finished", new Object[0]);
    return arrayOfInt1.length;
  }
}