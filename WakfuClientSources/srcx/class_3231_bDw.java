class bDw
  implements cSv
{
  private boolean first = true;

  bDw(cLO paramcLO, StringBuilder paramStringBuilder) {  } 
  public boolean a(byte paramByte, float paramFloat) { if (this.first) this.first = false; else {
      this.aBU.append(",");
    }
    this.aBU.append(paramByte);
    this.aBU.append("=");
    this.aBU.append(paramFloat);
    return true;
  }
}