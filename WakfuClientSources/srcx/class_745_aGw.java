class aGw
  implements dgE
{
  private boolean first = true;

  aGw(bjI parambjI, StringBuilder paramStringBuilder) {  } 
  public boolean k(int paramInt, byte paramByte) { if (this.first) this.first = false; else {
      this.aBU.append(",");
    }
    this.aBU.append(paramInt);
    this.aBU.append("=");
    this.aBU.append(paramByte);
    return true;
  }
}