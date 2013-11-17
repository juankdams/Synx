class dyA
  implements nf
{
  private boolean first = true;

  dyA(rU paramrU, StringBuilder paramStringBuilder) {  } 
  public boolean c(byte paramByte1, byte paramByte2) { if (this.first) this.first = false; else {
      this.aBU.append(",");
    }
    this.aBU.append(paramByte1);
    this.aBU.append("=");
    this.aBU.append(paramByte2);
    return true;
  }
}