import java.text.CharacterIterator;

class bVC
  implements CharacterIterator
{
  CharSequence hhJ;
  int hhK;
  int hhL;

  bVC()
  {
  }

  bVC(CharSequence paramCharSequence)
  {
    initFromCharSequence(paramCharSequence);
  }

  public void initFromCharSequence(CharSequence paramCharSequence) {
    this.hhJ = paramCharSequence;
    this.hhK = this.hhJ.length();
    this.hhL = 0;
  }

  public char last() {
    this.hhL = Math.max(0, this.hhK - 1);

    return current();
  }

  public char current() {
    if ((this.hhK == 0) || (this.hhL >= this.hhK)) {
      return 65535;
    }

    return this.hhJ.charAt(this.hhL);
  }

  public char next() {
    this.hhL += 1;

    return current();
  }

  public char previous() {
    this.hhL = Math.max(this.hhL - 1, 0);

    return current();
  }

  public char setIndex(int paramInt) {
    this.hhL = paramInt;

    return current();
  }

  public int getBeginIndex() {
    return 0;
  }

  public int getEndIndex() {
    return this.hhK;
  }

  public int getIndex() {
    return this.hhL;
  }

  public Object clone() {
    bVC localbVC = new bVC(this.hhJ);
    localbVC.hhL = this.hhL;

    return localbVC;
  }

  public char first() {
    if (this.hhK == 0) {
      return 65535;
    }

    this.hhL = 0;

    return current();
  }
}