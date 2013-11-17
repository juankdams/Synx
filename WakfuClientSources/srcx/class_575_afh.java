import java.io.Reader;

class afh extends bgQ
{
  afh(diD paramdiD, Reader paramReader)
  {
    super(paramReader);
  }

  public int read()
  {
    while (true)
    {
      int i = this.in.read();
      if (i == -1) {
        return i;
      }
      if (!diD.a(this.cXw, (char)i))
        return i;
    }
  }
}