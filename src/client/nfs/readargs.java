/*
 * Automatically generated by jrpcgen 1.1.1 on 12/1/15 11:39 PM
 * jrpcgen is part of the "Remote Tea" ONC/RPC package for Java
 * See http://remotetea.sourceforge.net for details
 */
package client.nfs;
import org.acplt.oncrpc.*;
import java.io.IOException;

public class readargs implements XdrAble {
    public fhandle file;
    public int offset;
    public int count;
    public int totalcount;

    public readargs() {
    }

    public readargs(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        xdrDecode(xdr);
    }

    public void xdrEncode(XdrEncodingStream xdr)
           throws OncRpcException, IOException {
        file.xdrEncode(xdr);
        xdr.xdrEncodeInt(offset);
        xdr.xdrEncodeInt(count);
        xdr.xdrEncodeInt(totalcount);
    }

    public void xdrDecode(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        file = new fhandle(xdr);
        offset = xdr.xdrDecodeInt();
        count = xdr.xdrDecodeInt();
        totalcount = xdr.xdrDecodeInt();
    }

}
// End of readargs.java
